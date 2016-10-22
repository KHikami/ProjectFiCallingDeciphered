package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: ajs */
public final class ajs implements ajw {
    private final String a;
    private final List<String> b;

    public ajs(String str, List<String> list) {
        this.a = str;
        this.b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajs)) {
            return false;
        }
        ajs ajs = (ajs) obj;
        if (!TextUtils.equals(this.a, ajs.a)) {
            return false;
        }
        if (this.b == null) {
            return ajs.b == null;
        } else {
            int size = this.b.size();
            if (size != ajs.b.size()) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (!TextUtils.equals((CharSequence) this.b.get(i), (CharSequence) ajs.b.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public int hashCode() {
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        } else {
            hashCode = 0;
        }
        if (this.b == null) {
            return hashCode;
        }
        int i = hashCode;
        for (String str : this.b) {
            i *= 31;
            if (str != null) {
                hashCode = str.hashCode();
            } else {
                hashCode = 0;
            }
            i = hashCode + i;
        }
        return i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = this.a;
        stringBuilder.append(new StringBuilder(String.valueOf(str).length() + 24).append("android-custom: ").append(str).append(", data: ").toString());
        stringBuilder.append(this.b == null ? "null" : Arrays.toString(this.b.toArray()));
        return stringBuilder.toString();
    }

    public ajy a() {
        return ajy.ANDROID_CUSTOM;
    }
}
