package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class hfj implements hfx {
    final Lock f16827a;
    final Map<gue<?>, gug> f16828b;
    final Map<gue<?>, ConnectionResult> f16829c = new HashMap();
    final gwa f16830d;
    final Map<gtz<?>, Integer> f16831e;
    final guc<? extends hca, hcb> f16832f;
    volatile hfi f16833g;
    int f16834h;
    final hfe f16835i;
    final hfy f16836j;
    private final Condition f16837k;
    private final Context f16838l;
    private final gtq f16839m;
    private final hfl f16840n;
    private ConnectionResult f16841o = null;

    public hfj(Context context, hfe hfe, Lock lock, Looper looper, gtq gtq, Map<gue<?>, gug> map, gwa gwa, Map<gtz<?>, Integer> map2, guc<? extends hca, hcb> guc__extends_hca__hcb, ArrayList<hek> arrayList, hfy hfy) {
        this.f16838l = context;
        this.f16827a = lock;
        this.f16839m = gtq;
        this.f16828b = map;
        this.f16830d = gwa;
        this.f16831e = map2;
        this.f16832f = guc__extends_hca__hcb;
        this.f16835i = hfe;
        this.f16836j = hfy;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((hek) obj).m19484a(this);
        }
        this.f16840n = new hfl(this, looper);
        this.f16837k = lock.newCondition();
        this.f16833g = new hfd(this);
    }

    public ConnectionResult mo2479a(long j, TimeUnit timeUnit) {
        mo2481a();
        long toNanos = timeUnit.toNanos(j);
        while (mo2487e()) {
            if (toNanos <= 0) {
                try {
                    mo2485c();
                    return new ConnectionResult(14, null);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, null);
                }
            }
            toNanos = this.f16837k.awaitNanos(toNanos);
        }
        return mo2486d() ? ConnectionResult.f7256a : this.f16841o != null ? this.f16841o : new ConnectionResult(13, null);
    }

    public <A extends gud, R extends gup, T extends heb<R, A>> T mo2480a(T t) {
        t.m18985i();
        return this.f16833g.mo2492a((heb) t);
    }

    public void mo2481a() {
        this.f16833g.mo2499c();
    }

    public void m19635a(int i) {
        this.f16827a.lock();
        try {
            this.f16833g.mo2494a(i);
        } finally {
            this.f16827a.unlock();
        }
    }

    public void m19636a(Bundle bundle) {
        this.f16827a.lock();
        try {
            this.f16833g.mo2495a(bundle);
        } finally {
            this.f16827a.unlock();
        }
    }

    void m19637a(ConnectionResult connectionResult) {
        this.f16827a.lock();
        try {
            this.f16841o = connectionResult;
            this.f16833g = new hfd(this);
            this.f16833g.mo2493a();
            this.f16837k.signalAll();
        } finally {
            this.f16827a.unlock();
        }
    }

    public void m19638a(ConnectionResult connectionResult, gtz<?> gtz_, int i) {
        this.f16827a.lock();
        try {
            this.f16833g.mo2496a(connectionResult, gtz_, i);
        } finally {
            this.f16827a.unlock();
        }
    }

    void m19639a(hfk hfk) {
        this.f16840n.sendMessage(this.f16840n.obtainMessage(1, hfk));
    }

    void m19640a(RuntimeException runtimeException) {
        this.f16840n.sendMessage(this.f16840n.obtainMessage(2, runtimeException));
    }

    public void mo2482a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        for (gtz gtz : this.f16831e.keySet()) {
            printWriter.append(str).append(gtz.m18607d()).println(":");
            ((gug) this.f16828b.get(gtz.m18606c())).m18614a(concat, printWriter);
        }
    }

    public ConnectionResult mo2483b() {
        mo2481a();
        while (mo2487e()) {
            try {
                this.f16837k.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        return mo2486d() ? ConnectionResult.f7256a : this.f16841o != null ? this.f16841o : new ConnectionResult(13, null);
    }

    public <A extends gud, T extends heb<? extends gup, A>> T mo2484b(T t) {
        t.m18985i();
        return this.f16833g.mo2497b(t);
    }

    public void mo2485c() {
        if (this.f16833g.mo2498b()) {
            this.f16829c.clear();
        }
    }

    public boolean mo2486d() {
        return this.f16833g instanceof hep;
    }

    public boolean mo2487e() {
        return this.f16833g instanceof hes;
    }

    public void mo2488f() {
        if (mo2486d()) {
            ((hep) this.f16833g).m19543d();
        }
    }

    void m19648g() {
        this.f16827a.lock();
        try {
            this.f16833g = new hes(this, this.f16830d, this.f16831e, this.f16839m, this.f16832f, this.f16827a, this.f16838l);
            this.f16833g.mo2493a();
            this.f16837k.signalAll();
        } finally {
            this.f16827a.unlock();
        }
    }

    void m19649h() {
        this.f16827a.lock();
        try {
            this.f16835i.m19626g();
            this.f16833g = new hep(this);
            this.f16833g.mo2493a();
            this.f16837k.signalAll();
        } finally {
            this.f16827a.unlock();
        }
    }

    void m19650i() {
        for (gug a : this.f16828b.values()) {
            a.mo2600a();
        }
    }
}
