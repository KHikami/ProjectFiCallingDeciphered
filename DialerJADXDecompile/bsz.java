import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class bsz implements bth {
    final Lock a;
    final Condition b;
    final Context c;
    final bqp d;
    final btb e;
    final Map f;
    final Map g;
    final bue h;
    final Map i;
    final bqz j;
    volatile bsy k;
    int l;
    final bsq m;
    final bti n;
    private ConnectionResult o;

    public bsz(Context context, bsq bsq, Lock lock, Looper looper, bqp bqp, Map map, bue bue, Map map2, bqz bqz, ArrayList arrayList, bti bti) {
        this.g = new HashMap();
        this.o = null;
        this.c = context;
        this.a = lock;
        this.d = bqp;
        this.f = map;
        this.h = bue;
        this.i = map2;
        this.j = bqz;
        this.m = bsq;
        this.n = bti;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((bry) it.next()).b = this;
        }
        this.e = new btb(this, looper);
        this.b = lock.newCondition();
        this.k = new bsp(this);
    }

    public final brq a(brq brq) {
        return this.k.a(brq);
    }

    public final ConnectionResult a(long j, TimeUnit timeUnit) {
        a();
        long toNanos = timeUnit.toNanos(j);
        while (d()) {
            if (toNanos <= 0) {
                try {
                    b();
                    return new ConnectionResult(14, null);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, null);
                }
            }
            toNanos = this.b.awaitNanos(toNanos);
        }
        return c() ? ConnectionResult.a : this.o != null ? this.o : new ConnectionResult(13, null);
    }

    public final void a() {
        this.k.c();
    }

    public final void a(int i) {
        this.a.lock();
        try {
            this.k.a(i);
        } finally {
            this.a.unlock();
        }
    }

    final void a(bta bta) {
        this.e.sendMessage(this.e.obtainMessage(1, bta));
    }

    final void a(ConnectionResult connectionResult) {
        this.a.lock();
        try {
            this.o = connectionResult;
            this.k = new bsp(this);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "  ";
        for (bqy bqy : this.i.keySet()) {
            printWriter.append(str).append(bqy.a).println(":");
            ((bra) this.f.get(bqy.b())).a(str2, printWriter);
        }
    }

    public final brq b(brq brq) {
        return this.k.b(brq);
    }

    public final boolean b() {
        boolean b = this.k.b();
        if (b) {
            this.g.clear();
        }
        return b;
    }

    public final boolean c() {
        return this.k instanceof bsc;
    }

    public final boolean d() {
        return this.k instanceof bsf;
    }
}
