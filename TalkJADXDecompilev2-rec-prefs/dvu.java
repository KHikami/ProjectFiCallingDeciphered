package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class dvu implements dvq {
    private final int f10651a;
    private final long f10652b;
    private final Set<bjg> f10653c = new LinkedHashSet();
    private transient iid f10654d;
    private String f10655e;
    private boolean f10656f;
    private long f10657g;
    private long f10658h;

    dvu(Context context, int i) {
        this.f10651a = i;
        this.f10652b = ((dvt) jyn.m25426a(context, dvt.class)).mo1729a();
        m12883a();
    }

    public void mo1727a(String str) {
        ba.m4536a((Object) str);
        synchronized (this) {
            if (!TextUtils.equals(this.f10655e, str)) {
                this.f10655e = str;
                this.f10656f = true;
            }
        }
    }

    public void mo1725a(Context context, Map<dvr, List<bjg>> map) {
        int i = 0;
        for (Entry entry : map.entrySet()) {
            dvr dvr = (dvr) entry.getKey();
            List<bjg> list = (List) entry.getValue();
            iii b = m12886b(context);
            int i2 = i;
            for (bjg a : list) {
                dvu.m12884a(b, 1, a, i2);
                i2++;
            }
            synchronized (this) {
                b.mo1717a(this.f10655e.length());
                b.mo1718a(m12885b()).mo1721b(this.f10658h).mo1720a(dvu.m12882a(dvr), 1);
            }
            i = ((List) entry.getValue()).size() + i;
        }
    }

    public void mo1724a(Context context, dvr dvr, bjg bjg, int i) {
        iii b = m12886b(context);
        dvu.m12884a(b, 2, bjg, i);
        synchronized (this) {
            b.mo1717a(this.f10655e.length());
            b = b.mo1718a(m12885b());
            long j = this.f10658h;
            this.f10658h = 1 + j;
            b.mo1721b(j).mo1720a(dvu.m12882a(dvr), 2);
            this.f10653c.add(bjg);
            m12883a();
        }
    }

    public void mo1726a(bjg bjg) {
        synchronized (this) {
            this.f10653c.remove(bjg);
        }
    }

    public void mo1723a(Context context) {
        synchronized (this) {
            if (this.f10653c.isEmpty()) {
                return;
            }
            iii b = m12886b(context);
            for (bjg a : this.f10653c) {
                dvu.m12884a(b, 8, a, -1);
            }
            b.mo1720a(26, 8);
        }
    }

    private void m12883a() {
        this.f10657g = 0;
        this.f10655e = "";
        this.f10656f = false;
    }

    private long m12885b() {
        if (this.f10656f) {
            this.f10657g++;
            this.f10656f = false;
        }
        return this.f10657g;
    }

    private static void m12884a(iii iii, int i, bjg bjg, int i2) {
        Object obj;
        Object obj2 = null;
        iij a = iii.mo1719a();
        if (i2 != -1) {
            a.m21861a(i2);
        }
        Collection j = bjg.mo576j();
        Collection b = bjg.mo568b();
        Collection d = bjg.mo570d();
        String l = bjg.mo578l();
        bjh w = bjg.mo589w();
        if (w == bjh.FOCUS || w == bjh.SUGGESTED_ENTITY) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj == null) {
            if (bjg.mo585s()) {
                a.m21862a(bjg.mo571e());
            }
            if (l != null) {
                a.m21863b(l);
            } else {
                if (!j.isEmpty()) {
                    a.m21866e(((bjf) j.iterator().next()).m5371b());
                }
                if (!d.isEmpty()) {
                    a.m21864c(((bje) d.iterator().next()).m5365c());
                }
                if (!b.isEmpty()) {
                    a.m21865d(((bjo) b.iterator().next()).m5475e());
                }
            }
        } else {
            if (i == 2 || i == 8) {
                obj2 = 1;
            }
            if (obj2 != null) {
                if (bjg.mo585s()) {
                    a.m21862a(bjg.mo571e());
                }
                if (l != null) {
                    a.m21863b(l);
                } else if (!d.isEmpty()) {
                    a.m21864c(((bje) d.iterator().next()).m5365c());
                } else if (!b.isEmpty()) {
                    a.m21865d(((bjo) b.iterator().next()).m5475e());
                }
            }
        }
        a.m21860a();
    }

    private static int m12882a(dvr dvr) {
        switch (dvv.f10659a[dvr.ordinal()]) {
            case 1:
                return 27;
            case 2:
                return 41;
            case 3:
                return 28;
            default:
                String valueOf = String.valueOf(dvr);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 21).append("Unknown bucket type: ").append(valueOf).toString());
        }
    }

    private iii m12886b(Context context) {
        if (this.f10654d == null) {
            this.f10654d = ((iih) jyn.m25426a(context, iih.class)).mo1979a(this.f10651a);
        }
        return this.f10654d.mo1694c().mo1722c(this.f10652b);
    }
}
