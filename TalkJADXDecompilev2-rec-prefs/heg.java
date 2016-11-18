package p000;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public abstract class heg<R extends gup> extends gum<R> {
    static final ThreadLocal<Boolean> f16385g = new heh();
    private final CountDownLatch f16386a;
    private guq<? super R> f16387b;
    private hej f16388c;
    private boolean f16389d;
    private boolean f16390e;
    private gws f16391f;
    final Object f16392h;
    public final hei<R> f16393i;
    public final WeakReference<gui> f16394j;
    final ArrayList<gun> f16395k;
    R f16396l;
    volatile boolean f16397m;
    private Integer f16398n;
    private volatile hgm<R> f16399o;
    private boolean f16400p;

    @Deprecated
    heg() {
        this.f16392h = new Object();
        this.f16386a = new CountDownLatch(1);
        this.f16395k = new ArrayList();
        this.f16400p = false;
        this.f16393i = new hei(Looper.getMainLooper());
        this.f16394j = new WeakReference(null);
    }

    protected heg(gui gui) {
        this.f16392h = new Object();
        this.f16386a = new CountDownLatch(1);
        this.f16395k = new ArrayList();
        this.f16400p = false;
        this.f16393i = new hei(gui != null ? gui.mo2507a() : Looper.getMainLooper());
        this.f16394j = new WeakReference(gui);
    }

    public static void m18970b(gup gup) {
        if (gup instanceof guo) {
            try {
                ((guo) gup).mo2073b();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(gup);
                new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf);
            }
        }
    }

    private R mo2422c() {
        R r;
        boolean z = true;
        synchronized (this.f16392h) {
            if (this.f16397m) {
                z = false;
            }
            gwb.m1886a(z, (Object) "Result has already been consumed.");
            gwb.m1886a(m18981e(), (Object) "Result is not ready.");
            r = this.f16396l;
            this.f16396l = null;
            this.f16387b = null;
            this.f16397m = true;
        }
        mo2423d();
        return r;
    }

    private void m18972c(R r) {
        this.f16396l = r;
        this.f16391f = null;
        this.f16386a.countDown();
        this.f16396l.mo1279k();
        if (this.f16389d) {
            this.f16387b = null;
        } else if (this.f16387b != null) {
            this.f16393i.m19479a();
            this.f16393i.m19480a(this.f16387b, mo2422c());
        } else if (this.f16396l instanceof guo) {
            this.f16388c = new hej(this);
        }
        ArrayList arrayList = this.f16395k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((gun) obj).m18649a();
        }
        this.f16395k.clear();
    }

    public final R mo2418a() {
        boolean z = true;
        gwb.m1886a(Looper.myLooper() != Looper.getMainLooper(), (Object) "await must not be called on the UI thread");
        gwb.m1886a(!this.f16397m, (Object) "Result has already been consumed");
        if (this.f16399o != null) {
            z = false;
        }
        gwb.m1886a(z, (Object) "Cannot await if then() has been called.");
        try {
            this.f16386a.await();
        } catch (InterruptedException e) {
            m18980d(Status.f7265b);
        }
        gwb.m1886a(m18981e(), (Object) "Result is not ready.");
        return mo2422c();
    }

    public final void m18974a(R r) {
        boolean z = true;
        synchronized (this.f16392h) {
            if (this.f16390e || this.f16389d) {
                heg.m18970b((gup) r);
                return;
            }
            if (m18981e()) {
            }
            gwb.m1886a(!m18981e(), (Object) "Results have already been set");
            if (this.f16397m) {
                z = false;
            }
            gwb.m1886a(z, (Object) "Result has already been consumed");
            m18972c(r);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2419a(guq<? super R> guq__super_R) {
        boolean z = true;
        synchronized (this.f16392h) {
            if (guq__super_R == null) {
                this.f16387b = null;
                return;
            }
            gwb.m1886a(!this.f16397m, (Object) "Result has already been consumed.");
            if (this.f16399o != null) {
                z = false;
            }
            gwb.m1886a(z, (Object) "Cannot set callbacks if then() has been called.");
            if (m18984h()) {
            } else if (m18981e()) {
                this.f16393i.m19480a(guq__super_R, mo2422c());
            } else {
                this.f16387b = guq__super_R;
            }
        }
    }

    protected final void m18976a(gws gws) {
        synchronized (this.f16392h) {
            this.f16391f = gws;
        }
    }

    public abstract R mo2424b(Status status);

    public Integer mo2420b() {
        return this.f16398n;
    }

    protected void mo2423d() {
    }

    public final void m18980d(Status status) {
        synchronized (this.f16392h) {
            if (!m18981e()) {
                m18974a(mo2424b(status));
                this.f16390e = true;
            }
        }
    }

    public final boolean m18981e() {
        return this.f16386a.getCount() == 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m18982f() {
        synchronized (this.f16392h) {
            if (this.f16389d || this.f16397m) {
            } else {
                if (this.f16391f != null) {
                    try {
                        this.f16391f.mo2360a();
                    } catch (RemoteException e) {
                    }
                }
                heg.m18970b(this.f16396l);
                this.f16389d = true;
                m18972c(mo2424b(Status.f7268e));
            }
        }
    }

    public boolean m18983g() {
        boolean h;
        synchronized (this.f16392h) {
            if (((gui) this.f16394j.get()) == null || !this.f16400p) {
                m18982f();
            }
            h = m18984h();
        }
        return h;
    }

    public boolean m18984h() {
        boolean z;
        synchronized (this.f16392h) {
            z = this.f16389d;
        }
        return z;
    }

    public void m18985i() {
        boolean z = this.f16400p || ((Boolean) f16385g.get()).booleanValue();
        this.f16400p = z;
    }
}
