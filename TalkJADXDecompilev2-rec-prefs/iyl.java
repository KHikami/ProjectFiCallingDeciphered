package p000;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

final class iyl {
    private final AtomicBoolean f19399a = new AtomicBoolean(false);
    private final AtomicBoolean f19400b = new AtomicBoolean(false);
    private final List<iyk> f19401c;

    iyl(List<iyk> list) {
        ba.m4536a((Object) list);
        this.f19401c = new ArrayList(list);
    }

    void m23489a(Application application) {
        iwj.m23388a(application).m23389a(new iwa(this, application));
    }

    void m23488a() {
        if (!this.f19400b.getAndSet(true)) {
            for (iyk d : this.f19401c) {
                d.mo3411d();
            }
        }
    }

    void m23490b() {
        if (!this.f19399a.getAndSet(true)) {
            for (iyk c : this.f19401c) {
                c.mo3410c();
            }
        }
    }
}
