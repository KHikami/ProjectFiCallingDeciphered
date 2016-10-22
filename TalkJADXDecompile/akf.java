import android.text.TextUtils;
import java.util.Arrays;

public final class akf implements ajw {
    private final String a;
    private final boolean b;
    private final byte[] c;
    private Integer d;

    public akf(String str, byte[] bArr, boolean z) {
        this.d = null;
        this.a = str;
        this.c = bArr;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akf)) {
            return false;
        }
        akf akf = (akf) obj;
        if (TextUtils.equals(this.a, akf.a) && Arrays.equals(this.c, akf.c) && this.b == akf.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        if (this.d != null) {
            return this.d.intValue();
        }
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode *= 31;
        if (this.c != null) {
            byte[] bArr = this.c;
            while (i < bArr.length) {
                hashCode += bArr[i];
                i++;
            }
        }
        hashCode = (this.b ? 1231 : 1237) + (hashCode * 31);
        this.d = Integer.valueOf(hashCode);
        return hashCode;
    }

    public String toString() {
        return String.format("format: %s: size: %d, isPrimary: %s", new Object[]{this.a, Integer.valueOf(this.c.length), Boolean.valueOf(this.b)});
    }

    public final ajy a() {
        return ajy.PHOTO;
    }
}
