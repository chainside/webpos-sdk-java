/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.PaymentOrderDeletionResponseSchema;

import java.util.HashMap;

public class PaymentOrderDeletionResponse extends SdkObject {
    public String cancel_url;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderDeletionResponseSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        return subObjects;
    }

    public String getCancelUrl() {
        return this.cancel_url;
    }

    public void setCancelUrl(String value) {
        this.cancel_url = value;
    }

    public PaymentOrderDeletionResponse() {
    }
}
