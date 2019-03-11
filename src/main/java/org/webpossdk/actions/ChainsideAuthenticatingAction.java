package org.webpossdk.actions;

import com.sdkboilerplate.hooks.PreSendHook;
import com.sdkboilerplate.lib.ApiContext;
import org.webpossdk.hooks.AuthenticationHook;

import java.util.ArrayList;

public abstract class ChainsideAuthenticatingAction extends ChainsideAction {
    public ChainsideAuthenticatingAction(ApiContext ctx) {
        super(ctx);
    }

    public ArrayList<Class<? extends PreSendHook>> getPreSendHooks() {
        ArrayList<Class<? extends PreSendHook>> preSendHooks = new ArrayList<>();
        preSendHooks.add(AuthenticationHook.class);
        return preSendHooks;
    }
}

/*

 */

