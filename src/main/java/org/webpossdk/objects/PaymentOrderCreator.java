/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.PaymentOrderCreatorSchema;

import java.util.HashMap;

public class PaymentOrderCreator extends SdkObject {
    public Boolean active;
    public String type;
    public String uuid;
    public DepositAccountLite deposit_account;
    public String name;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderCreatorSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        subObjects.put("deposit_account", DepositAccountLite.class);
        return subObjects;
    }

    public Boolean getActive() {
        return this.active;
    }

    ;

    public void setActive(Boolean value) {
        this.active = value;
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

    public DepositAccountLite getDepositAccount() {
        return this.deposit_account;
    }

    ;

    public void setDepositAccount(DepositAccountLite value) {
        this.deposit_account = value;
    }

    public String getName() {
        return this.name;
    }

    ;

    public void setName(String value) {
        this.name = value;
    }

    public PaymentOrderCreator() {
    }
}
