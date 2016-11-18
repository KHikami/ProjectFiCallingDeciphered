package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;

public final class heo extends hed {
    private final gxt<guu<?>> g;
    private hfn h;

    protected void a(ConnectionResult connectionResult, int i) {
        this.h.b(connectionResult, i);
    }

    public void b() {
        super.b();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((guu) it.next()).a();
        }
        this.g.clear();
        this.h.a(this);
    }

    protected void c() {
        this.h.b();
    }
}
