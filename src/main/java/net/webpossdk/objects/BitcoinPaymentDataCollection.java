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


public class BitcoinPaymentDataCollection extends SdkCollection<BitcoinPaymentData>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(BitcoinPaymentDataSchema.jsonSchema);
        }
        public static Class<BitcoinPaymentData> getElementsClass(){
                return BitcoinPaymentData.class;
        }
        public BitcoinPaymentDataCollection(ArrayList<BitcoinPaymentData> elements){
                super(elements);
        }
}