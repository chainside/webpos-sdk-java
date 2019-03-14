package org.webpossdk.objects.schemas;

public class {{callback.object_name | classname}}Schema {
public final static String jsonSchema = {{callback.schema | filter_descriptions | tojson | tojson}};
        }