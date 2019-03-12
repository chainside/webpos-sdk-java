/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;

public class PaymentOrderState extends SdkObject{
    public String status;
    public PaidStatus in_confirmation;
    public PaidStatus paid;
    public PaidStatus unpaid;
    public String blockchain_status;
    public Schema getSchema(){
            return new Schema();
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap<>();
        subObjects.put("in_confirmation" , PaidStatus.class);
        subObjects.put("paid" , PaidStatus.class);
        subObjects.put("unpaid" , PaidStatus.class);
        return subObjects;
        }
        public String getStatus(){
            return this.status;
        };
        public void setStatus(String value){
            this.status = value;
        }
        public PaidStatus getInConfirmation(){
            return this.in_confirmation;
        };
        public void setInConfirmation(PaidStatus value){
            this.in_confirmation = value;
        }
        public PaidStatus getPaid(){
            return this.paid;
        };
        public void setPaid(PaidStatus value){
            this.paid = value;
        }
        public PaidStatus getUnpaid(){
            return this.unpaid;
        };
        public void setUnpaid(PaidStatus value){
            this.unpaid = value;
        }
        public String getBlockchainStatus(){
            return this.blockchain_status;
        };
        public void setBlockchainStatus(String value){
            this.blockchain_status = value;
        }
        public PaymentOrderState(){}
}
