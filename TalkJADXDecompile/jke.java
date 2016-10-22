import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import java.nio.ByteBuffer;
import org.chromium.net.ChunkedWritableByteChannel;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

final class jke extends Callback {
    final /* synthetic */ jkc a;

    jke(jkc jkc) {
        this.a = jkc;
    }

    public void a(UrlRequest urlRequest, String str) {
        if (Log.isLoggable("Downloader", 3)) {
            String valueOf = String.valueOf(urlRequest);
            new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(str).length()).append("onRedirectReceived\nRequest: ").append(valueOf).append("\nResponse: ").append(str);
        }
        urlRequest.b();
    }

    public void a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (Log.isLoggable("Downloader", 3)) {
            String valueOf = String.valueOf(urlRequest);
            String valueOf2 = String.valueOf(urlResponseInfo);
            new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(valueOf2).length()).append("onResponseStarted\nRequest: ").append(valueOf).append("\nResponse:  ").append(valueOf2);
        }
        if (urlResponseInfo.b() == HttpStatusCodes.STATUS_CODE_OK) {
            long g;
            this.a.c = System.currentTimeMillis();
            this.a.d = urlResponseInfo.f();
            jkc jkc = this.a;
            valueOf = jkc.a(urlResponseInfo, "Content-Length");
            long parseLong = valueOf == null ? -1 : Long.parseLong(valueOf);
            if ((this.a.a.l().i & 8192) != 0) {
                g = this.a.b.g();
            } else {
                g = this.a.b.h();
            }
            if (parseLong > g) {
                Log.e("Downloader", "onResponseStarted: Download too large: " + g);
                this.a.e();
                this.a.a(urlRequest, null);
                return;
            }
            this.a.m = ByteBuffer.allocateDirect(8192);
            if (Log.isLoggable("Downloader", 3)) {
                new StringBuilder(42).append("onResponseStarted buffer size: ").append(this.a.m.capacity());
            }
            if (this.a.j != null) {
                this.a.j.a(parseLong);
            }
            this.a.m.clear();
            urlRequest.a(this.a.m);
            return;
        }
        this.a.a(urlRequest, null);
    }

    public void a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        if (Log.isLoggable("Downloader", 3)) {
            String valueOf = String.valueOf(urlRequest);
            String valueOf2 = String.valueOf(urlResponseInfo);
            new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()).append("onReadCompleted\nRequest: ").append(valueOf).append("\nResponse:  ").append(valueOf2);
        }
        this.a.m.flip();
        if (this.a.j != null) {
            this.a.j.write(this.a.m);
        }
        this.a.m.clear();
        urlRequest.a(this.a.m);
    }

    public void b(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (Log.isLoggable("Downloader", 3)) {
            String valueOf = String.valueOf(urlRequest);
            String valueOf2 = String.valueOf(urlResponseInfo);
            new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()).append("onSucceeded\nRequest: ").append(valueOf).append("\nResponse:  ").append(valueOf2);
        }
        synchronized (this.a) {
            if (urlRequest != this.a.i) {
                return;
            }
            this.a.i = null;
            this.a.g();
            jkc jkc = this.a;
            jkc.g++;
            int b = urlResponseInfo.b();
            if (b != HttpStatusCodes.STATUS_CODE_OK) {
                if (this.a.l != null) {
                    this.a.l.delete();
                }
                this.a.a.a(b, null);
                return;
            }
            Object a;
            if (this.a.a.m() != 2) {
                this.a.k = true;
            }
            jkc = this.a;
            valueOf = jkc.a(urlResponseInfo, "Content-Length");
            long parseLong = valueOf != null ? Long.parseLong(valueOf) : -1;
            if (parseLong == -1) {
                this.a.h = -1;
            } else {
                jkc = this.a;
                jkc.h = parseLong + jkc.h;
            }
            jtw l = this.a.a.l();
            jkn jkn = this.a.b;
            urlResponseInfo.a();
            jkc jkc2 = this.a;
            jkc.a(urlResponseInfo, "Content-Type");
            parseLong = this.a.e;
            parseLong = this.a.c;
            parseLong = this.a.f;
            parseLong = this.a.h;
            valueOf2 = this.a.d;
            if (this.a.j.a() instanceof ChunkedWritableByteChannel) {
                a = ((ChunkedWritableByteChannel) this.a.j.a()).a();
            } else {
                if ((l.i & 2) == 0) {
                    a = this.a.m;
                } else {
                    a = null;
                }
                this.a.m = null;
            }
            this.a.b.a(this.a.a, a);
        }
    }

    public void a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, UrlRequestException urlRequestException) {
        if (Log.isLoggable("Downloader", 3)) {
            String valueOf = String.valueOf(urlRequest);
            String valueOf2 = String.valueOf(urlResponseInfo);
            String valueOf3 = String.valueOf(urlRequestException);
            new StringBuilder(((String.valueOf(valueOf).length() + 44) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("onFailure\nRequest: ").append(valueOf).append("\nResponse:  ").append(valueOf2).append("\nException : ").append(valueOf3);
        }
        this.a.a(urlRequest, urlRequestException);
    }
}
