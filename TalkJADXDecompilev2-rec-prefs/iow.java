package p000;

import android.content.Context;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataProviders.ByteBufferUploadProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Builder;
import org.chromium.net.UrlRequest.Callback;

class iow {
    final String f18610a;
    final Executor f18611b;
    final CronetEngine f18612c;
    String f18613d;
    String f18614e;

    public void m22801a(String str, long j) {
        this.f18613d = str;
        this.f18614e = j == 0 ? "none" : Long.toString(j);
    }

    public boolean m22802a() {
        return this.f18613d != null;
    }

    public UrlRequest m22800a(String str, byte[] bArr, Callback callback) {
        UploadDataProvider byteBufferUploadProvider = new ByteBufferUploadProvider(ByteBuffer.wrap(bArr).slice());
        String valueOf = String.valueOf(this.f18610a);
        String valueOf2 = String.valueOf(str);
        Builder a = new Builder(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), callback, this.f18611b, this.f18612c).a("Post").a("Content-Type", "application/x-protobuf");
        valueOf = "Authorization";
        String str2 = "Bearer ";
        valueOf2 = String.valueOf(this.f18613d);
        return a.a(valueOf, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2)).a("X-Auth-Time", this.f18614e).a("X-Goog-Encode-Response-If-Executable", "base64").a(byteBufferUploadProvider, this.f18611b).a();
    }

    public void m22803b() {
        if (this.f18612c != null) {
            this.f18612c.mo3963c();
        }
    }

    iow(Context context, String str, Executor executor) {
        this.f18610a = str;
        this.f18611b = executor;
        this.f18612c = new CronetEngine.Builder(context).m33542a("HangoutsApiaryClient; G+ SDK/1.0.0;").m33547b(true).m33541a(0, 20480).m33543a("www.googleapis.com", 443, 443).m33575y();
    }
}
