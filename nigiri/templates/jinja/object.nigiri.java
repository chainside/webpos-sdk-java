package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;
import com.sdkboilerplate.exceptions.*;

import org.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class {{object.raw_name | classname}} extends SdkObject{
    {% for attribute in object._schema  -%}
        public {{object._schema.get(attribute).get('type') | get_j_type}} {{attribute}};
    {% endfor -%}
    public Schema getSchema() throws JsonSerializationException{
            return new Schema({{object.raw_name | classname}}Schema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap<>();
        {% for key in object._schema -%}
        {% if object._schema[key] | is_object_type -%}
        subObjects.put("{{key}}" , {{object._schema[key].get('type').replace('object(', '').replace(')', '') |  classname}}.class);
        {% elif object._schema[key] | is_array_type -%}
        subObjects.put("{{key}}", {{object._schema[key].get('type').replace('array[', '').replace(']', '') |  classname}}Collection.class);
        {% endif -%}
        {% endfor -%}
        return subObjects;
        }
        {% for attribute in object._schema  -%}
        public {{object._schema.get(attribute).get('type') | get_j_type}} get{{ attribute|classname }}(){
            return this.{{attribute}};
        };
        public void set{{ attribute|classname }}({{object._schema.get(attribute).get('type') | get_j_type}} value){
            this.{{attribute}} = value;
        }
        {% endfor -%}
    public {{object.raw_name | classname}}(){}
}

