/*
Nigiri auto-generated file
*/
package it.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import it.webpossdk.objects.schemas.PaymentOrderRetrievalSchema;

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