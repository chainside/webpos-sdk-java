package org.webpossdk.callbacks;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdkboilerplate.callbacks.CallbackHandler;
import com.sdkboilerplate.exceptions.CallbackParsingException;
import com.sdkboilerplate.exceptions.CallbackVerificationException;
import com.sdkboilerplate.lib.ApiContext;
import com.sdkboilerplate.objects.SdkObject;
import org.webpossdk.api.ChainsideHeaders;
import org.webpossdk.lib.Hashers;
import org.webpossdk.utils.Converter;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;

public class ChainsideCallbackHandler extends CallbackHandler {


    @Override
    public String getCallbackNamespace(byte[] rawBody) throws CallbackParsingException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            HashMap<String, Object> body = (HashMap<String, Object>) mapper.readValue(Arrays.toString(rawBody), HashMap.class);
            return body.get("event").toString();
        } catch (IOException e) {
            throw new CallbackParsingException();
        }
    }

    @Override
    public void verify(HashMap<String, String> headers, byte[] rawBody) throws CallbackVerificationException {
        String signature = headers.get(ChainsideHeaders.SIGNATURE);
        if (signature == null) {
            throw new CallbackVerificationException();
        }
        try {
            MessageDigest digest = MessageDigest.getInstance(Hashers.SHA_256);
            byte[] key = digest.digest(this.ctx.getConfig().get("secret").toString().getBytes(StandardCharsets.UTF_8));
            byte[] bodyHmac = this.getHMAC(rawBody, key);
            String computedSignature = Base64.getEncoder().encodeToString(bodyHmac);
            if (!computedSignature.equals(signature)) {
                throw new CallbackVerificationException();
            }
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new CallbackVerificationException();
        }


    }

    @Override
    public HashMap<String, Class<? extends SdkObject>> getCallbacks() {
        return ChainsideCallbackFactory.getCallbacks();
    }

    public ChainsideCallbackHandler(ApiContext ctx) {
        super(ctx);
    }

    private byte[] getHMAC(byte[] data, byte[] key) throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec spec = new SecretKeySpec(key, Hashers.HMAC_SHA512);
        Mac mac = Mac.getInstance(Hashers.HMAC_SHA512);
        mac.init(spec);
        return mac.doFinal(data);

    }
}
