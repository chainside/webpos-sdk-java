package org.webpossdk.callbacks;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdkboilerplate.callbacks.CallbackHandler;
import com.sdkboilerplate.exceptions.CallbackParsingException;
import com.sdkboilerplate.objects.SdkObject;
import org.webpossdk.api.ChainsideHeaders;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;

public class ChainsideCallbackHandler extends CallbackHandler {

    @Override
    public String getCallbackNamespace(ByteBuffer rawBody) throws CallbackParsingException{
        try {
            ObjectMapper mapper = new ObjectMapper();
            HashMap<String, Object> body = (HashMap<String, Object>) mapper.readValue(rawBody.toString(), HashMap.class);
            return body.get("event").toString();
        }catch (IOException e){
            throw new CallbackParsingException();
        }
    }

    @Override
    public void verify(HashMap<String, String> headers, ByteBuffer rawBody) {
        String signature = headers.get(ChainsideHeaders.SIGNATURE);

    }

    @Override
    public HashMap<String, Class<? extends SdkObject>> getCallbacks() {
        return ChainsideCallbackFactory.getCallbacks();
    }

    public ChainsideCallbackHandler() {
    }
}
