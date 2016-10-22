package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: heg */
public abstract class heg<R extends gup> extends gum<R> {
    static final ThreadLocal<Boolean> g;
    private final CountDownLatch a;
    private guq<? super R> b;
    private hej c;
    private boolean d;
    private boolean e;
    private gws f;
    final Object h;
    public final hei<R> i;
    public final WeakReference<gui> j;
    final ArrayList<gun> k;
    R l;
    volatile boolean m;
    private Integer n;
    private volatile hgm<R> o;
    private boolean p;

    static {
        g = new heh();
    }

    @Deprecated
    heg() {
        this.h = new Object();
        this.a = new CountDownLatch(1);
        this.k = new ArrayList();
        this.p = false;
        this.i = new hei(Looper.getMainLooper());
        this.j = new WeakReference(null);
    }

    protected heg(gui gui) {
        this.h = new Object();
        this.a = new CountDownLatch(1);
        this.k = new ArrayList();
        this.p = false;
        this.i = new hei(gui != null ? gui.a() : Looper.getMainLooper());
        this.j = new WeakReference(gui);
    }

    public static void b(gup gup) {
        if (gup instanceof guo) {
            try {
                ((guo) gup).b();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(gup);
                new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf);
            }
        }
    }

    private R c() {
        R r;
        boolean z = true;
        synchronized (this.h) {
            if (this.m) {
                z = false;
            }
            gwb.a(z, (Object) "Result has already been consumed.");
            gwb.a(e(), (Object) "Result is not ready.");
            r = this.l;
            this.l = null;
            this.b = null;
            this.m = true;
        }
        d();
        return r;
    }

    private void c(R r) {
        this.l = r;
        this.f = null;
        this.a.countDown();
        this.l.k();
        if (this.d) {
            this.b = null;
        } else if (this.b != null) {
            this.i.a();
            this.i.a(this.b, c());
        } else if (this.l instanceof guo) {
            this.c = new hej(this);
        }
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((gun) obj).a();
        }
        this.k.clear();
    }

    public final R a() {
        boolean z = true;
        gwb.a(Looper.myLooper() != Looper.getMainLooper(), (Object) "await must not be called on the UI thread");
        gwb.a(!this.m, (Object) "Result has already been consumed");
        if (this.o != null) {
            z = false;
        }
        gwb.a(z, (Object) "Cannot await if then() has been called.");
        try {
            this.a.await();
        } catch (InterruptedException e) {
            d(Status.b);
        }
        gwb.a(e(), (Object) "Result is not ready.");
        return c();
    }

    public final void a(R r) {
        boolean z = true;
        synchronized (this.h) {
            if (this.e || this.d) {
                heg.b((gup) r);
                return;
            }
            if (e()) {
            }
            gwb.a(!e(), (Object) "Results have already been set");
            if (this.m) {
                z = false;
            }
            gwb.a(z, (Object) "Result has already been consumed");
            c(r);
        }
    }

    public final void a(guq<? super R> guq__super_R) {
        boolean z = true;
        synchronized (this.h) {
            if (guq__super_R == null) {
                this.b = null;
                return;
            }
            gwb.a(!this.m, (Object) "Result has already been consumed.");
            if (this.o != null) {
                z = false;
            }
            gwb.a(z, (Object) "Cannot set callbacks if then() has been called.");
            if (h()) {
                return;
            }
            if (e()) {
                this.i.a(guq__super_R, c());
            } else {
                this.b = guq__super_R;
            }
            return;
        }
    }

    protected final void a(gws gws) {
        synchronized (this.h) {
            this.f = gws;
        }
    }

    public abstract R b(Status status);

    public Integer b() {
        return this.n;
    }

    protected void d() {
    }

    public final void d(Status status) {
        synchronized (this.h) {
            if (!e()) {
                a(b(status));
                this.e = true;
            }
        }
    }

    public final boolean e() {
        return this.a.getCount() == 0;
    }

    public void f() {
        synchronized (this.h) {
            if (this.d || this.m) {
                return;
            }
            if (this.f != null) {
                try {
                    this.f.a();
                } catch (RemoteException e) {
                }
            }
            heg.b(this.l);
            this.d = true;
            c(b(Status.e));
        }
    }

    public boolean g() {
        boolean h;
        synchronized (this.h) {
            if (((gui) this.j.get()) == null || !this.p) {
                f();
            }
            h = h();
        }
        return h;
    }

    public boolean h() {
        boolean z;
        synchronized (this.h) {
            z = this.d;
        }
        return z;
    }

    public void i() {
        boolean z = this.p || ((Boolean) g.get()).booleanValue();
        this.p = z;
    }
}
