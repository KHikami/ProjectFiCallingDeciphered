package defpackage;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;

final class fba implements HttpRequestInitializer {
    final /* synthetic */ Long a;
    final /* synthetic */ String b;
    final /* synthetic */ keg c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;

    fba(Long l, String str, keg keg, String str2, int i) {
        this.a = l;
        this.b = str;
        this.c = keg;
        this.d = str2;
        this.e = i;
    }

    public void initialize(HttpRequest httpRequest) {
        httpRequest.getHeaders().put("X-Device-ID", (Object) faz.c);
        httpRequest.getHeaders().put("X-Network-ID", (Object) giw.b());
        httpRequest.getHeaders().setUserAgent(gwb.z());
        httpRequest.getHeaders().put("X-Auth-Time", this.a != null ? this.a.toString() : "none");
        if (this.b != null) {
            this.c.initialize(httpRequest);
        }
        if (this.d != null) {
            httpRequest.getHeaders().put("X-Goog-PageId", (Object) this.d);
        }
        httpRequest.setConnectTimeout(this.e);
        httpRequest.setReadTimeout(this.e);
    }
}
