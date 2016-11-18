package defpackage;

import android.text.TextUtils;

public final class aju implements ajw {
    public final String a;

    public aju(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aju)) {
            return false;
        }
        return TextUtils.equals(this.a, ((aju) obj).a);
    }

    public int hashCode() {
        return this.a != null ? this.a.hashCode() : 0;
    }

    public String toString() {
        String str = "birthday: ";
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public ajy a() {
        return ajy.BIRTHDAY;
    }
}
