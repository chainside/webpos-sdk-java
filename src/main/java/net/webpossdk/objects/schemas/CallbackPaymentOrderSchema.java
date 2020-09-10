/*
Nigiri auto-generated file
*/
package net.webpossdk.objects.schemas;

public class CallbackPaymentOrderSchema {
public final static String jsonSchema = "{\"created_at\": {\"rules\": [\"required\"], \"type\": \"ISO_8601_date\"}, \"event\": {\"rules\": [\"required\", \"equals:payment.chargeback\"], \"type\": \"string\"}, \"object\": {\"rules\": [], \"schema\": {\"uuid\": {\"rules\": [\"required\"], \"type\": \"uuid\"}}, \"type\": \"object\"}, \"object_type\": {\"rules\": [\"required\", \"nullable\"], \"type\": \"string\"}}";
        }