package p000;

import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

final class jke extends Callback {
    final /* synthetic */ jkc f20347a;

    jke(jkc jkc) {
        this.f20347a = jkc;
    }

    public void m24546a(UrlRequest urlRequest, String str) {
        if (Log.isLoggable("Downloader", 3)) {
            String valueOf = String.valueOf(urlRequest);
            new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(str).length()).append("onRedirectReceived\nRequest: ").append(valueOf).append("\nResponse: ").append(str);
        }
        urlRequest.b();
    }

    public void m24547a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (Log.isLoggable("Downloader", 3)) {
            String valueOf = String.valueOf(urlRequest);
            String valueOf2 = String.valueOf(urlResponseInfo);
            new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(valueOf2).length()).append("onResponseStarted\nRequest: ").append(valueOf).append("\nResponse:  ").append(valueOf2);
        }
        if (urlResponseInfo.b() == HttpStatusCodes.STATUS_CODE_OK) {
            long g;
            this.f20347a.f20332c = System.currentTimeMillis();
            this.f20347a.f20333d = urlResponseInfo.f();
            jkc jkc = this.f20347a;
            valueOf = jkc.m24528a(urlResponseInfo, "Content-Length");
            long parseLong = valueOf == null ? -1 : Long.parseLong(valueOf);
            if ((this.f20347a.f20330a.m24246l().f20071i & 8192) != 0) {
                g = this.f20347a.f20331b.mo3551g();
            } else {
                g = this.f20347a.f20331b.mo3552h();
            }
            if (parseLong > g) {
                Log.e("Downloader", "onResponseStarted: Download too large: " + g);
                this.f20347a.m24538e();
                this.f20347a.m24532a(urlRequest, null);
                return;
            }
            this.f20347a.f20342m = ByteBuffer.allocateDirect(8192);
            if (Log.isLoggable("Downloader", 3)) {
                new StringBuilder(42).append("onResponseStarted buffer size: ").append(this.f20347a.f20342m.capacity());
            }
            if (this.f20347a.f20339j != null) {
                this.f20347a.f20339j.m25168a(parseLong);
            }
            this.f20347a.f20342m.clear();
            urlRequest.a(this.f20347a.f20342m);
            return;
        }
        this.f20347a.m24532a(urlRequest, null);
    }

    public void m24548a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        if (Log.isLoggable("Downloader", 3)) {
            String valueOf = String.valueOf(urlRequest);
            String valueOf2 = String.valueOf(urlResponseInfo);
            new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()).append("onReadCompleted\nRequest: ").append(valueOf).append("\nResponse:  ").append(valueOf2);
        }
        this.f20347a.f20342m.flip();
        if (this.f20347a.f20339j != null) {
            this.f20347a.f20339j.write(this.f20347a.f20342m);
        }
        this.f20347a.f20342m.clear();
        urlRequest.a(this.f20347a.f20342m);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m24550b(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (Log.isLoggable("Downloader", 3)) {
            String valueOf = String.valueOf(urlRequest);
            String valueOf2 = String.valueOf(urlResponseInfo);
            new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()).append("onSucceeded\nRequest: ").append(valueOf).append("\nResponse:  ").append(valueOf2);
        }
        synchronized (this.f20347a) {
            if (urlRequest != this.f20347a.f20338i) {
                return;
            }
            this.f20347a.f20338i = null;
        }
    }

    public void m24549a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        if (Log.isLoggable("Downloader", 3)) {
            String valueOf = String.valueOf(urlRequest);
            String valueOf2 = String.valueOf(urlResponseInfo);
            String valueOf3 = String.valueOf(urlRequestException);
            new StringBuilder(((String.valueOf(valueOf).length() + 44) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("onFailure\nRequest: ").append(valueOf).append("\nResponse:  ").append(valueOf2).append("\nException : ").append(valueOf3);
        }
        this.f20347a.m24532a(urlRequest, urlRequestException);
    }
}
