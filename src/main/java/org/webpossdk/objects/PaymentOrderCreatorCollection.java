/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.PaymentOrderCreatorSchema;

import java.util.ArrayList;


public class PaymentOrderCreatorCollection extends SdkCollection<PaymentOrderCreator> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderCreatorSchema.jsonSchema);
    }

    public static Class<PaymentOrderCreator> getElementsClass() {
        return PaymentOrderCreator.class;
    }

    public PaymentOrderCreatorCollection(ArrayList<PaymentOrderCreator> elements) {
        super(elements);
    }
}