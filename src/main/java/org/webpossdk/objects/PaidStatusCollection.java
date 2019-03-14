/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.PaidStatusSchema;

import java.util.ArrayList;


public class PaidStatusCollection extends SdkCollection<PaidStatus> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaidStatusSchema.jsonSchema);
    }

    public static Class<PaidStatus> getElementsClass() {
        return PaidStatus.class;
    }

    public PaidStatusCollection(ArrayList<PaidStatus> elements) {
        super(elements);
    }
}