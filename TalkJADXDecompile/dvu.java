import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class dvu implements dvq {
    private final int a;
    private final long b;
    private final Set<bjg> c;
    private transient iid d;
    private String e;
    private boolean f;
    private long g;
    private long h;

    dvu(Context context, int i) {
        this.c = new LinkedHashSet();
        this.a = i;
        this.b = ((dvt) jyn.a(context, dvt.class)).a();
        a();
    }

    public void a(String str) {
        ba.a((Object) str);
        synchronized (this) {
            if (!TextUtils.equals(this.e, str)) {
                this.e = str;
                this.f = true;
            }
        }
    }

    public void a(Context context, Map<dvr, List<bjg>> map) {
        int i = 0;
        for (Entry entry : map.entrySet()) {
            dvr dvr = (dvr) entry.getKey();
            List<bjg> list = (List) entry.getValue();
            iii b = b(context);
            int i2 = i;
            for (bjg a : list) {
                a(b, 1, a, i2);
                i2++;
            }
            synchronized (this) {
                b.a(this.e.length());
                b.a(b()).b(this.h).a(a(dvr), 1);
            }
            i = ((List) entry.getValue()).size() + i;
        }
    }

    public void a(Context context, dvr dvr, bjg bjg, int i) {
        iii b = b(context);
        a(b, 2, bjg, i);
        synchronized (this) {
            b.a(this.e.length());
            b = b.a(b());
            long j = this.h;
            this.h = 1 + j;
            b.b(j).a(a(dvr), 2);
            this.c.add(bjg);
            a();
        }
    }

    public void a(bjg bjg) {
        synchronized (this) {
            this.c.remove(bjg);
        }
    }

    public void a(Context context) {
        synchronized (this) {
            if (this.c.isEmpty()) {
                return;
            }
            iii b = b(context);
            for (bjg a : this.c) {
                a(b, 8, a, -1);
            }
            b.a(26, 8);
        }
    }

    private void a() {
        this.g = 0;
        this.e = "";
        this.f = false;
    }

    private long b() {
        if (this.f) {
            this.g++;
            this.f = false;
        }
        return this.g;
    }

    private static void a(iii iii, int i, bjg bjg, int i2) {
        Object obj;
        Object obj2 = null;
        iij a = iii.a();
        if (i2 != -1) {
            a.a(i2);
        }
        Collection j = bjg.j();
        Collection b = bjg.b();
        Collection d = bjg.d();
        String l = bjg.l();
        bjh w = bjg.w();
        if (w == bjh.FOCUS || w == bjh.SUGGESTED_ENTITY) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj == null) {
            if (bjg.s()) {
                a.a(bjg.e());
            }
            if (l != null) {
                a.b(l);
            } else {
                if (!j.isEmpty()) {
                    a.e(((bjf) j.iterator().next()).b());
                }
                if (!d.isEmpty()) {
                    a.c(((bje) d.iterator().next()).c());
                }
                if (!b.isEmpty()) {
                    a.d(((bjo) b.iterator().next()).e());
                }
            }
        } else {
            if (i == 2 || i == 8) {
                obj2 = 1;
            }
            if (obj2 != null) {
                if (bjg.s()) {
                    a.a(bjg.e());
                }
                if (l != null) {
                    a.b(l);
                } else if (!d.isEmpty()) {
                    a.c(((bje) d.iterator().next()).c());
                } else if (!b.isEmpty()) {
                    a.d(((bjo) b.iterator().next()).e());
                }
            }
        }
        a.a();
    }

    private static int a(dvr dvr) {
        switch (dvv.a[dvr.ordinal()]) {
            case wi.j /*1*/:
                return 27;
            case wi.l /*2*/:
                return 41;
            case wi.z /*3*/:
                return 28;
            default:
                String valueOf = String.valueOf(dvr);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 21).append("Unknown bucket type: ").append(valueOf).toString());
        }
    }

    private iii b(Context context) {
        if (this.d == null) {
            this.d = ((iih) jyn.a(context, iih.class)).a(this.a);
        }
        return this.d.c().c(this.b);
    }
}
