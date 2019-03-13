/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;

public class PaymentOrderCreator extends SdkObject{
    public String type;
    public DepositAccountLite deposit_account;
    public String name;
    public String uuid;
    public Boolean active;
    public Schema getSchema(){
            return new Schema();
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap<>();
        subObjects.put("deposit_account" , DepositAccountLite.class);
        return subObjects;
        }
        public String getType(){
            return this.type;
        };
        public void setType(String value){
            this.type = value;
        }
        public DepositAccountLite getDepositAccount(){
            return this.deposit_account;
        };
        public void setDepositAccount(DepositAccountLite value){
            this.deposit_account = value;
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
        public Boolean getActive(){
            return this.active;
        };
        public void setActive(Boolean value){
            this.active = value;
        }
        public PaymentOrderCreator(){}
}
