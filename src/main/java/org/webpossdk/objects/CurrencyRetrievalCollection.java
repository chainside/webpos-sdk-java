/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.CurrencyRetrievalSchema;

import java.util.ArrayList;


public class CurrencyRetrievalCollection extends SdkCollection<CurrencyRetrieval> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(CurrencyRetrievalSchema.jsonSchema);
    }

    public static Class<CurrencyRetrieval> getElementsClass() {
        return CurrencyRetrieval.class;
    }

    public CurrencyRetrievalCollection(ArrayList<CurrencyRetrieval> elements) {
        super(elements);
    }
}