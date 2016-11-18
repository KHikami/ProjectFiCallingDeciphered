package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

final class aqe<R> implements api<R>, bay {
    private static final aqf k = new aqf();
    private static final Handler l = new Handler(Looper.getMainLooper(), new aqg());
    final List<azm> a;
    final bba b;
    final aqh c;
    anv d;
    boolean e;
    aqr<?> f;
    anq g;
    boolean h;
    aqk<?> i;
    volatile boolean j;
    private final ll<aqe<?>> m;
    private final aqf n;
    private final asm o;
    private final asm p;
    private final asm q;
    private boolean r;
    private aqm s;
    private boolean t;
    private List<azm> u;
    private apg<R> v;

    aqe(asm asm, asm asm2, asm asm3, aqh aqh, ll<aqe<?>> llVar) {
        this(asm, asm2, asm3, aqh, llVar, k);
    }

    private aqe(asm asm, asm asm2, asm asm3, aqh aqh, ll<aqe<?>> llVar, aqf aqf) {
        this.a = new ArrayList(2);
        this.b = bba.a();
        this.o = asm;
        this.p = asm2;
        this.q = asm3;
        this.c = aqh;
        this.m = llVar;
        this.n = aqf;
    }

    aqe<R> a(anv anv, boolean z, boolean z2) {
        this.d = anv;
        this.e = z;
        this.r = z2;
        return this;
    }

    public void b(apg<R> apg_R) {
        asm asm;
        this.v = apg_R;
        if (apg_R.a()) {
            asm = this.o;
        } else {
            asm = b();
        }
        asm.execute(apg_R);
    }

    public void a(azm azm) {
        baq.a();
        this.b.b();
        if (this.h) {
            azm.a(this.i, this.g);
        } else if (this.t) {
            azm.a(this.s);
        } else {
            this.a.add(azm);
        }
    }

    public void b(azm azm) {
        baq.a();
        this.b.b();
        if (this.h || this.t) {
            if (this.u == null) {
                this.u = new ArrayList(2);
            }
            if (!this.u.contains(azm)) {
                this.u.add(azm);
                return;
            }
            return;
        }
        this.a.remove(azm);
        if (this.a.isEmpty()) {
            c();
        }
    }

    private asm b() {
        return this.r ? this.q : this.p;
    }

    boolean c(azm azm) {
        return this.u != null && this.u.contains(azm);
    }

    private void c() {
        if (!this.t && !this.h && !this.j) {
            this.j = true;
            this.v.b();
            boolean z = this.o.remove(this.v) || this.p.remove(this.v) || this.q.remove(this.v);
            this.c.a(this, this.d);
            if (z) {
                a(true);
            }
        }
    }

    void a(boolean z) {
        baq.a();
        this.a.clear();
        this.d = null;
        this.i = null;
        this.f = null;
        if (this.u != null) {
            this.u.clear();
        }
        this.t = false;
        this.j = false;
        this.h = false;
        this.v.a(z);
        this.v = null;
        this.s = null;
        this.g = null;
        this.m.a(this);
    }

    public void a(aqr<R> aqr_R, anq anq) {
        this.f = aqr_R;
        this.g = anq;
        l.obtainMessage(1, this).sendToTarget();
    }

    public void a(aqm aqm) {
        this.s = aqm;
        l.obtainMessage(2, this).sendToTarget();
    }

    public void a(apg<?> apg_) {
        if (this.j) {
            l.obtainMessage(3, this).sendToTarget();
        } else {
            b().execute(apg_);
        }
    }

    void a() {
        this.b.b();
        if (this.j) {
            a(false);
        } else if (this.a.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        } else if (this.t) {
            throw new IllegalStateException("Already failed once");
        } else {
            this.t = true;
            this.c.a(this.d, null);
            for (azm azm : this.a) {
                if (!c(azm)) {
                    azm.a(this.s);
                }
            }
            a(false);
        }
    }

    public bba j_() {
        return this.b;
    }
}
