package defpackage;

/* renamed from: jfo */
public class jfo {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;

    public /* synthetic */ Object clone() {
        return a();
    }

    private jfo(jfo jfo) {
        this.a = jfo.a;
        this.b = jfo.b;
        this.c = jfo.c;
        this.d = jfo.d;
        this.e = jfo.e;
        this.f = jfo.f;
        this.g = jfo.g;
        this.h = jfo.h;
    }

    public float a(float f) {
        if (f == 0.0f) {
            return this.a;
        }
        if (f == 1.0f) {
            return this.g;
        }
        float f2 = this.a;
        f2 += (this.c - f2) * f;
        float f3 = this.c;
        f3 += (this.e - f3) * f;
        float f4 = this.e;
        f2 += (f3 - f2) * f;
        return f2 + (((f3 + (((f4 + ((this.g - f4) * f)) - f3) * f)) - f2) * f);
    }

    public float b(float f) {
        if (f == 0.0f) {
            return this.b;
        }
        if (f == 1.0f) {
            return this.h;
        }
        float f2 = this.b;
        f2 += (this.d - f2) * f;
        float f3 = this.d;
        f3 += (this.f - f3) * f;
        float f4 = this.f;
        f2 += (f3 - f2) * f;
        return f2 + (((f3 + (((f4 + ((this.h - f4) * f)) - f3) * f)) - f2) * f);
    }

    public float c(float f) {
        float f2 = 1.0f;
        float f3 = (f - this.a) / (this.g - this.a);
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
            f4 = a(f5);
            float a = (a(f5 + 1.0E-6f) - f4) / 1.0E-6f;
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
            f4 = a(f6);
            i2++;
        }
        return f6;
    }

    public jfo a() {
        return new jfo(this);
    }
}
