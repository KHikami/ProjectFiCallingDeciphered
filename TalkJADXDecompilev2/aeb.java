package defpackage;

import java.util.ArrayList;
import java.util.List;

public abstract class aeb {
    private aec a = null;
    private ArrayList<a> b = new ArrayList();
    private long c = 120;
    private long d = 120;
    private long e = 250;
    private long f = 250;

    public abstract void a();

    public abstract boolean a(aer aer, aed aed, aed aed2);

    public abstract boolean a(aer aer, aer aer2, aed aed, aed aed2);

    public abstract boolean b();

    public abstract boolean b(aer aer, aed aed, aed aed2);

    public abstract void c(aer aer);

    public abstract boolean c(aer aer, aed aed, aed aed2);

    public abstract void d();

    public long e() {
        return this.e;
    }

    public void a(long j) {
        this.e = j;
    }

    public long f() {
        return this.c;
    }

    public void b(long j) {
        this.c = j;
    }

    public long g() {
        return this.d;
    }

    public long h() {
        return this.f;
    }

    public void a(aec aec) {
        this.a = aec;
    }

    public aed b(aer aer, List<Object> list) {
        return j().a(aer);
    }

    public aed d(aer aer) {
        return j().a(aer);
    }

    public final void f(aer aer) {
        if (this.a != null) {
            this.a.a(aer);
        }
    }

    public boolean g(aer aer) {
        return true;
    }

    public boolean a(aer aer, List<Object> list) {
        return g(aer);
    }

    public final void i() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i);
        }
        this.b.clear();
    }

    public aed j() {
        return new aed();
    }

    public static int e(aer aer) {
        int i = aer.i & 14;
        if (aer.k()) {
            return 4;
        }
        if ((i & 4) != 0) {
            return i;
        }
        int i2 = aer.c;
        int e = aer.e();
        if (i2 == -1 || e == -1 || i2 == e) {
            return i;
        }
        return i | 2048;
    }
}
