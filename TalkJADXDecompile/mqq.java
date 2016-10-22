import java.io.IOException;

public abstract class mqq {
    public static final mqq a;
    public static final mqq b;
    private static final mqq c;
    private static final mqq d;
    private static final mqq e;

    abstract int a(int i);

    abstract int a(byte[] bArr, CharSequence charSequence);

    abstract mdz a();

    abstract void a(Appendable appendable, byte[] bArr, int i, int i2);

    abstract int b(int i);

    mqq() {
    }

    public String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private String a(byte[] bArr, int i, int i2) {
        bm.a(0, i2 + 0, bArr.length);
        Appendable stringBuilder = new StringBuilder(a(i2));
        try {
            a(stringBuilder, bArr, 0, i2);
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    static {
        a = new mqt("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
        b = new mqt("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));
        c = new mqv("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
        d = new mqv("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
        e = new mqs("base16()", "0123456789ABCDEF");
    }

    public final byte[] a(CharSequence charSequence) {
        try {
            CharSequence a = a().a(charSequence);
            Object obj = new byte[b(a.length())];
            int a2 = a(obj, a);
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
