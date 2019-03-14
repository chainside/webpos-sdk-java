package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;
import com.sdkboilerplate.exceptions.*;

import org.webpossdk.objects.schemas.*;

import java.util.HashMap;
import java.util.ArrayList;


public class {{object.raw_name|classname}}Collection extends SdkCollection<{{object.raw_name|classname}}>{
        public Schema getSchema() throws JsonSerializationException {
                return new Schema({{object.raw_name|classname}}Schema.jsonSchema);
        }
        public static Class<{{object.raw_name|classname}}> getElementsClass(){
                return {{object.raw_name|classname}}.class;
        }
        public {{object.raw_name|classname}}Collection(ArrayList<{{object.raw_name|classname}}> elements){
                super(elements);
        }
}
