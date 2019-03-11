package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;

public class {{callback.event_type.replace('.', '_') | classname}}Callback extends SdkObject{
    {% for attribute in callback.schema  -%}
    private {{callback.schema.get(attribute).get('type') | get_j_type}} {{attribute | camel_case}};
    {% endfor -%}
    public Schema getSchema(){
        return new Schema();
    }
    public static HashMap<String, Class<? extends SdkBodyType>>  getSubObjects(){
        HashMap<String, Class<? extends SdkBodyType>>  subObjects = new HashMap<>();
        subObjects.put("object", {{callback.object_name | classname}}.class);
        return subObjects;
    }
    {% for attribute in callback.schema  -%}
    public {{callback.schema.get(attribute).get('type') | get_j_type}} get{{ attribute|classname }}(){
        return this.{{attribute | camel_case}};
    }
    public void set{{ attribute|classname }}({{callback.schema.get(attribute).get('type') | get_j_type}} value){
        this.{{attribute|camel_case}} = value;
    }
    {% endfor -%}
    public {{callback.event_type.replace('.', '_') | classname}}Callback(){}
}