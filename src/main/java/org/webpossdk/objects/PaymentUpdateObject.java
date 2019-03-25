/*
Nigiri auto-generated file
*/
package it.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import it.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class PaymentUpdateObject extends SdkObject{
    public String callback;
    public Schema getSchema() throws JsonSerializationException{
            return new Schema(PaymentUpdateObjectSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap<>();
        return subObjects;
        }
        public String getCallback(){
            return this.callback;
        }
        public void setCallback(String value){
            this.callback = value;
        }
        public PaymentUpdateObject(){}
}
