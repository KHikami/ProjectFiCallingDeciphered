import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public final class brz implements bth {
    final bsz a;
    final bsz b;
    Bundle c;
    ConnectionResult d;
    ConnectionResult e;
    boolean f;
    final Lock g;
    private final Context h;
    private final bsq i;
    private final Map j;
    private final Set k;
    private final bra l;
    private int m;

    public brz(Context context, bsq bsq, Lock lock, Looper looper, bqp bqp, Map map, bue bue, Map map2, bqz bqz, ArrayList arrayList) {
        this.j = new hv();
        this.k = Collections.newSetFromMap(new WeakHashMap());
        this.d = null;
        this.e = null;
        this.f = false;
        this.m = 0;
        this.h = context;
        this.i = bsq;
        this.g = lock;
        Map hvVar = new hv();
        Map hvVar2 = new hv();
        for (brb brb : map.keySet()) {
            bra bra = (bra) map.get(brb);
            if (bra.c()) {
                hvVar.put(brb, bra);
            } else {
                hvVar2.put(brb, bra);
            }
        }
        this.l = null;
        if (hvVar.isEmpty()) {
            throw new IllegalStateException("CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        }
        Map hvVar3 = new hv();
        Map hvVar4 = new hv();
        for (bqy bqy : map2.keySet()) {
            brb b = bqy.b();
            if (hvVar.containsKey(b)) {
                hvVar3.put(bqy, map2.get(bqy));
            } else if (hvVar2.containsKey(b)) {
                hvVar4.put(bqy, map2.get(bqy));
            } else {
                throw new IllegalStateException("Each API in the apiTypeMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bry bry = (bry) it.next();
            if (hvVar3.containsKey(bry.a)) {
                arrayList2.add(bry);
            } else if (hvVar4.containsKey(bry.a)) {
                arrayList3.add(bry);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
            }
        }
        Context context2 = context;
        this.a = new bsz(context2, this.i, lock, looper, bqp, hvVar2, null, hvVar4, null, arrayList3, new bsa(this));
        Context context3 = context;
        this.b = new bsz(context3, this.i, lock, looper, bqp, hvVar, bue, hvVar3, bqz, arrayList2, new bsb(this));
        for (brb brb2 : hvVar2.keySet()) {
            this.j.put(brb2, this.a);
        }
        for (brb brb22 : hvVar.keySet()) {
            this.j.put(brb22, this.b);
        }
    }

    static /* synthetic */ void a(brz brz, int i, boolean z) {
        brz.i.a(i, z);
        brz.e = null;
        brz.d = null;
    }

    private final void a(ConnectionResult connectionResult) {
        switch (this.m) {
            case rq.b /*1*/:
                break;
            case rq.c /*2*/:
                this.i.a(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        e();
        this.m = 0;
    }

    private static boolean b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.b();
    }

    private final void e() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.k.clear();
    }

    private final boolean f() {
        return this.e != null && this.e.c == 4;
    }

    private final PendingIntent g() {
        return this.l == null ? null : PendingIntent.getActivity(this.h, System.identityHashCode(this.i), this.l.d(), 134217728);
    }

    public final brq a(brq brq) {
        if (!c(brq)) {
            return this.a.a(brq);
        }
        if (!f()) {
            return this.b.a(brq);
        }
        brq.a(new Status(4, null, g()));
        return brq;
    }

    public final ConnectionResult a(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void a() {
        this.m = 2;
        this.f = false;
        this.e = null;
        this.d = null;
        this.a.a();
        this.b.a();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.b.a(str + "  ", fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.a.a(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final brq b(brq brq) {
        if (!c(brq)) {
            return this.a.b(brq);
        }
        if (!f()) {
            return this.b.b(brq);
        }
        brq.a(new Status(4, null, g()));
        return brq;
    }

    public final boolean b() {
        this.e = null;
        this.d = null;
        this.m = 0;
        boolean b = this.a.b();
        boolean b2 = this.b.b();
        e();
        return b && b2;
    }

    public final boolean c() {
        boolean z = true;
        this.g.lock();
        try {
            if (!(this.a.c() && (this.b.c() || f() || this.m == 1))) {
                z = false;
            }
            this.g.unlock();
            return z;
        } catch (Throwable th) {
            this.g.unlock();
        }
    }

    public final boolean d() {
        this.g.lock();
        try {
            boolean z = this.m == 2;
            this.g.unlock();
            return z;
        } catch (Throwable th) {
            this.g.unlock();
        }
    }

    private final boolean c(brq brq) {
        brb brb = brq.a;
        buf.b(this.j.containsKey(brb), (Object) "GoogleApiClient is not configured to use the API required for this call.");
        return ((bsz) this.j.get(brb)).equals(this.b);
    }

    static /* synthetic */ void a(brz brz) {
        if (b(brz.d)) {
            if (b(brz.e) || brz.f()) {
                switch (brz.m) {
                    case rq.b /*1*/:
                        break;
                    case rq.c /*2*/:
                        brz.i.a(brz.c);
                        break;
                    default:
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                        break;
                }
                brz.e();
                brz.m = 0;
            } else if (brz.e == null) {
            } else {
                if (brz.m == 1) {
                    brz.e();
                    return;
                }
                brz.a(brz.e);
                brz.a.b();
            }
        } else if (brz.d != null && b(brz.e)) {
            brz.b.b();
            brz.a(brz.d);
        } else if (brz.d != null && brz.e != null) {
            ConnectionResult connectionResult = brz.d;
            if (brz.b.l < brz.a.l) {
                connectionResult = brz.e;
            }
            brz.a(connectionResult);
        }
    }
}
