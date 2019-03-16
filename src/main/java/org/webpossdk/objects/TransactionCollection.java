/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.TransactionSchema;

import java.util.ArrayList;


public class TransactionCollection extends SdkCollection<Transaction> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(TransactionSchema.jsonSchema);
    }

    public static Class<Transaction> getElementsClass() {
        return Transaction.class;
    }

    public TransactionCollection(ArrayList<Transaction> elements) {
        super(elements);
    }
}