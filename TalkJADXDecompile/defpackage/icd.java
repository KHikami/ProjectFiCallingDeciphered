package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: icd */
final class icd extends ContentObserver {
    final /* synthetic */ icc a;

    icd(icc icc, Handler handler) {
        this.a = icc;
        super(handler);
    }

    public void onChange(boolean z) {
        synchronized (icb.class) {
            icb.e.clear();
            icb.f = new Object();
            if (icb.g.length > 0) {
                icb.b(this.a.a, icb.g);
            }
        }
    }
}
