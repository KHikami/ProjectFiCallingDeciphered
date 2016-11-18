package defpackage;

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
    final hfj a;
    final Lock b;
    final Context c;
    final gtq d;
    hca e;
    boolean f;
    boolean g;
    gwp h;
    boolean i;
    boolean j;
    final gwa k;
    private ConnectionResult l;
    private int m;
    private int n = 0;
    private int o;
    private final Bundle p = new Bundle();
    private final Set<gue> q = new HashSet();
    private int r;
    private final Map<gtz<?>, Integer> s;
    private final guc<? extends hca, hcb> t;
    private ArrayList<Future<?>> u = new ArrayList();

    public hes(hfj hfj, gwa gwa, Map<gtz<?>, Integer> map, gtq gtq, guc<? extends hca, hcb> guc__extends_hca__hcb, Lock lock, Context context) {
        this.a = hfj;
        this.k = gwa;
        this.s = map;
        this.d = gtq;
        this.t = guc__extends_hca__hcb;
        this.b = lock;
        this.c = context;
    }

    private void a(boolean z) {
        if (this.e != null) {
            if (this.e.b() && z) {
                this.e.i();
            }
            this.e.a();
            this.h = null;
        }
    }

    private static String c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    private void g() {
        this.a.h();
        hfm.a.execute(new het(this));
        if (this.e != null) {
            if (this.i) {
                this.e.a(this.h, this.j);
            }
            a(false);
        }
        for (gue gue : this.a.c.keySet()) {
            ((gug) this.a.b.get(gue)).a();
        }
        this.a.j.a(this.p.isEmpty() ? null : this.p);
    }

    private void h() {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.u.clear();
    }

    public <A extends gud, R extends gup, T extends heb<R, A>> T a(T t) {
        this.a.i.b.add(t);
        return t;
    }

    public void a() {
        this.a.c.clear();
        this.f = false;
        this.l = null;
        this.n = 0;
        this.r = 2;
        this.g = false;
        this.i = false;
        Map hashMap = new HashMap();
        for (gtz gtz : this.s.keySet()) {
            gug gug = (gug) this.a.b.get(gtz.c());
            int intValue = ((Integer) this.s.get(gtz)).intValue();
            if (gug.d()) {
                this.f = true;
                if (intValue < this.r) {
                    this.r = intValue;
                }
                if (intValue != 0) {
                    this.q.add(gtz.c());
                }
            }
            hashMap.put(gug, new heu(this, gtz, intValue));
        }
        if (this.f) {
            this.k.a(Integer.valueOf(this.a.i.j()));
            guk hfb = new hfb(this);
            this.e = (hca) this.t.a(this.c, this.a.i.a(), this.k, this.k.h(), hfb, hfb);
        }
        this.o = this.a.b.size();
        this.u.add(hfm.a.submit(new hev(this, hashMap)));
    }

    public void a(int i) {
        b(new ConnectionResult(8, null));
    }

    public void a(Bundle bundle) {
        if (b(1)) {
            if (bundle != null) {
                this.p.putAll(bundle);
            }
            if (d()) {
                g();
            }
        }
    }

    public void a(ConnectionResult connectionResult, gtz<?> gtz_, int i) {
        if (b(1)) {
            b(connectionResult, gtz_, i);
            if (d()) {
                g();
            }
        }
    }

    boolean a(ConnectionResult connectionResult) {
        return this.r != 2 ? this.r == 1 && !connectionResult.a() : true;
    }

    public <A extends gud, T extends heb<? extends gup, A>> T b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    void b(ConnectionResult connectionResult) {
        h();
        a(!connectionResult.a());
        this.a.a(connectionResult);
        this.a.j.a(connectionResult);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void b(com.google.android.gms.common.ConnectionResult r6, defpackage.gtz<?> r7, int r8) {
        /*
        r5 = this;
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1 = 0;
        r0 = 1;
        r2 = 2;
        if (r8 == r2) goto L_0x0021;
    L_0x0008:
        if (r8 != r0) goto L_0x0013;
    L_0x000a:
        r2 = r6.a();
        if (r2 == 0) goto L_0x002d;
    L_0x0010:
        r2 = r0;
    L_0x0011:
        if (r2 == 0) goto L_0x003d;
    L_0x0013:
        r2 = r5.l;
        if (r2 == 0) goto L_0x001b;
    L_0x0017:
        r2 = r5.m;
        if (r4 >= r2) goto L_0x003d;
    L_0x001b:
        if (r0 == 0) goto L_0x0021;
    L_0x001d:
        r5.l = r6;
        r5.m = r4;
    L_0x0021:
        r0 = r5.a;
        r0 = r0.c;
        r1 = r7.c();
        r0.put(r1, r6);
        return;
    L_0x002d:
        r2 = r5.d;
        r3 = r6.c();
        r2 = r2.b(r3);
        if (r2 == 0) goto L_0x003b;
    L_0x0039:
        r2 = r0;
        goto L_0x0011;
    L_0x003b:
        r2 = r1;
        goto L_0x0011;
    L_0x003d:
        r0 = r1;
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: hes.b(com.google.android.gms.common.ConnectionResult, gtz, int):void");
    }

    public boolean b() {
        h();
        a(true);
        this.a.a(null);
        return true;
    }

    boolean b(int i) {
        if (this.n == i) {
            return true;
        }
        this.a.i.i();
        String valueOf = String.valueOf(hes.c(this.n));
        String valueOf2 = String.valueOf(hes.c(i));
        Log.wtf("GoogleApiClientConnecting", new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()).append("GoogleApiClient connecting is in step ").append(valueOf).append(" but received callback for step ").append(valueOf2).toString(), new Exception());
        b(new ConnectionResult(8, null));
        return false;
    }

    public void c() {
    }

    boolean d() {
        this.o--;
        if (this.o > 0) {
            return false;
        }
        if (this.o < 0) {
            this.a.i.i();
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            b(new ConnectionResult(8, null));
            return false;
        } else if (this.l == null) {
            return true;
        } else {
            this.a.h = this.m;
            b(this.l);
            return false;
        }
    }

    void e() {
        if (this.o == 0) {
            if (!this.f || this.g) {
                ArrayList arrayList = new ArrayList();
                this.n = 1;
                this.o = this.a.b.size();
                for (gue gue : this.a.b.keySet()) {
                    if (!this.a.c.containsKey(gue)) {
                        arrayList.add((gug) this.a.b.get(gue));
                    } else if (d()) {
                        g();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.u.add(hfm.a.submit(new hey(this, arrayList)));
                }
            }
        }
    }

    void f() {
        this.f = false;
        this.a.i.e = Collections.emptySet();
        for (gue gue : this.q) {
            if (!this.a.c.containsKey(gue)) {
                this.a.c.put(gue, new ConnectionResult(17, null));
            }
        }
    }
}
