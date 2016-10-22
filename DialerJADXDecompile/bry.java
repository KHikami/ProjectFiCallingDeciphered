import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class bry implements brf, brg {
    public final bqy a;
    bsz b;
    private final int c;

    public bry(bqy bqy, int i) {
        this.a = bqy;
        this.c = i;
    }

    private final void a() {
        buf.d(this.b, (Object) "Callbacks must be attached to a GoogleApiClient instance before connecting the client.");
    }

    public final void a(int i) {
        a();
        this.b.a(i);
    }

    public final void a(Bundle bundle) {
        a();
        bsz bsz = this.b;
        bsz.a.lock();
        try {
            bsz.k.a(bundle);
        } finally {
            bsz.a.unlock();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        a();
        bsz bsz = this.b;
        bqy bqy = this.a;
        int i = this.c;
        bsz.a.lock();
        try {
            bsz.k.a(connectionResult, bqy, i);
        } finally {
            bsz.a.unlock();
        }
    }
}
