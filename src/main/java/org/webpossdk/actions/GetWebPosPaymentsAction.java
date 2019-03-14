/*
Nigiri auto-generated file
*/
package org.webpossdk.actions;

import com.sdkboilerplate.exceptions.SdkHttpException;
import com.sdkboilerplate.lib.ApiContext;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.exceptions.NotFoundException;
import org.webpossdk.objects.PaymentOrderList;

import java.util.HashMap;

public class GetWebPosPaymentsAction extends ChainsideAuthenticatedAction {
    public GetWebPosPaymentsAction(ApiContext ctx) {
        super(ctx);
    }

    @Override
    public String getRoute() {
        return "/pos/web/{pos_uuid}/payment-order";
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
        errors.put("3001", NotFoundException.class);
        return errors;
    }

    @Override
    public Class<? extends SdkBodyType> getRequestBodyClass() {
        return null;
    }

    @Override
    public Class<? extends SdkBodyType> getResponseBodyClass() {
        return PaymentOrderList.class;
    }

    @Override
    public HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Api-Version", "v1");
        headers.put("Accept", "application/json");
        return headers;
    }

    public void setPosUuid(String value) {
        this.setRouteParameter("pos_uuid", value);
    }

    public void setStatus(String value) {
        this.setQueryParameter("status", value);
    }
}