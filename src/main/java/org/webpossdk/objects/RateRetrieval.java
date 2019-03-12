/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;

public class RateRetrieval extends SdkObject{
    public String created_at;
    public String value;
    public String source;
    public String to;
    public String from;
    public Schema getSchema(){
            return new Schema();
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap<>();
        return subObjects;
        }
        public String getCreatedAt(){
            return this.created_at;
        };
        public void setCreatedAt(String value){
            this.created_at = value;
        }
        public String getValue(){
            return this.value;
        };
        public void setValue(String value){
            this.value = value;
        }
        public String getSource(){
            return this.source;
        };
        public void setSource(String value){
            this.source = value;
        }
        public String getTo(){
            return this.to;
        };
        public void setTo(String value){
            this.to = value;
        }
        public String getFrom(){
            return this.from;
        };
        public void setFrom(String value){
            this.from = value;
        }
        public RateRetrieval(){}
}
