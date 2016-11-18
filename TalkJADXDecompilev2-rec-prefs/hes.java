package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class hes implements hfi {
    final hfj f16760a;
    final Lock f16761b;
    final Context f16762c;
    final gtq f16763d;
    hca f16764e;
    boolean f16765f;
    boolean f16766g;
    gwp f16767h;
    boolean f16768i;
    boolean f16769j;
    final gwa f16770k;
    private ConnectionResult f16771l;
    private int f16772m;
    private int f16773n = 0;
    private int f16774o;
    private final Bundle f16775p = new Bundle();
    private final Set<gue> f16776q = new HashSet();
    private int f16777r;
    private final Map<gtz<?>, Integer> f16778s;
    private final guc<? extends hca, hcb> f16779t;
    private ArrayList<Future<?>> f16780u = new ArrayList();

    public hes(hfj hfj, gwa gwa, Map<gtz<?>, Integer> map, gtq gtq, guc<? extends hca, hcb> guc__extends_hca__hcb, Lock lock, Context context) {
        this.f16760a = hfj;
        this.f16770k = gwa;
        this.f16778s = map;
        this.f16763d = gtq;
        this.f16779t = guc__extends_hca__hcb;
        this.f16761b = lock;
        this.f16762c = context;
    }

    private void m19547a(boolean z) {
        if (this.f16764e != null) {
            if (this.f16764e.m18615b() && z) {
                this.f16764e.mo2348i();
            }
            this.f16764e.mo2600a();
            this.f16767h = null;
        }
    }

    private static String m19548c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    private void m19549g() {
        this.f16760a.m19649h();
        hfm.f16843a.execute(new het(this));
        if (this.f16764e != null) {
            if (this.f16768i) {
                this.f16764e.mo3041a(this.f16767h, this.f16769j);
            }
            m19547a(false);
        }
        for (gue gue : this.f16760a.f16829c.keySet()) {
            ((gug) this.f16760a.f16828b.get(gue)).mo2600a();
        }
        this.f16760a.f16836j.mo2490a(this.f16775p.isEmpty() ? null : this.f16775p);
    }

    private void m19550h() {
        ArrayList arrayList = this.f16780u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.f16780u.clear();
    }

    public <A extends gud, R extends gup, T extends heb<R, A>> T mo2492a(T t) {
        this.f16760a.f16835i.f16800b.add(t);
        return t;
    }

    public void mo2493a() {
        this.f16760a.f16829c.clear();
        this.f16765f = false;
        this.f16771l = null;
        this.f16773n = 0;
        this.f16777r = 2;
        this.f16766g = false;
        this.f16768i = false;
        Map hashMap = new HashMap();
        for (gtz gtz : this.f16778s.keySet()) {
            gug gug = (gug) this.f16760a.f16828b.get(gtz.m18606c());
            int intValue = ((Integer) this.f16778s.get(gtz)).intValue();
            if (gug.mo3043d()) {
                this.f16765f = true;
                if (intValue < this.f16777r) {
                    this.f16777r = intValue;
                }
                if (intValue != 0) {
                    this.f16776q.add(gtz.m18606c());
                }
            }
            hashMap.put(gug, new heu(this, gtz, intValue));
        }
        if (this.f16765f) {
            this.f16770k.m18755a(Integer.valueOf(this.f16760a.f16835i.m19629j()));
            guk hfb = new hfb(this);
            this.f16764e = (hca) this.f16779t.mo2333a(this.f16762c, this.f16760a.f16835i.mo2507a(), this.f16770k, this.f16770k.m18762h(), hfb, hfb);
        }
        this.f16774o = this.f16760a.f16828b.size();
        this.f16780u.add(hfm.f16843a.submit(new hev(this, hashMap)));
    }

    public void mo2494a(int i) {
        m19558b(new ConnectionResult(8, null));
    }

    public void mo2495a(Bundle bundle) {
        if (m19561b(1)) {
            if (bundle != null) {
                this.f16775p.putAll(bundle);
            }
            if (m19563d()) {
                m19549g();
            }
        }
    }

    public void mo2496a(ConnectionResult connectionResult, gtz<?> gtz_, int i) {
        if (m19561b(1)) {
            m19559b(connectionResult, gtz_, i);
            if (m19563d()) {
                m19549g();
            }
        }
    }

    boolean m19556a(ConnectionResult connectionResult) {
        return this.f16777r != 2 ? this.f16777r == 1 && !connectionResult.m9652a() : true;
    }

    public <A extends gud, T extends heb<? extends gup, A>> T mo2497b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    void m19558b(ConnectionResult connectionResult) {
        m19550h();
        m19547a(!connectionResult.m9652a());
        this.f16760a.m19637a(connectionResult);
        this.f16760a.f16836j.mo2491a(connectionResult);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m19559b(ConnectionResult connectionResult, gtz<?> gtz_, int i) {
        Object obj = 1;
        if (i != 2) {
            if (i == 1) {
                Object obj2;
                if (connectionResult.m9652a()) {
                    obj2 = 1;
                } else if (this.f16763d.mo2340b(connectionResult.m9654c()) != null) {
                    int i2 = 1;
                } else {
                    obj2 = null;
                }
            }
            if (this.f16771l != null) {
            }
            if (obj != null) {
                this.f16771l = connectionResult;
                this.f16772m = Integer.MAX_VALUE;
            }
        }
        this.f16760a.f16829c.put(gtz_.m18606c(), connectionResult);
    }

    public boolean mo2498b() {
        m19550h();
        m19547a(true);
        this.f16760a.m19637a(null);
        return true;
    }

    boolean m19561b(int i) {
        if (this.f16773n == i) {
            return true;
        }
        this.f16760a.f16835i.m19628i();
        String valueOf = String.valueOf(hes.m19548c(this.f16773n));
        String valueOf2 = String.valueOf(hes.m19548c(i));
        Log.wtf("GoogleApiClientConnecting", new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()).append("GoogleApiClient connecting is in step ").append(valueOf).append(" but received callback for step ").append(valueOf2).toString(), new Exception());
        m19558b(new ConnectionResult(8, null));
        return false;
    }

    public void mo2499c() {
    }

    boolean m19563d() {
        this.f16774o--;
        if (this.f16774o > 0) {
            return false;
        }
        if (this.f16774o < 0) {
            this.f16760a.f16835i.m19628i();
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m19558b(new ConnectionResult(8, null));
            return false;
        } else if (this.f16771l == null) {
            return true;
        } else {
            this.f16760a.f16834h = this.f16772m;
            m19558b(this.f16771l);
            return false;
        }
    }

    void m19564e() {
        if (this.f16774o == 0) {
            if (!this.f16765f || this.f16766g) {
                ArrayList arrayList = new ArrayList();
                this.f16773n = 1;
                this.f16774o = this.f16760a.f16828b.size();
                for (gue gue : this.f16760a.f16828b.keySet()) {
                    if (!this.f16760a.f16829c.containsKey(gue)) {
                        arrayList.add((gug) this.f16760a.f16828b.get(gue));
                    } else if (m19563d()) {
                        m19549g();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f16780u.add(hfm.f16843a.submit(new hey(this, arrayList)));
                }
            }
        }
    }

    void m19565f() {
        this.f16765f = false;
        this.f16760a.f16835i.f16803e = Collections.emptySet();
        for (gue gue : this.f16776q) {
            if (!this.f16760a.f16829c.containsKey(gue)) {
                this.f16760a.f16829c.put(gue, new ConnectionResult(17, null));
            }
        }
    }
}
