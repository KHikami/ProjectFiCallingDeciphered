package com.google.api.client.http;

import bc;
import gwb;
import kfd;
import kgk;

public class HttpBackOffIOExceptionHandler implements HttpIOExceptionHandler {
    private final kfd backOff;
    private kgk sleeper;

    public HttpBackOffIOExceptionHandler(kfd kfd) {
        this.sleeper = kgk.a;
        this.backOff = (kfd) bc.a((Object) kfd);
    }

    public final kfd getBackOff() {
        return this.backOff;
    }

    public final kgk getSleeper() {
        return this.sleeper;
    }

    public HttpBackOffIOExceptionHandler setSleeper(kgk kgk) {
        this.sleeper = (kgk) bc.a((Object) kgk);
        return this;
    }

    public boolean handleIOException(HttpRequest httpRequest, boolean z) {
        boolean z2 = false;
        if (z) {
            try {
                z2 = gwb.a(this.sleeper, this.backOff);
            } catch (InterruptedException e) {
            }
        }
        return z2;
    }
}
