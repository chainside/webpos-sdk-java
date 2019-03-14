/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.OutSchema;

import java.util.ArrayList;


public class OutCollection extends SdkCollection<Out> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(OutSchema.jsonSchema);
    }

    public static Class<Out> getElementsClass() {
        return Out.class;
    }

    public OutCollection(ArrayList<Out> elements) {
        super(elements);
    }
}