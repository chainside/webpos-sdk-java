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


public class OutCollection extends SdkCollection<Out>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema(OutSchema.jsonSchema);
        }
        public static Class<Out> getElementsClass(){
                return Out.class;
        }
        public OutCollection(ArrayList<Out> elements){
                super(elements);
        }
}