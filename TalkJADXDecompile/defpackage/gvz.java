package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: gvz */
public final class gvz extends gvp {
    final /* synthetic */ gvo e;

    public gvz(gvo gvo, int i, Bundle bundle) {
        this.e = gvo;
        super(gvo, i, bundle);
    }

    protected void a(ConnectionResult connectionResult) {
        this.e.p.a(connectionResult);
        this.e.a(connectionResult);
    }

    protected boolean a() {
        this.e.p.a(ConnectionResult.a);
        return true;
    }
}
