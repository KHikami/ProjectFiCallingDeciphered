package p000;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

public final class ajs implements ajw {
    private final String f1048a;
    private final List<String> f1049b;

    public ajs(String str, List<String> list) {
        this.f1048a = str;
        this.f1049b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajs)) {
            return false;
        }
        ajs ajs = (ajs) obj;
        if (!TextUtils.equals(this.f1048a, ajs.f1048a)) {
            return false;
        }
        if (this.f1049b == null) {
            return ajs.f1049b == null;
        } else {
            int size = this.f1049b.size();
            if (size != ajs.f1049b.size()) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (!TextUtils.equals((CharSequence) this.f1049b.get(i), (CharSequence) ajs.f1049b.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public int hashCode() {
        int hashCode;
        if (this.f1048a != null) {
            hashCode = this.f1048a.hashCode();
        } else {
            hashCode = 0;
        }
        if (this.f1049b == null) {
            return hashCode;
        }
        int i = hashCode;
        for (String str : this.f1049b) {
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
        String str = this.f1048a;
        stringBuilder.append(new StringBuilder(String.valueOf(str).length() + 24).append("android-custom: ").append(str).append(", data: ").toString());
        stringBuilder.append(this.f1049b == null ? "null" : Arrays.toString(this.f1049b.toArray()));
        return stringBuilder.toString();
    }

    public ajy mo229a() {
        return ajy.ANDROID_CUSTOM;
    }
}
