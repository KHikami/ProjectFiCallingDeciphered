package p000;

import com.google.android.gms.common.ConnectionResult;

final class iel implements idr {
    private final ConnectionResult f17610a;

    public iel(ConnectionResult connectionResult) {
        if (connectionResult == null) {
            throw new IllegalArgumentException("null connectionResult");
        }
        this.f17610a = connectionResult;
    }

    public int mo3157a() {
        return this.f17610a.m9654c();
    }

    public String toString() {
        return this.f17610a.toString();
    }
}
