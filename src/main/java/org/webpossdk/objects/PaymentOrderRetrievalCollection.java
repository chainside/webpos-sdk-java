/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.PaymentOrderRetrievalSchema;

import java.util.ArrayList;


public class PaymentOrderRetrievalCollection extends SdkCollection<PaymentOrderRetrieval> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderRetrievalSchema.jsonSchema);
    }

    public static Class<PaymentOrderRetrieval> getElementsClass() {
        return PaymentOrderRetrieval.class;
    }

    public PaymentOrderRetrievalCollection(ArrayList<PaymentOrderRetrieval> elements) {
        super(elements);
    }
}