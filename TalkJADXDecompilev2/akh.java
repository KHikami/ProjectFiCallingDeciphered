package defpackage;

import android.text.TextUtils;

public final class akh implements ajw {
    private final String a;
    private final int b;
    private final String c;
    private final boolean d;

    public akh(String str, int i, String str2, boolean z) {
        if (str.startsWith("sip:")) {
            this.a = str.substring(4);
        } else {
            this.a = str;
        }
        this.b = i;
        this.c = str2;
        this.d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akh)) {
            return false;
        }
        akh akh = (akh) obj;
        if (this.b == akh.b && TextUtils.equals(this.c, akh.c) && TextUtils.equals(this.a, akh.a) && this.d == akh.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        int i2 = this.b * 31;
        if (this.c != null) {
            hashCode = this.c.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + i2) * 31;
        if (this.a != null) {
            i = this.a.hashCode();
        }
        return (this.d ? 1231 : 1237) + ((hashCode + i) * 31);
    }

    public String toString() {
        String str = "sip: ";
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public ajy a() {
        return ajy.SIP;
    }
}
