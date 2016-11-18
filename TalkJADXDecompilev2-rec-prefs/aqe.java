package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

final class aqe<R> implements api<R>, bay {
    private static final aqf f2106k = new aqf();
    private static final Handler f2107l = new Handler(Looper.getMainLooper(), new aqg());
    final List<azm> f2108a;
    final bba f2109b;
    final aqh f2110c;
    anv f2111d;
    boolean f2112e;
    aqr<?> f2113f;
    anq f2114g;
    boolean f2115h;
    aqk<?> f2116i;
    volatile boolean f2117j;
    private final ll<aqe<?>> f2118m;
    private final aqf f2119n;
    private final asm f2120o;
    private final asm f2121p;
    private final asm f2122q;
    private boolean f2123r;
    private aqm f2124s;
    private boolean f2125t;
    private List<azm> f2126u;
    private apg<R> f2127v;

    aqe(asm asm, asm asm2, asm asm3, aqh aqh, ll<aqe<?>> llVar) {
        this(asm, asm2, asm3, aqh, llVar, f2106k);
    }

    private aqe(asm asm, asm asm2, asm asm3, aqh aqh, ll<aqe<?>> llVar, aqf aqf) {
        this.f2108a = new ArrayList(2);
        this.f2109b = bba.m4705a();
        this.f2120o = asm;
        this.f2121p = asm2;
        this.f2122q = asm3;
        this.f2110c = aqh;
        this.f2118m = llVar;
        this.f2119n = aqf;
    }

    aqe<R> m3719a(anv anv, boolean z, boolean z2) {
        this.f2111d = anv;
        this.f2112e = z;
        this.f2123r = z2;
        return this;
    }

    public void m3726b(apg<R> apg_R) {
        asm asm;
        this.f2127v = apg_R;
        if (apg_R.m3651a()) {
            asm = this.f2120o;
        } else {
            asm = m3717b();
        }
        asm.execute(apg_R);
    }

    public void m3724a(azm azm) {
        baq.m4685a();
        this.f2109b.mo439b();
        if (this.f2115h) {
            azm.mo420a(this.f2116i, this.f2114g);
        } else if (this.f2125t) {
            azm.mo419a(this.f2124s);
        } else {
            this.f2108a.add(azm);
        }
    }

    public void m3727b(azm azm) {
        baq.m4685a();
        this.f2109b.mo439b();
        if (this.f2115h || this.f2125t) {
            if (this.f2126u == null) {
                this.f2126u = new ArrayList(2);
            }
            if (!this.f2126u.contains(azm)) {
                this.f2126u.add(azm);
                return;
            }
            return;
        }
        this.f2108a.remove(azm);
        if (this.f2108a.isEmpty()) {
            m3718c();
        }
    }

    private asm m3717b() {
        return this.f2123r ? this.f2122q : this.f2121p;
    }

    boolean m3728c(azm azm) {
        return this.f2126u != null && this.f2126u.contains(azm);
    }

    private void m3718c() {
        if (!this.f2125t && !this.f2115h && !this.f2117j) {
            this.f2117j = true;
            this.f2127v.m3652b();
            boolean z = this.f2120o.remove(this.f2127v) || this.f2121p.remove(this.f2127v) || this.f2122q.remove(this.f2127v);
            this.f2110c.mo338a(this, this.f2111d);
            if (z) {
                m3725a(true);
            }
        }
    }

    void m3725a(boolean z) {
        baq.m4685a();
        this.f2108a.clear();
        this.f2111d = null;
        this.f2116i = null;
        this.f2113f = null;
        if (this.f2126u != null) {
            this.f2126u.clear();
        }
        this.f2125t = false;
        this.f2117j = false;
        this.f2115h = false;
        this.f2127v.m3650a(z);
        this.f2127v = null;
        this.f2124s = null;
        this.f2114g = null;
        this.f2118m.mo437a(this);
    }

    public void mo344a(aqr<R> aqr_R, anq anq) {
        this.f2113f = aqr_R;
        this.f2114g = anq;
        f2107l.obtainMessage(1, this).sendToTarget();
    }

    public void mo343a(aqm aqm) {
        this.f2124s = aqm;
        f2107l.obtainMessage(2, this).sendToTarget();
    }

    public void mo342a(apg<?> apg_) {
        if (this.f2117j) {
            f2107l.obtainMessage(3, this).sendToTarget();
        } else {
            m3717b().execute(apg_);
        }
    }

    void m3720a() {
        this.f2109b.mo439b();
        if (this.f2117j) {
            m3725a(false);
        } else if (this.f2108a.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        } else if (this.f2125t) {
            throw new IllegalStateException("Already failed once");
        } else {
            this.f2125t = true;
            this.f2110c.mo337a(this.f2111d, null);
            for (azm azm : this.f2108a) {
                if (!m3728c(azm)) {
                    azm.mo419a(this.f2124s);
                }
            }
            m3725a(false);
        }
    }

    public bba j_() {
        return this.f2109b;
    }
}
