/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class PaymentOrderCreation extends SdkObject{
    public String reference;
        public String continue_url;
        public Integer required_confirmations;
        public String callback_url;
        public String amount;
        public String cancel_url;
        public String details;
        public Schema getSchema() throws JsonSerializationException{
            return new Schema(PaymentOrderCreationSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        return subObjects;
        }
        public String getReference(){
            return this.reference;
        }
        public void setReference(String value){
            this.reference = value;
        }
        public String getContinueUrl(){
            return this.continue_url;
        }
        public void setContinueUrl(String value){
            this.continue_url = value;
        }
        public Integer getRequiredConfirmations(){
            return this.required_confirmations;
        }
        public void setRequiredConfirmations(Integer value){
            this.required_confirmations = value;
        }
        public String getCallbackUrl(){
            return this.callback_url;
        }
        public void setCallbackUrl(String value){
            this.callback_url = value;
        }
        public String getAmount(){
            return this.amount;
        }
        public void setAmount(String value){
            this.amount = value;
        }
        public String getCancelUrl(){
            return this.cancel_url;
        }
        public void setCancelUrl(String value){
            this.cancel_url = value;
        }
        public String getDetails(){
            return this.details;
        }
        public void setDetails(String value){
            this.details = value;
        }
        public PaymentOrderCreation(){}
}
