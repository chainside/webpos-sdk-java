/*
Nigiri auto-generated file
*/
package it.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.objects.SdkObject;
import it.sdkboilerplate.validation.Schema;
import it.webpossdk.objects.schemas.PaymentOrderListSchema;

import java.util.HashMap;

public class PaymentOrderList extends SdkObject {
    public PaymentOrderRetrievalCollection paymentorders;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderListSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        subObjects.put("paymentorders", PaymentOrderRetrievalCollection.class);
        return subObjects;
    }

    public PaymentOrderRetrievalCollection getPaymentorders() {
        return this.paymentorders;
    }

    public void setPaymentorders(PaymentOrderRetrievalCollection value) {
        this.paymentorders = value;
    }

    public PaymentOrderList() {
    }
}
