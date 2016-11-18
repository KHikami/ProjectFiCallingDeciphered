package defpackage;

import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import java.nio.ByteBuffer;
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(org.chromium.net.UrlRequest r9, org.chromium.net.UrlResponseInfo r10) {
        /*
        r8 = this;
        r4 = -1;
        r1 = 0;
        r0 = "Downloader";
        r2 = 3;
        r0 = android.util.Log.isLoggable(r0, r2);
        if (r0 == 0) goto L_0x003f;
    L_0x000c:
        r0 = java.lang.String.valueOf(r9);
        r2 = java.lang.String.valueOf(r10);
        r3 = new java.lang.StringBuilder;
        r6 = java.lang.String.valueOf(r0);
        r6 = r6.length();
        r6 = r6 + 33;
        r7 = java.lang.String.valueOf(r2);
        r7 = r7.length();
        r6 = r6 + r7;
        r3.<init>(r6);
        r6 = "onSucceeded\nRequest: ";
        r3 = r3.append(r6);
        r0 = r3.append(r0);
        r3 = "\nResponse:  ";
        r0 = r0.append(r3);
        r0.append(r2);
    L_0x003f:
        r2 = r8.a;
        monitor-enter(r2);
        r0 = r8.a;	 Catch:{ all -> 0x007a }
        r0 = r0.i;	 Catch:{ all -> 0x007a }
        if (r9 == r0) goto L_0x004a;
    L_0x0048:
        monitor-exit(r2);	 Catch:{ all -> 0x007a }
    L_0x0049:
        return;
    L_0x004a:
        r0 = r8.a;	 Catch:{ all -> 0x007a }
        r3 = 0;
        r0.i = r3;	 Catch:{ all -> 0x007a }
        monitor-exit(r2);	 Catch:{ all -> 0x007a }
        r0 = r8.a;
        r0.g();
        r0 = r8.a;
        r2 = r0.g;
        r2 = r2 + 1;
        r0.g = r2;
        r0 = r10.b();
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 == r2) goto L_0x007d;
    L_0x0065:
        r2 = r8.a;
        r2 = r2.l;
        if (r2 == 0) goto L_0x0072;
    L_0x006b:
        r2 = r8.a;
        r2 = r2.l;
        r2.delete();
    L_0x0072:
        r2 = r8.a;
        r2 = r2.a;
        r2.a(r0, r1);
        goto L_0x0049;
    L_0x007a:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x007a }
        throw r0;
    L_0x007d:
        r0 = r8.a;
        r0 = r0.a;
        r0 = r0.m();
        r2 = 2;
        if (r0 == r2) goto L_0x008d;
    L_0x0088:
        r0 = r8.a;
        r2 = 1;
        r0.k = r2;
    L_0x008d:
        r0 = r8.a;
        r0 = "Content-Length";
        r0 = defpackage.jkc.a(r10, r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x0097:
        r2 = java.lang.Long.parseLong(r0);
    L_0x009b:
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x00f8;
    L_0x009f:
        r0 = r8.a;
        r0.h = r4;
    L_0x00a3:
        r0 = r8.a;
        r0 = r0.a;
        r0 = r0.l();
        r0 = (defpackage.jtw) r0;
        r2 = r8.a;
        r2 = r2.b;
        r10.a();
        r2 = r8.a;
        r2 = "Content-Type";
        defpackage.jkc.a(r10, r2);
        r2 = r8.a;
        r2 = r2.e;
        r2 = r8.a;
        r2 = r2.c;
        r2 = r8.a;
        r2 = r2.f;
        r2 = r8.a;
        r2 = r2.h;
        r2 = r8.a;
        r2 = r2.d;
        r2 = r8.a;
        r2 = r2.j;
        r2 = r2.a();
        r2 = r2 instanceof org.chromium.net.ChunkedWritableByteChannel;
        if (r2 == 0) goto L_0x0100;
    L_0x00db:
        r0 = r8.a;
        r0 = r0.j;
        r0 = r0.a();
        r0 = (org.chromium.net.ChunkedWritableByteChannel) r0;
        r0 = r0.a();
    L_0x00e9:
        r1 = r8.a;
        r1 = r1.b;
        r2 = r8.a;
        r2 = r2.a;
        r1.a(r2, r0);
        goto L_0x0049;
    L_0x00f6:
        r2 = r4;
        goto L_0x009b;
    L_0x00f8:
        r0 = r8.a;
        r4 = r0.h;
        r2 = r2 + r4;
        r0.h = r2;
        goto L_0x00a3;
    L_0x0100:
        r0 = r0.i;
        r0 = r0 & 2;
        if (r0 != 0) goto L_0x010f;
    L_0x0106:
        r0 = r8.a;
        r0 = r0.m;
    L_0x010a:
        r2 = r8.a;
        r2.m = r1;
        goto L_0x00e9;
    L_0x010f:
        r0 = r1;
        goto L_0x010a;
        */
        throw new UnsupportedOperationException("Method not decompiled: jke.b(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo):void");
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
