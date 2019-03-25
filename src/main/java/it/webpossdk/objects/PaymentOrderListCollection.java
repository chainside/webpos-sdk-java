/*
Nigiri auto-generated file
*/
package it.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import it.webpossdk.objects.schemas.PaymentOrderListSchema;

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