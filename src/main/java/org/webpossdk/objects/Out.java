/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;

public class Out extends SdkObject{
    public Integer amount;
    public Integer n;
    public Schema getSchema(){
            return new Schema();
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap<>();
        return subObjects;
        }
        public Integer getAmount(){
            return this.amount;
        };
        public void setAmount(Integer value){
            this.amount = value;
        }
        public Integer getN(){
            return this.n;
        };
        public void setN(Integer value){
            this.n = value;
        }
        public Out(){}
}
