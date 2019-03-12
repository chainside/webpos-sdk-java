/*
Nigiri auto-generated file
*/
package org.webpossdk.actions;

import com.sdkboilerplate.actions.*;

import org.webpossdk.api.*;
import java.util.HashMap;

public class ChainsideActionFactory extends ActionsFactory{
    public HashMap<String, Class<? extends Action>> getActions(){
        HashMap<String, Class<? extends Action>> actions = new HashMap<>();
        actions.put("getCallbacks" , GetCallbacksAction.class);
        actions.put("paymentReset" , PaymentResetAction.class);
        actions.put("paymentUpdate" , PaymentUpdateAction.class);
        actions.put("clientCredentialsLogin" , ClientCredentialsLoginAction.class);
        actions.put("deletePaymentOrder" , DeletePaymentOrderAction.class);
        actions.put("getPaymentOrder" , GetPaymentOrderAction.class);
        actions.put("getWebPosPayments" , GetWebPosPaymentsAction.class);
        actions.put("createPaymentOrder" , CreatePaymentOrderAction.class);
        return actions;
    }
    public ChainsideActionFactory(ChainsideApiContext ctx){
        super(ctx);
    }
}