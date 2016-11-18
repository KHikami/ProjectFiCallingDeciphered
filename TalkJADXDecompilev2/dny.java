package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class dny implements dnc {
    static final boolean a = false;
    final dgg b = dgg.a();
    final dob c = new dob(this);
    final List<dnb> d = new CopyOnWriteArrayList();
    dnd e = dnd.OPEN;
    ijb f = null;
    lyh g;
    private final doa h = new doa(this);

    static {
        kae kae = glk.g;
    }

    dny() {
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
