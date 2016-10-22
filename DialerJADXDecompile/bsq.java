import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public final class bsq extends brc implements bti {
    final Looper b;
    final Queue c;
    Set d;
    final Set e;
    Set f;
    private final Lock g;
    private final bur h;
    private bth i;
    private final int j;
    private final Context k;
    private volatile boolean l;
    private long m;
    private long n;
    private final bst o;
    private final bqp p;
    private bsv q;
    private Map r;
    private bue s;
    private Map t;
    private bqz u;
    private final Set v;
    private final ArrayList w;
    private Integer x;
    private final bsw y;
    private final bus z;

    public bsq(Context context, Lock lock, Looper looper, bue bue, bqp bqp, bqz bqz, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        this.i = null;
        this.c = new LinkedList();
        this.m = 120000;
        this.n = 5000;
        this.d = new HashSet();
        this.v = Collections.newSetFromMap(new WeakHashMap());
        this.e = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75f, 2));
        this.x = null;
        this.f = null;
        this.y = new bsr(this);
        this.z = new bss(this);
        this.k = context;
        this.g = lock;
        this.h = new bur(looper, this.z);
        this.b = looper;
        this.o = new bst(this, looper);
        this.p = bqp;
        this.j = i;
        if (this.j >= 0) {
            this.x = Integer.valueOf(i2);
        }
        this.t = map;
        this.r = map2;
        this.w = arrayList;
        for (brf a : list) {
            this.h.a(a);
        }
        for (brg a2 : list2) {
            this.h.a(a2);
        }
        this.s = bue;
        this.u = bqz;
    }

    public static int a(Iterable iterable, boolean z) {
        int i = 0;
        for (bra c : iterable) {
            i = c.c() ? 1 : i;
        }
        return i != 0 ? 1 : 3;
    }

    private final void a(int i) {
        if (this.x == null) {
            this.x = Integer.valueOf(i);
        } else if (this.x.intValue() != i) {
            throw new IllegalStateException("Cannot use sign-in mode: " + b(i) + ". Mode was already set to " + b(this.x.intValue()));
        }
        if (this.i == null) {
            Object obj = null;
            for (bra c : this.r.values()) {
                obj = c.c() ? 1 : obj;
            }
            switch (this.x.intValue()) {
                case rq.b /*1*/:
                    if (obj == null) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    }
                    break;
                case rq.c /*2*/:
                    if (obj != null) {
                        this.i = new brz(this.k, this, this.g, this.b, this.p, this.r, this.s, this.t, this.u, this.w);
                        return;
                    }
                    break;
            }
            this.i = new bsz(this.k, this, this.g, this.b, this.p, this.r, this.s, this.t, this.u, this.w, this);
        }
    }

    private static String b(int i) {
        switch (i) {
            case rq.b /*1*/:
                return "SIGN_IN_MODE_REQUIRED";
            case rq.c /*2*/:
                return "SIGN_IN_MODE_OPTIONAL";
            case rl.e /*3*/:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    private final void i() {
        this.h.d = true;
        this.i.a();
    }

    public final Looper a() {
        return this.b;
    }

    public final bra a(brb brb) {
        Object obj = (bra) this.r.get(brb);
        buf.d(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public final ConnectionResult a(long j, TimeUnit timeUnit) {
        boolean z = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = false;
        }
        buf.a(z, (Object) "blockingConnect must not be called on the UI thread");
        buf.d((Object) timeUnit, (Object) "TimeUnit must not be null");
        this.g.lock();
        try {
            if (this.x == null) {
                this.x = Integer.valueOf(a(this.r.values(), false));
            } else if (this.x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            a(this.x.intValue());
            this.h.d = true;
            ConnectionResult a = this.i.a(j, timeUnit);
            return a;
        } finally {
            this.g.unlock();
        }
    }

    public final void a(int i, boolean z) {
        if (!(i != 1 || z || this.l)) {
            this.l = true;
            if (this.q == null) {
                this.q = (bsv) btd.a(this.k.getApplicationContext(), new bsv(this), this.p);
            }
            this.o.sendMessageDelayed(this.o.obtainMessage(1), this.m);
            this.o.sendMessageDelayed(this.o.obtainMessage(2), this.n);
        }
        for (bsx bsx : this.e) {
            if (z) {
                bsx.c();
            }
            bsx.b(new Status(8, "The connection to Google Play services was lost"));
        }
        this.e.clear();
        this.h.a(i);
        this.h.a();
        if (i == 2) {
            i();
        }
    }

    public final void a(Bundle bundle) {
        while (!this.c.isEmpty()) {
            b((brq) this.c.remove());
        }
        this.h.a(bundle);
    }

    public final void a(brf brf) {
        this.h.a(brf);
    }

    public final void a(brg brg) {
        this.h.a(brg);
    }

    final void a(bsx bsx) {
        this.e.add(bsx);
        bsx.a(this.y);
    }

    public final void a(ConnectionResult connectionResult) {
        if (!this.p.a(this.k, connectionResult.c)) {
            f();
        }
        if (!this.l) {
            this.h.a(connectionResult);
            this.h.a();
        }
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.k);
        printWriter.append(str).append("mResuming=").print(this.l);
        printWriter.append(" mWorkQueue.size()=").print(this.c.size());
        printWriter.append(" mUnconsumedRunners.size()=").println(this.e.size());
        if (this.i != null) {
            this.i.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    final void a(boolean z) {
        bsw bsw = null;
        for (bsx bsx : this.e) {
            if (bsx.a() != null) {
                bsx.c();
                IBinder e = a(bsx.b()).e();
                if (bsx.e()) {
                    bsx.a(new bsu(bsx, bsw, e));
                } else if (e == null || !e.isBinderAlive()) {
                    bsx.a(bsw);
                    bsx.f();
                    bsx.a().intValue();
                    bsw.a();
                } else {
                    bsw bsu = new bsu(bsx, bsw, e);
                    bsx.a(bsu);
                    try {
                        e.linkToDeath(bsu, 0);
                    } catch (RemoteException e2) {
                        bsx.f();
                        bsx.a().intValue();
                        bsw.a();
                    }
                }
                this.e.remove(bsx);
            } else if (z) {
                bsx.g();
            } else {
                bsx.f();
                this.e.remove(bsx);
            }
        }
    }

    public final void b() {
        boolean z = false;
        this.g.lock();
        try {
            if (this.j >= 0) {
                buf.a(this.x != null, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.x == null) {
                this.x = Integer.valueOf(a(this.r.values(), false));
            } else if (this.x.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            int intValue = this.x.intValue();
            this.g.lock();
            if (intValue == 3 || intValue == 1 || intValue == 2) {
                z = true;
            }
            buf.b(z, "Illegal sign-in mode: " + intValue);
            a(intValue);
            i();
            this.g.unlock();
        } catch (Throwable th) {
        } finally {
            this.g.unlock();
        }
    }

    public final void b(brf brf) {
        bur bur = this.h;
        buf.A((Object) brf);
        synchronized (bur.f) {
            if (!bur.a.remove(brf)) {
                Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + brf + " not found");
            } else if (bur.e) {
                bur.b.add(brf);
            }
        }
    }

    public final void b(brg brg) {
        bur bur = this.h;
        buf.A((Object) brg);
        synchronized (bur.f) {
            if (!bur.c.remove(brg)) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + brg + " not found");
            }
        }
    }

    public final void c() {
        this.g.lock();
        try {
            boolean z = (this.i == null || this.i.b()) ? false : true;
            a(z);
            for (btj btj : this.v) {
                btj.a = null;
            }
            this.v.clear();
            for (bsx bsx : this.c) {
                bsx.a(null);
                bsx.f();
            }
            this.c.clear();
            if (this.i != null) {
                f();
                this.h.a();
                this.g.unlock();
            }
        } finally {
            this.g.unlock();
        }
    }

    public final boolean d() {
        return this.i != null && this.i.c();
    }

    public final boolean e() {
        return this.i != null && this.i.d();
    }

    final boolean f() {
        if (!this.l) {
            return false;
        }
        this.l = false;
        this.o.removeMessages(2);
        this.o.removeMessages(1);
        if (this.q != null) {
            this.q.b();
            this.q = null;
        }
        return true;
    }

    final boolean g() {
        boolean z = false;
        this.g.lock();
        try {
            if (this.f != null) {
                if (!this.f.isEmpty()) {
                    z = true;
                }
                this.g.unlock();
            }
            return z;
        } finally {
            this.g.unlock();
        }
    }

    final String h() {
        Writer stringWriter = new StringWriter();
        a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public final brq a(brq brq) {
        buf.b(brq.a != null, (Object) "This task can not be enqueued (it's probably a Batch or malformed)");
        buf.b(this.r.containsKey(brq.a), (Object) "GoogleApiClient is not configured to use the API required for this call.");
        this.g.lock();
        try {
            if (this.i == null) {
                this.c.add(brq);
            } else {
                brq = this.i.a(brq);
                this.g.unlock();
            }
            return brq;
        } finally {
            this.g.unlock();
        }
    }

    public final brq b(brq brq) {
        buf.b(brq.a != null, (Object) "This task can not be executed (it's probably a Batch or malformed)");
        this.g.lock();
        try {
            if (this.i == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.l) {
                this.c.add(brq);
                while (!this.c.isEmpty()) {
                    bsx bsx = (bsx) this.c.remove();
                    a(bsx);
                    bsx.a(Status.c);
                }
            } else {
                brq = this.i.b(brq);
                this.g.unlock();
            }
            return brq;
        } finally {
            this.g.unlock();
        }
    }

    static /* synthetic */ void b(bsq bsq) {
        bsq.g.lock();
        try {
            if (bsq.l) {
                bsq.i();
            }
            bsq.g.unlock();
        } catch (Throwable th) {
            bsq.g.unlock();
        }
    }

    static /* synthetic */ void c(bsq bsq) {
        bsq.g.lock();
        try {
            if (bsq.f()) {
                bsq.i();
            }
            bsq.g.unlock();
        } catch (Throwable th) {
            bsq.g.unlock();
        }
    }
}
