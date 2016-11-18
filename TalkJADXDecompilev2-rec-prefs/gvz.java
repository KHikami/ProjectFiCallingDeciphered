package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class gvz extends gvp {
    final /* synthetic */ gvo f16258e;

    public gvz(gvo gvo, int i, Bundle bundle) {
        this.f16258e = gvo;
        super(gvo, i, bundle);
    }

    protected void mo2353a(ConnectionResult connectionResult) {
        this.f16258e.f16229p.mo2352a(connectionResult);
        this.f16258e.m18697a(connectionResult);
    }

    protected boolean mo2354a() {
        this.f16258e.f16229p.mo2352a(ConnectionResult.f7256a);
        return true;
    }
}
