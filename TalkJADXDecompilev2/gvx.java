package defpackage;

import com.google.android.gms.common.ConnectionResult;

public final class gvx implements gvu {
    final /* synthetic */ gvo a;

    public gvx(gvo gvo) {
        this.a = gvo;
    }

    public void a(ConnectionResult connectionResult) {
        if (connectionResult.b()) {
            this.a.a(null, this.a.q());
        } else if (this.a.v != null) {
            this.a.v.a(connectionResult);
        }
    }
}
