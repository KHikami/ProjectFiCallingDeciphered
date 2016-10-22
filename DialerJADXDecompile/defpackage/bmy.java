package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bmy */
final class bmy implements Runnable {
    private /* synthetic */ Map a;
    private /* synthetic */ boolean b;
    private /* synthetic */ String c;
    private /* synthetic */ long d;
    private /* synthetic */ boolean e;
    private /* synthetic */ boolean f;
    private /* synthetic */ String g;
    private /* synthetic */ bmx h;

    bmy(bmx bmx, Map map, boolean z, String str, long j, boolean z2, boolean z3, String str2) {
        this.h = bmx;
        this.a = map;
        this.b = z;
        this.c = str;
        this.d = j;
        this.e = z2;
        this.f = z3;
        this.g = str2;
    }

    public final void run() {
        boolean z;
        boolean z2 = true;
        if (this.h.d.b()) {
            this.a.put("sc", "start");
        }
        bmb d = this.h.f.d();
        buf.p("getClientId can not be called from the main thread");
        bpq.b(this.a, "cid", d.a.g().b());
        String str = (String) this.a.get("sf");
        if (str != null) {
            double a = bpq.a(str, 100.0d);
            if (bpq.a(a, (String) this.a.get("cid"))) {
                this.h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(a));
                return;
            }
        }
        bnh f = this.h.f.f();
        if (this.b) {
            bpq.a(this.a, "ate", f.b());
            bpq.a(this.a, "adid", f.c());
        } else {
            this.a.remove("ate");
            this.a.remove("adid");
        }
        cqu b = this.h.f.h().b();
        bpq.a(this.a, "an", b.a);
        bpq.a(this.a, "av", b.b);
        bpq.a(this.a, "aid", b.c);
        bpq.a(this.a, "aiid", b.d);
        this.a.put("v", "1");
        this.a.put("_v", bpc.b);
        bpq.a(this.a, "ul", this.h.f.h.b().a);
        bon bon = this.h.f.h;
        bon.o();
        cqw b2 = bon.b();
        bpq.a(this.a, "sr", b2.c + "x" + b2.d);
        if (this.c.equals("transaction") || this.c.equals("item")) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.h.c.a()) {
            long a2 = bpq.a((String) this.a.get("ht"));
            if (a2 == 0) {
                a2 = this.d;
            }
            if (this.e) {
                this.h.f.a().c("Dry run enabled. Would have sent hit", new bos(this.h, this.a, a2, this.f));
                return;
            }
            String str2 = (String) this.a.get("cid");
            Map hashMap = new HashMap();
            bpq.a(hashMap, "uid", this.a);
            bpq.a(hashMap, "an", this.a);
            bpq.a(hashMap, "aid", this.a);
            bpq.a(hashMap, "av", this.a);
            bpq.a(hashMap, "aiid", this.a);
            String str3 = this.g;
            if (TextUtils.isEmpty((CharSequence) this.a.get("adid"))) {
                z2 = false;
            }
            this.a.put("_s", String.valueOf(this.h.f.c().a(new bns(0, str2, str3, z2, 0, hashMap))));
            this.h.f.c().a(new bos(this.h, this.a, a2, this.f));
            return;
        }
        this.h.f.a().a(this.a, "Too many hits sent too quickly, rate limiting invoked");
    }
}
