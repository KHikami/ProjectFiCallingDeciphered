package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* renamed from: heu */
final class heu implements gvu {
    final int a;
    private final WeakReference<hes> b;
    private final gtz<?> c;

    public heu(hes hes, gtz<?> gtz_, int i) {
        this.b = new WeakReference(hes);
        this.c = gtz_;
        this.a = i;
    }

    public void a(ConnectionResult connectionResult) {
        boolean z = false;
        hes hes = (hes) this.b.get();
        if (hes != null) {
            if (Looper.myLooper() == hes.a.i.a()) {
                z = true;
            }
            gwb.a(z, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            hes.b.lock();
            try {
                if (hes.b(0)) {
                    if (!connectionResult.b()) {
                        hes.b(connectionResult, this.c, this.a);
                    }
                    if (hes.d()) {
                        hes.e();
                    }
                    hes.b.unlock();
                }
            } finally {
                hes.b.unlock();
            }
        }
    }
}
