/*
Nigiri auto-generated file
*/
package it.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import it.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class ClientCredentials extends SdkObject{
    public String scope;
    public String grant_type;
    public Schema getSchema() throws JsonSerializationException{
            return new Schema(ClientCredentialsSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap<>();
        return subObjects;
        }
        public String getScope(){
            return this.scope;
        }
        public void setScope(String value){
            this.scope = value;
        }
        public String getGrantType(){
            return this.grant_type;
        }
        public void setGrantType(String value){
            this.grant_type = value;
        }
        public ClientCredentials(){}
}
