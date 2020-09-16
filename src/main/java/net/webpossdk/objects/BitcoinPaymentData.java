/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class BitcoinPaymentData extends SdkObject{
    public String address;
        public String uri;
        public TransactionCollection transactions;
        public PaymentOrderState state;
        public Integer required_confirmations;
        public Schema getSchema() throws JsonSerializationException{
            return new Schema(BitcoinPaymentDataSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        subObjects.put("transactions", TransactionCollection.class);
        subObjects.put("state" , PaymentOrderState.class);
        return subObjects;
        }
        public String getAddress(){
            return this.address;
        }
        public void setAddress(String value){
            this.address = value;
        }
        public String getUri(){
            return this.uri;
        }
        public void setUri(String value){
            this.uri = value;
        }
        public TransactionCollection getTransactions(){
            return this.transactions;
        }
        public void setTransactions(TransactionCollection value){
            this.transactions = value;
        }
        public PaymentOrderState getState(){
            return this.state;
        }
        public void setState(PaymentOrderState value){
            this.state = value;
        }
        public Integer getRequiredConfirmations(){
            return this.required_confirmations;
        }
        public void setRequiredConfirmations(Integer value){
            this.required_confirmations = value;
        }
        public BitcoinPaymentData(){}
}
