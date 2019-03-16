/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkCollection;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.ClientCredentialsSchema;

import java.util.ArrayList;


public class ClientCredentialsCollection extends SdkCollection<ClientCredentials> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(ClientCredentialsSchema.jsonSchema);
    }

    public static Class<ClientCredentials> getElementsClass() {
        return ClientCredentials.class;
    }

    public ClientCredentialsCollection(ArrayList<ClientCredentials> elements) {
        super(elements);
    }
}