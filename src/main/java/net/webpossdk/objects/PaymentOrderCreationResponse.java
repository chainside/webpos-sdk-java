/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.objects.SdkObject;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.PaymentOrderCreationResponseSchema;

import java.util.HashMap;

public class PaymentOrderCreationResponse extends SdkObject {
    public String redirect_url;
    public String uuid;
    public String expiration_time;
    public Long amount;
    public String address;
    public String uri;
    public Integer expires_in;
    public RateRetrieval rate;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderCreationResponseSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap();
        subObjects.put("rate", RateRetrieval.class);
        return subObjects;
    }

    public String getRedirectUrl() {
        return this.redirect_url;
    }

    public void setRedirectUrl(String value) {
        this.redirect_url = value;
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

    public Long getAmount() {
        return this.amount;
    }

    public void setAmount(Integer value) {
        this.amount = Long.valueOf(value);
    }

    public void setAmount(Long value) {
        this.amount = value;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public String getUri() {
        return this.uri;
    }

    public void setUri(String value) {
        this.uri = value;
    }

    public Integer getExpiresIn() {
        return this.expires_in;
    }

    public void setExpiresIn(Integer value) {
        this.expires_in = value;
    }

    public RateRetrieval getRate() {
        return this.rate;
    }

    public void setRate(RateRetrieval value) {
        this.rate = value;
    }

    public PaymentOrderCreationResponse() {
    }
}
