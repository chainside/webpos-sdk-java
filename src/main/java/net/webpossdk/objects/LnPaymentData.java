/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class LnPaymentData extends SdkObject{
    public String invoice;
        public Schema getSchema() throws JsonSerializationException{
            return new Schema(LnPaymentDataSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        return subObjects;
        }
        public String getInvoice(){
            return this.invoice;
        }
        public void setInvoice(String value){
            this.invoice = value;
        }
        public LnPaymentData(){}
}
