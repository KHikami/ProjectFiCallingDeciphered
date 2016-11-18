package p000;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

final class heu implements gvu {
    final int f16782a;
    private final WeakReference<hes> f16783b;
    private final gtz<?> f16784c;

    public heu(hes hes, gtz<?> gtz_, int i) {
        this.f16783b = new WeakReference(hes);
        this.f16784c = gtz_;
        this.f16782a = i;
    }

    public void mo2352a(ConnectionResult connectionResult) {
        boolean z = false;
        hes hes = (hes) this.f16783b.get();
        if (hes != null) {
            if (Looper.myLooper() == hes.f16760a.f16835i.mo2507a()) {
                z = true;
            }
            gwb.m1886a(z, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            hes.f16761b.lock();
            try {
                if (hes.m19561b(0)) {
                    if (!connectionResult.m9653b()) {
                        hes.m19559b(connectionResult, this.f16784c, this.f16782a);
                    }
                    if (hes.m19563d()) {
                        hes.m19564e();
                    }
                    hes.f16761b.unlock();
                }
            } finally {
                hes.f16761b.unlock();
            }
        }
    }
}
