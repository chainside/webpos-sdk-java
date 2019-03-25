package it.webpossdk.actions;

import it.sdkboilerplate.actions.*;

import it.webpossdk.api.*;
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