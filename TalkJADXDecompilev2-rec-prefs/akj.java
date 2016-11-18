package p000;

import android.text.TextUtils;

public final class akj implements ajw {
    private final String f1125a;

    public akj(String str) {
        this.f1125a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akj)) {
            return false;
        }
        return TextUtils.equals(this.f1125a, ((akj) obj).f1125a);
    }

    public int hashCode() {
        return this.f1125a != null ? this.f1125a.hashCode() : 0;
    }

    public String toString() {
        String str = "website: ";
        String valueOf = String.valueOf(this.f1125a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public ajy mo229a() {
        return ajy.WEBSITE;
    }

    public String m2719b() {
        return this.f1125a;
    }
}
