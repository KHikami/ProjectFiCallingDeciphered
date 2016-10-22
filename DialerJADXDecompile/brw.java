import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class brw extends bri {
    private brx a;
    public final Object b;
    public final ArrayList c;
    public volatile brl d;
    public volatile boolean e;
    private final WeakReference f;
    private final CountDownLatch g;
    private brm h;
    private boolean i;
    private boolean j;
    private boolean k;
    private bvc l;
    private volatile brv m;

    protected brw(brc brc) {
        this.b = new Object();
        this.g = new CountDownLatch(1);
        this.c = new ArrayList();
        this.a = new brx(brc != null ? brc.a() : Looper.getMainLooper());
        this.f = new WeakReference(brc);
    }

    public static void b(brl brl) {
        if (!(brl instanceof brk)) {
        }
    }

    private final void c(brl brl) {
        this.d = brl;
        this.l = null;
        this.g.countDown();
        this.d.a();
        if (this.h != null) {
            this.a.removeMessages(2);
            if (!this.i) {
                this.a.a(this.h, i());
            }
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((brj) it.next()).a();
        }
        this.c.clear();
    }

    private boolean h() {
        boolean z;
        synchronized (this.b) {
            z = this.i;
        }
        return z;
    }

    private final brl i() {
        brl brl;
        boolean z = true;
        synchronized (this.b) {
            if (this.e) {
                z = false;
            }
            buf.a(z, (Object) "Result has already been consumed.");
            buf.a(e(), (Object) "Result is not ready.");
            brl = this.d;
            this.d = null;
            this.h = null;
            this.e = true;
        }
        d();
        return brl;
    }

    public final brl a(long j, TimeUnit timeUnit) {
        boolean z = false;
        boolean z2 = j <= 0 || Looper.myLooper() != Looper.getMainLooper();
        buf.a(z2, (Object) "await must not be called on the UI thread when time is greater than zero.");
        if (!this.e) {
            z = true;
        }
        buf.a(z, (Object) "Result has already been consumed.");
        brv brv = this.m;
        buf.a(true, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.g.await(j, timeUnit)) {
                b(Status.d);
            }
        } catch (InterruptedException e) {
            b(Status.b);
        }
        buf.a(e(), (Object) "Result is not ready.");
        return i();
    }

    public final Integer a() {
        return null;
    }

    public final void a(brl brl) {
        boolean z = true;
        synchronized (this.b) {
            if (this.j || this.i) {
                b(brl);
                return;
            }
            buf.a(!e(), (Object) "Results have already been set");
            if (this.e) {
                z = false;
            }
            buf.a(z, (Object) "Result has already been consumed");
            c(brl);
        }
    }

    public final void a(brm brm) {
        boolean z = true;
        if (this.e) {
            z = false;
        }
        buf.a(z, (Object) "Result has already been consumed.");
        synchronized (this.b) {
            brv brv = this.m;
            buf.a(true, (Object) "Cannot set callbacks if then() has been called.");
            if (h()) {
            } else if (!this.k || (((brc) this.f.get()) != null && (brm instanceof brv))) {
                if (e()) {
                    this.a.a(brm, i());
                } else {
                    this.h = brm;
                }
            } else {
                f();
            }
        }
    }

    public final void b(Status status) {
        synchronized (this.b) {
            if (!e()) {
                a(c(status));
                this.j = true;
            }
        }
    }

    public abstract brl c(Status status);

    protected void d() {
    }

    public final boolean e() {
        return this.g.getCount() == 0;
    }

    public final void f() {
        synchronized (this.b) {
            if (this.i || this.e) {
                return;
            }
            b(this.d);
            this.h = null;
            this.i = true;
            c(c(Status.e));
        }
    }

    public final void g() {
        synchronized (this.b) {
            if (((brc) this.f.get()) == null) {
                f();
                return;
            }
            if (this.h == null || (this.h instanceof brv)) {
                this.k = true;
            } else {
                f();
            }
        }
    }
}
