package defpackage;

import android.content.Context;

@Deprecated
public abstract class fgs extends fhb implements bhf, bhj {
    public final bhr a = new bhs().d(0).a();
    private final long b;
    private final long g;
    private int h = 0;

    @Deprecated
    protected abstract void a(long j);

    @Deprecated
    protected abstract long f();

    public fgs(bko bko, long j, long j2) {
        super(bko);
        this.b = j;
        this.g = j2;
    }

    @Deprecated
    public void a(int i) {
        synchronized (this) {
            this.h = i;
            if (i == 3) {
                a(glj.a());
                this.h = 0;
            }
        }
    }

    protected int a(bhb bhb) {
        a(2);
        return super.a(bhb);
    }

    @Deprecated
    public boolean e() {
        boolean z;
        synchronized (this) {
            z = this.h == 2;
        }
        return z;
    }

    private long g() {
        long a = glj.a() - f();
        if (a > this.b || a > this.g) {
            return 0;
        }
        return this.g - a;
    }

    public bhr a() {
        this.a.a(g());
        return this.a;
    }

    public void a(Context context) {
    }

    public bhk c() {
        return g() == 0 ? bhk.NONE : bhk.USE_OLD;
    }

    public String b() {
        return getClass().getName();
    }

    public bhu d() {
        return new bhv().a();
    }
}
