package defpackage;

import android.text.TextUtils;

/* renamed from: akb */
public final class akb implements ajw {
    private final String a;

    public akb(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof akb)) {
            return false;
        }
        return TextUtils.equals(this.a, ((akb) obj).a);
    }

    public int hashCode() {
        return this.a != null ? this.a.hashCode() : 0;
    }

    public String toString() {
        String str = "nickname: ";
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public ajy a() {
        return ajy.NICKNAME;
    }
}
