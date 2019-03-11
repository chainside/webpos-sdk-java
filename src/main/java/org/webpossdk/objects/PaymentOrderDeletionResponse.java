/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;

public class PaymentOrderDeletionResponse extends SdkObject{
    public String cancel_url;
    public Schema getSchema(){
            return new Schema();
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap<>();
        return subObjects;
        }
        public String getCancelUrl(){
            return this.cancel_url;
        };
        public void setCancelUrl(String value){
            this.cancel_url = value;
        }
        public PaymentOrderDeletionResponse(){}
}
