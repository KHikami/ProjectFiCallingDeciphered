package defpackage;

import android.text.TextUtils;

/* renamed from: akj */
public final class akj implements ajw {
    private final String a;

    public akj(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akj)) {
            return false;
        }
        return TextUtils.equals(this.a, ((akj) obj).a);
    }

    public int hashCode() {
        return this.a != null ? this.a.hashCode() : 0;
    }

    public String toString() {
        String str = "website: ";
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public ajy a() {
        return ajy.WEBSITE;
    }

    public String b() {
        return this.a;
    }
}
