/*
Nigiri auto-generated file
*/
package it.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.objects.SdkObject;
import it.sdkboilerplate.validation.Schema;
import it.webpossdk.objects.schemas.PaymentOrderStateSchema;

import java.util.HashMap;

public class PaymentOrderState extends SdkObject {
    public PaidStatus in_confirmation;
    public PaidStatus unpaid;
    public PaidStatus paid;
    public String blockchain_status;
    public String status;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderStateSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        subObjects.put("in_confirmation", PaidStatus.class);
        subObjects.put("unpaid", PaidStatus.class);
        subObjects.put("paid", PaidStatus.class);
        return subObjects;
    }

    public PaidStatus getInConfirmation() {
        return this.in_confirmation;
    }

    public void setInConfirmation(PaidStatus value) {
        this.in_confirmation = value;
    }

    public PaidStatus getUnpaid() {
        return this.unpaid;
    }

    public void setUnpaid(PaidStatus value) {
        this.unpaid = value;
    }

    public PaidStatus getPaid() {
        return this.paid;
    }

    public void setPaid(PaidStatus value) {
        this.paid = value;
    }

    public String getBlockchainStatus() {
        return this.blockchain_status;
    }

    public void setBlockchainStatus(String value) {
        this.blockchain_status = value;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public PaymentOrderState() {
    }
}
