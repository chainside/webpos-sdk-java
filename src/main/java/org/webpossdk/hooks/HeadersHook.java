package org.webpossdk.hooks;

import com.sdkboilerplate.hooks.PreSendHook;
import com.sdkboilerplate.http.SdkRequest;
import org.webpossdk.api.ChainsideApiContext;
import org.webpossdk.api.ChainsideHeaders;

public class HeadersHook extends PreSendHook {
    public HeadersHook(ChainsideApiContext ctx, SdkRequest sdkRequest) {
        super(ctx, sdkRequest);
    }

    public void run() {
        this.sdkRequest.setHeader(ChainsideHeaders.API_VERSION, this.ctx.getConfig().get("version").toString());
    }
}
