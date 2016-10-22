package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: cyr */
final class cyr implements gul {
    final /* synthetic */ cyp a;

    cyr(cyp cyp) {
        this.a = cyp;
    }

    public void a(ConnectionResult connectionResult) {
        String valueOf = String.valueOf(connectionResult);
        glk.e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 34).append("People client connection failure: ").append(valueOf).toString(), new Object[0]);
    }
}
