package p000;

import android.content.Context;

@Deprecated
public abstract class fgs extends fhb implements bhf, bhj {
    public final bhr f13024a = new bhs().m5272d(0).m5267a();
    private final long f13025b;
    private final long f13026g;
    private int f13027h = 0;

    @Deprecated
    protected abstract void mo2020a(long j);

    @Deprecated
    protected abstract long mo2021f();

    public fgs(bko bko, long j, long j2) {
        super(bko);
        this.f13025b = j;
        this.f13026g = j2;
    }

    @Deprecated
    public void m15273a(int i) {
        synchronized (this) {
            this.f13027h = i;
            if (i == 3) {
                mo2020a(glj.m17956a());
                this.f13027h = 0;
            }
        }
    }

    protected int mo1991a(bhb bhb) {
        m15273a(2);
        return super.mo1991a(bhb);
    }

    @Deprecated
    public boolean m15279e() {
        boolean z;
        synchronized (this) {
            z = this.f13027h == 2;
        }
        return z;
    }

    private long mo2022g() {
        long a = glj.m17956a() - mo2021f();
        if (a > this.f13025b || a > this.f13026g) {
            return 0;
        }
        return this.f13026g - a;
    }

    public bhr mo540a() {
        this.f13024a.m5261a(mo2022g());
        return this.f13024a;
    }

    public void mo541a(Context context) {
    }

    public bhk mo543c() {
        return mo2022g() == 0 ? bhk.NONE : bhk.USE_OLD;
    }

    public String mo542b() {
        return getClass().getName();
    }

    public bhu mo544d() {
        return new bhv().m5276a();
    }
}
