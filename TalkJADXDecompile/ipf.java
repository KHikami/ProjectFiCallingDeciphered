import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;

final class ipf implements HttpRequestInitializer {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ keg c;
    final /* synthetic */ int d;

    ipf(String str, String str2, keg keg, int i) {
        this.a = str;
        this.b = str2;
        this.c = keg;
        this.d = i;
    }

    public void initialize(HttpRequest httpRequest) {
        if (httpRequest != null) {
            HttpHeaders headers = httpRequest.getHeaders();
            headers.put("X-Auth-Time", this.a != null ? this.a : "none");
            headers.put("X-Goog-Encode-Response-If-Executable", (Object) "base64");
            if (this.b != null) {
                this.c.initialize(httpRequest);
            }
            httpRequest.setConnectTimeout(this.d);
            httpRequest.setReadTimeout(this.d);
        }
    }
}
