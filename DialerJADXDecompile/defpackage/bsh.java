package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* renamed from: bsh */
final class bsh implements brh {
    private final WeakReference a;
    private final bqy b;
    private final int c;

    public bsh(bsf bsf, bqy bqy, int i) {
        this.a = new WeakReference(bsf);
        this.b = bqy;
        this.c = i;
    }

    public final void a(ConnectionResult connectionResult) {
        boolean z = false;
        bsf bsf = (bsf) this.a.get();
        if (bsf != null) {
            if (Looper.myLooper() == bsf.a.m.b) {
                z = true;
            }
            buf.a(z, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            bsf.b.lock();
            try {
                if (bsf.b(0)) {
                    if (!connectionResult.b()) {
                        bsf.b(connectionResult, this.b, this.c);
                    }
                    if (bsf.d()) {
                        bsf.e();
                    }
                    bsf.b.unlock();
                }
            } finally {
                bsf.b.unlock();
            }
        }
    }
}
