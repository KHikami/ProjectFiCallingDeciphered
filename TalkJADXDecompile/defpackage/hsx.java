package defpackage;

import android.widget.ImageView;

/* renamed from: hsx */
final class hsx extends hta {
    public final String a;
    public final int b;
    final /* synthetic */ hsw c;

    public hsx(hsw hsw, ImageView imageView, String str, String str2, int i) {
        this.c = hsw;
        super(hsw);
        this.f = imageView;
        this.g = str;
        this.a = str2;
        this.b = i;
    }

    public void a() {
        hsj.g.a(this.c.c, this.g, this.a).a(new hsy(this));
    }

    public void a(hse hse) {
        this.c.a(hse.k(), hse.a(), hse.c(), hse.d(), this.b, this);
    }
}
