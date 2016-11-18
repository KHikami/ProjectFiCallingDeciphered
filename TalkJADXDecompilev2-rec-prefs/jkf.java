package p000;

import org.chromium.net.UrlRequest;

final class jkf implements Runnable {
    final /* synthetic */ UrlRequest f20348a;
    final /* synthetic */ jkc f20349b;

    jkf(jkc jkc, UrlRequest urlRequest) {
        this.f20349b = jkc;
        this.f20348a = urlRequest;
    }

    public void run() {
        this.f20348a.e();
    }
}
