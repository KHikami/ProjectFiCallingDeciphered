package p000;

import android.text.TextUtils;

public final class akd implements ajw {
    String f1093a;
    String f1094b;
    String f1095c;
    boolean f1096d;
    private final String f1097e;
    private final int f1098f;

    public akd(String str, String str2, String str3, String str4, int i, boolean z) {
        this.f1098f = i;
        this.f1093a = str;
        this.f1094b = str2;
        this.f1095c = str3;
        this.f1097e = str4;
        this.f1096d = z;
    }

    public String m2691b() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(this.f1093a)) {
            stringBuilder.append(this.f1093a);
        }
        if (!TextUtils.isEmpty(this.f1094b)) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.f1094b);
        }
        if (!TextUtils.isEmpty(this.f1095c)) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.f1095c);
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akd)) {
            return false;
        }
        akd akd = (akd) obj;
        if (this.f1098f == akd.f1098f && TextUtils.equals(this.f1093a, akd.f1093a) && TextUtils.equals(this.f1094b, akd.f1094b) && TextUtils.equals(this.f1095c, akd.f1095c) && this.f1096d == akd.f1096d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        int i2 = this.f1098f * 31;
        if (this.f1093a != null) {
            hashCode = this.f1093a.hashCode();
        } else {
            hashCode = 0;
        }
        i2 = (hashCode + i2) * 31;
        if (this.f1094b != null) {
            hashCode = this.f1094b.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + i2) * 31;
        if (this.f1095c != null) {
            i = this.f1095c.hashCode();
        }
        return (this.f1096d ? 1231 : 1237) + ((hashCode + i) * 31);
    }

    public String toString() {
        return String.format("type: %d, organization: %s, department: %s, title: %s, isPrimary: %s", new Object[]{Integer.valueOf(this.f1098f), this.f1093a, this.f1094b, this.f1095c, Boolean.valueOf(this.f1096d)});
    }

    public final ajy mo229a() {
        return ajy.ORGANIZATION;
    }

    public String m2692c() {
        return this.f1093a;
    }

    public String m2693d() {
        return this.f1095c;
    }

    public int m2694e() {
        return this.f1098f;
    }
}
