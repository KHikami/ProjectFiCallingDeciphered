package p000;

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
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

final class hel implements hfx {
    final hfj f16737a;
    final hfj f16738b;
    Bundle f16739c;
    ConnectionResult f16740d = null;
    ConnectionResult f16741e = null;
    boolean f16742f = false;
    final Lock f16743g;
    private final Context f16744h;
    private final hfe f16745i;
    private final Looper f16746j;
    private final Map<gue<?>, hfj> f16747k;
    private final Set<C0000a> f16748l = Collections.newSetFromMap(new WeakHashMap());
    private final gug f16749m;
    private int f16750n = 0;

    private hel(Context context, hfe hfe, Lock lock, Looper looper, gtq gtq, Map<gue<?>, gug> map, Map<gue<?>, gug> map2, gwa gwa, guc<? extends hca, hcb> guc__extends_hca__hcb, gug gug, ArrayList<hek> arrayList, ArrayList<hek> arrayList2, Map<gtz<?>, Integer> map3, Map<gtz<?>, Integer> map4) {
        this.f16744h = context;
        this.f16745i = hfe;
        this.f16743g = lock;
        this.f16746j = looper;
        this.f16749m = gug;
        this.f16737a = new hfj(context, this.f16745i, lock, looper, gtq, map2, null, map4, null, arrayList2, new hem(this));
        this.f16738b = new hfj(context, this.f16745i, lock, looper, gtq, map, gwa, map3, guc__extends_hca__hcb, arrayList, new hen(this));
        Map kyVar = new ky();
        for (gue put : map2.keySet()) {
            kyVar.put(put, this.f16737a);
        }
        for (gue put2 : map.keySet()) {
            kyVar.put(put2, this.f16738b);
        }
        this.f16747k = Collections.unmodifiableMap(kyVar);
    }

