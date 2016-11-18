package p000;

import com.google.api.client.http.ExponentialBackOffPolicy;

public final class iuc {
    public final int f19032a;
    public final int f19033b;

    public iuc(int i, int i2) {
        this.f19032a = i;
        this.f19033b = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iuc)) {
            return false;
        }
        iuc iuc = (iuc) obj;
        if (this.f19032a == iuc.f19032a && this.f19033b == iuc.f19033b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f19032a * 32713) + this.f19033b;
    }

    public String toString() {
        int i = this.f19032a;
        return i + "x" + this.f19033b;
    }

    public static iuc m23298a(iuc iuc, int i) {
        if (iuc.f19032a * iuc.f19033b <= i) {
            return iuc;
        }
        int sqrt = (int) (Math.sqrt((((double) i) * ((double) iuc.f19032a)) / ((double) iuc.f19033b)) + ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR);
        return new iuc(sqrt, (int) ((((double) i) / ((double) sqrt)) + ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR));
    }

    public int m23300a() {
        return (this.f19032a << 16) | this.f19033b;
    }

    public static iuc m23299a(iuc iuc, iuc iuc2) {
        float f = (float) iuc.f19032a;
        float f2 = (float) iuc.f19033b;
        float f3 = (float) iuc2.f19032a;
        float f4 = (float) iuc2.f19033b;
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
        return new iuc((((int) (((float) iuc.f19032a) * f3)) + 2) & -4, (((int) (f3 * ((float) iuc.f19033b))) + 2) & -4);
    }
}
