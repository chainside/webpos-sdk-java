/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;
import java.util.ArrayList;

public class PaymentOrderCreationCollection extends SdkCollection<PaymentOrderCreation>{
        public Schema getSchema(){
                return new Schema();
        }
        public static Class<PaymentOrderCreation> getElementsClass(){
                return PaymentOrderCreation.class;
        }
        public PaymentOrderCreationCollection(ArrayList<PaymentOrderCreation> elements){
                super(elements);
        }
}