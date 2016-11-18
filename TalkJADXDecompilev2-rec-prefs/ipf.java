package p000;

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;

final class ipf implements HttpRequestInitializer {
    final /* synthetic */ String f18640a;
    final /* synthetic */ String f18641b;
    final /* synthetic */ keg f18642c;
    final /* synthetic */ int f18643d;

    ipf(String str, String str2, keg keg, int i) {
        this.f18640a = str;
        this.f18641b = str2;
        this.f18642c = keg;
        this.f18643d = i;
    }

    public void initialize(HttpRequest httpRequest) {
        if (httpRequest != null) {
            HttpHeaders headers = httpRequest.getHeaders();
            headers.put("X-Auth-Time", this.f18640a != null ? this.f18640a : "none");
            headers.put("X-Goog-Encode-Response-If-Executable", (Object) "base64");
            if (this.f18641b != null) {
                this.f18642c.initialize(httpRequest);
            }
            httpRequest.setConnectTimeout(this.f18643d);
            httpRequest.setReadTimeout(this.f18643d);
        }
    }
}
