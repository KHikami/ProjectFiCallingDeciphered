package defpackage;

import android.text.TextUtils;

/* renamed from: ajv */
public final class ajv implements ajw {
    final String a;
    private final int b;
    private final String c;
    private final boolean d;

    public ajv(String str, int i, String str2, boolean z) {
        this.b = i;
        this.a = str;
        this.c = str2;
        this.d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajv)) {
            return false;
        }
        ajv ajv = (ajv) obj;
        if (this.b == ajv.b && TextUtils.equals(this.a, ajv.a) && TextUtils.equals(this.c, ajv.c) && this.d == ajv.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        int i2 = this.b * 31;
        if (this.a != null) {
            hashCode = this.a.hashCode();
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
        return String.format("type: %d, data: %s, label: %s, isPrimary: %s", new Object[]{Integer.valueOf(this.b), this.a, this.c, Boolean.valueOf(this.d)});
    }

    public final ajy a() {
        return ajy.EMAIL;
    }

    public String b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }
}
