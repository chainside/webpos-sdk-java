/*
Nigiri auto-generated file
*/
package it.webpossdk.actions;

import it.sdkboilerplate.exceptions.SdkHttpException;
import it.sdkboilerplate.exceptions.UnserializableObjectException;
import it.sdkboilerplate.lib.ApiContext;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.validation.Schema;
import it.webpossdk.exceptions.FunctionalityDownException;
import it.webpossdk.exceptions.ValidationErrorException;
import it.webpossdk.objects.PaymentOrderCreation;
import it.webpossdk.objects.PaymentOrderCreationResponse;

import java.util.HashMap;

public class CreatePaymentOrderAction extends ChainsideAuthenticatedAction {
    public CreatePaymentOrderAction(ApiContext ctx) {
        super(ctx);
    }

    @Override
    public String getRoute() {
        return "/payment-order";
    }

    @Override
    public String getVerb() {
        return "POST";

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
        errors.put("4006", FunctionalityDownException.class);
        return errors;
    }

    @Override
    public Class<? extends SdkBodyType> getRequestBodyClass() {
        return PaymentOrderCreation.class;
    }

    @Override
    public Class<? extends SdkBodyType> getResponseBodyClass() {
        return PaymentOrderCreationResponse.class;
    }

    @Override
    public HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("X-Api-Version", "v1");
        headers.put("Accept", "application/json");
        headers.put("Content-Type", "application/json");
        return headers;
    }

    public void setPaymentOrderCreation(PaymentOrderCreation value)
            throws ReflectiveOperationException, UnserializableObjectException {
        this.setRequestBody(value);
    }
}