/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;

public class CurrencyRetrieval extends SdkObject{
    public String type;
    public String name;
    public String uuid;
    public Schema getSchema(){
            return new Schema();
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap<>();
        return subObjects;
        }
        public String getType(){
            return this.type;
        };
        public void setType(String value){
            this.type = value;
        }
        public String getName(){
            return this.name;
        };
        public void setName(String value){
            this.name = value;
        }
        public String getUuid(){
            return this.uuid;
        };
        public void setUuid(String value){
            this.uuid = value;
        }
        public CurrencyRetrieval(){}
}
