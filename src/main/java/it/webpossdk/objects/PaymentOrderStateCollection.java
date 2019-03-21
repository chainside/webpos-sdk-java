/*
Nigiri auto-generated file
*/
package it.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import it.webpossdk.objects.schemas.PaymentOrderStateSchema;

import java.util.ArrayList;


public class PaymentOrderStateCollection extends SdkCollection<PaymentOrderState> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderStateSchema.jsonSchema);
    }

    public static Class<PaymentOrderState> getElementsClass() {
        return PaymentOrderState.class;
    }

    public PaymentOrderStateCollection(ArrayList<PaymentOrderState> elements) {
        super(elements);
    }
}