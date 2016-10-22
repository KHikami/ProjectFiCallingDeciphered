import org.chromium.net.UrlRequest;

final class jkf implements Runnable {
    final /* synthetic */ UrlRequest a;
    final /* synthetic */ jkc b;

    jkf(jkc jkc, UrlRequest urlRequest) {
        this.b = jkc;
        this.a = urlRequest;
    }

    public void run() {
        this.a.e();
    }
}
