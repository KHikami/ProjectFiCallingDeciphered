package p000;

import android.app.Activity;
import android.app.Application;
import java.util.concurrent.Future;

final class ixi implements iwh, iyk {
    final Application f19335a;
    final ixb f19336b;
    private final iwj f19337c;

    ixi(Application application, izw izw) {
        this.f19335a = application;
        this.f19337c = iwj.m23388a(application);
        this.f19336b = new ixb(izw, ixe.m23428b(application), ixd.f19323a, Integer.MAX_VALUE);
    }

    public void mo3410c() {
        this.f19337c.m23389a((ivz) this);
    }

    public void mo3411d() {
    }

    public void mo3413a(Activity activity) {
        this.f19337c.m23390b(this);
        m23441a();
    }

    private Future<?> m23441a() {
        ixx ixx = ixx.f19383c;
        return ixx.m23473b().submit(new ixj(this));
    }
}
