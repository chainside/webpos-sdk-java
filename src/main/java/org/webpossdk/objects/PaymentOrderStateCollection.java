/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.PaymentOrderStateSchema;

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