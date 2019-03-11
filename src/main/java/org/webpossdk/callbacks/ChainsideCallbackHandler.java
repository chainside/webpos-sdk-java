package org.webpossdk.callbacks;

import com.google.gson.Gson;
import com.sdkboilerplate.callbacks.CallbackHandler;
import com.sdkboilerplate.objects.SdkObject;
import org.webpossdk.api.ChainsideHeaders;

import java.nio.ByteBuffer;
import java.util.HashMap;

public class ChainsideCallbackHandler extends CallbackHandler {

    @Override
    public String getCallbackNamespace(ByteBuffer rawBody) {
        Gson gson = new Gson();
        HashMap<String, Object> body = (HashMap<String, Object>) gson.fromJson(rawBody.toString(), HashMap.class);
        return body.get("event").toString();
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
