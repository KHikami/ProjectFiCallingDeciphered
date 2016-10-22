package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: bsf */
public final class bsf implements bsy {
    final bsz a;
    final Lock b;
    final Context c;
    final bqp d;
    cod e;
    boolean f;
    boolean g;
    buz h;
    boolean i;
    boolean j;
    final bue k;
    private ConnectionResult l;
    private int m;
    private int n;
    private int o;
    private final Bundle p;
    private final Set q;
    private int r;
    private final Map s;
    private final bqz t;
    private ArrayList u;

    public bsf(bsz bsz, bue bue, Map map, bqp bqp, bqz bqz, Lock lock, Context context) {
        this.n = 0;
        this.p = new Bundle();
        this.q = new HashSet();
        this.u = new ArrayList();
        this.a = bsz;
        this.k = bue;
        this.s = map;
        this.d = bqp;
        this.t = bqz;
        this.b = lock;
        this.c = context;
    }

    private final void a(boolean z) {
        if (this.e != null) {
            if (this.e.b() && z) {
                this.e.h();
            }
            this.e.a();
            this.h = null;
        }
    }

    private static String c(int i) {
        switch (i) {
            case rl.c /*0*/:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case rq.b /*1*/:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    private final void g() {
        bsz bsz = this.a;
        bsz.a.lock();
        try {
            bsz.m.f();
            bsz.k = new bsc(bsz);
            bsz.k.a();
            bsz.b.signalAll();
            btc.a.execute(new bsg(this));
            if (this.e != null) {
                if (this.i) {
                    this.e.a(this.h, this.j);
                }
                a(false);
            }
            for (brb brb : this.a.g.keySet()) {
                ((bra) this.a.f.get(brb)).a();
            }
            this.a.n.a(this.p.isEmpty() ? null : this.p);
        } finally {
            bsz.a.unlock();
        }
    }

    private final void h() {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        this.u.clear();
    }

    public final brq a(brq brq) {
        this.a.m.c.add(brq);
        return brq;
    }

    public final void a() {
        this.a.g.clear();
        this.f = false;
        this.l = null;
        this.n = 0;
        this.r = 2;
        this.g = false;
        this.i = false;
        Map hashMap = new HashMap();
        for (bqy bqy : this.s.keySet()) {
            bra bra = (bra) this.a.f.get(bqy.b());
            int intValue = ((Integer) this.s.get(bqy)).intValue();
            bqy.a();
            if (bra.c()) {
                this.f = true;
                if (intValue < this.r) {
                    this.r = intValue;
                }
                if (intValue != 0) {
                    this.q.add(bqy.b());
                }
            }
            hashMap.put(bra, new bsh(this, bqy, intValue));
        }
        if (this.f) {
            this.k.h = Integer.valueOf(System.identityHashCode(this.a.m));
            brf bsn = new bsn(this);
            this.e = (cod) this.t.a(this.c, this.a.m.b, this.k, this.k.g, bsn, bsn);
        }
        this.o = this.a.f.size();
        this.u.add(btc.a.submit(new bsi(this, hashMap)));
    }

    public final void a(int i) {
        b(new ConnectionResult(8, null));
    }

    public final void a(Bundle bundle) {
        if (b(1)) {
            if (bundle != null) {
                this.p.putAll(bundle);
            }
            if (d()) {
                g();
            }
        }
    }

    public final void a(ConnectionResult connectionResult, bqy bqy, int i) {
        if (b(1)) {
            b(connectionResult, bqy, i);
            if (d()) {
                g();
            }
        }
    }

    final boolean a(ConnectionResult connectionResult) {
        return this.r != 2 ? this.r == 1 && !connectionResult.a() : true;
    }

    public final brq b(brq brq) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    final void b(ConnectionResult connectionResult) {
        h();
        a(!connectionResult.a());
        this.a.a(connectionResult);
        this.a.n.a(connectionResult);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void b(com.google.android.gms.common.ConnectionResult r6, defpackage.bqy r7, int r8) {
        /*
        r5 = this;
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1 = 0;
        r0 = 1;
        r2 = 2;
        if (r8 == r2) goto L_0x0024;
    L_0x0008:
        r7.a();
        if (r8 != r0) goto L_0x0016;
    L_0x000d:
        r2 = r6.a();
        if (r2 == 0) goto L_0x0030;
    L_0x0013:
        r2 = r0;
    L_0x0014:
        if (r2 == 0) goto L_0x003e;
    L_0x0016:
        r2 = r5.l;
        if (r2 == 0) goto L_0x001e;
    L_0x001a:
        r2 = r5.m;
        if (r4 >= r2) goto L_0x003e;
    L_0x001e:
        if (r0 == 0) goto L_0x0024;
    L_0x0020:
        r5.l = r6;
        r5.m = r4;
    L_0x0024:
        r0 = r5.a;
        r0 = r0.g;
        r1 = r7.b();
        r0.put(r1, r6);
        return;
    L_0x0030:
        r2 = r5.d;
        r3 = r6.c;
        r2 = r2.b(r3);
        if (r2 == 0) goto L_0x003c;
    L_0x003a:
        r2 = r0;
        goto L_0x0014;
    L_0x003c:
        r2 = r1;
        goto L_0x0014;
    L_0x003e:
        r0 = r1;
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: bsf.b(com.google.android.gms.common.ConnectionResult, bqy, int):void");
    }

    public final boolean b() {
        h();
        a(true);
        this.a.a(null);
        return true;
    }

    final boolean b(int i) {
        if (this.n == i) {
            return true;
        }
        this.a.m.h();
        Log.wtf("GoogleApiClientConnecting", "GoogleApiClient connecting is in step " + bsf.c(this.n) + " but received callback for step " + bsf.c(i), new Exception());
        b(new ConnectionResult(8, null));
        return false;
    }

    public final void c() {
    }

    final boolean d() {
        this.o--;
        if (this.o > 0) {
            return false;
        }
        if (this.o < 0) {
            this.a.m.h();
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            b(new ConnectionResult(8, null));
            return false;
        } else if (this.l == null) {
            return true;
        } else {
            this.a.l = this.m;
            b(this.l);
            return false;
        }
    }

    final void e() {
        if (this.o == 0) {
            if (!this.f || this.g) {
                ArrayList arrayList = new ArrayList();
                this.n = 1;
                this.o = this.a.f.size();
                for (brb brb : this.a.f.keySet()) {
                    if (!this.a.g.containsKey(brb)) {
                        arrayList.add(this.a.f.get(brb));
                    } else if (d()) {
                        g();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.u.add(btc.a.submit(new bsk(this, arrayList)));
                }
            }
        }
    }

    final void f() {
        this.f = false;
        this.a.m.d = Collections.emptySet();
        for (brb brb : this.q) {
            if (!this.a.g.containsKey(brb)) {
                this.a.g.put(brb, new ConnectionResult(17, null));
            }
        }
    }
}
