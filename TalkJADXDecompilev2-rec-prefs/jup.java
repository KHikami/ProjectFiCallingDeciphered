package p000;

import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

abstract class jup extends Callback {
    UrlRequestException f21073a;
    UrlResponseInfo f21074b;
    final /* synthetic */ juo f21075c;

    jup(juo juo) {
        this.f21075c = juo;
    }

    public void m25242a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        juo juo = this.f21075c;
        urlResponseInfo.e();
        juo.f5770q = urlResponseInfo.f();
        if (juo.f5763j != null) {
            juo.f5763j.m25255a();
            juo.f5769p.m25276a(juo.f5770q);
        }
        urlRequest.a(ByteBuffer.allocateDirect(8192));
    }

    public void m25241a(UrlRequest urlRequest, String str) {
        urlRequest.b();
    }

    public void m25245b(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f21074b = urlResponseInfo;
        this.f21075c.f5771r = true;
    }

    public void m25243a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        this.f21073a = urlRequestException;
        this.f21074b = urlResponseInfo;
        this.f21075c.f5771r = true;
    }

    public void m25244a(UrlResponseInfo urlResponseInfo) {
        this.f21074b = urlResponseInfo;
        this.f21075c.f5768o = true;
        this.f21075c.f5771r = true;
    }
}
