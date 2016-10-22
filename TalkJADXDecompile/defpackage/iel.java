package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: iel */
final class iel implements idr {
    private final ConnectionResult a;

    public iel(ConnectionResult connectionResult) {
        if (connectionResult == null) {
            throw new IllegalArgumentException("null connectionResult");
        }
        this.a = connectionResult;
    }

    public int a() {
        return this.a.c();
    }

    public String toString() {
        return this.a.toString();
    }
}
