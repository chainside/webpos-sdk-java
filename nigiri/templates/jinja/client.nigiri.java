package org.webpossdk.api;

import com.sdkboilerplate.actions.*;
import com.sdkboilerplate.exceptions.*;

import org.webpossdk.actions.*;
import org.webpossdk.objects.*;

import java.util.HashMap;

public class ChainsideClient{
    private HashMap<String, Object> config;
    private ChainsideActionFactory factory;
    private ChainsideApiContext ctx;

    public ChainsideClient(HashMap<String, Object> config) throws ConfigurationException, Exception{

        this.config = config;
        this.ctx = new ChainsideApiContext(config);
        this.factory = new ChainsideActionFactory(this.ctx);

        this.login();



    }
    {% for endpoint in endpoints -%}
    public {{endpoint | request_return_type}} {{endpoint.namespace | camel_case}}({{endpoint | params_to_init}})
        throws ReflectiveOperationException, SdkException{
        {{endpoint.namespace | classname }}Action action = ({{endpoint.namespace | classname }}Action)this.factory.make("{{endpoint.namespace | camel_case}}");
        {% if endpoint.request.uri_params -%}
        {% for key in endpoint.request.uri_params -%}
        action.set{{key | classname}}({{key | camel_case}});
        {% endfor -%}
        {% endif -%}
        {% if endpoint.request.query_params -%}
        {% for key in endpoint.request.query_params -%}
        if ({{key | camel_case}} != null){
        action.set{{key | classname}}({{key | camel_case}});
        }
        {% endfor -%}
        {% endif -%}
        {% if endpoint.request.body_params -%}
        action.set{{endpoint | request_body_class}}({{endpoint.request.body_params.raw_name | camel_case }});
        {% endif -%}

        {% if (endpoint | request_return_type) != "void" -%}
            return ({{endpoint | request_return_type}})action.run();
        {% else -%}
            action.run();
        {% endif -%}
    }
    {% endfor -%}
    public void login() throws Exception {
        ChainsideAuthenticatedAction.login(this.ctx);
    }
}