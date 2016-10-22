import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

public final class bsp implements bsy {
    private final bsz a;

    public bsp(bsz bsz) {
        this.a = bsz;
    }

    public final brq a(brq brq) {
        this.a.m.c.add(brq);
        return brq;
    }

    public final void a() {
        for (bra a : this.a.f.values()) {
            a.a();
        }
        this.a.m.d = Collections.emptySet();
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
    }

    public final void a(ConnectionResult connectionResult, bqy bqy, int i) {
    }

    public final brq b(brq brq) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final boolean b() {
        return true;
    }

    public final void c() {
        bsz bsz = this.a;
        bsz.a.lock();
        try {
            bsz.k = new bsf(bsz, bsz.h, bsz.i, bsz.d, bsz.j, bsz.a, bsz.c);
            bsz.k.a();
            bsz.b.signalAll();
        } finally {
            bsz.a.unlock();
        }
    }
}
