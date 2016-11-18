package p000;

import java.lang.ref.WeakReference;

final class hfh extends hft {
    private WeakReference<hfe> f16826a;

    hfh(hfe hfe) {
        this.f16826a = new WeakReference(hfe);
    }

    public void mo2478a() {
        hfe hfe = (hfe) this.f16826a.get();
        if (hfe != null) {
            hfe.m19596a(hfe);
        }
    }
}
