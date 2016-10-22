package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

/* renamed from: bmx */
public final class bmx extends bpb {
    public boolean a;
    final Map b;
    final bpm c;
    final bmz d;
    bpp e;
    private final Map g;
    private bmn h;

    bmx(bnp bnp, String str, bpm bpm) {
        super(bnp);
        this.g = new HashMap();
        this.b = new HashMap();
        this.g.put("useSecure", "1");
        this.g.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.c = new bpm("tracking", this.f.c);
        this.d = new bmz(this, bnp);
    }

    private static String a(Entry entry) {
        String str = (String) entry.getKey();
        entry.getValue();
        int i = (!str.startsWith("&") || str.length() < 2) ? 0 : 1;
        return i == 0 ? null : ((String) entry.getKey()).substring(1);
    }

    private static void a(Map map, Map map2) {
        buf.A((Object) map2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String a = bmx.a(entry);
                if (a != null) {
                    map2.put(a, entry.getValue());
                }
            }
        }
    }

    private static void b(Map map, Map map2) {
        buf.A((Object) map2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String a = bmx.a(entry);
                if (!(a == null || map2.containsKey(a))) {
                    map2.put(a, entry.getValue());
                }
            }
        }
    }

    protected final void a() {
        this.d.p();
        String c = this.f.e().c();
        if (c != null) {
            a("&an", c);
        }
        c = this.f.e().b();
        if (c != null) {
            a("&av", c);
        }
    }

    public final void a(String str, String str2) {
        buf.d((Object) str, (Object) "Key should be non-null");
        if (!TextUtils.isEmpty(str)) {
            this.g.put(str, str2);
        }
    }

    public final void a(Map map) {
        long a = this.f.c.a();
        if (this.f.d().g) {
            c("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        boolean z = this.f.d().f;
        Map hashMap = new HashMap();
        bmx.a(this.g, hashMap);
        bmx.a(map, hashMap);
        boolean a2 = bpq.a((String) this.g.get("useSecure"), true);
        bmx.b(this.b, hashMap);
        this.b.clear();
        String str = (String) hashMap.get("t");
        if (TextUtils.isEmpty(str)) {
            this.f.a().a(hashMap, "Missing hit type parameter");
            return;
        }
        String str2 = (String) hashMap.get("tid");
        if (TextUtils.isEmpty(str2)) {
            this.f.a().a(hashMap, "Missing tracking id parameter");
            return;
        }
        boolean z2 = this.a;
        synchronized (this) {
            if ("screenview".equalsIgnoreCase(str) || "pageview".equalsIgnoreCase(str) || "appview".equalsIgnoreCase(str) || TextUtils.isEmpty(str)) {
                int parseInt = Integer.parseInt((String) this.g.get("&a")) + 1;
                if (parseInt >= Integer.MAX_VALUE) {
                    parseInt = 1;
                }
                this.g.put("&a", Integer.toString(parseInt));
            }
        }
        this.f.b().a(new bmy(this, hashMap, z2, str, a, z, a2, str2));
    }

    public final void a(boolean z) {
        synchronized (this) {
            if ((this.h != null) == z) {
                return;
            }
            if (z) {
                this.h = new bmn(this, Thread.getDefaultUncaughtExceptionHandler(), this.f.a);
                Thread.setDefaultUncaughtExceptionHandler(this.h);
                b("Uncaught exceptions will be reported to Google Analytics");
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this.h.a);
                b("Uncaught exceptions will not be reported to Google Analytics");
            }
        }
    }
}
