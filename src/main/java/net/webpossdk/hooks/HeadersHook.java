package net.webpossdk.hooks;

import it.sdkboilerplate.hooks.PreSendHook;
import it.sdkboilerplate.http.Headers;
import it.sdkboilerplate.http.SdkRequest;
import it.sdkboilerplate.lib.ApiContext;

public class HeadersHook extends PreSendHook {
    public HeadersHook(ApiContext ctx, SdkRequest sdkRequest) {
        super(ctx, sdkRequest);
    }

    public void run() {
        this.sdkRequest.setHeader('Accept', 'application/json');
        this.sdkRequest.setHeader('Content-Type', 'application/json');
        this.sdkRequest.setHeader('X-Api-version', this.ctx.getConfig().get('version').toString());
    }

}
