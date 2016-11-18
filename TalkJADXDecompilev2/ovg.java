package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

final class ovg {
    final Callback a;
    final Executor b;
    final /* synthetic */ oup c;

    ovg(oup oup, Callback callback, Executor executor) {
        this.c = oup;
        this.a = callback;
        this.b = executor;
    }

    private void a(ovw ovw, ovn ovn) {
        try {
            this.b.execute(new ovf(this.c, ovn, ovw));
        } catch (Throwable e) {
            this.c.a(ovw, e);
        }
    }

    void a(UrlResponseInfo urlResponseInfo, String str) {
        a(ovw.AWAITING_FOLLOW_REDIRECT, new ovh(this, urlResponseInfo, str));
    }

    void a() {
        a(ovw.AWAITING_READ, new ovi(this));
    }

    void a(UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        a(ovw.AWAITING_READ, new ovj(this, urlResponseInfo, byteBuffer));
    }

    void a(UrlResponseInfo urlResponseInfo) {
        oup.a(this.c.m);
        this.b.execute(new ovk(this, urlResponseInfo));
    }

    void b(UrlResponseInfo urlResponseInfo) {
        this.b.execute(new ovl(this, urlResponseInfo));
    }

    void a(UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        oup.a(this.c.m);
        this.b.execute(new ovm(this, urlResponseInfo, urlRequestException));
    }
}
