/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.TransactionSchema;

import java.util.HashMap;

public class Transaction extends SdkObject {
    public String txid;
    public String status;
    public Integer outs_sum;
    public String created_at;
    public String blockchain_status;
    public OutCollection outs;
    public String normalized_txid;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(TransactionSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        subObjects.put("outs", OutCollection.class);
        return subObjects;
    }

    public String getTxid() {
        return this.txid;
    }

    public void setTxid(String value) {
        this.txid = value;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public Integer getOutsSum() {
        return this.outs_sum;
    }

    public void setOutsSum(Integer value) {
        this.outs_sum = value;
    }

    public String getCreatedAt() {
        return this.created_at;
    }

    public void setCreatedAt(String value) {
        this.created_at = value;
    }

    public String getBlockchainStatus() {
        return this.blockchain_status;
    }

    public void setBlockchainStatus(String value) {
        this.blockchain_status = value;
    }

    public OutCollection getOuts() {
        return this.outs;
    }

    public void setOuts(OutCollection value) {
        this.outs = value;
    }

    public String getNormalizedTxid() {
        return this.normalized_txid;
    }

    public void setNormalizedTxid(String value) {
        this.normalized_txid = value;
    }

    public Transaction() {
    }
}