    public static hel m19495a(Context context, hfe hfe, Lock lock, Looper looper, gtq gtq, Map<gue<?>, gug> map, gwa gwa, Map<gtz<?>, Integer> map2, guc<? extends hca, hcb> guc__extends_hca__hcb, ArrayList<hek> arrayList) {
        Map kyVar = new ky();
        Map kyVar2 = new ky();
        for (Entry entry : map.entrySet()) {
            gug gug = (gug) entry.getValue();
            if (gug.mo3043d()) {
                kyVar.put((gue) entry.getKey(), gug);
            } else {
                kyVar2.put((gue) entry.getKey(), gug);
            }
        }
        gwb.m1886a(!kyVar.isEmpty(), (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        Map kyVar3 = new ky();
        Map kyVar4 = new ky();
        for (gtz gtz : map2.keySet()) {
            gue c = gtz.m18606c();
            if (kyVar.containsKey(c)) {
                kyVar3.put(gtz, (Integer) map2.get(gtz));
            } else if (kyVar2.containsKey(c)) {
                kyVar4.put(gtz, (Integer) map2.get(gtz));
            } else {
                throw new IllegalStateException("Each API in the apiTypeMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            hek hek = (hek) obj;
            if (kyVar3.containsKey(hek.f16734a)) {
                arrayList2.add(hek);
            } else if (kyVar4.containsKey(hek.f16734a)) {
                arrayList3.add(hek);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
            }
        }
        return new hel(context, hfe, lock, looper, gtq, kyVar, kyVar2, gwa, guc__extends_hca__hcb, null, arrayList2, arrayList3, kyVar3, kyVar4);
    }

    private void m19496a(ConnectionResult connectionResult) {
        switch (this.f16750n) {
            case 1:
                break;
            case 2:
                this.f16745i.mo2491a(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        m19502h();
        this.f16750n = 0;
    }

    private static boolean m19499b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.m9653b();
    }

    private boolean m19501g() {
        return this.f16738b.mo2486d();
    }

    private void m19502h() {
        Iterator it = this.f16748l.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.f16748l.clear();
    }

    private boolean m19503i() {
        return this.f16741e != null && this.f16741e.m9654c() == 4;
    }

    private PendingIntent m19504j() {
        return this.f16749m == null ? null : PendingIntent.getActivity(this.f16744h, this.f16745i.m19629j(), this.f16749m.m18618e(), 134217728);
    }

    public ConnectionResult mo2479a(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public <A extends gud, R extends gup, T extends heb<R, A>> T mo2480a(T t) {
        if (!m19500c(t)) {
            return this.f16737a.mo2480a((heb) t);
        }
        if (!m19503i()) {
            return this.f16738b.mo2480a((heb) t);
        }
        t.m18993c(new Status(4, null, m19504j()));
        return t;
    }

    public void mo2481a() {
        this.f16750n = 2;
        this.f16742f = false;
        this.f16741e = null;
        this.f16740d = null;
        this.f16737a.mo2481a();
        this.f16738b.mo2481a();
    }

    public void mo2482a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f16738b.mo2482a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f16737a.mo2482a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public ConnectionResult mo2483b() {
        throw new UnsupportedOperationException();
    }

    public <A extends gud, T extends heb<? extends gup, A>> T mo2484b(T t) {
        if (!m19500c(t)) {
            return this.f16737a.mo2484b(t);
        }
        if (!m19503i()) {
            return this.f16738b.mo2484b(t);
        }
        t.m18993c(new Status(4, null, m19504j()));
        return t;
    }

    public void mo2485c() {
        this.f16741e = null;
        this.f16740d = null;
        this.f16750n = 0;
        this.f16737a.mo2485c();
        this.f16738b.mo2485c();
        m19502h();
    }

    public boolean mo2486d() {
        boolean z = true;
        this.f16743g.lock();
        try {
            if (!(this.f16737a.mo2486d() && (m19501g() || m19503i() || this.f16750n == 1))) {
                z = false;
            }
            this.f16743g.unlock();
            return z;
        } catch (Throwable th) {
            this.f16743g.unlock();
        }
    }

    public boolean mo2487e() {
        this.f16743g.lock();
        try {
            boolean z = this.f16750n == 2;
            this.f16743g.unlock();
            return z;
        } catch (Throwable th) {
            this.f16743g.unlock();
        }
    }

    public void mo2488f() {
        this.f16737a.mo2488f();
        this.f16738b.mo2488f();
    }

    private boolean m19500c(heb<? extends gup, ? extends gud> heb__extends_gup___extends_gud) {
        gue gue = heb__extends_gup___extends_gud.f16402e;
        gwb.m2048b(this.f16747k.containsKey(gue), (Object) "GoogleApiClient is not configured to use the API required for this call.");
        return ((hfj) this.f16747k.get(gue)).equals(this.f16738b);
    }

    static /* synthetic */ void m19497a(hel hel) {
        if (hel.m19499b(hel.f16740d)) {
            if (hel.m19499b(hel.f16741e) || hel.m19503i()) {
                switch (hel.f16750n) {
                    case 1:
                        break;
                    case 2:
                        hel.f16745i.mo2490a(hel.f16739c);
                        break;
                    default:
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        break;
                }
                hel.m19502h();
                hel.f16750n = 0;
            } else if (hel.f16741e == null) {
            } else {
                if (hel.f16750n == 1) {
                    hel.m19502h();
                    return;
                }
                hel.m19496a(hel.f16741e);
                hel.f16737a.mo2485c();
            }
        } else if (hel.f16740d != null && hel.m19499b(hel.f16741e)) {
            hel.f16738b.mo2485c();
            hel.m19496a(hel.f16740d);
        } else if (hel.f16740d != null && hel.f16741e != null) {
            ConnectionResult connectionResult = hel.f16740d;
            if (hel.f16738b.f16834h < hel.f16737a.f16834h) {
                connectionResult = hel.f16741e;
            }
            hel.m19496a(connectionResult);
        }
    }

    static /* synthetic */ void m19498a(hel hel, int i, boolean z) {
        hel.f16745i.mo2489a(i, z);
        hel.f16741e = null;
        hel.f16740d = null;
    }
}
