import java.util.BitSet;
import java.util.Locale;

/* compiled from: PG */
public abstract class dha {
    private static final BitSet c;
    public final String a;
    public final byte[] b;
    private final String d;

    abstract Object a(byte[] bArr);

    abstract byte[] a(Object obj);

    public static dha a(String str, dgx dgx) {
        return new dgw(str, dgx);
    }

    private static String a(String str) {
        boolean z;
        int i = 0;
        cob.i((Object) str);
        if (str.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        cob.a(z, (Object) "token must have at least 1 tchar");
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ':' || i != 0) {
                cob.a(c.get(charAt), "Invalid character '%s' in key name '%s'", charAt, (Object) str);
            }
            i++;
        }
        return str;
    }

    dha(String str) {
        this.d = (String) cob.i((Object) str);
        this.a = a(this.d.toLowerCase(Locale.ROOT)).intern();
        this.b = this.a.getBytes(cyg.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((dha) obj).a);
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
        c = bitSet;
    }
}
