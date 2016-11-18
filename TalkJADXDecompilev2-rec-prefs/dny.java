package p000;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class dny implements dnc {
    static final boolean f10199a = false;
    final dgg f10200b = dgg.m11692a();
    final dob f10201c = new dob(this);
    final List<dnb> f10202d = new CopyOnWriteArrayList();
    dnd f10203e = dnd.OPEN;
    ijb f10204f = null;
    lyh f10205g;
    private final doa f10206h = new doa(this);

    static {
        kae kae = glk.f15560g;
    }

    dny() {
        this.f10200b.m11701a(this.f10206h);
    }

    public void mo1623a(dnb dnb) {
        this.f10202d.add(dnb);
    }

    public void mo1625b(dnb dnb) {
        this.f10202d.remove(dnb);
    }

    public dnd mo1622a() {
        return this.f10203e;
    }

    public void mo1624a(boolean z) {
        if (this.f10204f != null && this.f10205g != null) {
            int i;
            lyh lyh = new lyh();
            lyh.f26866a = this.f10205g.f26866a;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            lyh.f26884s = Integer.valueOf(i);
            nzf lyk = new lyk();
            lyk.f26901c = new lyh[]{lyh};
            this.f10204f.mo3367b(lyk, new dnz(this, z));
        }
    }

    public boolean mo1626b() {
        return this.f10205g != null && gwb.m1507a(this.f10205g.f26867b) == 2;
    }

    public String mo1627c() {
        return this.f10205g == null ? null : this.f10205g.f26890y;
    }
}
