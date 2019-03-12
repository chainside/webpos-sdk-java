/*
Nigiri auto-generated file
*/
package org.webpossdk.actions;

import org.webpossdk.objects.*;
import org.webpossdk.lib.*;
import org.webpossdk.exceptions.*;

import com.sdkboilerplate.exceptions.*;
import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.lib.*;
import com.sdkboilerplate.validation.*;

import java.util.*;

public class CreatePaymentOrderAction extends ChainsideAuthenticatedAction{
    public CreatePaymentOrderAction(ApiContext ctx){
        super(ctx);
    }
    @Override
    public String getRoute(){
            return "/payment-order";
    }
    @Override
    public String getVerb(){
        return "POST";

    }
    @Override
    public Schema getQueryParametersSchema () {return new Schema();}
    @Override
    public Schema getRouteParametersSchema () {return new Schema();}

    public HashMap<String, Class<? extends SdkHttpException>> getErrors() {
        HashMap<String, Class<? extends SdkHttpException>> errors = new HashMap<>();
        errors.putAll(super.getErrors());
        errors.put("0001" , ValidationErrorException.class);
        errors.put("4006" , FunctionalityDownException.class);
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
    public HashMap<String, String> getHeaders(){
        HashMap<String, String> headers = new HashMap<>();
        headers.put("X-Api-Version", "v1");
        headers.put("Accept", "application/json");
        headers.put("Content-Type", "application/json");
        return headers;
    }
    public void setPaymentOrderCreation(PaymentOrderCreation value)
        throws ReflectiveOperationException, UnserializableObjectException{
        this.setRequestBody(value);
    }
    }