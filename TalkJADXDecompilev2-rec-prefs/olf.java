package p000;

import java.util.BitSet;
import java.util.Locale;

public abstract class olf<T> {
    private static final BitSet f33146b;
    public final String f33147a = olf.m38662a(this.f33148c.toLowerCase(Locale.ROOT)).intern();
    private final String f33148c;
    private final byte[] f33149d = this.f33147a.getBytes(mes.a);

    abstract T mo4167a(byte[] bArr);

    abstract byte[] mo4168a(T t);

    public static <T> olf<T> m38663a(String str, olc<T> olc_T) {
        return new olb(str, olc_T);
    }

    private static String m38662a(String str) {
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
                bm.a(f33146b.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
            }
            i++;
        }
        return str;
    }

    olf(String str) {
        this.f33148c = (String) bm.a(str, "name");
    }

    byte[] m38665a() {
        return this.f33149d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f33147a.equals(((olf) obj).f33147a);
    }

    public int hashCode() {
        return this.f33147a.hashCode();
    }

    public String toString() {
        String str = this.f33147a;
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
        f33146b = bitSet;
    }
}
