/*
Nigiri auto-generated file
*/
package org.webpossdk.actions;

import com.sdkboilerplate.exceptions.SdkHttpException;
import com.sdkboilerplate.exceptions.UnserializableObjectException;
import com.sdkboilerplate.lib.ApiContext;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.exceptions.InvalidGrantTypeException;
import org.webpossdk.exceptions.InvalidScopeException;
import org.webpossdk.exceptions.UnauthorizedClientException;
import org.webpossdk.objects.ClientCredentials;
import org.webpossdk.objects.ClientCredentialsLoginResponse;

import java.util.HashMap;

public class ClientCredentialsLoginAction extends ChainsideAuthenticatingAction {
    public ClientCredentialsLoginAction(ApiContext ctx) {
        super(ctx);
    }

    @Override
    public String getRoute() {
        return "/token";
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
        errors.put("1002", InvalidGrantTypeException.class);
        errors.put("1013", InvalidScopeException.class);
        errors.put("1001", UnauthorizedClientException.class);
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
    public HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Api-Version", "v1");
        headers.put("Accept", "application/json");
        return headers;
    }

    public void setClientCredentials(ClientCredentials value)
            throws ReflectiveOperationException, UnserializableObjectException {
        this.setRequestBody(value);
    }
}