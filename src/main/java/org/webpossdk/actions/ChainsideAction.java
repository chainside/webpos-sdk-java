package org.webpossdk.actions;

import com.sdkboilerplate.actions.Action;
import com.sdkboilerplate.exceptions.SdkHttpException;
import com.sdkboilerplate.hooks.FailureHook;
import com.sdkboilerplate.hooks.PreSendHook;
import com.sdkboilerplate.hooks.SuccessHook;
import com.sdkboilerplate.lib.ApiContext;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class ChainsideAction extends Action {
    public ChainsideAction(ApiContext ctx) {
        super(ctx);
    }

    @Override
    public ArrayList<Class<? extends FailureHook>> getFailureHooks() {
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Class<? extends SuccessHook>> getSuccessHooks() {
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Class<? extends PreSendHook>> getPreSendHooks() {
        return new ArrayList<>();
    }

    @Override
    public HashMap<String, Class<? extends SdkHttpException>> getErrors() {
        return new HashMap<>();
    }
}
