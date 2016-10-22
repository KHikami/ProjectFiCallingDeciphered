import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class bsb implements bti {
    private /* synthetic */ brz a;

    bsb(brz brz) {
        this.a = brz;
    }

    public final void a(int i, boolean z) {
        this.a.g.lock();
        try {
            if (this.a.f) {
                this.a.f = false;
                brz.a(this.a, i, z);
                return;
            }
            this.a.f = true;
            this.a.a.a(i);
            this.a.g.unlock();
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            this.a.e = ConnectionResult.a;
            brz.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.g.lock();
        try {
            this.a.e = connectionResult;
            brz.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }
}
