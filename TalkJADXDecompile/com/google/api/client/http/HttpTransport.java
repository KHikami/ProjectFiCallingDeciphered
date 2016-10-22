package com.google.api.client.http;

import java.util.Arrays;
import java.util.logging.Logger;

public abstract class HttpTransport {
    static final Logger LOGGER;
    private static final String[] SUPPORTED_METHODS;

    public abstract LowLevelHttpRequest buildRequest(String str, String str2);

    static {
        LOGGER = Logger.getLogger(HttpTransport.class.getName());
        String[] strArr = new String[]{HttpMethods.DELETE, HttpMethods.GET, HttpMethods.POST, HttpMethods.PUT};
        SUPPORTED_METHODS = strArr;
        Arrays.sort(strArr);
    }

    public final HttpRequestFactory createRequestFactory() {
        return createRequestFactory(null);
    }

    public final HttpRequestFactory createRequestFactory(HttpRequestInitializer httpRequestInitializer) {
        return new HttpRequestFactory(this, httpRequestInitializer);
    }

    HttpRequest buildRequest() {
        return new HttpRequest(this, null);
    }

    public boolean supportsMethod(String str) {
        return Arrays.binarySearch(SUPPORTED_METHODS, str) >= 0;
    }

    public void shutdown() {
    }
}
