import android.os.Looper;

public final class aqk<Z> implements aqr<Z> {
    private final boolean a;
    private aql b;
    private anv c;
    private int d;
    private boolean e;
    private final aqr<Z> f;

    aqk(aqr<Z> aqr_Z, boolean z) {
        this.f = (aqr) gwb.I((Object) aqr_Z);
        this.a = z;
    }

    void a(anv anv, aql aql) {
        this.c = anv;
        this.b = aql;
    }

    boolean a() {
        return this.a;
    }

    public Class<Z> b() {
        return this.f.b();
    }

    public Z c() {
        return this.f.c();
    }

    public int d() {
        return this.f.d();
    }

    public void e() {
        if (this.d > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (this.e) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else {
            this.e = true;
            this.f.e();
        }
    }

    void f() {
        if (this.e) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.d++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    public void g() {
        if (this.d <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.b.b(this.c, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }

    public String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        boolean z2 = this.e;
        String valueOf3 = String.valueOf(this.f);
        return new StringBuilder(((String.valueOf(valueOf).length() + 101) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("EngineResource{isCacheable=").append(z).append(", listener=").append(valueOf).append(", key=").append(valueOf2).append(", acquired=").append(i).append(", isRecycled=").append(z2).append(", resource=").append(valueOf3).append("}").toString();
    }
}
