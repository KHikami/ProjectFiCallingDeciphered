package p000;

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;

public final class heo extends hed {
    private final gxt<guu<?>> f16753g;
    private hfn f16754h;

    protected void mo2475a(ConnectionResult connectionResult, int i) {
        this.f16754h.m19669b(connectionResult, i);
    }

    public void mo2473b() {
        super.mo2473b();
        Iterator it = this.f16753g.iterator();
        while (it.hasNext()) {
            ((guu) it.next()).m18655a();
        }
        this.f16753g.clear();
        this.f16754h.m19666a(this);
    }

    protected void mo2477c() {
        this.f16754h.m19668b();
    }
}
