/*
Nigiri auto-generated file
*/
package it.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import it.webpossdk.objects.schemas.CallbackPaymentOrderSchema;

import java.util.ArrayList;


public class CallbackPaymentOrderCollection extends SdkCollection<CallbackPaymentOrder> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(CallbackPaymentOrderSchema.jsonSchema);
    }

    public static Class<CallbackPaymentOrder> getElementsClass() {
        return CallbackPaymentOrder.class;
    }

    public CallbackPaymentOrderCollection(ArrayList<CallbackPaymentOrder> elements) {
        super(elements);
    }
}