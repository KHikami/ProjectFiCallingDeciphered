import android.view.TextureView;

public final class cvo {
    final ita a;
    final cvq b;
    isy c;
    TextureView d;
    float e;
    int f;
    boolean g;
    private final cvt h;
    private final cvr i;
    private String j;

    public cvo(cvr cvr, cvq cvq) {
        this.a = new cvp(this);
        this.h = new cvt(this);
        this.e = 0.0f;
        this.f = 1;
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
