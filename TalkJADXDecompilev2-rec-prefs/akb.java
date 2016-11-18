package p000;

import android.text.TextUtils;

public final class akb implements ajw {
    private final String f1091a;

    public akb(String str) {
        this.f1091a = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof akb)) {
            return false;
        }
        return TextUtils.equals(this.f1091a, ((akb) obj).f1091a);
    }

    public int hashCode() {
        return this.f1091a != null ? this.f1091a.hashCode() : 0;
    }

    public String toString() {
        String str = "nickname: ";
        String valueOf = String.valueOf(this.f1091a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public ajy mo229a() {
        return ajy.NICKNAME;
    }
}
