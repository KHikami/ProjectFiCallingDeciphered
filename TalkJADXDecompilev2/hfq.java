package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

final class hfq<O extends gua> implements guk, gul {
    final gug a;
    boolean b;
    final /* synthetic */ hfn c;
    private final Queue<hdv> d = new LinkedList();
    private final gud e;
    private final hdx<O> f;
    private final SparseArray<hgp> g = new SparseArray();
    private final Set<hea> h = new HashSet();
    private final SparseArray<Map<Object, heb>> i = new SparseArray();
    private ConnectionResult j = null;

    public hfq(hfn hfn, guu<O> guu_O) {
        this.c = hfn;
        this.a = guu_O.b().b().a(guu_O.e(), this.c.m.getLooper(), gwa.a(guu_O.e()), guu_O.c(), this, this);
        if (this.a instanceof gvl) {
            this.e = ((gvl) this.a).i();
        } else {
            this.e = this.a;
        }
        this.f = guu_O.d();
    }

    private void b(ConnectionResult connectionResult) {
        for (hea a : this.h) {
            a.a(this.f, connectionResult);
        }
        this.h.clear();
    }

    private void b(hdv hdv) {
        hdv.a(this.g);
        Map map;
        if (hdv.b == 3) {
            try {
                Map map2;
                map = (Map) this.i.get(hdv.a);
                if (map == null) {
                    ky kyVar = new ky(1);
                    this.i.put(hdv.a, kyVar);
                    map2 = kyVar;
                } else {
                    map2 = map;
                }
                heb heb = ((hdw) hdv).c;
                map2.put(((a) heb).i(), heb);
            } catch (ClassCastException e) {
                throw new IllegalStateException("Listener registration methods must implement ListenerApiMethod");
            }
        } else if (hdv.b == 4) {
            try {
                map = (Map) this.i.get(hdv.a);
                a aVar = (a) ((hdw) hdv).c;
                if (map != null) {
                    map.remove(aVar.i());
                }
            } catch (ClassCastException e2) {
                throw new IllegalStateException("Listener unregistration methods must implement ListenerApiMethod");
            }
        }
        try {
            hdv.a(this.e);
        } catch (DeadObjectException e3) {
            this.a.a();
            a(1);
        }
    }

    private void g() {
        while (this.a.b() && !this.d.isEmpty()) {
            b((hdv) this.d.remove());
        }
    }

    private void h() {
        this.c.m.removeMessages(10, this.f);
        this.c.m.sendMessageDelayed(this.c.m.obtainMessage(10, this.f), this.c.d);
    }

    public void a() {
        this.j = null;
    }

    public void a(int i) {
        a();
        this.b = true;
        this.c.m.sendMessageDelayed(Message.obtain(this.c.m, 8, this.f), this.c.b);
        this.c.m.sendMessageDelayed(Message.obtain(this.c.m, 9, this.f), this.c.c);
        this.c.h = -1;
    }

