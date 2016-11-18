package p000;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

final class jqz extends Callback {
    final /* synthetic */ jqy f20821a;

    jqz(jqy jqy) {
        this.f20821a = jqy;
    }

    public void m25039a(UrlRequest urlRequest, String str) {
        urlRequest.b();
    }

    public void m25040a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f20821a.mo3593a(urlResponseInfo.e());
        urlRequest.a(ByteBuffer.allocateDirect(4096));
    }

    public void m25041a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.f20821a.f20775h.m25046a(byteBuffer);
        this.f20821a.mo3593a(urlResponseInfo.e());
        if (byteBuffer.hasRemaining()) {
            urlRequest.a(byteBuffer);
        } else {
            urlRequest.a(ByteBuffer.allocateDirect(4096));
        }
    }

    public void m25044b(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        try {
            this.f20821a.f20770c = urlResponseInfo.b();
            jqy jqy = this.f20821a;
            Map e = urlResponseInfo.e();
            long j = 0;
            if (e.containsKey("content-length")) {
                j = Long.parseLong((String) ((List) e.get("content-length")).get(0));
            }
            jqy.f20771d = j;
            this.f20821a.f20772e = gwb.m1950a(this.f20821a.f20775h.m25045a());
            this.f20821a.f20773f = null;
            this.f20821a.f20774g = false;
            this.f20821a.f20775h = null;
        } finally {
            this.f20821a.f20768a = true;
        }
    }

    public void m25042a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        try {
            m25038b(urlResponseInfo);
            this.f20821a.f20775h = null;
            this.f20821a.f20773f = urlRequestException;
            this.f20821a.f20774g = false;
        } finally {
            this.f20821a.f20768a = true;
        }
    }

    private void m25038b(UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo != null) {
            this.f20821a.f20770c = urlResponseInfo.b();
            jqy jqy = this.f20821a;
            Map e = urlResponseInfo.e();
            long j = 0;
            if (e.containsKey("content-length")) {
                j = Long.parseLong((String) ((List) e.get("content-length")).get(0));
            }
            jqy.f20771d = j;
            this.f20821a.f20772e = this.f20821a.f20775h.m25045a().array();
            return;
        }
        this.f20821a.f20770c = 0;
        this.f20821a.f20771d = -1;
        this.f20821a.f20772e = null;
    }

    public void m25043a(UrlResponseInfo urlResponseInfo) {
        try {
            m25038b(urlResponseInfo);
            this.f20821a.f20775h = null;
            this.f20821a.f20773f = null;
            this.f20821a.f20774g = true;
        } finally {
            this.f20821a.f20768a = true;
        }
    }
}
