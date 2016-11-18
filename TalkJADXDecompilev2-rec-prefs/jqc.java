package p000;

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
    private final Context f20778j;
    private final String f20779k;
    private final jrl f20780l;
    private final jrr f20781m;
    private final String f20782n;
    private final String f20783o;
    private final boolean f20784p;
    private UrlRequest f20785q;
    private String f20786r;
    private jrk f20787s;
    private final CronetEngine f20788t;

    public jqc(Context context, juy juy, String str, jrl jrl, jrr jrr, String str2, String str3, jrk jrk, boolean z) {
        super(juy);
        this.f20778j = context;
        this.f20779k = str;
        this.f20781m = jrr;
        this.f20780l = jrl;
        this.f20782n = str2;
        this.f20783o = str3;
        this.f20787s = jrk;
        this.f20784p = z;
        this.f20788t = (CronetEngine) jyn.m25426a(context, CronetEngine.class);
    }

    public void mo3592a() {
        Map hashMap = new HashMap(m25000j().mo3615a(this.f20779k));
        hashMap.put("X-Upload-Content-Type", this.f20781m.m25109e());
        hashMap.put("Content-Type", "application/x-protobuf");
        long k = this.f20781m.m25115k();
        if (k >= 0) {
            hashMap.put("X-Upload-Content-Length", Long.toString(k));
        }
        String str = "X-Goog-Hash";
        String str2 = "sha1=";
        String valueOf = String.valueOf(Base64.encodeToString(this.f20781m.m25113i().m24962c(), 2));
        hashMap.put(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Builder builder = new Builder(this.f20779k, this.i, this.f20769b, this.f20788t);
        for (Entry entry : hashMap.entrySet()) {
            builder.a((String) entry.getKey(), (String) entry.getValue());
        }
        nzf knn = new knn();
        knn.f22427a = ((jqe) jyn.m25426a(this.f20778j, jqe.class)).m25010a(this.f20778j, this.f20783o, this.f20780l, this.f20781m, this.f20787s, this.f20784p);
        jvr.m25326a(this.f20778j, knn, this.f20782n, false, this.f20780l.m25075m() ? 50 : 100);
        builder.a(new jqd(nzf.m1029a(knn)), this.f20769b);
        this.f20785q = builder.a();
        if (Log.isLoggable("Uploader", 2)) {
            gwb.m1734a(2, "Uploader", knn.toString());
        }
    }

    protected UrlRequest mo3594b() {
        return this.f20785q;
    }

    protected void mo3593a(Map<String, List<String>> map) {
        List a = new jpy(map).m24979a("Location");
        if (a != null && a.size() == 1) {
            this.f20786r = (String) a.get(0);
        }
    }

    public String m25004c() {
        return this.f20786r;
    }
}
