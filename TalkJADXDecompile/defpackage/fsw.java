package defpackage;

/* renamed from: fsw */
public final class fsw extends hwl {
    private hwl b;
    private final Object c;
    private Throwable d;

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public fsw(hwl hwl) {
        super(null);
        this.c = new Object();
        iil.b("Expected condition to be false", hwl.c());
        this.b = hwl;
    }

    private fsx b(int i) {
        fsx fsx;
        synchronized (this.c) {
            if (this.b == null) {
                throw new IllegalStateException("Already released", this.d);
            }
            fsx = new fsx((hwk) this.b.a(i));
        }
        return fsx;
    }

    public int a() {
        int a;
        synchronized (this.c) {
            if (this.b == null) {
                throw new IllegalStateException("Already released", this.d);
            }
            a = this.b.a();
        }
        return a;
    }

    public void b() {
        super.b();
        this.d = new Throwable("ThreadSafeAggregatedPersonBuffer released");
        synchronized (this.c) {
            if (this.b != null) {
                this.b.b();
                this.b = null;
            }
        }
    }

    public boolean c() {
        boolean z;
        synchronized (this.c) {
            if (this.b == null) {
                z = true;
            } else {
                z = this.b.c();
            }
        }
        return z;
    }
}
