package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: cus */
public final class cus {
    int a;
    boolean b;
    boolean c;
    float d;
    int e;
    int f;
    boolean g;
    boolean h;
    boolean i;
    final ite j;
    final Handler k;
    final List<cuz> l;
    final Runnable m;
    final Runnable n;
    final Runnable o;
    private final boolean p;
    private iry q;
    private ism r;
    private final Context s;

    cus(Context context, ite ite, int i) {
        boolean z = true;
        this.d = 1.0f;
        this.k = new Handler();
        this.l = new ArrayList();
        this.m = new cut(this);
        this.n = new cuu(this);
        this.o = new cuv(this);
        this.s = context;
        this.j = ite;
        if (i != 1) {
            z = false;
        }
        this.p = z;
    }

    public void a(cuz cuz) {
        if (!this.l.contains(cuz)) {
            this.l.add(cuz);
        }
    }

    public void b(cuz cuz) {
        this.l.remove(cuz);
    }

    public void a(int i) {
        if (b() != i) {
            s().a(i);
            for (cuz a : this.l) {
                a.a(i);
            }
        }
    }

    public float a() {
        return this.d;
    }

    public int b() {
        return s().h();
    }

    public boolean b(int i) {
        switch (i) {
            case wi.j /*1*/:
                return s().a();
            case wi.l /*2*/:
                return s().b();
            default:
                return false;
        }
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean z) {
        this.b = z;
        this.m.run();
    }

    public void d() {
        a(!c());
    }

    public void e() {
        this.a++;
        if (this.a == 1) {
            this.m.run();
        }
    }

    public void f() {
        this.a--;
        if (this.a == 0) {
            this.k.postDelayed(this.m, 100);
        }
    }

    public boolean g() {
        return ((ehz) jyn.a(this.s, ehz.class)).a("android.permission.CAMERA");
    }

    public void h() {
        this.m.run();
    }

    public boolean i() {
        return this.h;
    }

    public void b(boolean z) {
        if (z != this.g) {
            this.g = z;
            this.n.run();
        }
    }

    public void j() {
        b(!i());
    }

    public void k() {
        this.e++;
        if (this.e == 1) {
            this.n.run();
        }
    }

    public void l() {
        this.e--;
        if (this.e == 0) {
            this.k.postDelayed(this.n, 100);
        }
    }

    public boolean m() {
        return ((ehz) jyn.a(this.s, ehz.class)).a("android.permission.RECORD_AUDIO");
    }

    private void a(isq isq) {
        t().a(isq);
        switch (cuy.a[isq.ordinal()]) {
            case wi.j /*1*/:
                gwb.i(this.s, 2062);
            case wi.l /*2*/:
                gwb.i(this.s, 2063);
            case wi.z /*3*/:
                gwb.i(this.s, 2065);
            case wi.h /*4*/:
                gwb.i(this.s, 2064);
            default:
        }
    }

    public Set<isq> n() {
        return t().d();
    }

    public isr o() {
        return t().c();
    }

    public void p() {
        Set n = n();
        switch (cuy.b[o().ordinal()]) {
            case wi.j /*1*/:
                if (n.contains(isq.SPEAKERPHONE)) {
                    a(isq.SPEAKERPHONE);
                    return;
                }
                break;
            case wi.l /*2*/:
                break;
        }
        if (n.contains(isq.BLUETOOTH_HEADSET)) {
            a(isq.BLUETOOTH_HEADSET);
            return;
        }
        if (n.contains(isq.EARPIECE)) {
            a(isq.EARPIECE);
        } else if (n.contains(isq.SPEAKERPHONE)) {
            a(isq.SPEAKERPHONE);
        } else if (n.contains(isq.BLUETOOTH_HEADSET)) {
            a(isq.BLUETOOTH_HEADSET);
        }
    }

    public void q() {
        this.f++;
        if (this.f == 1) {
            this.o.run();
        }
    }

    public void r() {
        this.f--;
        if (this.f == 0) {
            this.k.postDelayed(this.o, 100);
        }
    }

    iry s() {
        if (this.q == null) {
            this.q = ((cva) jyn.a(this.s, cva.class)).a(this.s);
            this.q.a(new cuw(this));
            this.j.a(this.q);
        }
        return this.q;
    }

    ism t() {
        if (this.r == null) {
            this.r = ((cva) jyn.a(this.s, cva.class)).a(this.s, this.p);
            this.r.a(new cux(this));
            this.j.a(this.r);
        }
        return this.r;
    }
}
