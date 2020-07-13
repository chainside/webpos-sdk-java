/*
Nigiri auto-generated file
*/
package net.webpossdk.objects.schemas;

public class PaymentOrderCreationResponseSchema {
    public final static String jsonSchema = "{\"rules\": [], \"schema\": {\"created_at\": {\"rules\": [\"nullable\"], \"type\": \"ISO_8601_date\"}, \"redirect_url\": {\"rules\": [\"regex[https_url]:^https://\", \"required\", \"nullable\"], \"type\": \"url\"}, \"reference\": {\"rules\": [\"nullable\"], \"type\": \"string\"}, \"uuid\": {\"rules\": [\"required\"], \"type\": \"uuid\"}}, \"type\": \"object\"}";
}