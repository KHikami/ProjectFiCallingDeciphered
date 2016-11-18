package p000;

import java.io.IOException;

public abstract class mqq {
    public static final mqq f28122a = new mqt("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
    public static final mqq f28123b = new mqt("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));
    private static final mqq f28124c = new mqv("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
    private static final mqq f28125d = new mqv("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
    private static final mqq f28126e = new mqs("base16()", "0123456789ABCDEF");

    abstract int mo3915a(int i);

    abstract int mo3916a(byte[] bArr, CharSequence charSequence);

    abstract mdz mo3917a();

    abstract void mo3918a(Appendable appendable, byte[] bArr, int i, int i2);

    abstract int mo3919b(int i);

    mqq() {
    }

    public String m32721a(byte[] bArr) {
        return m32718a(bArr, 0, bArr.length);
    }

    private String m32718a(byte[] bArr, int i, int i2) {
        bm.m6127a(0, i2 + 0, bArr.length);
        Appendable stringBuilder = new StringBuilder(mo3915a(i2));
        try {
            mo3918a(stringBuilder, bArr, 0, i2);
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] m32724a(CharSequence charSequence) {
        try {
            CharSequence a = mo3917a().mo3739a(charSequence);
            Object obj = new byte[mo3919b(a.length())];
            int a2 = mo3916a(obj, a);
            if (a2 == obj.length) {
                return obj;
            }
            Object obj2 = new byte[a2];
            System.arraycopy(obj, 0, obj2, 0, a2);
            return obj2;
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }
}
