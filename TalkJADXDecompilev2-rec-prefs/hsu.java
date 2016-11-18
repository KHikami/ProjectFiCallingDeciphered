package p000;

import android.widget.ImageView;

final class hsu extends hta {
    public final int f17220a;
    public final String f17221b;
    public final hwn f17222c;
    final /* synthetic */ hst f17223d;

    public hsu(hst hst, ImageView imageView, hwn hwn, int i) {
        String str = null;
        this.f17223d = hst;
        super(hst);
        boolean a = gwb.m1927a(hwn);
        this.f = imageView;
        this.f17222c = hwn;
        this.g = a ? hwn.mo1778a() : null;
        if (a) {
            str = hwn.mo1781d();
        }
        this.f17221b = str;
        this.f17220a = i;
    }

    public void mo2945a() {
        hsj.f17170g.m20763a(this.f17223d.c, this.g, this.f17221b, this.f17220a, 1).mo2419a(new hsv(this));
    }

    public void m20803a(hse hse) {
        super.m20794a(hse.mo1279k(), hse.mo2556a(), (hta) this, 0);
    }
}
