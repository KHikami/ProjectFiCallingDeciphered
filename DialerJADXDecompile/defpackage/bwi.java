package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: bwi */
public abstract class bwi {
    private int a;

    protected bwi(byte[] bArr) {
        buf.b(bArr.length == 25, (Object) "cert hash data has incorrect length");
        this.a = Arrays.hashCode(bArr);
    }

    protected static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    abstract byte[] a();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bwi)) {
            return false;
        }
        return Arrays.equals(a(), ((bwi) obj).a());
    }

    public int hashCode() {
        return this.a;
    }
}
