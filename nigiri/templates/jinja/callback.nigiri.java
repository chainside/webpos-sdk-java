package it.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import it.webpossdk.objects.schemas.*;
import it.webpossdk.objects.*;

import java.util.HashMap;

public class {{callback.event_type.replace('.', '_') | classname}}Callback extends SdkObject{

    {% for attribute in callback.schema  -%}
    {% if attribute == 'object' -%}
    {% set otype = callback.object_name | classname -%}
    {% else -%}
    {% set otype = callback.schema.get(attribute).get('type') | get_j_type -%}
    {% endif -%}
    private {{otype}} {{attribute | camel_case}};
    public {{otype}} get{{ attribute|classname }}(){ return this.{{attribute | camel_case}};}
    public void set{{ attribute|classname }}({{otype}} value){this.{{attribute|camel_case}} = value;}
    {% endfor -%}
    public Schema getSchema() throws JsonSerializationException{
        return new Schema({{callback.object_name | classname}}Schema.jsonSchema);
    }
    public static HashMap<String, Class<? extends SdkBodyType>>  getSubObjects(){
        HashMap<String, Class<? extends SdkBodyType>>  subObjects = new HashMap<>();
        subObjects.put("object", {{callback.object_name | classname}}.class);
        return subObjects;
    }



    public {{callback.event_type.replace('.', '_') | classname}}Callback(){}
}