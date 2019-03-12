/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;
import java.util.ArrayList;

public class PaidStatusCollection extends SdkCollection<PaidStatus>{
        public Schema getSchema(){
                return new Schema();
        }
        public static Class<PaidStatus> getElementsClass(){
                return PaidStatus.class;
        }
        public PaidStatusCollection(ArrayList<PaidStatus> elements){
                super(elements);
        }
}