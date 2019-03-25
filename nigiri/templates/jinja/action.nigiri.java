package it.webpossdk.actions;

import it.webpossdk.objects.*;
import it.webpossdk.lib.*;
import it.webpossdk.exceptions.*;

import it.sdkboilerplate.exceptions.*;
import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.lib.*;
import it.sdkboilerplate.validation.*;

import java.util.*;

{% set parent_class = 'ChainsideAction' -%}
{% if endpoint.tags -%}
{% if 'Authenticated' in endpoint.tags -%}
{% set parent_class = 'ChainsideAuthenticatedAction' -%}
{% elif 'Authenticating' in endpoint.tags -%}
{% set parent_class = 'ChainsideAuthenticatingAction' -%}
{% endif -%}
{% else %}
{% endif -%}

public class {{endpoint.namespace | classname }}Action extends {{parent_class}}{
    public {{endpoint.namespace | classname}}Action(ApiContext ctx){
        super(ctx);
    }
    @Override
    public String getRoute(){
            return "{{endpoint.route}}";
    }
    @Override
    public String getVerb(){
        return "{{endpoint.verb}}";

    }
    @Override
    public Schema getQueryParametersSchema () {return new Schema();}
    @Override
    public Schema getRouteParametersSchema () {return new Schema();}

    public HashMap<String, Class<? extends SdkHttpException>> getErrors() {
        HashMap<String, Class<? extends SdkHttpException>> errors = new HashMap<>();
        errors.putAll(super.getErrors());
        {% for error in endpoint.response.errors -%}
        errors.put("{{ error }}" , {{errors_dict[error] | error_classname}}.class);
        {% endfor -%}
        return errors;
        }
    @Override
    public Class<? extends SdkBodyType> getRequestBodyClass() {
        {% if endpoint | request_body_class -%}
        return {{endpoint | request_body_class }}.class;
        {% else -%}
        return null;
        {% endif -%}
    }
    @Override
    public Class<? extends SdkBodyType> getResponseBodyClass() {
        {% if endpoint | response_body_class -%}
        return {{endpoint | response_body_class }}.class;
        {% else -%}
        return null;
        {% endif -%}
    }
    @Override
    public HashMap<String, String> getHeaders(){
        HashMap<String, String> headers = new HashMap<>();
        {% for header_name, header_value in endpoint.request._headers.items() -%}
        {% if header_name != 'Authorization' -%}
        headers.put("{{header_name}}", "{{header_value.value}}");
        {% endif -%}
        {% endfor -%}
        return headers;
    }
    {% if endpoint.request.uri_params -%}
    {% for key in endpoint.request.uri_params -%}
    public void set{{key | classname}}(String value){
        this.setRouteParameter("{{key}}", value);
    }
    {% endfor -%}
    {% endif -%}
    {% if endpoint.request.query_params -%}
    {% for key in endpoint.request.query_params -%}
    public void set{{key | classname}}(String value){
        this.setQueryParameter("{{key}}", value);
    }
    {% endfor -%}
    {% endif -%}
    {% if endpoint.request.body_params -%}
    public void set{{endpoint | request_body_class }}({{endpoint | request_body_class }} value)
        throws ReflectiveOperationException, UnserializableObjectException{
        this.setRequestBody(value);
    }
    {% endif -%}


}