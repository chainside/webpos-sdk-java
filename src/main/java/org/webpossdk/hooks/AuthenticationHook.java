package org.webpossdk.hooks;

import com.sdkboilerplate.hooks.PreSendHook;
import com.sdkboilerplate.http.Headers;
import com.sdkboilerplate.http.SdkRequest;
import com.sdkboilerplate.lib.ApiContext;

import java.util.Base64;

public class AuthenticationHook extends PreSendHook {
    public AuthenticationHook(ApiContext ctx, SdkRequest sdkRequest) {
        super(ctx, sdkRequest);
    }

    public void run() {
        String clientId = this.ctx.getConfig().get("clientId").toString();
        String secret = this.ctx.getConfig().get("secret").toString();
        String encoded = Base64.getEncoder().encodeToString((clientId + ":" + secret).getBytes());
        this.sdkRequest.setHeader(Headers.AUTHORIZATION, "Basic " + encoded);
    }
}
