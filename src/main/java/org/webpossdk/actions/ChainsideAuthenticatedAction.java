package org.webpossdk.actions;

import com.sdkboilerplate.exceptions.SdkException;
import com.sdkboilerplate.exceptions.SdkHttpException;
import com.sdkboilerplate.hooks.PreSendHook;
import com.sdkboilerplate.lib.ApiContext;
import com.sdkboilerplate.objects.SdkBodyType;
import org.webpossdk.api.ChainsideApiContext;
import org.webpossdk.exceptions.AccessTokenExpiredException;
import org.webpossdk.exceptions.TooManyRerunsException;
import org.webpossdk.hooks.AuthorizationHook;
import org.webpossdk.objects.ClientCredentials;
import org.webpossdk.objects.ClientCredentialsLoginResponse;

import java.util.ArrayList;

/**
 * Superclass for actions which required authorization. It declares the AuthorizationHook as a pre-send hook.
 */
public abstract class ChainsideAuthenticatedAction extends ChainsideAction {
    private Integer runs = 0;


    public ChainsideAuthenticatedAction(ApiContext ctx) {
        super(ctx);
    }


    @Override
    public ArrayList<Class<? extends PreSendHook>> getPreSendHooks() {
        ArrayList<Class<? extends PreSendHook>> preSendHooks = new ArrayList<>();
        preSendHooks.add(AuthorizationHook.class);
        preSendHooks.addAll(super.getPreSendHooks());
        return preSendHooks;
    }

    @Override
    public SdkBodyType run() throws SdkException, SdkHttpException, ReflectiveOperationException {
        try {
            return super.run();
        } catch (AccessTokenExpiredException e) {
            if (this.runs > 0) throw new TooManyRerunsException();
            this.runs += 1;
            ChainsideAuthenticatedAction.login(this.getContext());
            return this.run();
        }
    }

    /**
     * Wrapping method for the authentication which performs the ClientCredentialsLogin action and caches the accessToken
     *
     * @throws SdkHttpException If the server responds with a > 400 status code
     * @throws SdkException     If any error occurs during the serialization / deserialization of objects
     */
    public static void login(ApiContext ctx) throws SdkHttpException, SdkException, ReflectiveOperationException {

        ClientCredentials credentials = new ClientCredentials();
        credentials.setGrantType("client_credentials");
        credentials.setScope("*");

        ChainsideActionFactory factory = new ChainsideActionFactory((ChainsideApiContext) ctx);
        ClientCredentialsLoginAction action = (ClientCredentialsLoginAction) factory.make("clientCredentialsLogin");
        action.setClientCredentials(credentials);
        String accessToken = ((ClientCredentialsLoginResponse) action.run()).getAccessToken();
        ctx.getCache().set(ctx.getConfig().get("accessTokenKey").toString(), accessToken);

    }
}
