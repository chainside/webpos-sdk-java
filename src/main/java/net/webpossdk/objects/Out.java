/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class Out extends SdkObject{
    public Long amount;
        public Integer n;
        public Schema getSchema() throws JsonSerializationException{
            return new Schema(OutSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        return subObjects;
        }
        public Long getAmount(){
            return this.amount;
        }
        public void setAmount(Integer value){
            this.amount = Long.valueOf(value);
        }
        public void setAmount(Long value){
            this.amount = value;
        }
        public Integer getN(){
            return this.n;
        }
        public void setN(Integer value){
            this.n = value;
        }
        public Out(){}
}
