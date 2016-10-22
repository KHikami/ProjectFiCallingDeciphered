package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: cvr */
public final class cvr {
    final Context a;
    final ite b;
    final Set<String> c;
    final ijd d;
    private final Map<String, cvv> e;
    private final Map<cvt, cvu> f;
    private boolean g;
    private final ijj<lym> h;

    public cvr(Context context, ite ite) {
        this.c = new HashSet();
        this.e = new HashMap();
        this.f = new HashMap();
        this.h = new cvs(this);
        this.a = context;
        this.b = ite;
        this.d = (ijd) ite.t().a(ijd.class);
    }

    public void a() {
        if (!this.g) {
            this.g = true;
            this.d.a(this.h);
            this.c.add("localParticipant");
            for (lym lym : this.d.b().values()) {
                if (!lym.b.equals(this.d.a().b) && gwb.b(lym.q)) {
                    this.c.add(lym.b);
                }
            }
            for (cvv a : this.e.values()) {
                a(a);
            }
        }
    }

    public void b() {
        if (this.g) {
            this.g = false;
            this.d.b(this.h);
            this.c.clear();
            for (cvv a : this.e.values()) {
                a(a);
            }
        }
    }

    public void a(cvt cvt, String str, int i) {
        cvu cvu = (cvu) this.f.get(cvt);
        if (cvu == null) {
            if (str != null) {
                cvu = new cvu(cvt, i, str);
                this.f.put(cvt, cvu);
                a(cvu);
            }
        } else if (str == null) {
            b(cvu);
            this.f.remove(cvt);
        } else if (!str.equals(cvu.c)) {
            b(cvu);
            cvu.c = str;
            cvu.b = i;
            a(cvu);
        } else if (i != cvu.b) {
            cvu.b = i;
            a(str);
        }
    }

    private void a(cvu cvu) {
        cvv cvv = (cvv) this.e.get(cvu.c);
        if (cvv == null) {
            cvv = new cvv(cvu.c);
            this.e.put(cvu.c, cvv);
        }
        cvv.b.add(cvu);
        a(cvv);
    }

    private void b(cvu cvu) {
        cvv cvv = (cvv) this.e.get(cvu.c);
        if (cvv != null) {
            cvv.b.remove(cvu);
            a(cvv);
        }
    }

    void a(String str) {
        cvv cvv = (cvv) this.e.get(str);
        if (cvv != null) {
            a(cvv);
        }
    }

    private void a(cvv cvv) {
        if (cvv.b.isEmpty()) {
            this.e.remove(cvv.a);
            if (cvv.c != null) {
                cvv.c.a();
                return;
            }
            return;
        }
        cvu cvu = null;
        for (cvu cvu2 : cvv.b) {
            cvu cvu3;
            if (cvu != null && cvu.b <= cvu2.b) {
                cvu3 = cvu;
            }
            cvu = cvu3;
        }
        if (cvv.c == null) {
            if (this.c.contains(cvv.a) && this.g) {
                cvv.c = new cvw(this, cvv.a, cvu.a);
            }
        } else if (this.c.contains(cvv.a) && this.g) {
            cvv.c.a(cvu.a);
        } else {
            cvv.c.a();
            cvv.c = null;
        }
    }
}
