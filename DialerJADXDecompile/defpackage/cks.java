package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: cks */
final class cks extends ContentObserver {
    private /* synthetic */ ckr a;

    cks(ckr ckr, Handler handler) {
        this.a = ckr;
        super(handler);
    }

    public final void onChange(boolean z) {
        synchronized (ckq.class) {
            ckq.d.clear();
            ckq.g = new Object();
            if (ckq.e.length > 0) {
                ckq.a(this.a.a, ckq.e);
            }
        }
    }
}
