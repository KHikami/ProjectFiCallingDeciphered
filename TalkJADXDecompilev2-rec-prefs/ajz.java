package p000;

import android.text.TextUtils;

public final class ajz implements ajw {
    private final String f1071a;
    private final int f1072b;
    private final String f1073c;
    private final int f1074d;
    private final boolean f1075e;

    public ajz(int i, String str, String str2, int i2, boolean z) {
        this.f1072b = i;
        this.f1073c = str;
        this.f1074d = i2;
        this.f1071a = str2;
        this.f1075e = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajz)) {
            return false;
        }
        ajz ajz = (ajz) obj;
        if (this.f1074d == ajz.f1074d && this.f1072b == ajz.f1072b && TextUtils.equals(this.f1073c, ajz.f1073c) && TextUtils.equals(this.f1071a, ajz.f1071a) && this.f1075e == ajz.f1075e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        int i2 = ((this.f1074d * 31) + this.f1072b) * 31;
        if (this.f1073c != null) {
            hashCode = this.f1073c.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + i2) * 31;
        if (this.f1071a != null) {
            i = this.f1071a.hashCode();
        }
        return (this.f1075e ? 1231 : 1237) + ((hashCode + i) * 31);
    }

    public String toString() {
        return String.format("type: %d, protocol: %d, custom_protcol: %s, data: %s, isPrimary: %s", new Object[]{Integer.valueOf(this.f1074d), Integer.valueOf(this.f1072b), this.f1073c, this.f1071a, Boolean.valueOf(this.f1075e)});
    }

    public final ajy mo229a() {
        return ajy.IM;
    }

    public String m2676b() {
        return this.f1071a;
    }

    public int m2677c() {
        return this.f1072b;
    }
}
