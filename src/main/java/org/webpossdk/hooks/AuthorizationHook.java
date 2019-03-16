package org.webpossdk.hooks;

import com.sdkboilerplate.hooks.PreSendHook;
import com.sdkboilerplate.http.Headers;
import com.sdkboilerplate.http.SdkRequest;
import com.sdkboilerplate.lib.ApiContext;

public class AuthorizationHook extends PreSendHook {
    public AuthorizationHook(ApiContext ctx, SdkRequest sdkRequest) {
        super(ctx, sdkRequest);
    }

    public void run() {
        String accessToken = this.ctx.getCache().get(this.ctx.getConfig().get("accessTokenKey").toString());
        this.sdkRequest.setHeader(Headers.AUTHORIZATION, "Bearer " + accessToken);
    }

}
