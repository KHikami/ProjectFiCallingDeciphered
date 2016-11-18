package p000;

import android.text.TextUtils;

public final class aju implements ajw {
    public final String f1051a;

    public aju(String str) {
        this.f1051a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aju)) {
            return false;
        }
        return TextUtils.equals(this.f1051a, ((aju) obj).f1051a);
    }

    public int hashCode() {
        return this.f1051a != null ? this.f1051a.hashCode() : 0;
    }

    public String toString() {
        String str = "birthday: ";
        String valueOf = String.valueOf(this.f1051a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public ajy mo229a() {
        return ajy.BIRTHDAY;
    }
}
