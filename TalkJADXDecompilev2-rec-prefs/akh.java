package p000;

import android.text.TextUtils;

public final class akh implements ajw {
    private final String f1118a;
    private final int f1119b;
    private final String f1120c;
    private final boolean f1121d;

    public akh(String str, int i, String str2, boolean z) {
        if (str.startsWith("sip:")) {
            this.f1118a = str.substring(4);
        } else {
            this.f1118a = str;
        }
        this.f1119b = i;
        this.f1120c = str2;
        this.f1121d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akh)) {
            return false;
        }
        akh akh = (akh) obj;
        if (this.f1119b == akh.f1119b && TextUtils.equals(this.f1120c, akh.f1120c) && TextUtils.equals(this.f1118a, akh.f1118a) && this.f1121d == akh.f1121d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        int i2 = this.f1119b * 31;
        if (this.f1120c != null) {
            hashCode = this.f1120c.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + i2) * 31;
        if (this.f1118a != null) {
            i = this.f1118a.hashCode();
        }
        return (this.f1121d ? 1231 : 1237) + ((hashCode + i) * 31);
    }

    public String toString() {
        String str = "sip: ";
        String valueOf = String.valueOf(this.f1118a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public ajy mo229a() {
        return ajy.SIP;
    }
}
