/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.ClientCredentialsSchema;

import java.util.HashMap;

public class ClientCredentials extends SdkObject {
    public String grant_type;
    public String scope;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(ClientCredentialsSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        return subObjects;
    }

    public String getGrantType() {
        return this.grant_type;
    }

    public void setGrantType(String value) {
        this.grant_type = value;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String value) {
        this.scope = value;
    }

    public ClientCredentials() {
    }
}
