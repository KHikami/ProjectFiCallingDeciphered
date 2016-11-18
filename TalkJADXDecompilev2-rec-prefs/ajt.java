package p000;

import android.text.TextUtils;

public final class ajt implements ajw {
    private final String f1050a;

    public ajt(String str) {
        this.f1050a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajt)) {
            return false;
        }
        return TextUtils.equals(this.f1050a, ((ajt) obj).f1050a);
    }

    public int hashCode() {
        return this.f1050a != null ? this.f1050a.hashCode() : 0;
    }

    public String toString() {
        String str = "anniversary: ";
        String valueOf = String.valueOf(this.f1050a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public ajy mo229a() {
        return ajy.ANNIVERSARY;
    }
}
