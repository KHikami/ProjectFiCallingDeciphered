import com.google.android.gms.common.ConnectionResult;

final class frs implements gul {
    final /* synthetic */ frq a;

    frs(frq frq) {
        this.a = frq;
    }

    public void a(ConnectionResult connectionResult) {
        String valueOf = String.valueOf(connectionResult);
        glk.e("BabelPeopleCache", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Google API client connection failure: ").append(valueOf).toString(), new Object[0]);
    }
}
