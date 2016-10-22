import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Builder;

final class jqc extends jqy {
    private final Context j;
    private final String k;
    private final jrl l;
    private final jrr m;
    private final String n;
    private final String o;
    private final boolean p;
    private UrlRequest q;
    private String r;
    private jrk s;
    private final CronetEngine t;

    public jqc(Context context, juy juy, String str, jrl jrl, jrr jrr, String str2, String str3, jrk jrk, boolean z) {
        super(juy);
        this.j = context;
        this.k = str;
        this.m = jrr;
        this.l = jrl;
        this.n = str2;
        this.o = str3;
        this.s = jrk;
        this.p = z;
        this.t = (CronetEngine) jyn.a(context, CronetEngine.class);
    }

    public void a() {
        Map hashMap = new HashMap(j().a(this.k));
        hashMap.put("X-Upload-Content-Type", this.m.e());
        hashMap.put("Content-Type", "application/x-protobuf");
        long k = this.m.k();
        if (k >= 0) {
            hashMap.put("X-Upload-Content-Length", Long.toString(k));
        }
        String str = "X-Goog-Hash";
        String str2 = "sha1=";
        String valueOf = String.valueOf(Base64.encodeToString(this.m.i().c(), 2));
        hashMap.put(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Builder builder = new Builder(this.k, this.i, this.b, this.t);
        for (Entry entry : hashMap.entrySet()) {
            builder.a((String) entry.getKey(), (String) entry.getValue());
        }
        nzf knn = new knn();
        knn.a = ((jqe) jyn.a(this.j, jqe.class)).a(this.j, this.o, this.l, this.m, this.s, this.p);
        jvr.a(this.j, knn, this.n, false, this.l.m() ? 50 : 100);
        builder.a(new jqd(nzf.a(knn)), this.b);
        this.q = builder.a();
        if (Log.isLoggable("Uploader", 2)) {
            gwb.a(2, "Uploader", knn.toString());
        }
    }

    protected UrlRequest b() {
        return this.q;
    }

    protected void a(Map<String, List<String>> map) {
        List a = new jpy(map).a("Location");
        if (a != null && a.size() == 1) {
            this.r = (String) a.get(0);
        }
    }

    public String c() {
        return this.r;
    }
}
