/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.PaymentOrderStateSchema;

import java.util.HashMap;

public class PaymentOrderState extends SdkObject {
    public String blockchain_status;
    public String status;
    public PaidStatus paid;
    public PaidStatus in_confirmation;
    public PaidStatus unpaid;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderStateSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        subObjects.put("paid", PaidStatus.class);
        subObjects.put("in_confirmation", PaidStatus.class);
        subObjects.put("unpaid", PaidStatus.class);
        return subObjects;
    }

    public String getBlockchainStatus() {
        return this.blockchain_status;
    }

    ;

    public void setBlockchainStatus(String value) {
        this.blockchain_status = value;
    }

    public String getStatus() {
        return this.status;
    }

    ;

    public void setStatus(String value) {
        this.status = value;
    }

    public PaidStatus getPaid() {
        return this.paid;
    }

    ;

    public void setPaid(PaidStatus value) {
        this.paid = value;
    }

    public PaidStatus getInConfirmation() {
        return this.in_confirmation;
    }

    ;

    public void setInConfirmation(PaidStatus value) {
        this.in_confirmation = value;
    }

    public PaidStatus getUnpaid() {
        return this.unpaid;
    }

    ;

    public void setUnpaid(PaidStatus value) {
        this.unpaid = value;
    }

    public PaymentOrderState() {
    }
}
