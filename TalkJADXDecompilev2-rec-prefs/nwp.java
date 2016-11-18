package p000;

import java.util.Iterator;
import java.util.Map.Entry;

public final class nwp {
    final /* synthetic */ nwo f31180a;
    private final Iterator<Entry<nwh, Object>> f31181b = this.f31180a.d.d();
    private Entry<nwh, Object> f31182c;
    private final boolean f31183d;

    nwp(nwo nwo, boolean z) {
        this.f31180a = nwo;
        if (this.f31181b.hasNext()) {
            this.f31182c = (Entry) this.f31181b.next();
        }
        this.f31183d = z;
    }

    public void m36970a(int i, nvy nvy) {
        while (this.f31182c != null && ((nwh) this.f31182c.getKey()).a() < Integer.MAX_VALUE) {
            nwh nwh = (nwh) this.f31182c.getKey();
            if (this.f31183d && nwh.c() == nyn.MESSAGE && !nwh.d()) {
                nvy.mo4031b(nwh.a(), (nxi) this.f31182c.getValue());
            } else {
                nwf.a(nwh, this.f31182c.getValue(), nvy);
            }
            if (this.f31181b.hasNext()) {
                this.f31182c = (Entry) this.f31181b.next();
            } else {
                this.f31182c = null;
            }
        }
    }
}
