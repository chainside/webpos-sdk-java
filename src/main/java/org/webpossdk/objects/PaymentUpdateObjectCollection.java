/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.PaymentUpdateObjectSchema;

import java.util.ArrayList;


public class PaymentUpdateObjectCollection extends SdkCollection<PaymentUpdateObject> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentUpdateObjectSchema.jsonSchema);
    }

    public static Class<PaymentUpdateObject> getElementsClass() {
        return PaymentUpdateObject.class;
    }

    public PaymentUpdateObjectCollection(ArrayList<PaymentUpdateObject> elements) {
        super(elements);
    }
}