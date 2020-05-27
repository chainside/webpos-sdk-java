/*
Nigiri auto-generated file
*/
package net.webpossdk.objects.schemas;

public class PaymentOrderCreationResponseSchema {
    public final static String jsonSchema = "{\"rules\": [], \"schema\": {\"address\": {\"rules\": [\"regex:^(bc1|[13]|tb1|[2nm]|bcrt)[a-zA-HJ-NP-Z0-9]{25,40}$\", \"required\"], \"type\": \"string\"}, \"amount\": {\"rules\": [\"required\"], \"type\": \"integer\"}, \"created_at\": {\"rules\": [\"nullable\"], \"type\": \"ISO_8601_date\"}, \"expiration_time\": {\"rules\": [\"required\"], \"type\": \"ISO_8601_date\"}, \"expires_in\": {\"rules\": [\"required\"], \"type\": \"integer\"}, \"rate\": {\"rules\": [\"required\"], \"schema\": {\"created_at\": {\"rules\": [\"required\"], \"type\": \"ISO_8601_date\"}, \"from\": {\"rules\": [], \"type\": \"string\"}, \"source\": {\"rules\": [\"required\"], \"type\": \"string\"}, \"to\": {\"rules\": [], \"type\": \"string\"}, \"value\": {\"rules\": [\"decimal\", \"required\"], \"type\": \"string\"}}, \"type\": \"object\"}, \"redirect_url\": {\"rules\": [\"regex[https_url]:^https://\", \"required\", \"nullable\"], \"type\": \"url\"}, \"reference\": {\"rules\": [\"nullable\"], \"type\": \"string\"}, \"uri\": {\"rules\": [\"regex:^\", \"required\"], \"type\": \"string\"}, \"uuid\": {\"rules\": [\"required\"], \"type\": \"uuid\"}}, \"type\": \"object\"}";
}