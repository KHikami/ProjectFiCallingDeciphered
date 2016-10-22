import com.google.android.gms.common.ConnectionResult;

final class cmt implements brg {
    private /* synthetic */ cjy a;

    cmt(cmo cmo, cjy cjy) {
        this.a = cjy;
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.a(cmo.a("Connection failed: " + connectionResult));
    }
}
