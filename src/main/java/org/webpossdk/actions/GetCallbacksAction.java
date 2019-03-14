/*
Nigiri auto-generated file
*/
package org.webpossdk.actions;

import com.sdkboilerplate.exceptions.SdkHttpException;
import com.sdkboilerplate.lib.ApiContext;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.exceptions.NotFoundException;
import org.webpossdk.exceptions.ValidationErrorException;
import org.webpossdk.objects.CallbackList;

import java.util.HashMap;

public class GetCallbacksAction extends ChainsideAuthenticatedAction {
    public GetCallbacksAction(ApiContext ctx) {
        super(ctx);
    }

    @Override
    public String getRoute() {
        return "/payment-order/{payment_order_uuid}/callbacks";
    }

    @Override
    public String getVerb() {
        return "GET";

    }

    @Override
    public Schema getQueryParametersSchema() {
        return new Schema();
    }

    @Override
    public Schema getRouteParametersSchema() {
        return new Schema();
    }

    public HashMap<String, Class<? extends SdkHttpException>> getErrors() {
        HashMap<String, Class<? extends SdkHttpException>> errors = new HashMap<>();
        errors.putAll(super.getErrors());
        errors.put("0001", ValidationErrorException.class);
        errors.put("3001", NotFoundException.class);
        return errors;
    }

    @Override
    public Class<? extends SdkBodyType> getRequestBodyClass() {
        return null;
    }

    @Override
    public Class<? extends SdkBodyType> getResponseBodyClass() {
        return CallbackList.class;
    }

    @Override
    public HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Api-Version", "v1");
        headers.put("Accept", "application/json");
        return headers;
    }

    public void setPaymentOrderUuid(String value) {
        this.setRouteParameter("payment_order_uuid", value);
    }
}