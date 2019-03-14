/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.PaymentOrderCreationSchema;

import java.util.ArrayList;


public class PaymentOrderCreationCollection extends SdkCollection<PaymentOrderCreation> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderCreationSchema.jsonSchema);
    }

    public static Class<PaymentOrderCreation> getElementsClass() {
        return PaymentOrderCreation.class;
    }

    public PaymentOrderCreationCollection(ArrayList<PaymentOrderCreation> elements) {
        super(elements);
    }
}