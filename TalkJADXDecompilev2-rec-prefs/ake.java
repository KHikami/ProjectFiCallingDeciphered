package p000;

import android.text.TextUtils;

public final class ake implements ajw {
    final String f1099a;
    private final int f1100b;
    private final String f1101c;
    private boolean f1102d;

    public ake(String str, int i, String str2, boolean z) {
        this.f1099a = str;
        this.f1100b = i;
        this.f1101c = str2;
        this.f1102d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ake)) {
            return false;
        }
        ake ake = (ake) obj;
        if (this.f1100b == ake.f1100b && TextUtils.equals(this.f1099a, ake.f1099a) && TextUtils.equals(this.f1101c, ake.f1101c) && this.f1102d == ake.f1102d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        int i2 = this.f1100b * 31;
        if (this.f1099a != null) {
            hashCode = this.f1099a.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + i2) * 31;
        if (this.f1101c != null) {
            i = this.f1101c.hashCode();
        }
        return (this.f1102d ? 1231 : 1237) + ((hashCode + i) * 31);
    }

    public String toString() {
        return String.format("type: %d, data: %s, label: %s, isPrimary: %s", new Object[]{Integer.valueOf(this.f1100b), this.f1099a, this.f1101c, Boolean.valueOf(this.f1102d)});
    }

    public final ajy mo229a() {
        return ajy.PHONE;
    }

    public String m2696b() {
        return this.f1099a;
    }

    public int m2697c() {
        return this.f1100b;
    }

    public String m2698d() {
        return this.f1101c;
    }
}
