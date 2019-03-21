/*
Nigiri auto-generated file
*/
package it.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.objects.SdkObject;
import it.sdkboilerplate.validation.Schema;
import it.webpossdk.objects.schemas.PaidStatusSchema;

import java.util.HashMap;

public class PaidStatus extends SdkObject {
    public String fiat;
    public Integer crypto;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaidStatusSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        return subObjects;
    }

    public String getFiat() {
        return this.fiat;
    }

    public void setFiat(String value) {
        this.fiat = value;
    }

    public Integer getCrypto() {
        return this.crypto;
    }

    public void setCrypto(Integer value) {
        this.crypto = value;
    }

    public PaidStatus() {
    }
}
