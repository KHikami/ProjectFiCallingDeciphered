package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

public final class nwp {
    final /* synthetic */ nwo a;
    private final Iterator<Entry<nwh, Object>> b = this.a.d.d();
    private Entry<nwh, Object> c;
    private final boolean d;

    nwp(nwo nwo, boolean z) {
        this.a = nwo;
        if (this.b.hasNext()) {
            this.c = (Entry) this.b.next();
        }
        this.d = z;
    }

    public void a(int i, nvy nvy) {
        while (this.c != null && ((nwh) this.c.getKey()).a() < Integer.MAX_VALUE) {
            nwh nwh = (nwh) this.c.getKey();
            if (this.d && nwh.c() == nyn.MESSAGE && !nwh.d()) {
                nvy.b(nwh.a(), (nxi) this.c.getValue());
            } else {
                nwf.a(nwh, this.c.getValue(), nvy);
            }
            if (this.b.hasNext()) {
                this.c = (Entry) this.b.next();
            } else {
                this.c = null;
            }
        }
    }
}
