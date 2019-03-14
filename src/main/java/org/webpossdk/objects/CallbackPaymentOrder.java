/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.exceptions.JsonSerializationException;
import com.sdkboilerplate.objects.SdkBodyType;
import com.sdkboilerplate.objects.SdkObject;
import com.sdkboilerplate.validation.Schema;
import org.webpossdk.objects.schemas.CallbackPaymentOrderSchema;

import java.util.HashMap;

public class CallbackPaymentOrder extends SdkObject {
    public Integer required_confirmations;
    public TransactionCollection transactions;
    public String created_at;
    public String dispute_start_date;
    public String continue_url;
    public String address;
    public String amount;
    public PaymentOrderState state;
    public Integer expires_in;
    public PaymentOrderCreator created_by;
    public String reference;
    public String cancel_url;
    public String chargeback_date;
    public String uri;
    public String callback_url;
    public String redirect_url;
    public Integer btc_amount;
    public String resolved_at;
    public String details;
    public RateRetrieval rate;
    public CurrencyRetrieval currency;
    public String uuid;
    public String expiration_time;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(CallbackPaymentOrderSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap<>();
        subObjects.put("transactions", TransactionCollection.class);
        subObjects.put("state", PaymentOrderState.class);
        subObjects.put("created_by", PaymentOrderCreator.class);
        subObjects.put("rate", RateRetrieval.class);
        subObjects.put("currency", CurrencyRetrieval.class);
        return subObjects;
    }

    public Integer getRequiredConfirmations() {
        return this.required_confirmations;
    }

    public void setRequiredConfirmations(Integer value) {
        this.required_confirmations = value;
    }

    public TransactionCollection getTransactions() {
        return this.transactions;
    }

    public void setTransactions(TransactionCollection value) {
        this.transactions = value;
    }

    public String getCreatedAt() {
        return this.created_at;
    }

    public void setCreatedAt(String value) {
        this.created_at = value;
    }

    public String getDisputeStartDate() {
        return this.dispute_start_date;
    }

    public void setDisputeStartDate(String value) {
        this.dispute_start_date = value;
    }

    public String getContinueUrl() {
        return this.continue_url;
    }

    public void setContinueUrl(String value) {
        this.continue_url = value;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String value) {
        this.amount = value;
    }

    public PaymentOrderState getState() {
        return this.state;
    }

    public void setState(PaymentOrderState value) {
        this.state = value;
    }

    public Integer getExpiresIn() {
        return this.expires_in;
    }

    public void setExpiresIn(Integer value) {
        this.expires_in = value;
    }

    public PaymentOrderCreator getCreatedBy() {
        return this.created_by;
    }

    public void setCreatedBy(PaymentOrderCreator value) {
        this.created_by = value;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String value) {
        this.reference = value;
    }

    public String getCancelUrl() {
        return this.cancel_url;
    }

    public void setCancelUrl(String value) {
        this.cancel_url = value;
    }

    public String getChargebackDate() {
        return this.chargeback_date;
    }

    public void setChargebackDate(String value) {
        this.chargeback_date = value;
    }

    public String getUri() {
        return this.uri;
    }

    public void setUri(String value) {
        this.uri = value;
    }

    public String getCallbackUrl() {
        return this.callback_url;
    }

    public void setCallbackUrl(String value) {
        this.callback_url = value;
    }

    public String getRedirectUrl() {
        return this.redirect_url;
    }

    public void setRedirectUrl(String value) {
        this.redirect_url = value;
    }

    public Integer getBtcAmount() {
        return this.btc_amount;
    }

    public void setBtcAmount(Integer value) {
        this.btc_amount = value;
    }

    public String getResolvedAt() {
        return this.resolved_at;
    }

    public void setResolvedAt(String value) {
        this.resolved_at = value;
    }

    public String getDetails() {
        return this.details;
    }

    public void setDetails(String value) {
        this.details = value;
    }

    public RateRetrieval getRate() {
        return this.rate;
    }

    public void setRate(RateRetrieval value) {
        this.rate = value;
    }

    public CurrencyRetrieval getCurrency() {
        return this.currency;
    }

    public void setCurrency(CurrencyRetrieval value) {
        this.currency = value;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String value) {
        this.uuid = value;
    }

    public String getExpirationTime() {
        return this.expiration_time;
    }

    public void setExpirationTime(String value) {
        this.expiration_time = value;
    }

    public CallbackPaymentOrder() {
    }
}
