import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public final class jjm {
    private static final Charset a;
    private static final int[] b;
    private static final SimpleDateFormat j;
    private final short c;
    private final short d;
    private boolean e;
    private int f;
    private int g;
    private Object h;
    private int i;

    static {
        a = Charset.forName("US-ASCII");
        int[] iArr = new int[11];
        b = iArr;
        iArr[1] = 1;
        b[2] = 1;
        b[3] = 2;
        b[4] = 4;
        b[5] = 8;
        b[7] = 1;
        b[9] = 4;
        b[10] = 8;
        j = new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
    }

    public static boolean a(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
    }

    public static boolean a(short s) {
        return s == (short) 1 || s == (short) 2 || s == (short) 3 || s == (short) 4 || s == (short) 5 || s == (short) 7 || s == (short) 9 || s == (short) 10;
    }

    jjm(short s, short s2, int i, int i2, boolean z) {
        this.c = s;
        this.d = s2;
        this.f = i;
        this.e = z;
        this.g = i2;
        this.h = null;
    }

    public int a() {
        return this.g;
    }

    protected void b(int i) {
        this.g = i;
    }

    public short b() {
        return this.c;
    }

    public short c() {
        return this.d;
    }

    public int d() {
        return e() * b[c()];
    }

    public int e() {
        return this.f;
    }

    protected void c(int i) {
        this.f = i;
    }

    public boolean f() {
        return this.h != null;
    }

    public boolean a(int[] iArr) {
        int i = 0;
        if (h(iArr.length)) {
            return false;
        }
        if (this.d != (short) 3 && this.d != (short) 9 && this.d != (short) 4) {
            return false;
        }
        int i2;
        if (this.d == (short) 3) {
            for (int i3 : iArr) {
                if (i3 > 65535 || i3 < 0) {
                    i2 = 1;
                    break;
                }
            }
            i2 = 0;
            if (i2 != 0) {
                return false;
            }
        }
        if (this.d == (short) 4) {
            for (int i32 : iArr) {
                if (i32 < 0) {
                    i2 = 1;
                    break;
                }
            }
            i2 = 0;
            if (i2 != 0) {
                return false;
            }
        }
        Object obj = new long[iArr.length];
        while (i < iArr.length) {
            obj[i] = (long) iArr[i];
            i++;
        }
        this.h = obj;
        this.f = iArr.length;
        return true;
    }

    public boolean d(int i) {
        return a(new int[]{i});
    }

    public boolean a(long[] jArr) {
        if (h(jArr.length) || this.d != (short) 4) {
            return false;
        }
        boolean z;
        for (long j : jArr) {
            if (j < 0 || j > 4294967295L) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            return false;
        }
        this.h = jArr;
        this.f = jArr.length;
        return true;
    }

    private boolean a(long j) {
        return a(new long[]{j});
    }

    public boolean a(String str) {
        if (this.d != (short) 2 && this.d != (short) 7) {
            return false;
        }
        Object bytes = str.getBytes(a);
        if (bytes.length > 0) {
            if (this.d == (short) 2 && bytes[bytes.length - 1] != null) {
                if (this.e && bytes.length == this.f) {
                    bytes[bytes.length - 1] = null;
                } else {
                    bytes = Arrays.copyOf(bytes, bytes.length + 1);
                }
            }
        } else if (this.d == (short) 2 && this.f == 1) {
            bytes = new byte[]{null};
        }
        int length = bytes.length;
        if (h(length)) {
            return false;
        }
        this.f = length;
        this.h = bytes;
        return true;
    }

    public boolean a(jjq[] jjqArr) {
        if (h(jjqArr.length)) {
            return false;
        }
        if (this.d != (short) 5 && this.d != (short) 10) {
            return false;
        }
        boolean z;
        if (this.d == (short) 5) {
            for (jjq jjq : jjqArr) {
                if (jjq.a() < 0 || jjq.b() < 0 || jjq.a() > 4294967295L || jjq.b() > 4294967295L) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                return false;
            }
        }
        if (this.d == (short) 10) {
            for (jjq jjq2 : jjqArr) {
                if (jjq2.a() < -2147483648L || jjq2.b() < -2147483648L || jjq2.a() > 2147483647L || jjq2.b() > 2147483647L) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                return false;
            }
        }
        this.h = jjqArr;
        this.f = jjqArr.length;
        return true;
    }

    private boolean a(jjq jjq) {
        return a(new jjq[]{jjq});
    }

    private boolean a(byte[] bArr, int i, int i2) {
        if (h(i2)) {
            return false;
        }
        if (this.d != (short) 1 && this.d != (short) 7) {
            return false;
        }
        this.h = new byte[i2];
        System.arraycopy(bArr, 0, this.h, 0, i2);
        this.f = i2;
        return true;
    }

    public boolean a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private boolean a(byte b) {
        return a(new byte[]{b});
    }

    public boolean a(Object obj) {
        int i = 0;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Short) {
            return d(((Short) obj).shortValue() & 65535);
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        if (obj instanceof int[]) {
            return a((int[]) obj);
        }
        if (obj instanceof long[]) {
            return a((long[]) obj);
        }
        if (obj instanceof jjq) {
            return a((jjq) obj);
        }
        if (obj instanceof jjq[]) {
            return a((jjq[]) obj);
        }
        if (obj instanceof byte[]) {
            return a((byte[]) obj);
        }
        if (obj instanceof Integer) {
            return d(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return a(((Long) obj).longValue());
        }
        if (obj instanceof Byte) {
            return a(((Byte) obj).byteValue());
        }
        int[] iArr;
        int i2;
        if (obj instanceof Short[]) {
            Short[] shArr = (Short[]) obj;
            iArr = new int[shArr.length];
            for (i2 = 0; i2 < shArr.length; i2++) {
                iArr[i2] = shArr[i2] == null ? 0 : shArr[i2].shortValue() & 65535;
            }
            return a(iArr);
        } else if (obj instanceof Integer[]) {
            Integer[] numArr = (Integer[]) obj;
            iArr = new int[numArr.length];
            for (i2 = 0; i2 < numArr.length; i2++) {
                iArr[i2] = numArr[i2] == null ? 0 : numArr[i2].intValue();
            }
            return a(iArr);
        } else if (obj instanceof Long[]) {
            Long[] lArr = (Long[]) obj;
            long[] jArr = new long[lArr.length];
            while (i < lArr.length) {
                jArr[i] = lArr[i] == null ? 0 : lArr[i].longValue();
                i++;
            }
            return a(jArr);
        } else if (!(obj instanceof Byte[])) {
            return false;
        } else {
            Byte[] bArr = (Byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            for (i2 = 0; i2 < bArr.length; i2++) {
                bArr2[i2] = bArr[i2] == null ? (byte) 0 : bArr[i2].byteValue();
            }
            return a(bArr2);
        }
    }

    private String l() {
        if (this.h == null) {
            return null;
        }
        if (this.h instanceof String) {
            return (String) this.h;
        }
        if (!(this.h instanceof byte[])) {
            return null;
        }
        byte[] bArr = (byte[]) this.h;
        if (bArr.length <= 0 || bArr[bArr.length - 1] != null) {
            return new String(bArr, a);
        }
        return new String(bArr, 0, bArr.length - 1, a);
    }

    public int[] g() {
        if (this.h == null || !(this.h instanceof long[])) {
            return null;
        }
        long[] jArr = (long[]) this.h;
        int[] iArr = new int[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            iArr[i] = (int) jArr[i];
        }
        return iArr;
    }

    public Object h() {
        return this.h;
    }

    private String m() {
        if (this.h == null) {
            return "";
        }
        if (this.h instanceof byte[]) {
            if (this.d == (short) 2) {
                return l();
            }
            return Arrays.toString((byte[]) this.h);
        } else if (this.h instanceof long[]) {
            if (((long[]) this.h).length == 1) {
                return String.valueOf(((long[]) this.h)[0]);
            }
            return Arrays.toString((long[]) this.h);
        } else if (!(this.h instanceof Object[])) {
            return this.h.toString();
        } else {
            if (((Object[]) this.h).length != 1) {
                return Arrays.toString((Object[]) this.h);
            }
            Object obj = ((Object[]) this.h)[0];
            if (obj == null) {
                return "";
            }
            return obj.toString();
        }
    }

    protected long e(int i) {
        if (this.h instanceof long[]) {
            return ((long[]) this.h)[i];
        }
        if (this.h instanceof byte[]) {
            return (long) ((byte[]) this.h)[i];
        }
        String str = "Cannot get integer value from ";
        String valueOf = String.valueOf(b(this.d));
        throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    protected byte[] i() {
        return (byte[]) this.h;
    }

    protected jjq f(int i) {
        if (this.d == (short) 10 || this.d == (short) 5) {
            return ((jjq[]) this.h)[i];
        }
        String str = "Cannot get RATIONAL value from ";
        String valueOf = String.valueOf(b(this.d));
        throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    protected void b(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    private void b(byte[] bArr, int i, int i2) {
        if (this.d == (short) 7 || this.d == (short) 1) {
            System.arraycopy(this.h, 0, bArr, 0, Math.min(this.f, i2));
            return;
        }
        String str = "Cannot get BYTE value from ";
        String valueOf = String.valueOf(b(this.d));
        throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    protected int j() {
        return this.i;
    }

    protected void g(int i) {
        this.i = i;
    }

    protected void a(boolean z) {
        this.e = z;
    }

    protected boolean k() {
        return this.e;
    }

    private boolean h(int i) {
        return this.e && this.f != i;
    }

    private static String b(short s) {
        switch (s) {
            case wi.j /*1*/:
                return "UNSIGNED_BYTE";
            case wi.l /*2*/:
                return "ASCII";
            case wi.z /*3*/:
                return "UNSIGNED_SHORT";
            case wi.h /*4*/:
                return "UNSIGNED_LONG";
            case wi.p /*5*/:
                return "UNSIGNED_RATIONAL";
            case wi.q /*7*/:
                return "UNDEFINED";
            case wi.n /*9*/:
                return "LONG";
            case wi.dr /*10*/:
                return "RATIONAL";
            default:
                return "";
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof jjm)) {
            return false;
        }
        jjm jjm = (jjm) obj;
        if (jjm.c != this.c || jjm.f != this.f || jjm.d != this.d) {
            return false;
        }
        if (this.h != null) {
            if (jjm.h == null) {
                return false;
            }
            if (this.h instanceof long[]) {
                if (jjm.h instanceof long[]) {
                    return Arrays.equals((long[]) this.h, (long[]) jjm.h);
                }
                return false;
            } else if (this.h instanceof jjq[]) {
                if (jjm.h instanceof jjq[]) {
                    return Arrays.equals((jjq[]) this.h, (jjq[]) jjm.h);
                }
                return false;
            } else if (!(this.h instanceof byte[])) {
                return this.h.equals(jjm.h);
            } else {
                if (jjm.h instanceof byte[]) {
                    return Arrays.equals((byte[]) this.h, (byte[]) jjm.h);
                }
                return false;
            }
        } else if (jjm.h == null) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (this.h == null ? 0 : this.h.hashCode()) + ((((((this.c + 527) * 31) + this.f) * 31) + this.d) * 31);
    }

    public String toString() {
        String valueOf = String.valueOf(String.format("tag id: %04X\n", new Object[]{Short.valueOf(this.c)}));
        int i = this.g;
        String valueOf2 = String.valueOf(b(this.d));
        int i2 = this.f;
        int i3 = this.i;
        String valueOf3 = String.valueOf(m());
        return new StringBuilder(((String.valueOf(valueOf).length() + 74) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append("ifd id: ").append(i).append("\ntype: ").append(valueOf2).append("\ncount: ").append(i2).append("\noffset: ").append(i3).append("\nvalue: ").append(valueOf3).append("\n").toString();
    }
}
