package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: csp */
final class csp extends ContentObserver {
    private /* synthetic */ cso a;

    csp(cso cso, Handler handler) {
        this.a = cso;
        super(handler);
    }

    public final void onChange(boolean z) {
        synchronized (csn.class) {
            csn.b.clear();
            csn.c = new Object();
            if (csn.d.length > 0) {
                csn.b(this.a.a, csn.d);
            }
        }
    }
}
