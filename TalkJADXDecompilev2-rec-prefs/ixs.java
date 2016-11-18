package p000;

import android.app.Application;

public final class ixs implements ivy {
    private final Application f19363a;
    private final ixv f19364b;

    public ixs(Application application, ixv ixv) {
        this.f19363a = (Application) ba.m4536a((Object) application);
        this.f19364b = (ixv) ba.m4536a((Object) ixv);
    }

    public ixl mo3418a() {
        if (!ixm.m23453f()) {
            return new ixg();
        }
        ixl ixm = new ixm(this.f19363a, this.f19364b);
        ixm.m23458b();
        return ixm;
    }
}
