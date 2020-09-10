/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class PaymentOrderState extends SdkObject{
    public String blockchain_status;
        public PaidStatus unpaid;
        public PaidStatus in_confirmation;
        public PaidStatus paid;
        public Schema getSchema() throws JsonSerializationException{
            return new Schema(PaymentOrderStateSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        subObjects.put("unpaid" , PaidStatus.class);
        subObjects.put("in_confirmation" , PaidStatus.class);
        subObjects.put("paid" , PaidStatus.class);
        return subObjects;
        }
        public String getBlockchainStatus(){
            return this.blockchain_status;
        }
        public void setBlockchainStatus(String value){
            this.blockchain_status = value;
        }
        public PaidStatus getUnpaid(){
            return this.unpaid;
        }
        public void setUnpaid(PaidStatus value){
            this.unpaid = value;
        }
        public PaidStatus getInConfirmation(){
            return this.in_confirmation;
        }
        public void setInConfirmation(PaidStatus value){
            this.in_confirmation = value;
        }
        public PaidStatus getPaid(){
            return this.paid;
        }
        public void setPaid(PaidStatus value){
            this.paid = value;
        }
        public PaymentOrderState(){}
}
