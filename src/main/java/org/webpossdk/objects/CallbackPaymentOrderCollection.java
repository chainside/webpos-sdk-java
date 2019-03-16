/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.CallbackPaymentOrderSchema;

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