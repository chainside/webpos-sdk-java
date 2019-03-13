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

public class ClientCredentialsLoginAction extends ChainsideAuthenticatingAction{
    public ClientCredentialsLoginAction(ApiContext ctx){
        super(ctx);
    }
    @Override
    public String getRoute(){
            return "/token";
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
        errors.put("1002" , InvalidGrantTypeException.class);
        errors.put("1013" , InvalidScopeException.class);
        errors.put("1001" , UnauthorizedClientException.class);
        return errors;
        }
    @Override
    public Class<? extends SdkBodyType> getRequestBodyClass() {
        return ClientCredentials.class;
        }
    @Override
    public Class<? extends SdkBodyType> getResponseBodyClass() {
        return ClientCredentialsLoginResponse.class;
        }
    @Override
    public HashMap<String, String> getHeaders(){
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/x-www-form-urlencoded");
        headers.put("X-Api-Version", "v1");
        headers.put("Accept", "application/json");
        return headers;
    }
    public void setClientCredentials(ClientCredentials value)
        throws ReflectiveOperationException, UnserializableObjectException{
        this.setRequestBody(value);
    }
    }