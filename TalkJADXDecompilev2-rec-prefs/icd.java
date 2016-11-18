package p000;

import android.database.ContentObserver;
import android.os.Handler;

final class icd extends ContentObserver {
    final /* synthetic */ icc f17556a;

    icd(icc icc, Handler handler) {
        this.f17556a = icc;
        super(handler);
    }

    public void onChange(boolean z) {
        synchronized (icb.class) {
            icb.f17551e.clear();
            icb.f17552f = new Object();
            if (icb.f17553g.length > 0) {
                icb.m21569b(this.f17556a.f17555a, icb.f17553g);
            }
        }
    }
}
