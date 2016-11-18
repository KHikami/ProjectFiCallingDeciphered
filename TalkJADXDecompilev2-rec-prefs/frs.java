package p000;

import com.google.android.gms.common.ConnectionResult;

final class frs implements gul {
    final /* synthetic */ frq f13852a;

    frs(frq frq) {
        this.f13852a = frq;
    }

    public void mo1151a(ConnectionResult connectionResult) {
        String valueOf = String.valueOf(connectionResult);
        glk.m17982e("BabelPeopleCache", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Google API client connection failure: ").append(valueOf).toString(), new Object[0]);
    }
}
