/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.PaymentUpdateObjectSchema;

import java.util.HashMap;

public class PaymentUpdateObject extends SdkObject {
    public String callback;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentUpdateObjectSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        return subObjects;
    }

    public String getCallback() {
        return this.callback;
    }

    public void setCallback(String value) {
        this.callback = value;
    }

    public PaymentUpdateObject() {
    }
}
