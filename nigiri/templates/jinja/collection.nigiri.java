package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;

public class {{object.raw_name|classname}}Collection extends SdkCollection<{{object.raw_name|classname}}>{
        public Schema getSchema(){
                return new Schema();
        }
        public static Class<{{object.raw_name|classname}}> getElementsClass(){
                return {{object.raw_name|classname}}.class;
        }
}
