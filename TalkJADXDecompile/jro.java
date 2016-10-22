import android.content.Context;
import com.google.api.client.http.HttpMethods;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Builder;

final class jro extends jqy {
    final jrp j;
    final jsh k;
    private final String l;
    private final String m;
    private final long n;
    private final long o;
    private UrlRequest p;
    private final CronetEngine q;

    public jro(Context context, juy juy, String str, String str2, long j, long j2, jrp jrp, jsh jsh) {
        super(juy);
        this.l = str;
        this.m = str2;
        this.n = j;
        this.o = j2;
        this.j = jrp;
        this.k = jsh;
        this.q = (CronetEngine) jyn.a(context, CronetEngine.class);
    }

    public void a() {
        Map kyVar = new ky();
        kyVar.putAll(j().a(this.l));
        long j = this.n;
        long j2 = this.o - 1;
        kyVar.put("Content-Range", "bytes " + j + "-" + j2 + "/" + this.o);
        Builder builder = new Builder(this.l, this.i, this.b, this.q);
        for (Entry entry : kyVar.entrySet()) {
            builder.a((String) entry.getKey(), (String) entry.getValue());
        }
        builder.a("content-type", this.m);
        builder.a(HttpMethods.PUT);
        builder.a(new jrq(this, this.o - this.n), this.b);
        this.p = builder.a();
    }

    protected UrlRequest b() {
        return this.p;
    }

    protected void a(Map<String, List<String>> map) {
    }

    public void c() {
        this.p.e();
    }
}
