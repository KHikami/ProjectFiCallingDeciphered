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
    final Lock a;
    final Map<gue<?>, gug> b;
    final Map<gue<?>, ConnectionResult> c;
    final gwa d;
    final Map<gtz<?>, Integer> e;
    final guc<? extends hca, hcb> f;
    volatile hfi g;
    int h;
    final hfe i;
    final hfy j;
    private final Condition k;
    private final Context l;
    private final gtq m;
    private final hfl n;
    private ConnectionResult o;

    public hfj(Context context, hfe hfe, Lock lock, Looper looper, gtq gtq, Map<gue<?>, gug> map, gwa gwa, Map<gtz<?>, Integer> map2, guc<? extends hca, hcb> guc__extends_hca__hcb, ArrayList<hek> arrayList, hfy hfy) {
        this.c = new HashMap();
        this.o = null;
        this.l = context;
        this.a = lock;
        this.m = gtq;
        this.b = map;
        this.d = gwa;
        this.e = map2;
        this.f = guc__extends_hca__hcb;
        this.i = hfe;
        this.j = hfy;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((hek) obj).a(this);
        }
        this.n = new hfl(this, looper);
        this.k = lock.newCondition();
        this.g = new hfd(this);
    }

    public ConnectionResult a(long j, TimeUnit timeUnit) {
        a();
        long toNanos = timeUnit.toNanos(j);
        while (e()) {
            if (toNanos <= 0) {
                try {
                    c();
                    return new ConnectionResult(14, null);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, null);
                }
            }
            toNanos = this.k.awaitNanos(toNanos);
        }
        return d() ? ConnectionResult.a : this.o != null ? this.o : new ConnectionResult(13, null);
    }

    public <A extends gud, R extends gup, T extends heb<R, A>> T a(T t) {
        t.i();
        return this.g.a((heb) t);
    }

    public void a() {
        this.g.c();
    }

    public void a(int i) {
        this.a.lock();
        try {
            this.g.a(i);
        } finally {
            this.a.unlock();
        }
    }

    public void a(Bundle bundle) {
        this.a.lock();
        try {
            this.g.a(bundle);
        } finally {
            this.a.unlock();
        }
    }

    void a(ConnectionResult connectionResult) {
        this.a.lock();
        try {
            this.o = connectionResult;
            this.g = new hfd(this);
            this.g.a();
            this.k.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public void a(ConnectionResult connectionResult, gtz<?> gtz_, int i) {
        this.a.lock();
        try {
            this.g.a(connectionResult, gtz_, i);
        } finally {
            this.a.unlock();
        }
    }

    void a(hfk hfk) {
        this.n.sendMessage(this.n.obtainMessage(1, hfk));
    }

    void a(RuntimeException runtimeException) {
        this.n.sendMessage(this.n.obtainMessage(2, runtimeException));
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        for (gtz gtz : this.e.keySet()) {
            printWriter.append(str).append(gtz.d()).println(":");
            ((gug) this.b.get(gtz.c())).a(concat, printWriter);
        }
    }

    public ConnectionResult b() {
        a();
        while (e()) {
            try {
                this.k.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        return d() ? ConnectionResult.a : this.o != null ? this.o : new ConnectionResult(13, null);
    }

    public <A extends gud, T extends heb<? extends gup, A>> T b(T t) {
        t.i();
        return this.g.b(t);
    }

    public void c() {
        if (this.g.b()) {
            this.c.clear();
        }
    }

    public boolean d() {
        return this.g instanceof hep;
    }

    public boolean e() {
        return this.g instanceof hes;
    }

    public void f() {
        if (d()) {
            ((hep) this.g).d();
        }
    }

    void g() {
        this.a.lock();
        try {
            this.g = new hes(this, this.d, this.e, this.m, this.f, this.a, this.l);
            this.g.a();
            this.k.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    void h() {
        this.a.lock();
        try {
            this.i.g();
            this.g = new hep(this);
            this.g.a();
            this.k.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    void i() {
        for (gug a : this.b.values()) {
            a.a();
        }
    }
}
