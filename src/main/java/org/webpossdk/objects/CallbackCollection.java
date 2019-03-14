/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.CallbackSchema;

import java.util.ArrayList;


public class CallbackCollection extends SdkCollection<Callback> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(CallbackSchema.jsonSchema);
    }

    public static Class<Callback> getElementsClass() {
        return Callback.class;
    }

    public CallbackCollection(ArrayList<Callback> elements) {
        super(elements);
    }
}