package defpackage;

import android.view.TextureView;

public final class cvo {
    final ita a = new cvp(this);
    final cvq b;
    isy c;
    TextureView d;
    float e = 0.0f;
    int f = 1;
    boolean g;
    private final cvt h = new cvt(this);
    private final cvr i;
    private String j;

    public cvo(cvr cvr, cvq cvq) {
        this.i = cvr;
        this.b = cvq;
    }

    public void a(String str, int i) {
        this.j = str;
        this.i.a(this.h, str, i);
    }

    public void a(float f) {
        this.e = f;
        if (this.c != null) {
            this.c.a(f);
        }
    }

    public void a(int i) {
        this.f = i;
        if (this.c != null) {
            this.c.a(i);
        }
    }
}
