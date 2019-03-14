/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.CallbackPaymentOrderSchema;

import java.util.HashMap;

public class PaymentChargebackCallback extends SdkObject {

    private String event;

    public String getEvent() {
        return this.event;
    }

    public void setEvent(String value) {
        this.event = value;
    }

    private String createdAt;

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String value) {
        this.createdAt = value;
    }

    private CallbackPaymentOrder object;

    public CallbackPaymentOrder getObject() {
        return this.object;
    }

    public void setObject(CallbackPaymentOrder value) {
        this.object = value;
    }

    private String objectType;

    public String getObjectType() {
        return this.objectType;
    }

    public void setObjectType(String value) {
        this.objectType = value;
    }

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(CallbackPaymentOrderSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        subObjects.put("object", CallbackPaymentOrder.class);
        return subObjects;
    }


    public PaymentChargebackCallback() {
    }
}