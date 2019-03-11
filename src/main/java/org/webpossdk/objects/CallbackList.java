/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;

public class CallbackList extends SdkObject{
    public CallbackCollection callbacks;
    public Schema getSchema(){
            return new Schema();
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap<>();
        subObjects.put("callbacks", CallbackCollection.class);
        return subObjects;
        }
        public CallbackCollection getCallbacks(){
            return this.callbacks;
        };
        public void setCallbacks(CallbackCollection value){
            this.callbacks = value;
        }
        public CallbackList(){}
}