    public void a(int i, boolean z) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            hdv hdv = (hdv) it.next();
            if (hdv.a == i && hdv.b != 1 && hdv.a()) {
                it.remove();
            }
        }
        ((hgp) this.g.get(i)).a();
        this.i.delete(i);
        if (!z) {
            this.g.remove(i);
            this.c.o.remove(i);
            if (this.g.size() == 0 && this.d.isEmpty()) {
                c();
                this.a.a();
                this.c.j.remove(this.f);
                synchronized (hfn.a) {
                    this.c.l.remove(this.f);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.android.gms.common.ConnectionResult r6) {
        /*
        r5 = this;
        r5.a();
        r0 = r5.c;
        r1 = -1;
        r0.h = r1;
        r5.b(r6);
        r0 = r5.g;
        r1 = 0;
        r0 = r0.keyAt(r1);
        r1 = r5.d;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x001e;
    L_0x001b:
        r5.j = r6;
    L_0x001d:
        return;
    L_0x001e:
        r1 = defpackage.hfn.a;
        monitor-enter(r1);
        r2 = r5.c;	 Catch:{ all -> 0x0042 }
        r2 = r2.k;	 Catch:{ all -> 0x0042 }
        if (r2 == 0) goto L_0x0045;
    L_0x0029:
        r2 = r5.c;	 Catch:{ all -> 0x0042 }
        r2 = r2.l;	 Catch:{ all -> 0x0042 }
        r3 = r5.f;	 Catch:{ all -> 0x0042 }
        r2 = r2.contains(r3);	 Catch:{ all -> 0x0042 }
        if (r2 == 0) goto L_0x0045;
    L_0x0037:
        r2 = r5.c;	 Catch:{ all -> 0x0042 }
        r2 = r2.k;	 Catch:{ all -> 0x0042 }
        r2.b(r6, r0);	 Catch:{ all -> 0x0042 }
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        goto L_0x001d;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        throw r0;
    L_0x0045:
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        r1 = r5.c;
        r0 = r1.a(r6, r0);
        if (r0 != 0) goto L_0x001d;
    L_0x004e:
        r0 = r6.c();
        r1 = 18;
        if (r0 != r1) goto L_0x0059;
    L_0x0056:
        r0 = 1;
        r5.b = r0;
    L_0x0059:
        r0 = r5.b;
        if (r0 == 0) goto L_0x007b;
    L_0x005d:
        r0 = r5.c;
        r0 = r0.m;
        r1 = r5.c;
        r1 = r1.m;
        r2 = 8;
        r3 = r5.f;
        r1 = android.os.Message.obtain(r1, r2, r3);
        r2 = r5.c;
        r2 = r2.b;
        r0.sendMessageDelayed(r1, r2);
        goto L_0x001d;
    L_0x007b:
        r0 = new com.google.android.gms.common.api.Status;
        r1 = 17;
        r2 = r5.f;
        r2 = r2.b();
        r2 = java.lang.String.valueOf(r2);
        r3 = new java.lang.StringBuilder;
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r4 = r4 + 38;
        r3.<init>(r4);
        r4 = "API: ";
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r3 = " is not available on this device.";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r0.<init>(r1, r2);
        r5.a(r0);
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: hfq.a(com.google.android.gms.common.ConnectionResult):void");
    }

    void a(Status status) {
        for (hdv a : this.d) {
            a.a(status);
        }
        this.d.clear();
    }

    public void a(hdv hdv) {
        if (this.a.b()) {
            b(hdv);
            h();
            return;
        }
        this.d.add(hdv);
        if (this.j == null || !this.j.a()) {
            e();
        } else {
            a(this.j);
        }
    }

    public void a(hea hea) {
        this.h.add(hea);
    }

    public void a_(Bundle bundle) {
        a();
        b(ConnectionResult.a);
        c();
        for (int i = 0; i < this.i.size(); i++) {
            for (heb b : ((Map) this.i.get(this.i.keyAt(i))).values()) {
                try {
                    b.b(this.e);
                } catch (DeadObjectException e) {
                    this.a.a();
                    a(1);
                }
            }
        }
        g();
        h();
    }

    ConnectionResult b() {
        return this.j;
    }

    public void b(int i) {
        this.g.put(i, new hgp(this.f.a(), this.a));
    }

    void c() {
        if (this.b) {
            this.c.m.removeMessages(9, this.f);
            this.c.m.removeMessages(8, this.f);
            this.b = false;
        }
    }

    void d() {
        if (this.a.b() && this.i.size() == 0) {
            for (int i = 0; i < this.g.size(); i++) {
                if (((hgp) this.g.get(this.g.keyAt(i))).c()) {
                    h();
                    return;
                }
            }
            this.a.a();
        }
    }

    void e() {
        if (!this.a.b() && !this.a.c()) {
            if (this.c.h != 0) {
                this.c.h = this.c.g.a(this.c.f);
                if (this.c.h != 0) {
                    a(new ConnectionResult(this.c.h, null));
                    return;
                }
            }
            this.a.a(new hfr(this.c, this.a, this.f));
        }
    }

    boolean f() {
        return this.a.b();
    }
}
