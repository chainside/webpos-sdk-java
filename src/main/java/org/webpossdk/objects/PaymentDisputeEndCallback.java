/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;

public class PaymentDisputeEndCallback extends SdkObject{
    private String createdAt;
    private String event;
    private Object object;
    private String objectType;
    public Schema getSchema(){
        return new Schema();
    }
    public static HashMap<String, Class<? extends SdkBodyType>>  getSubObjects(){
        HashMap<String, Class<? extends SdkBodyType>>  subObjects = new HashMap<>();
        subObjects.put("object", CallbackPaymentOrder.class);
        return subObjects;
    }
    public String getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(String value){
        this.createdAt = value;
    }
    public String getEvent(){
        return this.event;
    }
    public void setEvent(String value){
        this.event = value;
    }
    public Object getObject(){
        return this.object;
    }
    public void setObject(Object value){
        this.object = value;
    }
    public String getObjectType(){
        return this.objectType;
    }
    public void setObjectType(String value){
        this.objectType = value;
    }
    public PaymentDisputeEndCallback(){}
}