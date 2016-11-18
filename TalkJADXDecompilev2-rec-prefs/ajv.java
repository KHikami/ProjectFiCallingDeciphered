package p000;

import android.text.TextUtils;

public final class ajv implements ajw {
    final String f1052a;
    private final int f1053b;
    private final String f1054c;
    private final boolean f1055d;

    public ajv(String str, int i, String str2, boolean z) {
        this.f1053b = i;
        this.f1052a = str;
        this.f1054c = str2;
        this.f1055d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajv)) {
            return false;
        }
        ajv ajv = (ajv) obj;
        if (this.f1053b == ajv.f1053b && TextUtils.equals(this.f1052a, ajv.f1052a) && TextUtils.equals(this.f1054c, ajv.f1054c) && this.f1055d == ajv.f1055d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        int i2 = this.f1053b * 31;
        if (this.f1052a != null) {
            hashCode = this.f1052a.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + i2) * 31;
        if (this.f1054c != null) {
            i = this.f1054c.hashCode();
        }
        return (this.f1055d ? 1231 : 1237) + ((hashCode + i) * 31);
    }

    public String toString() {
        return String.format("type: %d, data: %s, label: %s, isPrimary: %s", new Object[]{Integer.valueOf(this.f1053b), this.f1052a, this.f1054c, Boolean.valueOf(this.f1055d)});
    }

    public final ajy mo229a() {
        return ajy.EMAIL;
    }

    public String m2667b() {
        return this.f1052a;
    }

    public int m2668c() {
        return this.f1053b;
    }

    public String m2669d() {
        return this.f1054c;
    }
}
