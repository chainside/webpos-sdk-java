/*
Nigiri auto-generated file
*/
package it.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import it.webpossdk.objects.schemas.*;

import java.util.HashMap;
import java.util.ArrayList;


public class CallbackListCollection extends SdkCollection<CallbackList>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(CallbackListSchema.jsonSchema);
        }
        public static Class<CallbackList> getElementsClass(){
                return CallbackList.class;
        }
        public CallbackListCollection(ArrayList<CallbackList> elements){
                super(elements);
        }
}