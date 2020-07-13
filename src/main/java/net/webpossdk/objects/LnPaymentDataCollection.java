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


public class LnPaymentDataCollection extends SdkCollection<LnPaymentData>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(LnPaymentDataSchema.jsonSchema);
        }
        public static Class<LnPaymentData> getElementsClass(){
                return LnPaymentData.class;
        }
        public LnPaymentDataCollection(ArrayList<LnPaymentData> elements){
                super(elements);
        }
}