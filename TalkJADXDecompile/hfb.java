import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class hfb implements guk, gul {
    final /* synthetic */ hes a;

    hfb(hes hes) {
        this.a = hes;
    }

    public void a(int i) {
    }

    public void a(ConnectionResult connectionResult) {
        this.a.b.lock();
        try {
            if (this.a.a(connectionResult)) {
                this.a.f();
                this.a.e();
            } else {
                this.a.b(connectionResult);
            }
            this.a.b.unlock();
        } catch (Throwable th) {
            this.a.b.unlock();
        }
    }

    public void a_(Bundle bundle) {
        this.a.e.a(new hez(this.a));
    }
}
