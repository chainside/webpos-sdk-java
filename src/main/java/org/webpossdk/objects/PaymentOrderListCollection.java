/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;
import java.util.ArrayList;

public class PaymentOrderListCollection extends SdkCollection<PaymentOrderList>{
        public Schema getSchema(){
                return new Schema();
        }
        public static Class<PaymentOrderList> getElementsClass(){
                return PaymentOrderList.class;
        }
        public PaymentOrderListCollection(ArrayList<PaymentOrderList> elements){
                super(elements);
        }
}