/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.DepositAccountLiteSchema;

import java.util.HashMap;

public class DepositAccountLite extends SdkObject {
    public String type;
    public String uuid;
    public String name;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(DepositAccountLiteSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        return subObjects;
    }

    public String getType() {
        return this.type;
    }

    ;

    public void setType(String value) {
        this.type = value;
    }

    public String getUuid() {
        return this.uuid;
    }

    ;

    public void setUuid(String value) {
        this.uuid = value;
    }

    public String getName() {
        return this.name;
    }

    ;

    public void setName(String value) {
        this.name = value;
    }

    public DepositAccountLite() {
    }
}
