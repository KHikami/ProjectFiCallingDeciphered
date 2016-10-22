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
    private final Queue<hdv> d;
    private final gud e;
    private final hdx<O> f;
    private final SparseArray<hgp> g;
    private final Set<hea> h;
    private final SparseArray<Map<Object, heb>> i;
    private ConnectionResult j;

    public hfq(hfn hfn, guu<O> guu_O) {
        this.c = hfn;
        this.d = new LinkedList();
        this.g = new SparseArray();
        this.h = new HashSet();
        this.i = new SparseArray();
        this.j = null;
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

    public void a(ConnectionResult connectionResult) {
        a();
        this.c.h = -1;
        b(connectionResult);
        int keyAt = this.g.keyAt(0);
        if (this.d.isEmpty()) {
            this.j = connectionResult;
            return;
        }
        synchronized (hfn.a) {
            if (this.c.k == null || !this.c.l.contains(this.f)) {
                if (!this.c.a(connectionResult, keyAt)) {
                    if (connectionResult.c() == 18) {
                        this.b = true;
                    }
                    if (this.b) {
                        this.c.m.sendMessageDelayed(Message.obtain(this.c.m, 8, this.f), this.c.b);
                        return;
                    }
                    String valueOf = String.valueOf(this.f.b());
                    a(new Status(17, new StringBuilder(String.valueOf(valueOf).length() + 38).append("API: ").append(valueOf).append(" is not available on this device.").toString()));
                    return;
                }
                return;
            }
            this.c.k.b(connectionResult, keyAt);
        }
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
