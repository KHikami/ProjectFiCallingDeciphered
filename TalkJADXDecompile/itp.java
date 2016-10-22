import android.graphics.RectF;

public final class itp {
    private int a;
    private int b;
    private int c;
    private int d;
    private RectF e;
    private RectF f;
    private int g;
    private boolean h;

    public itp() {
        this.e = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public itp a() {
        itp itp = new itp();
        itp.a(this.a, this.b, this.c, this.d);
        itp.a(this.e);
        itp.b(this.f);
        itp.a(this.g);
        itp.a(this.h);
        return itp;
    }

    public itp a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        return this;
    }

    public itp a(int i, int i2) {
        return a(i, i2, i, i2);
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public itp a(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.e = rectF;
        return this;
    }

    public RectF f() {
        return this.e;
    }

    public itp b(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.f = rectF;
        return this;
    }

    public RectF g() {
        return this.f;
    }

    public itp a(int i) {
        this.g = i;
        return this;
    }

    public int h() {
        return this.g;
    }

    public itp a(boolean z) {
        this.h = z;
        return this;
    }

    public boolean i() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof itp)) {
            return false;
        }
        itp itp = (itp) obj;
        if (this.a == itp.a && this.b == itp.b && this.c == itp.c && this.d == itp.d && this.e.equals(itp.e) && this.f.equals(itp.f) && this.g == itp.g && this.h == itp.h) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        int i5 = this.g;
        return new StringBuilder((String.valueOf(valueOf).length() + 146) + String.valueOf(valueOf2).length()).append("VideoFormatInfo(size=").append(i).append("x").append(i2).append(",buffer=").append(i3).append("x").append(i4).append(",regionOfInterest=").append(valueOf).append(",croppedRect=").append(valueOf2).append(",rotation=").append(i5).append(",screenshare=").append(this.h).append(")").toString();
    }
}
