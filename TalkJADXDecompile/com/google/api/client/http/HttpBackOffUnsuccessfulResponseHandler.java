package com.google.api.client.http;

import bc;
import gwb;
import kfd;
import kgk;

public class HttpBackOffUnsuccessfulResponseHandler implements HttpUnsuccessfulResponseHandler {
    private final kfd backOff;
    private BackOffRequired backOffRequired;
    private kgk sleeper;

    public interface BackOffRequired {
        public static final BackOffRequired ALWAYS;
        public static final BackOffRequired ON_SERVER_ERROR;

        final class 1 implements BackOffRequired {
            1() {
            }

            public boolean isRequired(HttpResponse httpResponse) {
                return true;
            }
        }

        final class 2 implements BackOffRequired {
            2() {
            }

            public boolean isRequired(HttpResponse httpResponse) {
                return httpResponse.getStatusCode() / 100 == 5;
            }
        }

        boolean isRequired(HttpResponse httpResponse);

        static {
            ALWAYS = new 1();
            ON_SERVER_ERROR = new 2();
        }
    }

    public HttpBackOffUnsuccessfulResponseHandler(kfd kfd) {
        this.backOffRequired = BackOffRequired.ON_SERVER_ERROR;
        this.sleeper = kgk.a;
        this.backOff = (kfd) bc.a((Object) kfd);
    }

    public final kfd getBackOff() {
        return this.backOff;
    }

    public final BackOffRequired getBackOffRequired() {
        return this.backOffRequired;
    }

    public HttpBackOffUnsuccessfulResponseHandler setBackOffRequired(BackOffRequired backOffRequired) {
        this.backOffRequired = (BackOffRequired) bc.a((Object) backOffRequired);
        return this;
    }

    public final kgk getSleeper() {
        return this.sleeper;
    }

    public HttpBackOffUnsuccessfulResponseHandler setSleeper(kgk kgk) {
        this.sleeper = (kgk) bc.a((Object) kgk);
        return this;
    }

    public final boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) {
        boolean z2 = false;
        if (z && this.backOffRequired.isRequired(httpResponse)) {
            try {
                z2 = gwb.a(this.sleeper, this.backOff);
            } catch (InterruptedException e) {
            }
        }
        return z2;
    }
}
