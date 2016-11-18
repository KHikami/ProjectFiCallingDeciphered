package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

final class hfr implements gvu {
    final /* synthetic */ hfn a;
    private final gug b;
    private final hdx<?> c;

    public hfr(hfn hfn, gug gug, hdx<?> hdx_) {
        this.a = hfn;
        this.b = gug;
        this.c = hdx_;
    }

    public void a(ConnectionResult connectionResult) {
        if (connectionResult.b()) {
            this.b.a(null, Collections.emptySet());
        } else {
            ((hfq) this.a.j.get(this.c)).a(connectionResult);
        }
    }
}
