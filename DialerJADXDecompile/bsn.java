import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class bsn implements brf, brg {
    private /* synthetic */ bsf a;

    bsn(bsf bsf) {
        this.a = bsf;
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
        this.a.e.a(new bsl(this.a));
    }

    public final void a(ConnectionResult connectionResult) {
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
}
