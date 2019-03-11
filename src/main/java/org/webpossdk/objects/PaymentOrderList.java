/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;

public class PaymentOrderList extends SdkObject{
    public PaymentOrderRetrievalCollection paymentorders;
    public Schema getSchema(){
            return new Schema();
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap<>();
        subObjects.put("paymentorders", PaymentOrderRetrievalCollection.class);
        return subObjects;
        }
        public PaymentOrderRetrievalCollection getPaymentorders(){
            return this.paymentorders;
        };
        public void setPaymentorders(PaymentOrderRetrievalCollection value){
            this.paymentorders = value;
        }
        public PaymentOrderList(){}
}
