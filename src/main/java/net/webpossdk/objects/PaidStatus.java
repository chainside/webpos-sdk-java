/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class PaidStatus extends SdkObject{
    public String fiat;
        public Long crypto;
        public Schema getSchema() throws JsonSerializationException{
            return new Schema(PaidStatusSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        return subObjects;
        }
        public String getFiat(){
            return this.fiat;
        }
        public void setFiat(String value){
            this.fiat = value;
        }
        public Long getCrypto(){
            return this.crypto;
        }
        public void setCrypto(Integer value){
            this.crypto = Long.valueOf(value);
        }
        public void setCrypto(Long value){
            this.crypto = value;
        }
        public PaidStatus(){}
}
