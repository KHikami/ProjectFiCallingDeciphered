package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: buo */
public final class buo implements brh {
    private /* synthetic */ bui a;

    public buo(bui bui) {
        this.a = bui;
    }

    public final void a(ConnectionResult connectionResult) {
        if (connectionResult.b()) {
            this.a.a(null, this.a.t);
        } else if (this.a.w != null) {
            this.a.w.a(connectionResult);
        }
    }
}
