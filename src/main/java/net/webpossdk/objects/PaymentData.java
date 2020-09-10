/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class PaymentData extends SdkObject{
    public RateRetrieval rate;
        public String payment_method;
        public Integer amount;
        public LnPaymentData ln;
        public BitcoinPaymentData bitcoin;
        public String expiration_time;
        public Integer expires_in;
        public Schema getSchema() throws JsonSerializationException{
            return new Schema(PaymentDataSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        subObjects.put("rate" , RateRetrieval.class);
        subObjects.put("ln" , LnPaymentData.class);
        subObjects.put("bitcoin" , BitcoinPaymentData.class);
        return subObjects;
        }
        public RateRetrieval getRate(){
            return this.rate;
        }
        public void setRate(RateRetrieval value){
            this.rate = value;
        }
        public String getPaymentMethod(){
            return this.payment_method;
        }
        public void setPaymentMethod(String value){
            this.payment_method = value;
        }
        public Integer getAmount(){
            return this.amount;
        }
        public void setAmount(Integer value){
            this.amount = value;
        }
        public LnPaymentData getLn(){
            return this.ln;
        }
        public void setLn(LnPaymentData value){
            this.ln = value;
        }
        public BitcoinPaymentData getBitcoin(){
            return this.bitcoin;
        }
        public void setBitcoin(BitcoinPaymentData value){
            this.bitcoin = value;
        }
        public String getExpirationTime(){
            return this.expiration_time;
        }
        public void setExpirationTime(String value){
            this.expiration_time = value;
        }
        public Integer getExpiresIn(){
            return this.expires_in;
        }
        public void setExpiresIn(Integer value){
            this.expires_in = value;
        }
        public PaymentData(){}
}
