package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public abstract class heg<R extends gup> extends gum<R> {
    static final ThreadLocal<Boolean> g = new heh();
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.guq<? super R> r6) {
        /*
        r5 = this;
        r0 = 1;
        r1 = 0;
        r3 = r5.h;
        monitor-enter(r3);
        if (r6 != 0) goto L_0x000c;
    L_0x0007:
        r0 = 0;
        r5.b = r0;	 Catch:{ all -> 0x0027 }
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
    L_0x000b:
        return;
    L_0x000c:
        r2 = r5.m;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002a;
    L_0x0010:
        r2 = r0;
    L_0x0011:
        r4 = "Result has already been consumed.";
        defpackage.gwb.a(r2, r4);	 Catch:{ all -> 0x0027 }
        r2 = r5.o;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002c;
    L_0x001a:
        r1 = "Cannot set callbacks if then() has been called.";
        defpackage.gwb.a(r0, r1);	 Catch:{ all -> 0x0027 }
        r0 = r5.h();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x002e;
    L_0x0025:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        throw r0;
    L_0x002a:
        r2 = r1;
        goto L_0x0011;
    L_0x002c:
        r0 = r1;
        goto L_0x001a;
    L_0x002e:
        r0 = r5.e();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x003f;
    L_0x0034:
        r0 = r5.i;	 Catch:{ all -> 0x0027 }
        r1 = r5.c();	 Catch:{ all -> 0x0027 }
        r0.a(r6, r1);	 Catch:{ all -> 0x0027 }
    L_0x003d:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x003f:
        r5.b = r6;	 Catch:{ all -> 0x0027 }
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: heg.a(guq):void");
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f() {
        /*
        r2 = this;
        r1 = r2.h;
        monitor-enter(r1);
        r0 = r2.d;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.m;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = r2.f;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r0 = r2.f;	 Catch:{ RemoteException -> 0x002c }
        r0.a();	 Catch:{ RemoteException -> 0x002c }
    L_0x0016:
        r0 = r2.l;	 Catch:{ all -> 0x0029 }
        defpackage.heg.b(r0);	 Catch:{ all -> 0x0029 }
        r0 = 1;
        r2.d = r0;	 Catch:{ all -> 0x0029 }
        r0 = com.google.android.gms.common.api.Status.e;	 Catch:{ all -> 0x0029 }
        r0 = r2.b(r0);	 Catch:{ all -> 0x0029 }
        r2.c(r0);	 Catch:{ all -> 0x0029 }
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        goto L_0x000c;
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        throw r0;
    L_0x002c:
        r0 = move-exception;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: heg.f():void");
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
