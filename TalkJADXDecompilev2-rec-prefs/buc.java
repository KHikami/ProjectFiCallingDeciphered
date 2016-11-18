package p000;

import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class buc extends ady<aer> {
    private final dr f4481b;
    private final bvc f4482c;
    private final bto f4483d;
    private wt<btf> f4484e;
    private int f4485f;
    private final Map<aer, Void> f4486g = new ky();
    private boolean f4487h;
    private boolean f4488i;

    public buc(dr drVar) {
        this.f4481b = drVar;
        this.f4482c = new bvc(drVar.getContext());
        this.f4483d = (bto) jyn.m25426a(drVar.getContext(), bto.class);
        m743a(true);
    }

    public void m6684a(wt<btf> wtVar) {
        boolean z;
        boolean z2 = true;
        if (this.f4484e == null) {
            z = true;
        } else {
            z = false;
        }
        ba.m4610b(z, (Object) "Must be called only once.");
        if (wtVar == null) {
            z2 = false;
        }
        ba.m4578a(z2, (Object) "MessageList must be valid.");
        this.f4484e = wtVar;
        this.f4485f = wtVar.a();
    }

    public int mo736a() {
        return (m6677e() ? 1 : 0) + m6675c();
    }

    public int mo737a(int i) {
        if (i >= m6675c()) {
            return -1;
        }
        if (i == 0) {
            return -2;
        }
        return this.f4482c.m6763a(((btf) this.f4484e.a(i - 1)).f4396i);
    }

    public long mo741b(int i) {
        if (i >= m6675c()) {
            return -1;
        }
        if (i == 0) {
            return -2;
        }
        return ((btf) this.f4484e.a(i - 1)).f4388a;
    }

    private int m6675c() {
        if (m6676d()) {
            return this.f4484e.a() + 1;
        }
        return this.f4484e.a();
    }

    private boolean m6676d() {
        return this.f4484e.a() > 0;
    }

    public aer mo738a(ViewGroup viewGroup, int i) {
        switch (i) {
            case -2:
                return new btv(this.f4481b.getContext(), viewGroup);
            case -1:
                return new bud(this.f4481b.getContext(), viewGroup);
            default:
                return this.f4482c.m6764a(this.f4481b, viewGroup, i);
        }
    }

    public void mo740a(aer aer, int i) {
        if (!(aer instanceof bud)) {
            if (i == 0) {
                ((btv) aer).m6619a(this.f4483d.mo770a(((btf) this.f4484e.a(0)).f4394g, Long.MAX_VALUE));
            } else {
                List emptyList;
                int i2 = i - 1;
                btf btf = (btf) this.f4484e.a(i2);
                bwd bwd = (bwd) aer;
                if (i2 == 0) {
                    emptyList = Collections.emptyList();
                } else {
                    emptyList = this.f4483d.mo770a(btf.f4394g, ((btf) this.f4484e.a(i2 - 1)).f4394g);
                }
                bwd.m6809a(btf, emptyList);
            }
            this.f4486g.put(aer, null);
        }
    }

    public void mo739a(aer aer) {
        super.mo739a(aer);
        if (!(aer instanceof bud)) {
            this.f4486g.remove(aer);
        }
    }

    public void mo742b(aer aer) {
        super.mo742b(aer);
        if (aer instanceof bwd) {
            ((bwd) aer).m6811w();
        }
    }

    private boolean m6677e() {
        return (this.f4487h && this.f4488i) ? false : true;
    }

    public void m6689b(boolean z) {
        boolean e = m6677e();
        this.f4487h = z;
        boolean e2 = m6677e();
        if (e != e2) {
            int c = m6675c();
            if (e2) {
                new Object[1][0] = Integer.valueOf(c);
                m750d(c);
                return;
            }
            new Object[1][0] = Integer.valueOf(c);
            m752e(c);
        }
    }

    public void m6690c(boolean z) {
        boolean e = m6677e();
        this.f4488i = z;
        boolean e2 = m6677e();
        if (e != e2) {
            int c = m6675c();
            if (e2) {
                new Object[1][0] = Integer.valueOf(c);
                m750d(c);
                return;
            }
            new Object[1][0] = Integer.valueOf(c);
            m752e(c);
        }
    }

    public void m6686b() {
        for (aer e : this.f4486g.keySet()) {
            int e2 = e.m865e();
            new Object[1][0] = Integer.valueOf(e2);
            a_(e2);
        }
    }

    public void m6693f(int i) {
        Object[] objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i + 1)};
        a_(i + 1);
    }

    public void m6687b(int i, Object obj) {
        Object[] objArr = new Object[]{Integer.valueOf(1), obj, Integer.valueOf(2), obj};
        m739a(2, obj);
    }

    public void m6692e(int i, int i2) {
        Object[] objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
        m745b(i + 1, i2 + 1);
    }

    public void m6694f(int i, int i2) {
        Object[] objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i + 1), Integer.valueOf(i2)};
        m738a(i + 1, i2);
    }

    public void m6695g(int i, int i2) {
        Object[] objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i + 1), Integer.valueOf(i2)};
        m6678f();
        m749c(i + 1, i2);
    }

    public void m6696h(int i, int i2) {
        Object[] objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i + 1), Integer.valueOf(i2)};
        m751d(i + 1, i2);
        m6678f();
    }

    public void m6691d(boolean z) {
        if (m6676d()) {
            Object[] objArr = new Object[]{Boolean.valueOf(z), Boolean.valueOf(z)};
            m739a(0, (Object) Boolean.valueOf(z));
        }
    }

    private void m6678f() {
        int i = this.f4485f;
        int a = this.f4484e.a();
        this.f4485f = a;
        if (i == 0 && a > 0) {
            m750d(0);
        } else if (i > 0 && a == 0) {
            m752e(0);
        }
    }
}
