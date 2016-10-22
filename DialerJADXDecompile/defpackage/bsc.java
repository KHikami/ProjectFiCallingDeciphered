package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: bsc */
public final class bsc implements bsy {
    final bsz a;
    boolean b;

    public bsc(bsz bsz) {
        this.b = false;
        this.a = bsz;
    }

    public final brq a(brq brq) {
        return b(brq);
    }

    public final void a() {
    }

    public final void a(int i) {
        this.a.a(null);
        this.a.n.a(i, this.b);
    }

    public final void a(Bundle bundle) {
    }

    public final void a(ConnectionResult connectionResult, bqy bqy, int i) {
    }

    public final boolean b() {
        if (this.b) {
            return false;
        }
        if (this.a.m.g()) {
            this.b = true;
            for (brv brv : this.a.m.f) {
                synchronized (null) {
                    try {
                        brv.a = null;
                    } catch (Throwable th) {
                    }
                }
            }
            return false;
        }
        this.a.a(null);
        return true;
    }

    public final void c() {
        if (this.b) {
            this.b = false;
            this.a.a(new bse(this, this));
        }
    }

    public final brq b(brq brq) {
        try {
            this.a.m.a((bsx) brq);
            bra a = this.a.m.a(brq.b());
            if (a.b() || !this.a.g.containsKey(brq.b())) {
                brq.a(a);
                return brq;
            }
            brq.a(new Status(17));
            return brq;
        } catch (DeadObjectException e) {
            this.a.a(new bsd(this, this));
        }
    }
}
