package p000;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;

final class keb implements HttpRequestInitializer {
    final /* synthetic */ kea f21466a;

    keb(kea kea) {
        this.f21466a = kea;
    }

    public void initialize(HttpRequest httpRequest) {
        if (this.f21466a.f21451a != null) {
            this.f21466a.f21451a.initialize(httpRequest);
        }
        httpRequest.setInterceptor(new kec(this, httpRequest.getInterceptor()));
    }
}
