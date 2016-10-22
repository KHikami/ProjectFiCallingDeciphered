package defpackage;

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

/* renamed from: hel */
final class hel implements hfx {
    final hfj a;
    final hfj b;
    Bundle c;
    ConnectionResult d;
    ConnectionResult e;
    boolean f;
    final Lock g;
    private final Context h;
    private final hfe i;
    private final Looper j;
    private final Map<gue<?>, hfj> k;
    private final Set<a> l;
    private final gug m;
    private int n;

    private hel(Context context, hfe hfe, Lock lock, Looper looper, gtq gtq, Map<gue<?>, gug> map, Map<gue<?>, gug> map2, gwa gwa, guc<? extends hca, hcb> guc__extends_hca__hcb, gug gug, ArrayList<hek> arrayList, ArrayList<hek> arrayList2, Map<gtz<?>, Integer> map3, Map<gtz<?>, Integer> map4) {
        this.l = Collections.newSetFromMap(new WeakHashMap());
        this.d = null;
        this.e = null;
        this.f = false;
        this.n = 0;
        this.h = context;
        this.i = hfe;
        this.g = lock;
        this.j = looper;
        this.m = gug;
        this.a = new hfj(context, this.i, lock, looper, gtq, map2, null, map4, null, arrayList2, new hem(this));
        this.b = new hfj(context, this.i, lock, looper, gtq, map, gwa, map3, guc__extends_hca__hcb, arrayList, new hen(this));
        Map kyVar = new ky();
        for (gue put : map2.keySet()) {
            kyVar.put(put, this.a);
        }
        for (gue put2 : map.keySet()) {
            kyVar.put(put2, this.b);
        }
        this.k = Collections.unmodifiableMap(kyVar);
    }

    public static hel a(Context context, hfe hfe, Lock lock, Looper looper, gtq gtq, Map<gue<?>, gug> map, gwa gwa, Map<gtz<?>, Integer> map2, guc<? extends hca, hcb> guc__extends_hca__hcb, ArrayList<hek> arrayList) {
        Map kyVar = new ky();
        Map kyVar2 = new ky();
        for (Entry entry : map.entrySet()) {
            gug gug = (gug) entry.getValue();
            if (gug.d()) {
                kyVar.put((gue) entry.getKey(), gug);
            } else {
                kyVar2.put((gue) entry.getKey(), gug);
            }
        }
        gwb.a(!kyVar.isEmpty(), (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        Map kyVar3 = new ky();
        Map kyVar4 = new ky();
        for (gtz gtz : map2.keySet()) {
            gue c = gtz.c();
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
            if (kyVar3.containsKey(hek.a)) {
                arrayList2.add(hek);
            } else if (kyVar4.containsKey(hek.a)) {
                arrayList3.add(hek);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
            }
        }
        return new hel(context, hfe, lock, looper, gtq, kyVar, kyVar2, gwa, guc__extends_hca__hcb, null, arrayList2, arrayList3, kyVar3, kyVar4);
    }

    private void a(ConnectionResult connectionResult) {
        switch (this.n) {
            case wi.j /*1*/:
                break;
            case wi.l /*2*/:
                this.i.a(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        h();
        this.n = 0;
    }

    private static boolean b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.b();
    }

    private boolean g() {
        return this.b.d();
    }

    private void h() {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.l.clear();
    }

    private boolean i() {
        return this.e != null && this.e.c() == 4;
    }

    private PendingIntent j() {
        return this.m == null ? null : PendingIntent.getActivity(this.h, this.i.j(), this.m.e(), 134217728);
    }

    public ConnectionResult a(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public <A extends gud, R extends gup, T extends heb<R, A>> T a(T t) {
        if (!c(t)) {
            return this.a.a((heb) t);
        }
        if (!i()) {
            return this.b.a((heb) t);
        }
        t.c(new Status(4, null, j()));
        return t;
    }

    public void a() {
        this.n = 2;
        this.f = false;
        this.e = null;
        this.d = null;
        this.a.a();
        this.b.a();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.a.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public ConnectionResult b() {
        throw new UnsupportedOperationException();
    }

    public <A extends gud, T extends heb<? extends gup, A>> T b(T t) {
        if (!c(t)) {
            return this.a.b(t);
        }
        if (!i()) {
            return this.b.b(t);
        }
        t.c(new Status(4, null, j()));
        return t;
    }

    public void c() {
        this.e = null;
        this.d = null;
        this.n = 0;
        this.a.c();
        this.b.c();
        h();
    }

    public boolean d() {
        boolean z = true;
        this.g.lock();
        try {
            if (!(this.a.d() && (g() || i() || this.n == 1))) {
                z = false;
            }
            this.g.unlock();
            return z;
        } catch (Throwable th) {
            this.g.unlock();
        }
    }

    public boolean e() {
        this.g.lock();
        try {
            boolean z = this.n == 2;
            this.g.unlock();
            return z;
        } catch (Throwable th) {
            this.g.unlock();
        }
    }

    public void f() {
        this.a.f();
        this.b.f();
    }

    private boolean c(heb<? extends gup, ? extends gud> heb__extends_gup___extends_gud) {
        gue gue = heb__extends_gup___extends_gud.e;
        gwb.b(this.k.containsKey(gue), (Object) "GoogleApiClient is not configured to use the API required for this call.");
        return ((hfj) this.k.get(gue)).equals(this.b);
    }

    static /* synthetic */ void a(hel hel) {
        if (hel.b(hel.d)) {
            if (hel.b(hel.e) || hel.i()) {
                switch (hel.n) {
                    case wi.j /*1*/:
                        break;
                    case wi.l /*2*/:
                        hel.i.a(hel.c);
                        break;
                    default:
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        break;
                }
                hel.h();
                hel.n = 0;
            } else if (hel.e == null) {
            } else {
                if (hel.n == 1) {
                    hel.h();
                    return;
                }
                hel.a(hel.e);
                hel.a.c();
            }
        } else if (hel.d != null && hel.b(hel.e)) {
            hel.b.c();
            hel.a(hel.d);
        } else if (hel.d != null && hel.e != null) {
            ConnectionResult connectionResult = hel.d;
            if (hel.b.h < hel.a.h) {
                connectionResult = hel.e;
            }
            hel.a(connectionResult);
        }
    }

    static /* synthetic */ void a(hel hel, int i, boolean z) {
        hel.i.a(i, z);
        hel.e = null;
        hel.d = null;
    }
}
