/*
Nigiri auto-generated file
*/
package org.webpossdk.objects;

import com.sdkboilerplate.objects.*;
import com.sdkboilerplate.validation.*;

import java.util.HashMap;
import java.util.ArrayList;


public class ClientCredentialsCollection extends SdkCollection<ClientCredentials>{
        public Schema getSchema(){
                return new Schema();
        }
        public static Class<ClientCredentials> getElementsClass(){
                return ClientCredentials.class;
        }
        public ClientCredentialsCollection(ArrayList<ClientCredentials> elements){
                super(elements);
        }
}