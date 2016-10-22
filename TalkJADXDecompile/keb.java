import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;

final class keb implements HttpRequestInitializer {
    final /* synthetic */ kea a;

    keb(kea kea) {
        this.a = kea;
    }

    public void initialize(HttpRequest httpRequest) {
        if (this.a.a != null) {
            this.a.a.initialize(httpRequest);
        }
        httpRequest.setInterceptor(new kec(this, httpRequest.getInterceptor()));
    }
}
