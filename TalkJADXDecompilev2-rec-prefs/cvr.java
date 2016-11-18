package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class cvr {
    final Context f9187a;
    final ite f9188b;
    final Set<String> f9189c = new HashSet();
    final ijd f9190d;
    private final Map<String, cvv> f9191e = new HashMap();
    private final Map<cvt, cvu> f9192f = new HashMap();
    private boolean f9193g;
    private final ijj<lym> f9194h = new cvs(this);

    public cvr(Context context, ite ite) {
        this.f9187a = context;
        this.f9188b = ite;
        this.f9190d = (ijd) ite.mo3229t().m21926a(ijd.class);
    }

    public void m11128a() {
        if (!this.f9193g) {
            this.f9193g = true;
            this.f9190d.mo3363a(this.f9194h);
            this.f9189c.add("localParticipant");
            for (lym lym : this.f9190d.mo3365b().values()) {
                if (!lym.f26907b.equals(this.f9190d.mo3376a().f26907b) && gwb.m2061b(lym.f26922q)) {
                    this.f9189c.add(lym.f26907b);
                }
            }
            for (cvv a : this.f9191e.values()) {
                m11126a(a);
            }
        }
    }

    public void m11131b() {
        if (this.f9193g) {
            this.f9193g = false;
            this.f9190d.mo3366b(this.f9194h);
            this.f9189c.clear();
            for (cvv a : this.f9191e.values()) {
                m11126a(a);
            }
        }
    }

    public void m11129a(cvt cvt, String str, int i) {
        cvu cvu = (cvu) this.f9192f.get(cvt);
        if (cvu == null) {
            if (str != null) {
                cvu = new cvu(cvt, i, str);
                this.f9192f.put(cvt, cvu);
                m11125a(cvu);
            }
        } else if (str == null) {
            m11127b(cvu);
            this.f9192f.remove(cvt);
        } else if (!str.equals(cvu.f9199c)) {
            m11127b(cvu);
            cvu.f9199c = str;
            cvu.f9198b = i;
            m11125a(cvu);
        } else if (i != cvu.f9198b) {
            cvu.f9198b = i;
            m11130a(str);
        }
    }

    private void m11125a(cvu cvu) {
        cvv cvv = (cvv) this.f9191e.get(cvu.f9199c);
        if (cvv == null) {
            cvv = new cvv(cvu.f9199c);
            this.f9191e.put(cvu.f9199c, cvv);
        }
        cvv.f9201b.add(cvu);
        m11126a(cvv);
    }

    private void m11127b(cvu cvu) {
        cvv cvv = (cvv) this.f9191e.get(cvu.f9199c);
        if (cvv != null) {
            cvv.f9201b.remove(cvu);
            m11126a(cvv);
        }
    }

    void m11130a(String str) {
        cvv cvv = (cvv) this.f9191e.get(str);
        if (cvv != null) {
            m11126a(cvv);
        }
    }

    private void m11126a(cvv cvv) {
        if (cvv.f9201b.isEmpty()) {
            this.f9191e.remove(cvv.f9200a);
            if (cvv.f9202c != null) {
                cvv.f9202c.m11140a();
                return;
            }
            return;
        }
        cvu cvu = null;
        for (cvu cvu2 : cvv.f9201b) {
            cvu cvu3;
            if (cvu != null && cvu.f9198b <= cvu2.f9198b) {
                cvu3 = cvu;
            }
            cvu = cvu3;
        }
        if (cvv.f9202c == null) {
            if (this.f9189c.contains(cvv.f9200a) && this.f9193g) {
                cvv.f9202c = new cvw(this, cvv.f9200a, cvu.f9197a);
            }
        } else if (this.f9189c.contains(cvv.f9200a) && this.f9193g) {
            cvv.f9202c.m11141a(cvu.f9197a);
        } else {
            cvv.f9202c.m11140a();
            cvv.f9202c = null;
        }
    }
}
