/*
Nigiri auto-generated file
*/
package it.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import it.webpossdk.objects.schemas.ClientCredentialsSchema;

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