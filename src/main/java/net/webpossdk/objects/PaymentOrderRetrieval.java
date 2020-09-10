/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class PaymentOrderRetrieval extends SdkObject{
    public PaymentData payment_data;
        public String status;
        public String callback_url;
        public String details;
        public String created_at;
        public String resolved_at;
        public String amount;
        public String dispute_start_date;
        public String chargeback_date;
        public String uuid;
        public String reference;
        public String redirect_url;
        public CurrencyRetrieval currency;
        public PaymentOrderCreator created_by;
        public Schema getSchema() throws JsonSerializationException{
            return new Schema(PaymentOrderRetrievalSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        subObjects.put("payment_data" , PaymentData.class);
        subObjects.put("currency" , CurrencyRetrieval.class);
        subObjects.put("created_by" , PaymentOrderCreator.class);
        return subObjects;
        }
        public PaymentData getPaymentData(){
            return this.payment_data;
        }
        public void setPaymentData(PaymentData value){
            this.payment_data = value;
        }
        public String getStatus(){
            return this.status;
        }
        public void setStatus(String value){
            this.status = value;
        }
        public String getCallbackUrl(){
            return this.callback_url;
        }
        public void setCallbackUrl(String value){
            this.callback_url = value;
        }
        public String getDetails(){
            return this.details;
        }
        public void setDetails(String value){
            this.details = value;
        }
        public String getCreatedAt(){
            return this.created_at;
        }
        public void setCreatedAt(String value){
            this.created_at = value;
        }
        public String getResolvedAt(){
            return this.resolved_at;
        }
        public void setResolvedAt(String value){
            this.resolved_at = value;
        }
        public String getAmount(){
            return this.amount;
        }
        public void setAmount(String value){
            this.amount = value;
        }
        public String getDisputeStartDate(){
            return this.dispute_start_date;
        }
        public void setDisputeStartDate(String value){
            this.dispute_start_date = value;
        }
        public String getChargebackDate(){
            return this.chargeback_date;
        }
        public void setChargebackDate(String value){
            this.chargeback_date = value;
        }
        public String getUuid(){
            return this.uuid;
        }
        public void setUuid(String value){
            this.uuid = value;
        }
        public String getReference(){
            return this.reference;
        }
        public void setReference(String value){
            this.reference = value;
        }
        public String getRedirectUrl(){
            return this.redirect_url;
        }
        public void setRedirectUrl(String value){
            this.redirect_url = value;
        }
        public CurrencyRetrieval getCurrency(){
            return this.currency;
        }
        public void setCurrency(CurrencyRetrieval value){
            this.currency = value;
        }
        public PaymentOrderCreator getCreatedBy(){
            return this.created_by;
        }
        public void setCreatedBy(PaymentOrderCreator value){
            this.created_by = value;
        }
        public PaymentOrderRetrieval(){}
}
