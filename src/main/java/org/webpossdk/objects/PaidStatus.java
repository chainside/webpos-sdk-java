/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;

public class PaidStatus extends SdkObject{
    public Integer crypto;
    public String fiat;
    public Schema getSchema(){
            return new Schema();
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap<>();
        return subObjects;
        }
        public Integer getCrypto(){
            return this.crypto;
        };
        public void setCrypto(Integer value){
            this.crypto = value;
        }
        public String getFiat(){
            return this.fiat;
        };
        public void setFiat(String value){
            this.fiat = value;
        }
        public PaidStatus(){}
}
