package p000;

import android.text.TextUtils;
import java.util.Arrays;

public final class akf implements ajw {
    private final String f1103a;
    private final boolean f1104b;
    private final byte[] f1105c;
    private Integer f1106d = null;

    public akf(String str, byte[] bArr, boolean z) {
        this.f1103a = str;
        this.f1105c = bArr;
        this.f1104b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akf)) {
            return false;
        }
        akf akf = (akf) obj;
        if (TextUtils.equals(this.f1103a, akf.f1103a) && Arrays.equals(this.f1105c, akf.f1105c) && this.f1104b == akf.f1104b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        if (this.f1106d != null) {
            return this.f1106d.intValue();
        }
        int hashCode;
        if (this.f1103a != null) {
            hashCode = this.f1103a.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode *= 31;
        if (this.f1105c != null) {
            byte[] bArr = this.f1105c;
            while (i < bArr.length) {
                hashCode += bArr[i];
                i++;
            }
        }
        hashCode = (this.f1104b ? 1231 : 1237) + (hashCode * 31);
        this.f1106d = Integer.valueOf(hashCode);
        return hashCode;
    }

    public String toString() {
        return String.format("format: %s: size: %d, isPrimary: %s", new Object[]{this.f1103a, Integer.valueOf(this.f1105c.length), Boolean.valueOf(this.f1104b)});
    }

    public final ajy mo229a() {
        return ajy.PHOTO;
    }
}
