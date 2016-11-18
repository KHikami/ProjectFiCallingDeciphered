package p000;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

final class hfr implements gvu {
    final /* synthetic */ hfn f16875a;
    private final gug f16876b;
    private final hdx<?> f16877c;

    public hfr(hfn hfn, gug gug, hdx<?> hdx_) {
        this.f16875a = hfn;
        this.f16876b = gug;
        this.f16877c = hdx_;
    }

    public void mo2352a(ConnectionResult connectionResult) {
        if (connectionResult.m9653b()) {
            this.f16876b.m18613a(null, Collections.emptySet());
        } else {
            ((hfq) this.f16875a.f16853j.get(this.f16877c)).mo1151a(connectionResult);
        }
    }
}
