/*
Nigiri auto-generated file
*/
package org.webpossdk.api;

import com.sdkboilerplate.actions.*;
import com.sdkboilerplate.exceptions.*;

import org.webpossdk.actions.*;
import org.webpossdk.objects.*;

import java.util.HashMap;

public class ChainsideClient{
    private HashMap<String, Object> config;
    private ChainsideActionFactory factory;
    private ChainsideApiContext ctx;

    public ChainsideClient(HashMap<String, Object> config) throws ConfigurationException, Exception{
        config.putIfAbsent("version", "v1");
        config.putIfAbsent("accessTokenKey", "___chainside.access.token___");
        config.putIfAbsent("timeout", 10);
        config.putIfAbsent("verifySSL", true);
        config.putIfAbsent("cacheDriver", "2k");

        this.config = config;
        this.ctx = new ChainsideApiContext(config);
        this.factory = new ChainsideActionFactory(this.ctx);

        this.login();



    }
    public CallbackList getCallbacks(String paymentOrderUuid)
        throws ReflectiveOperationException, SdkException{
        GetCallbacksAction action = (GetCallbacksAction)this.factory.make("getCallbacks");
        action.setPaymentOrderUuid(paymentOrderUuid);
        return (CallbackList)action.run();
        }
    public PaymentOrderRetrieval paymentReset(String paymentOrderUuid)
        throws ReflectiveOperationException, SdkException{
        PaymentResetAction action = (PaymentResetAction)this.factory.make("paymentReset");
        action.setPaymentOrderUuid(paymentOrderUuid);
        return (PaymentOrderRetrieval)action.run();
        }
    public void paymentUpdate(String paymentOrderUuid,PaymentUpdateObject paymentUpdateObject)
        throws ReflectiveOperationException, SdkException{
        PaymentUpdateAction action = (PaymentUpdateAction)this.factory.make("paymentUpdate");
        action.setPaymentOrderUuid(paymentOrderUuid);
        action.setPaymentUpdateObject(paymentUpdateObject);
        action.run();
        }
    public ClientCredentialsLoginResponse clientCredentialsLogin(ClientCredentials clientCredentials)
        throws ReflectiveOperationException, SdkException{
        ClientCredentialsLoginAction action = (ClientCredentialsLoginAction)this.factory.make("clientCredentialsLogin");
        action.setClientCredentials(clientCredentials);
        return (ClientCredentialsLoginResponse)action.run();
        }
    public PaymentOrderDeletionResponse deletePaymentOrder(String paymentOrderUuid)
        throws ReflectiveOperationException, SdkException{
        DeletePaymentOrderAction action = (DeletePaymentOrderAction)this.factory.make("deletePaymentOrder");
        action.setPaymentOrderUuid(paymentOrderUuid);
        return (PaymentOrderDeletionResponse)action.run();
        }
    public PaymentOrderRetrieval getPaymentOrder(String paymentOrderUuid)
        throws ReflectiveOperationException, SdkException{
        GetPaymentOrderAction action = (GetPaymentOrderAction)this.factory.make("getPaymentOrder");
        action.setPaymentOrderUuid(paymentOrderUuid);
        return (PaymentOrderRetrieval)action.run();
        }
    public PaymentOrderList getWebPosPayments(String posUuid,String status)
        throws ReflectiveOperationException, SdkException{
        GetWebPosPaymentsAction action = (GetWebPosPaymentsAction)this.factory.make("getWebPosPayments");
        action.setPosUuid(posUuid);
        if (status != null){
        action.setStatus(status);
        }
        return (PaymentOrderList)action.run();
        }
    public PaymentOrderCreationResponse createPaymentOrder(PaymentOrderCreation paymentOrderCreation)
        throws ReflectiveOperationException, SdkException{
        CreatePaymentOrderAction action = (CreatePaymentOrderAction)this.factory.make("createPaymentOrder");
        action.setPaymentOrderCreation(paymentOrderCreation);
        return (PaymentOrderCreationResponse)action.run();
        }
    public void login() throws Exception {
        ClientCredentials credentials = new ClientCredentials();
        credentials.setGrantType("client_credentials");
        credentials.setScope("*");
        ChainsideActionFactory factory = new ChainsideActionFactory(this.ctx);
        ClientCredentialsLoginAction action = (ClientCredentialsLoginAction) factory.make("clientCredentialsLogin");
        action.setClientCredentials(credentials);
        String accessToken = ((ClientCredentialsLoginResponse) action.run()).getAccessToken();
        this.ctx.getCache().set(this.config.get("accessTokenKey").toString(), accessToken);
    }
}