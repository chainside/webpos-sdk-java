package it.webpossdk.callbacks;

import it.webpossdk.actions.*;
import it.webpossdk.objects.*;

import it.sdkboilerplate.objects.*;

import java.util.HashMap;

public class ChainsideCallbackFactory {
    public static HashMap<String, Class<? extends SdkObject>> getCallbacks(){
        HashMap<String, Class<? extends SdkObject>> callbacks = new HashMap<>();
        {% for callback in callbacks -%}
        callbacks.put("{{callback.event_type}}" , {{callback.event_type.replace('.', '_') | classname}}Callback.class);
        {% endfor -%}
        return callbacks;
    }
}