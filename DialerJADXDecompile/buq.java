import com.google.android.gms.common.ConnectionResult;

public final class buq extends buj {
    private /* synthetic */ bui c;

    public buq(bui bui, int i) {
        this.c = bui;
        super(bui, i, null);
    }

    protected final void a(ConnectionResult connectionResult) {
        this.c.p.a(connectionResult);
        this.c.a(connectionResult);
    }

    protected final boolean a() {
        this.c.p.a(ConnectionResult.a);
        return true;
    }
}
