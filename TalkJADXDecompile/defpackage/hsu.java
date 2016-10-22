package defpackage;

import android.widget.ImageView;

/* renamed from: hsu */
final class hsu extends hta {
    public final int a;
    public final String b;
    public final hwn c;
    final /* synthetic */ hst d;

    public hsu(hst hst, ImageView imageView, hwn hwn, int i) {
        String str = null;
        this.d = hst;
        super(hst);
        boolean a = gwb.a(hwn);
        this.f = imageView;
        this.c = hwn;
        this.g = a ? hwn.a() : null;
        if (a) {
            str = hwn.d();
        }
        this.b = str;
        this.a = i;
    }

    public void a() {
        hsj.g.a(this.d.c, this.g, this.b, this.a, 1).a(new hsv(this));
    }

    public void a(hse hse) {
        super.a(hse.k(), hse.a(), (hta) this, 0);
    }
}
