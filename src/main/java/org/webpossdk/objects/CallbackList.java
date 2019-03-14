/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.CallbackListSchema;

import java.util.HashMap;

public class CallbackList extends SdkObject {
    public CallbackCollection callbacks;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(CallbackListSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        subObjects.put("callbacks", CallbackCollection.class);
        return subObjects;
    }

    public CallbackCollection getCallbacks() {
        return this.callbacks;
    }

    ;

    public void setCallbacks(CallbackCollection value) {
        this.callbacks = value;
    }

    public CallbackList() {
    }
}
