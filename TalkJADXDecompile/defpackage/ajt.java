package defpackage;

import android.text.TextUtils;

/* renamed from: ajt */
public final class ajt implements ajw {
    private final String a;

    public ajt(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajt)) {
            return false;
        }
        return TextUtils.equals(this.a, ((ajt) obj).a);
    }

    public int hashCode() {
        return this.a != null ? this.a.hashCode() : 0;
    }

    public String toString() {
        String str = "anniversary: ";
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public ajy a() {
        return ajy.ANNIVERSARY;
    }
}
