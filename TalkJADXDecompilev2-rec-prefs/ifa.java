package p000;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

public final class ifa implements iez {
    volatile Handler f17625a;
    final Runnable f17626b = new ifd(this);
    private boolean f17627c;
    private final idx f17628d;
    private final idc f17629e;
    private final iee<ied> f17630f = new ife(this);

    ifa(Context context, idx idx, idd idd) {
        this.f17628d = idx;
        this.f17628d.mo3166a(new ifb(this));
        this.f17628d.mo3167a(new ifc(this));
        this.f17629e = idd.mo3145a(context, "UNKNOWN", null);
    }

    void m21684a() {
        synchronized (this.f17628d) {
            if (this.f17627c) {
                this.f17629e.mo3147a(this.f17628d, 5000, TimeUnit.MILLISECONDS);
                this.f17628d.mo3168b();
                this.f17627c = false;
            }
        }
    }
}
