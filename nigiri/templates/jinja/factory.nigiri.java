package org.webpossdk.actions;

import com.sdkboilerplate.actions.*;

import org.webpossdk.api.*;
import java.util.HashMap;

public class ChainsideActionFactory extends ActionsFactory{
    public HashMap<String, Class<? extends Action>> getActions(){
        HashMap<String, Class<? extends Action>> actions = new HashMap<>();
        {% for endpoint in endpoints -%}
        actions.put("{{endpoint.namespace | camel_case}}" , {{endpoint.namespace | classname }}Action.class);
        {% endfor -%}
        return actions;
    }
    public ChainsideActionFactory(ChainsideApiContext ctx){
        super(ctx);
    }
}