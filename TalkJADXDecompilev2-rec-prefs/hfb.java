package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class hfb implements guk, gul {
    final /* synthetic */ hes f16798a;

    hfb(hes hes) {
        this.f16798a = hes;
    }

    public void mo1150a(int i) {
    }

    public void mo1151a(ConnectionResult connectionResult) {
        this.f16798a.f16761b.lock();
        try {
            if (this.f16798a.m19556a(connectionResult)) {
                this.f16798a.m19565f();
                this.f16798a.m19564e();
            } else {
                this.f16798a.m19558b(connectionResult);
            }
            this.f16798a.f16761b.unlock();
        } catch (Throwable th) {
            this.f16798a.f16761b.unlock();
        }
    }

    public void a_(Bundle bundle) {
        this.f16798a.f16764e.mo3042a(new hez(this.f16798a));
    }
}
