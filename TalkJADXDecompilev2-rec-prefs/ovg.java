package p000;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

final class ovg {
    final Callback f34361a;
    final Executor f34362b;
    final /* synthetic */ oup f34363c;

    ovg(oup oup, Callback callback, Executor executor) {
        this.f34363c = oup;
        this.f34361a = callback;
        this.f34362b = executor;
    }

    private void m39760a(ovw ovw, ovn ovn) {
        try {
            this.f34362b.execute(new ovf(this.f34363c, ovn, ovw));
        } catch (Throwable e) {
            this.f34363c.m39748a(ovw, e);
        }
    }

    void m39763a(UrlResponseInfo urlResponseInfo, String str) {
        m39760a(ovw.AWAITING_FOLLOW_REDIRECT, new ovh(this, urlResponseInfo, str));
    }

    void m39761a() {
        m39760a(ovw.AWAITING_READ, new ovi(this));
    }

    void m39764a(UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        m39760a(ovw.AWAITING_READ, new ovj(this, urlResponseInfo, byteBuffer));
    }

    void m39762a(UrlResponseInfo urlResponseInfo) {
        oup.m39737a(this.f34363c.f34330m);
        this.f34362b.execute(new ovk(this, urlResponseInfo));
    }

    void m39766b(UrlResponseInfo urlResponseInfo) {
        this.f34362b.execute(new ovl(this, urlResponseInfo));
    }

    void m39765a(UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        oup.m39737a(this.f34363c.f34330m);
        this.f34362b.execute(new ovm(this, urlResponseInfo, urlRequestException));
    }
}
