package p000;

import android.os.Looper;

public final class aqk<Z> implements aqr<Z> {
    private final boolean f2137a;
    private aql f2138b;
    private anv f2139c;
    private int f2140d;
    private boolean f2141e;
    private final aqr<Z> f2142f;

    aqk(aqr<Z> aqr_Z, boolean z) {
        this.f2142f = (aqr) gwb.m1404I((Object) aqr_Z);
        this.f2137a = z;
    }

    void m3734a(anv anv, aql aql) {
        this.f2139c = anv;
        this.f2138b = aql;
    }

    boolean m3735a() {
        return this.f2137a;
    }

    public Class<Z> mo345b() {
        return this.f2142f.mo345b();
    }

    public Z mo346c() {
        return this.f2142f.mo346c();
    }

    public int mo347d() {
        return this.f2142f.mo347d();
    }

    public void mo348e() {
        if (this.f2140d > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (this.f2141e) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else {
            this.f2141e = true;
            this.f2142f.mo348e();
        }
    }

    void m3740f() {
        if (this.f2141e) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f2140d++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    public void m3741g() {
        if (this.f2140d <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.f2140d - 1;
            this.f2140d = i;
            if (i == 0) {
                this.f2138b.mo340b(this.f2139c, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }

    public String toString() {
        boolean z = this.f2137a;
        String valueOf = String.valueOf(this.f2138b);
        String valueOf2 = String.valueOf(this.f2139c);
        int i = this.f2140d;
        boolean z2 = this.f2141e;
        String valueOf3 = String.valueOf(this.f2142f);
        return new StringBuilder(((String.valueOf(valueOf).length() + 101) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("EngineResource{isCacheable=").append(z).append(", listener=").append(valueOf).append(", key=").append(valueOf2).append(", acquired=").append(i).append(", isRecycled=").append(z2).append(", resource=").append(valueOf3).append("}").toString();
    }
}
