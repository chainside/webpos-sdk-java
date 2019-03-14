/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.PaymentOrderListSchema;

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

    ;

    public void setPaymentorders(PaymentOrderRetrievalCollection value) {
        this.paymentorders = value;
    }

    public PaymentOrderList() {
    }
}
