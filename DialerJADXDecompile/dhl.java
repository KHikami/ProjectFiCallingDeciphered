import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
final class dhl extends dgm {
    private static final dhn b;
    final dht a;
    private final Object c;
    private dgj d;
    private dhu e;
    private dhn f;

    static {
        b = dhn.j.b("SimpleLoadBalancer has shut down");
    }

    dhl(dht dht) {
        this.c = new Object();
        this.a = dht;
    }

    public final Object a() {
        synchronized (this.c) {
            dgj dgj = this.d;
            if (dgj != null) {
                return this.a.a(dgj);
            } else if (this.f != null) {
                r0 = this.a.a(this.f);
                return r0;
            } else {
                if (this.e == null) {
                    this.e = this.a.a();
                }
                r0 = this.e.a();
                return r0;
            }
        }
    }

    public final void a(List list) {
        synchronized (this.c) {
            List arrayList = new ArrayList(list.size());
            for (dhj dhj : list) {
                arrayList.add(dhj.a);
            }
            dgj dgj = new dgj(arrayList);
            if (dgj.equals(this.d)) {
                return;
            }
            this.d = dgj;
            this.f = null;
            dhu dhu = this.e;
            this.e = null;
            if (dhu != null) {
                dhu.a(new dhm(this, dgj));
            }
        }
    }

    public final void a(dhn dhn) {
        synchronized (this.c) {
            dhn b = dhn.b("Name resolution failed");
            dhu dhu = this.e;
            this.e = null;
            this.f = b;
        }
        if (dhu != null) {
            dhu.a(b);
        }
    }
}
