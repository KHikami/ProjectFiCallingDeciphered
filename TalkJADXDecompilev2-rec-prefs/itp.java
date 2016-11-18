package p000;

import android.graphics.RectF;

public final class itp {
    private int f18992a;
    private int f18993b;
    private int f18994c;
    private int f18995d;
    private RectF f18996e = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    private RectF f18997f = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    private int f18998g;
    private boolean f18999h;

    public itp m23257a() {
        itp itp = new itp();
        itp.m23260a(this.f18992a, this.f18993b, this.f18994c, this.f18995d);
        itp.m23261a(this.f18996e);
        itp.m23264b(this.f18997f);
        itp.m23258a(this.f18998g);
        itp.m23262a(this.f18999h);
        return itp;
    }

    public itp m23260a(int i, int i2, int i3, int i4) {
        this.f18992a = i;
        this.f18993b = i2;
        this.f18994c = i3;
        this.f18995d = i4;
        return this;
    }

    public itp m23259a(int i, int i2) {
        return m23260a(i, i2, i, i2);
    }

    public int m23263b() {
        return this.f18992a;
    }

    public int m23265c() {
        return this.f18993b;
    }

    public int m23266d() {
        return this.f18994c;
    }

    public int m23267e() {
        return this.f18995d;
    }

    public itp m23261a(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.f18996e = rectF;
        return this;
    }

    public RectF m23268f() {
        return this.f18996e;
    }

    public itp m23264b(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.f18997f = rectF;
        return this;
    }

    public RectF m23269g() {
        return this.f18997f;
    }

    public itp m23258a(int i) {
        this.f18998g = i;
        return this;
    }

    public int m23270h() {
        return this.f18998g;
    }

    public itp m23262a(boolean z) {
        this.f18999h = z;
        return this;
    }

    public boolean m23271i() {
        return this.f18999h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof itp)) {
            return false;
        }
        itp itp = (itp) obj;
        if (this.f18992a == itp.f18992a && this.f18993b == itp.f18993b && this.f18994c == itp.f18994c && this.f18995d == itp.f18995d && this.f18996e.equals(itp.f18996e) && this.f18997f.equals(itp.f18997f) && this.f18998g == itp.f18998g && this.f18999h == itp.f18999h) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i = this.f18992a;
        int i2 = this.f18993b;
        int i3 = this.f18994c;
        int i4 = this.f18995d;
        String valueOf = String.valueOf(this.f18996e);
        String valueOf2 = String.valueOf(this.f18997f);
        int i5 = this.f18998g;
        return new StringBuilder((String.valueOf(valueOf).length() + 146) + String.valueOf(valueOf2).length()).append("VideoFormatInfo(size=").append(i).append("x").append(i2).append(",buffer=").append(i3).append("x").append(i4).append(",regionOfInterest=").append(valueOf).append(",croppedRect=").append(valueOf2).append(",rotation=").append(i5).append(",screenshare=").append(this.f18999h).append(")").toString();
    }
}
