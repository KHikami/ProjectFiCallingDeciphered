package defpackage;

import java.util.BitSet;
import java.util.Locale;

public abstract class olf<T> {
    private static final BitSet b;
    public final String a = olf.a(this.c.toLowerCase(Locale.ROOT)).intern();
    private final String c;
    private final byte[] d = this.a.getBytes(mes.a);

    abstract T a(byte[] bArr);

    abstract byte[] a(T t);

    public static <T> olf<T> a(String str, olc<T> olc_T) {
        return new olb(str, olc_T);
    }

    private static String a(String str) {
        boolean z;
        int i = 0;
        bm.a(str, "name");
        if (str.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        bm.a(z, "token must have at least 1 tchar");
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ':' || i != 0) {
                bm.a(b.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
            }
            i++;
        }
        return str;
    }

    olf(String str) {
        this.c = (String) bm.a(str, "name");
    }

    byte[] a() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((olf) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String str = this.a;
        return new StringBuilder(String.valueOf(str).length() + 12).append("Key{name='").append(str).append("'}").toString();
    }

    static {
        int i;
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (i = 48; i <= 57; i = (char) (i + 1)) {
            bitSet.set(i);
        }
        for (i = 97; i <= 122; i = (char) (i + 1)) {
            bitSet.set(i);
        }
        b = bitSet;
    }
}
