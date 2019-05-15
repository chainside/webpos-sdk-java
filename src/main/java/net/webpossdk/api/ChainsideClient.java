/*
Nigiri auto-generated file
*/
package net.webpossdk.api;

import it.sdkboilerplate.exceptions.ConfigurationException;
import it.sdkboilerplate.exceptions.SdkException;
import net.webpossdk.actions.*;
import net.webpossdk.objects.*;

import java.util.HashMap;

public class ChainsideClient {
    private HashMap<String, Object> config;
    private ChainsideActionFactory factory;
    private ChainsideApiContext ctx;

    public ChainsideClient(HashMap<String, Object> config) throws ConfigurationException, Exception {

        this.config = config;
        this.ctx = new ChainsideApiContext(config);
        this.factory = new ChainsideActionFactory(this.ctx);

        this.login();


    }

    public ClientCredentialsLoginResponse clientCredentialsLogin(ClientCredentials clientCredentials)
            throws ReflectiveOperationException, SdkException {
        ClientCredentialsLoginAction action = (ClientCredentialsLoginAction) this.factory.make("clientCredentialsLogin");
        action.setClientCredentials(clientCredentials);
        return (ClientCredentialsLoginResponse) action.run();
    }

    public PaymentOrderDeletionResponse deletePaymentOrder(String paymentOrderUuid)
            throws ReflectiveOperationException, SdkException {
        DeletePaymentOrderAction action = (DeletePaymentOrderAction) this.factory.make("deletePaymentOrder");
        action.setPaymentOrderUuid(paymentOrderUuid);
        return (PaymentOrderDeletionResponse) action.run();
    }

    public PaymentOrderRetrieval getPaymentOrder(String paymentOrderUuid)
            throws ReflectiveOperationException, SdkException {
        GetPaymentOrderAction action = (GetPaymentOrderAction) this.factory.make("getPaymentOrder");
        action.setPaymentOrderUuid(paymentOrderUuid);
        return (PaymentOrderRetrieval) action.run();
    }

    public PaymentOrderList getWebPosPayments(String posUuid, String sortOrder, String page, String status, String pageSize, String sortBy)
            throws ReflectiveOperationException, SdkException {
        GetWebPosPaymentsAction action = (GetWebPosPaymentsAction) this.factory.make("getWebPosPayments");
        action.setPosUuid(posUuid);
        if (sortOrder != null) {
            action.setSortOrder(sortOrder);
        }
        if (page != null) {
            action.setPage(page);
        }
        if (status != null) {
            action.setStatus(status);
        }
        if (pageSize != null) {
            action.setPageSize(pageSize);
        }
        if (sortBy != null) {
            action.setSortBy(sortBy);
        }
        return (PaymentOrderList) action.run();
    }

    public PaymentOrderCreationResponse createPaymentOrder(PaymentOrderCreation paymentOrderCreation)
            throws ReflectiveOperationException, SdkException {
        CreatePaymentOrderAction action = (CreatePaymentOrderAction) this.factory.make("createPaymentOrder");
        action.setPaymentOrderCreation(paymentOrderCreation);
        return (PaymentOrderCreationResponse) action.run();
    }

    public CallbackList getCallbacks(String paymentOrderUuid)
            throws ReflectiveOperationException, SdkException {
        GetCallbacksAction action = (GetCallbacksAction) this.factory.make("getCallbacks");
        action.setPaymentOrderUuid(paymentOrderUuid);
        return (CallbackList) action.run();
    }

    public PaymentOrderRetrieval paymentReset(String paymentOrderUuid)
            throws ReflectiveOperationException, SdkException {
        PaymentResetAction action = (PaymentResetAction) this.factory.make("paymentReset");
        action.setPaymentOrderUuid(paymentOrderUuid);
        return (PaymentOrderRetrieval) action.run();
    }

    public void paymentUpdate(String paymentOrderUuid, PaymentUpdateObject paymentUpdateObject)
            throws ReflectiveOperationException, SdkException {
        PaymentUpdateAction action = (PaymentUpdateAction) this.factory.make("paymentUpdate");
        action.setPaymentOrderUuid(paymentOrderUuid);
        action.setPaymentUpdateObject(paymentUpdateObject);
        action.run();
    }

    public void login() throws Exception {
        ChainsideAuthenticatedAction.login(this.ctx);
    }
}