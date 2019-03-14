package org.webpossdk.objects.schemas;

public class {{object.raw_name | classname}}Schema {
    public final static String jsonSchema = {{object.expanded_schema | filter_descriptions | tojson | tojson(indent=2)}};
}