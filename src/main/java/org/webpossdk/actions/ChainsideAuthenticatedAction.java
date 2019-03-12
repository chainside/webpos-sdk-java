package org.webpossdk.actions;

import com.sdkboilerplate.hooks.PreSendHook;
import com.sdkboilerplate.lib.ApiContext;
import org.webpossdk.hooks.AuthorizationHook;

import java.util.ArrayList;

public abstract class ChainsideAuthenticatedAction extends ChainsideAction {
    public ChainsideAuthenticatedAction(ApiContext ctx) {
        super(ctx);
    }

    @Override
    public ArrayList<Class <? extends PreSendHook>> getPreSendHooks(){
        ArrayList<Class <? extends PreSendHook>> preSendHooks = new ArrayList<>();
        preSendHooks.add(AuthorizationHook.class);
        preSendHooks.addAll(super.getPreSendHooks());
        return preSendHooks;
    }
}
