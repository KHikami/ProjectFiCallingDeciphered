package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class hek implements guk, gul {
    public final gtz<?> f16734a;
    private final int f16735b;
    private hfj f16736c;

    public hek(gtz<?> gtz_, int i) {
        this.f16734a = gtz_;
        this.f16735b = i;
    }

    private void m19481a() {
        gwb.m2195f(this.f16736c, (Object) "Callbacks must be attached to a GoogleApiClient instance before connecting the client.");
    }

    public void mo1150a(int i) {
        m19481a();
        this.f16736c.m19635a(i);
    }

    public void mo1151a(ConnectionResult connectionResult) {
        m19481a();
        this.f16736c.m19638a(connectionResult, this.f16734a, this.f16735b);
    }

    public void m19484a(hfj hfj) {
        this.f16736c = hfj;
    }

    public void a_(Bundle bundle) {
        m19481a();
        this.f16736c.m19636a(bundle);
    }
}
