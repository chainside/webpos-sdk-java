/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.CallbackListSchema;

import java.util.ArrayList;


public class CallbackListCollection extends SdkCollection<CallbackList> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(CallbackListSchema.jsonSchema);
    }

    public static Class<CallbackList> getElementsClass() {
        return CallbackList.class;
    }

    public CallbackListCollection(ArrayList<CallbackList> elements) {
        super(elements);
    }
}