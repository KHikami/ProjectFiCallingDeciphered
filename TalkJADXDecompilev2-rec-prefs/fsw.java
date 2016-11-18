package p000;

public final class fsw extends hwl {
    private hwl f13938b;
    private final Object f13939c = new Object();
    private Throwable f13940d;

    public /* synthetic */ Object mo2075a(int i) {
        return m16155b(i);
    }

    public fsw(hwl hwl) {
        super(null);
        iil.m21879b("Expected condition to be false", hwl.mo2076c());
        this.f13938b = hwl;
    }

    private fsx m16155b(int i) {
        fsx fsx;
        synchronized (this.f13939c) {
            if (this.f13938b == null) {
                throw new IllegalStateException("Already released", this.f13940d);
            }
            fsx = new fsx((hwk) this.f13938b.mo2075a(i));
        }
        return fsx;
    }

    public int mo2074a() {
        int a;
        synchronized (this.f13939c) {
            if (this.f13938b == null) {
                throw new IllegalStateException("Already released", this.f13940d);
            }
            a = this.f13938b.mo2074a();
        }
        return a;
    }

    public void mo2073b() {
        super.mo2073b();
        this.f13940d = new Throwable("ThreadSafeAggregatedPersonBuffer released");
        synchronized (this.f13939c) {
            if (this.f13938b != null) {
                this.f13938b.mo2073b();
                this.f13938b = null;
            }
        }
    }

    public boolean mo2076c() {
        boolean z;
        synchronized (this.f13939c) {
            if (this.f13938b == null) {
                z = true;
            } else {
                z = this.f13938b.mo2076c();
            }
        }
        return z;
    }
}
