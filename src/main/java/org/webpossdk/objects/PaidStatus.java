/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.PaidStatusSchema;

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

    ;

    public void setFiat(String value) {
        this.fiat = value;
    }

    public Integer getCrypto() {
        return this.crypto;
    }

    ;

    public void setCrypto(Integer value) {
        this.crypto = value;
    }

    public PaidStatus() {
    }
}
