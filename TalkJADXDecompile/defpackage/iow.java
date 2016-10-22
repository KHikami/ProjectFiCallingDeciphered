package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProviders.ByteBufferUploadProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Builder;
import org.chromium.net.UrlRequest.Callback;

/* renamed from: iow */
class iow {
    final String a;
    final Executor b;
    final CronetEngine c;
    String d;
    String e;

    public void a(String str, long j) {
        this.d = str;
        this.e = j == 0 ? "none" : Long.toString(j);
    }

    public boolean a() {
        return this.d != null;
    }

    public UrlRequest a(String str, byte[] bArr, Callback callback) {
        ByteBufferUploadProvider byteBufferUploadProvider = new ByteBufferUploadProvider(ByteBuffer.wrap(bArr).slice());
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(str);
        Builder a = new Builder(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), callback, this.b, this.c).a("Post").a("Content-Type", "application/x-protobuf");
        valueOf = "Authorization";
        String str2 = "Bearer ";
        valueOf2 = String.valueOf(this.d);
        return a.a(valueOf, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2)).a("X-Auth-Time", this.e).a("X-Goog-Encode-Response-If-Executable", "base64").a(byteBufferUploadProvider, this.b).a();
    }

    public void b() {
        if (this.c != null) {
            this.c.c();
        }
    }

    iow(Context context, String str, Executor executor) {
        this.a = str;
        this.b = executor;
        this.c = new CronetEngine.Builder(context).a("HangoutsApiaryClient; G+ SDK/1.0.0;").b(true).a(0, 20480).a("www.googleapis.com", 443, 443).y();
    }
}
