package org.webpossdk.api;

public class Hostnames {
    private final static String LIVE_HOSTNAME = "https://api.staging.chainside.net";
    private final static String SANDBOX_HOSTNAME = "https://api.sandbox.staging.chainside.net";

    public static String get(String mode) {
        return mode.equals("live") ? LIVE_HOSTNAME : SANDBOX_HOSTNAME;
    }
}
