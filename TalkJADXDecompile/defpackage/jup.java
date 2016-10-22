package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

/* renamed from: jup */
abstract class jup extends Callback {
    UrlRequestException a;
    UrlResponseInfo b;
    final /* synthetic */ juo c;

    jup(juo juo) {
        this.c = juo;
    }

    public void a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        juo juo = this.c;
        urlResponseInfo.e();
        juo.q = urlResponseInfo.f();
        if (juo.j != null) {
            juo.j.a();
            juo.p.a(juo.q);
        }
        urlRequest.a(ByteBuffer.allocateDirect(8192));
    }

    public void a(UrlRequest urlRequest, String str) {
        urlRequest.b();
    }

    public void b(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.b = urlResponseInfo;
        this.c.r = true;
    }

    public void a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        this.a = urlRequestException;
        this.b = urlResponseInfo;
        this.c.r = true;
    }

    public void a(UrlResponseInfo urlResponseInfo) {
        this.b = urlResponseInfo;
        this.c.o = true;
        this.c.r = true;
    }
}
