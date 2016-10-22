package defpackage;

import android.view.TextureView;

/* renamed from: cvw */
final class cvw {
    final /* synthetic */ cvr a;
    private final TextureView b;
    private final isy c;
    private cvt d;

    cvw(cvr cvr, String str, cvt cvt) {
        this.a = cvr;
        this.b = new TextureView(cvr.a);
        this.c = new isy(cvr.b, this.b, 0.0f, (byte) 0);
        this.c.a(str);
        this.d = cvt;
        this.d.a(this.c, this.b);
    }

    public void a(cvt cvt) {
        if (this.d != cvt) {
            this.d.a(null, null);
            this.d = cvt;
            this.d.a(this.c, this.b);
        }
    }

    public void a() {
        if (this.d != null) {
            this.d.a(null, null);
        }
        this.d = null;
        this.c.a();
    }
}
