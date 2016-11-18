package p000;

import android.text.TextUtils;

public final class akc implements ajw {
    public final String f1092a;

    public akc(String str) {
        this.f1092a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akc)) {
            return false;
        }
        return TextUtils.equals(this.f1092a, ((akc) obj).f1092a);
    }

    public int hashCode() {
        return this.f1092a != null ? this.f1092a.hashCode() : 0;
    }

    public String toString() {
        String str = "note: ";
        String valueOf = String.valueOf(this.f1092a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public ajy mo229a() {
        return ajy.NOTE;
    }

    public String m2689b() {
        return this.f1092a;
    }
}
