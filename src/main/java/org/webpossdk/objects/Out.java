/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.OutSchema;

import java.util.HashMap;

public class Out extends SdkObject {
    public Integer amount;
    public Integer n;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(OutSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        return subObjects;
    }

    public Integer getAmount() {
        return this.amount;
    }

    ;

    public void setAmount(Integer value) {
        this.amount = value;
    }

    public Integer getN() {
        return this.n;
    }

    ;

    public void setN(Integer value) {
        this.n = value;
    }

    public Out() {
    }
}
