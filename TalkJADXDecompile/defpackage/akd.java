package defpackage;

import android.text.TextUtils;

/* renamed from: akd */
public final class akd implements ajw {
    String a;
    String b;
    String c;
    boolean d;
    private final String e;
    private final int f;

    public akd(String str, String str2, String str3, String str4, int i, boolean z) {
        this.f = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.e = str4;
        this.d = z;
    }

    public String b() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            stringBuilder.append(this.a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.b);
        }
        if (!TextUtils.isEmpty(this.c)) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.c);
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
        if (this.f == akd.f && TextUtils.equals(this.a, akd.a) && TextUtils.equals(this.b, akd.b) && TextUtils.equals(this.c, akd.c) && this.d == akd.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        int i2 = this.f * 31;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        } else {
            hashCode = 0;
        }
        i2 = (hashCode + i2) * 31;
        if (this.b != null) {
            hashCode = this.b.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + i2) * 31;
        if (this.c != null) {
            i = this.c.hashCode();
        }
        return (this.d ? 1231 : 1237) + ((hashCode + i) * 31);
    }

    public String toString() {
        return String.format("type: %d, organization: %s, department: %s, title: %s, isPrimary: %s", new Object[]{Integer.valueOf(this.f), this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    public final ajy a() {
        return ajy.ORGANIZATION;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public int e() {
        return this.f;
    }
}
