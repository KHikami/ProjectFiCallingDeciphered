package p000;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;

final class fba implements HttpRequestInitializer {
    final /* synthetic */ Long f12608a;
    final /* synthetic */ String f12609b;
    final /* synthetic */ keg f12610c;
    final /* synthetic */ String f12611d;
    final /* synthetic */ int f12612e;

    fba(Long l, String str, keg keg, String str2, int i) {
        this.f12608a = l;
        this.f12609b = str;
        this.f12610c = keg;
        this.f12611d = str2;
        this.f12612e = i;
    }

    public void initialize(HttpRequest httpRequest) {
        httpRequest.getHeaders().put("X-Device-ID", (Object) faz.f12606c);
        httpRequest.getHeaders().put("X-Network-ID", (Object) giw.m17757b());
        httpRequest.getHeaders().setUserAgent(gwb.m2399z());
        httpRequest.getHeaders().put("X-Auth-Time", this.f12608a != null ? this.f12608a.toString() : "none");
        if (this.f12609b != null) {
            this.f12610c.initialize(httpRequest);
        }
        if (this.f12611d != null) {
            httpRequest.getHeaders().put("X-Goog-PageId", (Object) this.f12611d);
        }
        httpRequest.setConnectTimeout(this.f12612e);
        httpRequest.setReadTimeout(this.f12612e);
    }
}
