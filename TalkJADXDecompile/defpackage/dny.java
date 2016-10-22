package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: dny */
final class dny implements dnc {
    static final boolean a;
    final dgg b;
    final dob c;
    final List<dnb> d;
    dnd e;
    ijb f;
    lyh g;
    private final doa h;

    static {
        kae kae = glk.g;
        a = false;
    }

    dny() {
        this.b = dgg.a();
        this.h = new doa(this);
        this.c = new dob(this);
        this.d = new CopyOnWriteArrayList();
        this.e = dnd.OPEN;
        this.f = null;
        this.b.a(this.h);
    }

    public void a(dnb dnb) {
        this.d.add(dnb);
    }

    public void b(dnb dnb) {
        this.d.remove(dnb);
    }

    public dnd a() {
        return this.e;
    }

    public void a(boolean z) {
        if (this.f != null && this.g != null) {
            int i;
            lyh lyh = new lyh();
            lyh.a = this.g.a;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            lyh.s = Integer.valueOf(i);
            nzf lyk = new lyk();
            lyk.c = new lyh[]{lyh};
            this.f.b(lyk, new dnz(this, z));
        }
    }

    public boolean b() {
        return this.g != null && gwb.a(this.g.b) == 2;
    }

    public String c() {
        return this.g == null ? null : this.g.y;
    }
}
