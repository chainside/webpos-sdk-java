/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.RateRetrievalSchema;

import java.util.ArrayList;


public class RateRetrievalCollection extends SdkCollection<RateRetrieval> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(RateRetrievalSchema.jsonSchema);
    }

    public static Class<RateRetrieval> getElementsClass() {
        return RateRetrieval.class;
    }

    public RateRetrievalCollection(ArrayList<RateRetrieval> elements) {
        super(elements);
    }
}