package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: dbp */
public abstract class dbp {
    public static final dbp a;
    public static final dbp b;

    abstract int a(int i);

    abstract int a(byte[] bArr, CharSequence charSequence);

    abstract cxn a();

    abstract void a(Appendable appendable, byte[] bArr, int i, int i2);

    abstract int b(int i);

    dbp() {
    }

    public final String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private String a(byte[] bArr, int i, int i2) {
        cob.b(0, i2 + 0, bArr.length);
        Appendable stringBuilder = new StringBuilder(a(i2));
        try {
            a(stringBuilder, bArr, 0, i2);
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    static {
        a = new dbs("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
        dbs dbs = new dbs("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));
        dbu dbu = new dbu("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
        dbu = new dbu("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
        b = new dbr("base16()", "0123456789ABCDEF");
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
