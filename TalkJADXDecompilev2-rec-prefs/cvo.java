package p000;

import android.view.TextureView;

public final class cvo {
    final ita f9176a = new cvp(this);
    final cvq f9177b;
    isy f9178c;
    TextureView f9179d;
    float f9180e = 0.0f;
    int f9181f = 1;
    boolean f9182g;
    private final cvt f9183h = new cvt(this);
    private final cvr f9184i;
    private String f9185j;

    public cvo(cvr cvr, cvq cvq) {
        this.f9184i = cvr;
        this.f9177b = cvq;
    }

    public void m11120a(String str, int i) {
        this.f9185j = str;
        this.f9184i.m11129a(this.f9183h, str, i);
    }

    public void m11118a(float f) {
        this.f9180e = f;
        if (this.f9178c != null) {
            this.f9178c.m23145a(f);
        }
    }

    public void m11119a(int i) {
        this.f9181f = i;
        if (this.f9178c != null) {
            this.f9178c.m23146a(i);
        }
    }
}
