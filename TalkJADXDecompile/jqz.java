import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

final class jqz extends Callback {
    final /* synthetic */ jqy a;

    jqz(jqy jqy) {
        this.a = jqy;
    }

    public void a(UrlRequest urlRequest, String str) {
        urlRequest.b();
    }

    public void a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.a(urlResponseInfo.e());
        urlRequest.a(ByteBuffer.allocateDirect(4096));
    }

    public void a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.a.h.a(byteBuffer);
        this.a.a(urlResponseInfo.e());
        if (byteBuffer.hasRemaining()) {
            urlRequest.a(byteBuffer);
        } else {
            urlRequest.a(ByteBuffer.allocateDirect(4096));
        }
    }

    public void b(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        try {
            this.a.c = urlResponseInfo.b();
            jqy jqy = this.a;
            Map e = urlResponseInfo.e();
            long j = 0;
            if (e.containsKey("content-length")) {
                j = Long.parseLong((String) ((List) e.get("content-length")).get(0));
            }
            jqy.d = j;
            this.a.e = gwb.a(this.a.h.a());
            this.a.f = null;
            this.a.g = false;
            this.a.h = null;
        } finally {
            this.a.a = true;
        }
    }

    public void a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        try {
            b(urlResponseInfo);
            this.a.h = null;
            this.a.f = urlRequestException;
            this.a.g = false;
        } finally {
            this.a.a = true;
        }
    }

    private void b(UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo != null) {
            this.a.c = urlResponseInfo.b();
            jqy jqy = this.a;
            Map e = urlResponseInfo.e();
            long j = 0;
            if (e.containsKey("content-length")) {
                j = Long.parseLong((String) ((List) e.get("content-length")).get(0));
            }
            jqy.d = j;
            this.a.e = this.a.h.a().array();
            return;
        }
        this.a.c = 0;
        this.a.d = -1;
        this.a.e = null;
    }

    public void a(UrlResponseInfo urlResponseInfo) {
        try {
            b(urlResponseInfo);
            this.a.h = null;
            this.a.f = null;
            this.a.g = true;
        } finally {
            this.a.a = true;
        }
    }
}
