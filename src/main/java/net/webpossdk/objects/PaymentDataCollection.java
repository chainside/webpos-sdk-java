/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;
import java.util.ArrayList;


public class PaymentDataCollection extends SdkCollection<PaymentData>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(PaymentDataSchema.jsonSchema);
        }
        public static Class<PaymentData> getElementsClass(){
                return PaymentData.class;
        }
        public PaymentDataCollection(ArrayList<PaymentData> elements){
                super(elements);
        }
}