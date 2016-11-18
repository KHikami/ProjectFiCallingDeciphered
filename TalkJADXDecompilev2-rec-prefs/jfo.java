package p000;

public class jfo {
    public float f19962a;
    public float f19963b;
    public float f19964c;
    public float f19965d;
    public float f19966e;
    public float f19967f;
    public float f19968g;
    public float f19969h;

    public /* synthetic */ Object clone() {
        return m24096a();
    }

    private jfo(jfo jfo) {
        this.f19962a = jfo.f19962a;
        this.f19963b = jfo.f19963b;
        this.f19964c = jfo.f19964c;
        this.f19965d = jfo.f19965d;
        this.f19966e = jfo.f19966e;
        this.f19967f = jfo.f19967f;
        this.f19968g = jfo.f19968g;
        this.f19969h = jfo.f19969h;
    }

    public float m24095a(float f) {
        if (f == 0.0f) {
            return this.f19962a;
        }
        if (f == 1.0f) {
            return this.f19968g;
        }
        float f2 = this.f19962a;
        f2 += (this.f19964c - f2) * f;
        float f3 = this.f19964c;
        f3 += (this.f19966e - f3) * f;
        float f4 = this.f19966e;
        f2 += (f3 - f2) * f;
        return f2 + (((f3 + (((f4 + ((this.f19968g - f4) * f)) - f3) * f)) - f2) * f);
    }

    public float m24097b(float f) {
        if (f == 0.0f) {
            return this.f19963b;
        }
        if (f == 1.0f) {
            return this.f19969h;
        }
        float f2 = this.f19963b;
        f2 += (this.f19965d - f2) * f;
        float f3 = this.f19965d;
        f3 += (this.f19967f - f3) * f;
        float f4 = this.f19967f;
        f2 += (f3 - f2) * f;
        return f2 + (((f3 + (((f4 + ((this.f19969h - f4) * f)) - f3) * f)) - f2) * f);
    }

    public float m24098c(float f) {
        float f2 = 1.0f;
        float f3 = (f - this.f19962a) / (this.f19968g - this.f19962a);
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        float f4 = 0.0f;
        float f5 = f3;
        f3 = 0.0f;
        while (i < 8) {
            f4 = m24095a(f5);
            float a = (m24095a(f5 + 1.0E-6f) - f4) / 1.0E-6f;
            if (Math.abs(f4 - f) >= 1.0E-6f) {
                if (Math.abs(a) < 1.0E-6f) {
                    break;
                }
                if (f4 < f) {
                    f3 = f5;
                } else {
                    f2 = f5;
                }
                i++;
                f5 -= (f4 - f) / a;
            } else {
                return f5;
            }
        }
        float f6 = f5;
        f5 = f2;
        int i2 = 0;
        while (Math.abs(f4 - f) > 1.0E-6f && i2 < 8) {
            float f7;
            if (f4 < f) {
                f7 = f6;
                f6 = (f6 + f5) / 2.0f;
                f3 = f7;
            } else {
                f7 = f6;
                f6 = (f6 + f3) / 2.0f;
                f5 = f7;
            }
            f4 = m24095a(f6);
            i2++;
        }
        return f6;
    }

    public jfo m24096a() {
        return new jfo(this);
    }
}
