package defpackage;

import com.google.api.client.http.ExponentialBackOffPolicy;

public final class iuc {
    public final int a;
    public final int b;

    public iuc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iuc)) {
            return false;
        }
        iuc iuc = (iuc) obj;
        if (this.a == iuc.a && this.b == iuc.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 32713) + this.b;
    }

    public String toString() {
        int i = this.a;
        return i + "x" + this.b;
    }

    public static iuc a(iuc iuc, int i) {
        if (iuc.a * iuc.b <= i) {
            return iuc;
        }
        int sqrt = (int) (Math.sqrt((((double) i) * ((double) iuc.a)) / ((double) iuc.b)) + ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR);
        return new iuc(sqrt, (int) ((((double) i) / ((double) sqrt)) + ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR));
    }

    public int a() {
        return (this.a << 16) | this.b;
    }

    public static iuc a(iuc iuc, iuc iuc2) {
        float f = (float) iuc.a;
        float f2 = (float) iuc.b;
        float f3 = (float) iuc2.a;
        float f4 = (float) iuc2.b;
        float f5 = f / f2;
        float f6 = f3 / f4;
        if ((f5 >= 1.0f || f6 <= 1.0f) && (f5 <= 1.0f || f6 >= 1.0f)) {
            float f7 = f4;
            f4 = f3;
            f3 = f7;
        } else {
            f6 = 1.0f / f6;
        }
        if (f5 > f6) {
            f3 = f4 / f;
        } else {
            f3 /= f2;
        }
        if (((double) f3) <= 1.0d) {
            return iuc;
        }
        return new iuc((((int) (((float) iuc.a) * f3)) + 2) & -4, (((int) (f3 * ((float) iuc.b))) + 2) & -4);
    }
}
