package p000;

import android.content.Context;
import com.google.api.client.http.HttpMethods;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Builder;

final class jro extends jqy {
    final jrp f20892j;
    final jsh f20893k;
    private final String f20894l;
    private final String f20895m;
    private final long f20896n;
    private final long f20897o;
    private UrlRequest f20898p;
    private final CronetEngine f20899q;

    public jro(Context context, juy juy, String str, String str2, long j, long j2, jrp jrp, jsh jsh) {
        super(juy);
        this.f20894l = str;
        this.f20895m = str2;
        this.f20896n = j;
        this.f20897o = j2;
        this.f20892j = jrp;
        this.f20893k = jsh;
        this.f20899q = (CronetEngine) jyn.m25426a(context, CronetEngine.class);
    }

    public void mo3592a() {
        Map kyVar = new ky();
        kyVar.putAll(m25000j().mo3615a(this.f20894l));
        long j = this.f20896n;
        long j2 = this.f20897o - 1;
        kyVar.put("Content-Range", "bytes " + j + "-" + j2 + "/" + this.f20897o);
        Builder builder = new Builder(this.f20894l, this.i, this.f20769b, this.f20899q);
        for (Entry entry : kyVar.entrySet()) {
            builder.a((String) entry.getKey(), (String) entry.getValue());
        }
        builder.a("content-type", this.f20895m);
        builder.a(HttpMethods.PUT);
        builder.a(new jrq(this, this.f20897o - this.f20896n), this.f20769b);
        this.f20898p = builder.a();
    }

    protected UrlRequest mo3594b() {
        return this.f20898p;
    }

    protected void mo3593a(Map<String, List<String>> map) {
    }

    public void m25093c() {
        this.f20898p.e();
    }
}
