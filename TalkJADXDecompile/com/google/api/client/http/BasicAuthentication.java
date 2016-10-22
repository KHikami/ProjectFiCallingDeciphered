package com.google.api.client.http;

import bc;

public final class BasicAuthentication implements HttpExecuteInterceptor, HttpRequestInitializer {
    private final String password;
    private final String username;

    public BasicAuthentication(String str, String str2) {
        this.username = (String) bc.a((Object) str);
        this.password = (String) bc.a((Object) str2);
    }

    public void initialize(HttpRequest httpRequest) {
        httpRequest.setInterceptor(this);
    }

    public void intercept(HttpRequest httpRequest) {
        httpRequest.getHeaders().setBasicAuthentication(this.username, this.password);
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}
