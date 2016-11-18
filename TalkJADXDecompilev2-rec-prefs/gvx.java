package p000;

import com.google.android.gms.common.ConnectionResult;

public final class gvx implements gvu {
    final /* synthetic */ gvo f16255a;

    public gvx(gvo gvo) {
        this.f16255a = gvo;
    }

    public void mo2352a(ConnectionResult connectionResult) {
        if (connectionResult.m9653b()) {
            this.f16255a.m18699a(null, this.f16255a.mo2344q());
        } else if (this.f16255a.f16235v != null) {
            this.f16255a.f16235v.m18734a(connectionResult);
        }
    }
}
