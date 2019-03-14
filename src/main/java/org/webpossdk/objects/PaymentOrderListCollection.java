/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.PaymentOrderListSchema;

import java.util.ArrayList;


public class PaymentOrderListCollection extends SdkCollection<PaymentOrderList> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderListSchema.jsonSchema);
    }

    public static Class<PaymentOrderList> getElementsClass() {
        return PaymentOrderList.class;
    }

    public PaymentOrderListCollection(ArrayList<PaymentOrderList> elements) {
        super(elements);
    }
}