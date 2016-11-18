package p000;

import android.view.TextureView;

final class cvw {
    final /* synthetic */ cvr f9203a;
    private final TextureView f9204b;
    private final isy f9205c;
    private cvt f9206d;

    cvw(cvr cvr, String str, cvt cvt) {
        this.f9203a = cvr;
        this.f9204b = new TextureView(cvr.f9187a);
        this.f9205c = new isy(cvr.f9188b, this.f9204b, 0.0f, (byte) 0);
        this.f9205c.m23148a(str);
        this.f9206d = cvt;
        this.f9206d.m11139a(this.f9205c, this.f9204b);
    }

    public void m11141a(cvt cvt) {
        if (this.f9206d != cvt) {
            this.f9206d.m11139a(null, null);
            this.f9206d = cvt;
            this.f9206d.m11139a(this.f9205c, this.f9204b);
        }
    }

    public void m11140a() {
        if (this.f9206d != null) {
            this.f9206d.m11139a(null, null);
        }
        this.f9206d = null;
        this.f9205c.m23144a();
    }
}
