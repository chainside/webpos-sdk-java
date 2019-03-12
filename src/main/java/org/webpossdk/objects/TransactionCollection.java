/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;
import java.util.ArrayList;

public class TransactionCollection extends SdkCollection<Transaction>{
        public Schema getSchema(){
                return new Schema();
        }
        public static Class<Transaction> getElementsClass(){
                return Transaction.class;
        }
        public TransactionCollection(ArrayList<Transaction> elements){
                super(elements);
        }
}