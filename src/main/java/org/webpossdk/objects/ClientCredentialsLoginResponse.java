/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.ClientCredentialsLoginResponseSchema;

import java.util.HashMap;

public class ClientCredentialsLoginResponse extends SdkObject {
    public String id_token;
    public String access_token;
    public Integer expires_in;
    public String token_type;
    public String scope;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(ClientCredentialsLoginResponseSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        return subObjects;
    }

    public String getIdToken() {
        return this.id_token;
    }

    public void setIdToken(String value) {
        this.id_token = value;
    }

    public String getAccessToken() {
        return this.access_token;
    }

    public void setAccessToken(String value) {
        this.access_token = value;
    }

    public Integer getExpiresIn() {
        return this.expires_in;
    }

    public void setExpiresIn(Integer value) {
        this.expires_in = value;
    }

    public String getTokenType() {
        return this.token_type;
    }

    public void setTokenType(String value) {
        this.token_type = value;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String value) {
        this.scope = value;
    }

    public ClientCredentialsLoginResponse() {
    }
}
