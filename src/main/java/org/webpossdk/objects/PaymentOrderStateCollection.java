/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;
import java.util.ArrayList;

public class PaymentOrderStateCollection extends SdkCollection<PaymentOrderState>{
        public Schema getSchema(){
                return new Schema();
        }
        public static Class<PaymentOrderState> getElementsClass(){
                return PaymentOrderState.class;
        }
        public PaymentOrderStateCollection(ArrayList<PaymentOrderState> elements){
                super(elements);
        }
}