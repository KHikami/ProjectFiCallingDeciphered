package defpackage;

import android.text.TextUtils;

/* renamed from: ajz */
public final class ajz implements ajw {
    private final String a;
    private final int b;
    private final String c;
    private final int d;
    private final boolean e;

    public ajz(int i, String str, String str2, int i2, boolean z) {
        this.b = i;
        this.c = str;
        this.d = i2;
        this.a = str2;
        this.e = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajz)) {
            return false;
        }
        ajz ajz = (ajz) obj;
        if (this.d == ajz.d && this.b == ajz.b && TextUtils.equals(this.c, ajz.c) && TextUtils.equals(this.a, ajz.a) && this.e == ajz.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        int i2 = ((this.d * 31) + this.b) * 31;
        if (this.c != null) {
            hashCode = this.c.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + i2) * 31;
        if (this.a != null) {
            i = this.a.hashCode();
        }
        return (this.e ? 1231 : 1237) + ((hashCode + i) * 31);
    }

    public String toString() {
        return String.format("type: %d, protocol: %d, custom_protcol: %s, data: %s, isPrimary: %s", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.b), this.c, this.a, Boolean.valueOf(this.e)});
    }

    public final ajy a() {
        return ajy.IM;
    }

    public String b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }
}
