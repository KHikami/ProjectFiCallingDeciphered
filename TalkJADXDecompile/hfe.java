import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public final class hfe extends gui implements hfy {
    final Queue<heb<?, ?>> b;
    hfs c;
    final Map<gue<?>, gug> d;
    Set<Scope> e;
    final gwa f;
    final Map<gtz<?>, Integer> g;
    final guc<? extends hca, hcb> h;
    Set<hgm> i;
    final hgp j;
    private final Lock k;
    private final gwh l;
    private hfx m;
    private final int n;
    private final Context o;
    private final Looper p;
    private volatile boolean q;
    private long r;
    private long s;
    private final hfg t;
    private final gtp u;
    private final hgh v;
    private final ArrayList<hek> w;
    private Integer x;
    private final gwi y;

    public hfe(Context context, Lock lock, Looper looper, gwa gwa, gtp gtp, guc<? extends hca, hcb> guc__extends_hca__hcb, Map<gtz<?>, Integer> map, List<guk> list, List<gul> list2, Map<gue<?>, gug> map2, int i, int i2, ArrayList<hek> arrayList) {
        this.m = null;
        this.b = new LinkedList();
        this.r = 120000;
        this.s = 5000;
        this.e = new HashSet();
        this.v = new hgh();
        this.x = null;
        this.i = null;
        this.y = new hff(this);
        this.o = context;
        this.k = lock;
        this.l = new gwh(looper, this.y);
        this.p = looper;
        this.t = new hfg(this, looper);
        this.u = gtp;
        this.n = i;
        if (this.n >= 0) {
            this.x = Integer.valueOf(i2);
        }
        this.g = map;
        this.d = map2;
        this.w = arrayList;
        this.j = new hgp(this.d);
        for (guk a : list) {
            this.l.a(a);
        }
        for (gul a2 : list2) {
            this.l.a(a2);
        }
        this.f = gwa;
        this.h = guc__extends_hca__hcb;
    }

    public static int a(Iterable<gug> iterable, boolean z) {
        int i = 0;
        for (gug d : iterable) {
            i = d.d() ? 1 : i;
        }
        return i != 0 ? 1 : 3;
    }

    private void b(int i) {
        if (this.x == null) {
            this.x = Integer.valueOf(i);
        } else if (this.x.intValue() != i) {
            String valueOf = String.valueOf(c(i));
            String valueOf2 = String.valueOf(c(this.x.intValue()));
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length()).append("Cannot use sign-in mode: ").append(valueOf).append(". Mode was already set to ").append(valueOf2).toString());
        }
        if (this.m == null) {
            Object obj = null;
            for (gug d : this.d.values()) {
                obj = d.d() ? 1 : obj;
            }
            switch (this.x.intValue()) {
                case wi.j /*1*/:
                    if (obj == null) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    }
                    break;
                case wi.l /*2*/:
                    if (obj != null) {
                        this.m = hel.a(this.o, this, this.k, this.p, this.u, this.d, this.f, this.g, this.h, this.w);
                        return;
                    }
                    break;
            }
            this.m = new hfj(this.o, this, this.k, this.p, this.u, this.d, this.f, this.g, this.h, this.w, this);
        }
    }

    private static String c(int i) {
        switch (i) {
            case wi.j /*1*/:
                return "SIGN_IN_MODE_REQUIRED";
            case wi.l /*2*/:
                return "SIGN_IN_MODE_OPTIONAL";
            case wi.z /*3*/:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    private boolean k() {
        return this.q;
    }

    private void l() {
        this.l.b();
        this.m.a();
    }

    private void m() {
        if (!k()) {
            this.q = true;
            if (this.c == null) {
                this.c = this.u.a(this.o.getApplicationContext(), new hfh(this));
            }
            this.t.sendMessageDelayed(this.t.obtainMessage(1), this.r);
            this.t.sendMessageDelayed(this.t.obtainMessage(2), this.s);
        }
    }

    public Looper a() {
        return this.p;
    }

    public ConnectionResult a(long j, TimeUnit timeUnit) {
        boolean z = false;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        }
        gwb.a(z, (Object) "blockingConnect must not be called on the UI thread");
        gwb.f((Object) timeUnit, (Object) "TimeUnit must not be null");
        this.k.lock();
        try {
            if (this.x == null) {
                this.x = Integer.valueOf(a(this.d.values(), false));
            } else if (this.x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            b(this.x.intValue());
            this.l.b();
            ConnectionResult a = this.m.a(1000, timeUnit);
            return a;
        } finally {
            this.k.unlock();
        }
    }

    public <C extends gug> C a(gue<C> gue_C) {
        Object obj = (gug) this.d.get(gue_C);
        gwb.f(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public <L> hge<L> a(L l) {
        this.k.lock();
        try {
            hge<L> a = this.v.a(l, this.p);
            return a;
        } finally {
            this.k.unlock();
        }
    }

    public void a(int i) {
        boolean z = true;
        this.k.lock();
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            gwb.b(z, "Illegal sign-in mode: " + i);
            b(i);
            l();
        } finally {
            this.k.unlock();
        }
    }

    public void a(int i, boolean z) {
        if (i == 1 && !z) {
            m();
        }
        this.j.b();
        this.l.a(i);
        this.l.a();
        if (i == 2) {
            l();
        }
    }

    public void a(Bundle bundle) {
        while (!this.b.isEmpty()) {
            b((heb) this.b.remove());
        }
        this.l.a(bundle);
    }

    public void a(ConnectionResult connectionResult) {
        if (!this.u.a(this.o, connectionResult.c())) {
            g();
        }
        if (!k()) {
            this.l.a(connectionResult);
            this.l.a();
        }
    }

    public void a(guk guk) {
        this.l.a(guk);
    }

    public void a(gul gul) {
        this.l.a(gul);
    }

    public void a(hgm hgm) {
        this.k.lock();
        try {
            if (this.i == null) {
                this.i = new HashSet();
            }
            this.i.add(hgm);
        } finally {
            this.k.unlock();
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.o);
        printWriter.append(str).append("mResuming=").print(this.q);
        printWriter.append(" mWorkQueue.size()=").print(this.b.size());
        this.j.a(printWriter);
        if (this.m != null) {
            this.m.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    <C extends gug> C b(gue<?> gue_) {
        Object obj = (gug) this.d.get(gue_);
        gwb.f(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public void b() {
        boolean z = false;
        this.k.lock();
        try {
            if (this.n >= 0) {
                if (this.x != null) {
                    z = true;
                }
                gwb.a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.x == null) {
                this.x = Integer.valueOf(a(this.d.values(), false));
            } else if (this.x.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            a(this.x.intValue());
        } finally {
            this.k.unlock();
        }
    }

    public void b(guk guk) {
        this.l.b(guk);
    }

    public void b(gul gul) {
        this.l.b(gul);
    }

    public void b(hgm hgm) {
        this.k.lock();
        try {
            if (this.i == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.i.remove(hgm)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!h()) {
                this.m.f();
            }
            this.k.unlock();
        } catch (Throwable th) {
            this.k.unlock();
        }
    }

    public ConnectionResult c() {
        boolean z = true;
        gwb.a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.k.lock();
        try {
            if (this.n >= 0) {
                if (this.x == null) {
                    z = false;
                }
                gwb.a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.x == null) {
                this.x = Integer.valueOf(a(this.d.values(), false));
            } else if (this.x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            b(this.x.intValue());
            this.l.b();
            ConnectionResult b = this.m.b();
            return b;
        } finally {
            this.k.unlock();
        }
    }

    public void d() {
        this.k.lock();
        try {
            this.j.a();
            if (this.m != null) {
                this.m.c();
            }
            this.v.a();
            for (heb heb : this.b) {
                heb.a(null);
                heb.f();
            }
            this.b.clear();
            if (this.m != null) {
                g();
                this.l.a();
                this.k.unlock();
            }
        } finally {
            this.k.unlock();
        }
    }

    public boolean e() {
        return this.m != null && this.m.d();
    }

    public boolean f() {
        return this.m != null && this.m.e();
    }

    boolean g() {
        if (!k()) {
            return false;
        }
        this.q = false;
        this.t.removeMessages(2);
        this.t.removeMessages(1);
        if (this.c != null) {
            this.c.a();
            this.c = null;
        }
        return true;
    }

    boolean h() {
        boolean z = false;
        this.k.lock();
        try {
            if (this.i != null) {
                if (!this.i.isEmpty()) {
                    z = true;
                }
                this.k.unlock();
            }
            return z;
        } finally {
            this.k.unlock();
        }
    }

    String i() {
        Writer stringWriter = new StringWriter();
        a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public int j() {
        return System.identityHashCode(this);
    }

    public <A extends gud, R extends gup, T extends heb<R, A>> T a(T t) {
        gwb.b(t.e != null, (Object) "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.d.containsKey(t.e);
        String d = t.f != null ? t.f.d() : "the API";
        gwb.b(containsKey, new StringBuilder(String.valueOf(d).length() + 65).append("GoogleApiClient is not configured to use ").append(d).append(" required for this call.").toString());
        this.k.lock();
        try {
            if (this.m == null) {
                this.b.add(t);
            } else {
                t = this.m.a(t);
                this.k.unlock();
            }
            return t;
        } finally {
            this.k.unlock();
        }
    }

    public <A extends gud, T extends heb<? extends gup, A>> T b(T t) {
        gwb.b(t.e != null, (Object) "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.d.containsKey(t.e);
        String d = t.f != null ? t.f.d() : "the API";
        gwb.b(containsKey, new StringBuilder(String.valueOf(d).length() + 65).append("GoogleApiClient is not configured to use ").append(d).append(" required for this call.").toString());
        this.k.lock();
        try {
            if (this.m == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (k()) {
                this.b.add(t);
                while (!this.b.isEmpty()) {
                    heb heb = (heb) this.b.remove();
                    this.j.a(heb);
                    heb.c(Status.c);
                }
            } else {
                t = this.m.b(t);
                this.k.unlock();
            }
            return t;
        } finally {
            this.k.unlock();
        }
    }

    static /* synthetic */ void a(hfe hfe) {
        hfe.k.lock();
        try {
            if (hfe.k()) {
                hfe.l();
            }
            hfe.k.unlock();
        } catch (Throwable th) {
            hfe.k.unlock();
        }
    }

    static /* synthetic */ void b(hfe hfe) {
        hfe.k.lock();
        try {
            if (hfe.g()) {
                hfe.l();
            }
            hfe.k.unlock();
        } catch (Throwable th) {
            hfe.k.unlock();
        }
    }
}
