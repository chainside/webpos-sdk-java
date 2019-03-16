/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.DepositAccountLiteSchema;

import java.util.ArrayList;


public class DepositAccountLiteCollection extends SdkCollection<DepositAccountLite> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(DepositAccountLiteSchema.jsonSchema);
    }

    public static Class<DepositAccountLite> getElementsClass() {
        return DepositAccountLite.class;
    }

    public DepositAccountLiteCollection(ArrayList<DepositAccountLite> elements) {
        super(elements);
    }
}