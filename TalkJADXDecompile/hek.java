import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class hek implements guk, gul {
    public final gtz<?> a;
    private final int b;
    private hfj c;

    public hek(gtz<?> gtz_, int i) {
        this.a = gtz_;
        this.b = i;
    }

    private void a() {
        gwb.f(this.c, (Object) "Callbacks must be attached to a GoogleApiClient instance before connecting the client.");
    }

    public void a(int i) {
        a();
        this.c.a(i);
    }

    public void a(ConnectionResult connectionResult) {
        a();
        this.c.a(connectionResult, this.a, this.b);
    }

    public void a(hfj hfj) {
        this.c = hfj;
    }

    public void a_(Bundle bundle) {
        a();
        this.c.a(bundle);
    }
}
