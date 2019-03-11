/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;

public class Callback extends SdkObject{
    public String name;
    public Schema getSchema(){
            return new Schema();
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap<>();
        return subObjects;
        }
        public String getName(){
            return this.name;
        };
        public void setName(String value){
            this.name = value;
        }
        public Callback(){}
}
