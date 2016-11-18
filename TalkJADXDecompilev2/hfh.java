package defpackage;

import java.lang.ref.WeakReference;

final class hfh extends hft {
    private WeakReference<hfe> a;

    hfh(hfe hfe) {
        this.a = new WeakReference(hfe);
    }

    public void a() {
        hfe hfe = (hfe) this.a.get();
        if (hfe != null) {
            hfe.a(hfe);
        }
    }
}
