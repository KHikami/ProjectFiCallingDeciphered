package p000;

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
    final Queue<heb<?, ?>> f16800b = new LinkedList();
    hfs f16801c;
    final Map<gue<?>, gug> f16802d;
    Set<Scope> f16803e = new HashSet();
    final gwa f16804f;
    final Map<gtz<?>, Integer> f16805g;
    final guc<? extends hca, hcb> f16806h;
    Set<hgm> f16807i = null;
    final hgp f16808j;
    private final Lock f16809k;
    private final gwh f16810l;
    private hfx f16811m = null;
    private final int f16812n;
    private final Context f16813o;
    private final Looper f16814p;
    private volatile boolean f16815q;
    private long f16816r = 120000;
    private long f16817s = 5000;
    private final hfg f16818t;
    private final gtp f16819u;
    private final hgh f16820v = new hgh();
    private final ArrayList<hek> f16821w;
    private Integer f16822x = null;
    private final gwi f16823y = new hff(this);

    public hfe(Context context, Lock lock, Looper looper, gwa gwa, gtp gtp, guc<? extends hca, hcb> guc__extends_hca__hcb, Map<gtz<?>, Integer> map, List<guk> list, List<gul> list2, Map<gue<?>, gug> map2, int i, int i2, ArrayList<hek> arrayList) {
        this.f16813o = context;
        this.f16809k = lock;
        this.f16810l = new gwh(looper, this.f16823y);
        this.f16814p = looper;
        this.f16818t = new hfg(this, looper);
        this.f16819u = gtp;
        this.f16812n = i;
        if (this.f16812n >= 0) {
            this.f16822x = Integer.valueOf(i2);
        }
        this.f16805g = map;
        this.f16802d = map2;
        this.f16821w = arrayList;
        this.f16808j = new hgp(this.f16802d);
        for (guk a : list) {
            this.f16810l.m18772a(a);
        }
        for (gul a2 : list2) {
            this.f16810l.m18773a(a2);
        }
        this.f16804f = gwa;
        this.f16806h = guc__extends_hca__hcb;
    }

    public static int m19595a(Iterable<gug> iterable, boolean z) {
        int i = 0;
        for (gug d : iterable) {
            i = d.mo3043d() ? 1 : i;
        }
        return i != 0 ? 1 : 3;
    }

    private void m19597b(int i) {
        if (this.f16822x == null) {
            this.f16822x = Integer.valueOf(i);
        } else if (this.f16822x.intValue() != i) {
            String valueOf = String.valueOf(hfe.m19599c(i));
            String valueOf2 = String.valueOf(hfe.m19599c(this.f16822x.intValue()));
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length()).append("Cannot use sign-in mode: ").append(valueOf).append(". Mode was already set to ").append(valueOf2).toString());
        }
        if (this.f16811m == null) {
            Object obj = null;
            for (gug d : this.f16802d.values()) {
                obj = d.mo3043d() ? 1 : obj;
            }
            switch (this.f16822x.intValue()) {
                case 1:
                    if (obj == null) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    }
                    break;
                case 2:
                    if (obj != null) {
                        this.f16811m = hel.m19495a(this.f16813o, this, this.f16809k, this.f16814p, this.f16819u, this.f16802d, this.f16804f, this.f16805g, this.f16806h, this.f16821w);
                        return;
                    }
                    break;
            }
            this.f16811m = new hfj(this.f16813o, this, this.f16809k, this.f16814p, this.f16819u, this.f16802d, this.f16804f, this.f16805g, this.f16806h, this.f16821w, this);
        }
    }

    private static String m19599c(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    private boolean m19600k() {
        return this.f16815q;
    }

    private void m19601l() {
        this.f16810l.m18774b();
        this.f16811m.mo2481a();
    }

    private void m19602m() {
        if (!m19600k()) {
            this.f16815q = true;
            if (this.f16801c == null) {
                this.f16801c = this.f16819u.m18560a(this.f16813o.getApplicationContext(), new hfh(this));
            }
            this.f16818t.sendMessageDelayed(this.f16818t.obtainMessage(1), this.f16816r);
            this.f16818t.sendMessageDelayed(this.f16818t.obtainMessage(2), this.f16817s);
        }
    }

    public Looper mo2507a() {
        return this.f16814p;
    }

    public ConnectionResult mo2508a(long j, TimeUnit timeUnit) {
        boolean z = false;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        }
        gwb.m1886a(z, (Object) "blockingConnect must not be called on the UI thread");
        gwb.m2195f((Object) timeUnit, (Object) "TimeUnit must not be null");
        this.f16809k.lock();
        try {
            if (this.f16822x == null) {
                this.f16822x = Integer.valueOf(hfe.m19595a(this.f16802d.values(), false));
            } else if (this.f16822x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m19597b(this.f16822x.intValue());
            this.f16810l.m18774b();
            ConnectionResult a = this.f16811m.mo2479a(1000, timeUnit);
            return a;
        } finally {
            this.f16809k.unlock();
        }
    }

    public <C extends gug> C mo2509a(gue<C> gue_C) {
        Object obj = (gug) this.f16802d.get(gue_C);
        gwb.m2195f(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public <L> hge<L> mo2511a(L l) {
        this.f16809k.lock();
        try {
            hge<L> a = this.f16820v.m19733a(l, this.f16814p);
            return a;
        } finally {
            this.f16809k.unlock();
        }
    }

    public void mo2512a(int i) {
        boolean z = true;
        this.f16809k.lock();
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            gwb.m2048b(z, "Illegal sign-in mode: " + i);
            m19597b(i);
            m19601l();
        } finally {
            this.f16809k.unlock();
        }
    }

    public void mo2489a(int i, boolean z) {
        if (i == 1 && !z) {
            m19602m();
        }
        this.f16808j.m19756b();
        this.f16810l.m18769a(i);
        this.f16810l.m18768a();
        if (i == 2) {
            m19601l();
        }
    }

    public void mo2490a(Bundle bundle) {
        while (!this.f16800b.isEmpty()) {
            mo2517b((heb) this.f16800b.remove());
        }
        this.f16810l.m18770a(bundle);
    }

    public void mo2491a(ConnectionResult connectionResult) {
        if (!this.f16819u.mo2339a(this.f16813o, connectionResult.m9654c())) {
            m19626g();
        }
        if (!m19600k()) {
            this.f16810l.m18771a(connectionResult);
            this.f16810l.m18768a();
        }
    }

    public void mo2513a(guk guk) {
        this.f16810l.m18772a(guk);
    }

    public void mo2514a(gul gul) {
        this.f16810l.m18773a(gul);
    }

    public void mo2515a(hgm hgm) {
        this.f16809k.lock();
        try {
            if (this.f16807i == null) {
                this.f16807i = new HashSet();
            }
            this.f16807i.add(hgm);
        } finally {
            this.f16809k.unlock();
        }
    }

    public void mo2516a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f16813o);
        printWriter.append(str).append("mResuming=").print(this.f16815q);
        printWriter.append(" mWorkQueue.size()=").print(this.f16800b.size());
        this.f16808j.m19755a(printWriter);
        if (this.f16811m != null) {
            this.f16811m.mo2482a(str, fileDescriptor, printWriter, strArr);
        }
    }

    <C extends gug> C m19616b(gue<?> gue_) {
        Object obj = (gug) this.f16802d.get(gue_);
        gwb.m2195f(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public void mo2518b() {
        boolean z = false;
        this.f16809k.lock();
        try {
            if (this.f16812n >= 0) {
                if (this.f16822x != null) {
                    z = true;
                }
                gwb.m1886a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f16822x == null) {
                this.f16822x = Integer.valueOf(hfe.m19595a(this.f16802d.values(), false));
            } else if (this.f16822x.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo2512a(this.f16822x.intValue());
        } finally {
            this.f16809k.unlock();
        }
    }

    public void mo2519b(guk guk) {
        this.f16810l.m18775b(guk);
    }

    public void mo2520b(gul gul) {
        this.f16810l.m18776b(gul);
    }

    public void mo2521b(hgm hgm) {
        this.f16809k.lock();
        try {
            if (this.f16807i == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.f16807i.remove(hgm)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!m19627h()) {
                this.f16811m.mo2488f();
            }
            this.f16809k.unlock();
        } catch (Throwable th) {
            this.f16809k.unlock();
        }
    }

    public ConnectionResult mo2522c() {
        boolean z = true;
        gwb.m1886a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.f16809k.lock();
        try {
            if (this.f16812n >= 0) {
                if (this.f16822x == null) {
                    z = false;
                }
                gwb.m1886a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f16822x == null) {
                this.f16822x = Integer.valueOf(hfe.m19595a(this.f16802d.values(), false));
            } else if (this.f16822x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m19597b(this.f16822x.intValue());
            this.f16810l.m18774b();
            ConnectionResult b = this.f16811m.mo2483b();
            return b;
        } finally {
            this.f16809k.unlock();
        }
    }

    public void mo2523d() {
        this.f16809k.lock();
        try {
            this.f16808j.m19753a();
            if (this.f16811m != null) {
                this.f16811m.mo2485c();
            }
            this.f16820v.m19734a();
            for (heb heb : this.f16800b) {
                heb.m18989a(null);
                heb.m18982f();
            }
            this.f16800b.clear();
            if (this.f16811m != null) {
                m19626g();
                this.f16810l.m18768a();
                this.f16809k.unlock();
            }
        } finally {
            this.f16809k.unlock();
        }
    }

    public boolean mo2524e() {
        return this.f16811m != null && this.f16811m.mo2486d();
    }

    public boolean mo2525f() {
        return this.f16811m != null && this.f16811m.mo2487e();
    }

    boolean m19626g() {
        if (!m19600k()) {
            return false;
        }
        this.f16815q = false;
        this.f16818t.removeMessages(2);
        this.f16818t.removeMessages(1);
        if (this.f16801c != null) {
            this.f16801c.m19689a();
            this.f16801c = null;
        }
        return true;
    }

    boolean m19627h() {
        boolean z = false;
        this.f16809k.lock();
        try {
            if (this.f16807i != null) {
                if (!this.f16807i.isEmpty()) {
                    z = true;
                }
                this.f16809k.unlock();
            }
            return z;
        } finally {
            this.f16809k.unlock();
        }
    }

    String m19628i() {
        Writer stringWriter = new StringWriter();
        mo2516a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public int m19629j() {
        return System.identityHashCode(this);
    }

    public <A extends gud, R extends gup, T extends heb<R, A>> T mo2510a(T t) {
        gwb.m2048b(t.f16402e != null, (Object) "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f16802d.containsKey(t.f16402e);
        String d = t.f16403f != null ? t.f16403f.m18607d() : "the API";
        gwb.m2048b(containsKey, new StringBuilder(String.valueOf(d).length() + 65).append("GoogleApiClient is not configured to use ").append(d).append(" required for this call.").toString());
        this.f16809k.lock();
        try {
            if (this.f16811m == null) {
                this.f16800b.add(t);
            } else {
                t = this.f16811m.mo2480a(t);
                this.f16809k.unlock();
            }
            return t;
        } finally {
            this.f16809k.unlock();
        }
    }

    public <A extends gud, T extends heb<? extends gup, A>> T mo2517b(T t) {
        gwb.m2048b(t.f16402e != null, (Object) "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f16802d.containsKey(t.f16402e);
        String d = t.f16403f != null ? t.f16403f.m18607d() : "the API";
        gwb.m2048b(containsKey, new StringBuilder(String.valueOf(d).length() + 65).append("GoogleApiClient is not configured to use ").append(d).append(" required for this call.").toString());
        this.f16809k.lock();
        try {
            if (this.f16811m == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (m19600k()) {
                this.f16800b.add(t);
                while (!this.f16800b.isEmpty()) {
                    heb heb = (heb) this.f16800b.remove();
                    this.f16808j.m19754a(heb);
                    heb.m18993c(Status.f7266c);
                }
            } else {
                t = this.f16811m.mo2484b(t);
                this.f16809k.unlock();
            }
            return t;
        } finally {
            this.f16809k.unlock();
        }
    }

    static /* synthetic */ void m19596a(hfe hfe) {
        hfe.f16809k.lock();
        try {
            if (hfe.m19600k()) {
                hfe.m19601l();
            }
            hfe.f16809k.unlock();
        } catch (Throwable th) {
            hfe.f16809k.unlock();
        }
    }

    static /* synthetic */ void m19598b(hfe hfe) {
        hfe.f16809k.lock();
        try {
            if (hfe.m19626g()) {
                hfe.m19601l();
            }
            hfe.f16809k.unlock();
        } catch (Throwable th) {
            hfe.f16809k.unlock();
        }
    }
}
