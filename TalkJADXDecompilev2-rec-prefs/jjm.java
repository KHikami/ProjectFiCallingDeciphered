package p000;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public final class jjm {
    private static final Charset f20286a = Charset.forName("US-ASCII");
    private static final int[] f20287b;
    private static final SimpleDateFormat f20288j = new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
    private final short f20289c;
    private final short f20290d;
    private boolean f20291e;
    private int f20292f;
    private int f20293g;
    private Object f20294h = null;
    private int f20295i;

    static {
        int[] iArr = new int[11];
        f20287b = iArr;
        iArr[1] = 1;
        f20287b[2] = 1;
        f20287b[3] = 2;
        f20287b[4] = 4;
        f20287b[5] = 8;
        f20287b[7] = 1;
        f20287b[9] = 4;
        f20287b[10] = 8;
    }

    public static boolean m24453a(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
    }

    public static boolean m24456a(short s) {
        return s == (short) 1 || s == (short) 2 || s == (short) 3 || s == (short) 4 || s == (short) 5 || s == (short) 7 || s == (short) 9 || s == (short) 10;
    }

    jjm(short s, short s2, int i, int i2, boolean z) {
        this.f20289c = s;
        this.f20290d = s2;
        this.f20292f = i;
        this.f20291e = z;
        this.f20293g = i2;
    }

    public int m24463a() {
        return this.f20293g;
    }

    protected void m24472b(int i) {
        this.f20293g = i;
    }

    public short m24471b() {
        return this.f20289c;
    }

    public short m24474c() {
        return this.f20290d;
    }

    public int m24476d() {
        return m24478e() * f20287b[m24474c()];
    }

    public int m24478e() {
        return this.f20292f;
    }

    protected void m24475c(int i) {
        this.f20292f = i;
    }

    public boolean m24481f() {
        return this.f20294h != null;
    }

    public boolean m24468a(int[] iArr) {
        int i = 0;
        if (m24460h(iArr.length)) {
            return false;
        }
        if (this.f20290d != (short) 3 && this.f20290d != (short) 9 && this.f20290d != (short) 4) {
            return false;
        }
        int i2;
        if (this.f20290d == (short) 3) {
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
        if (this.f20290d == (short) 4) {
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
        this.f20294h = obj;
        this.f20292f = iArr.length;
        return true;
    }

    public boolean m24477d(int i) {
        return m24468a(new int[]{i});
    }

    public boolean m24469a(long[] jArr) {
        if (m24460h(jArr.length) || this.f20290d != (short) 4) {
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
        this.f20294h = jArr;
        this.f20292f = jArr.length;
        return true;
    }

    private boolean m24454a(long j) {
        return m24469a(new long[]{j});
    }

    public boolean m24466a(String str) {
        if (this.f20290d != (short) 2 && this.f20290d != (short) 7) {
            return false;
        }
        Object bytes = str.getBytes(f20286a);
        if (bytes.length > 0) {
            if (this.f20290d == (short) 2 && bytes[bytes.length - 1] != (byte) 0) {
                if (this.f20291e && bytes.length == this.f20292f) {
                    bytes[bytes.length - 1] = null;
                } else {
                    bytes = Arrays.copyOf(bytes, bytes.length + 1);
                }
            }
        } else if (this.f20290d == (short) 2 && this.f20292f == 1) {
            bytes = new byte[]{null};
        }
        int length = bytes.length;
        if (m24460h(length)) {
            return false;
        }
        this.f20292f = length;
        this.f20294h = bytes;
        return true;
    }

    public boolean m24470a(jjq[] jjqArr) {
        if (m24460h(jjqArr.length)) {
            return false;
        }
        if (this.f20290d != (short) 5 && this.f20290d != (short) 10) {
            return false;
        }
        boolean z;
        if (this.f20290d == (short) 5) {
            for (jjq jjq : jjqArr) {
                if (jjq.m24501a() < 0 || jjq.m24502b() < 0 || jjq.m24501a() > 4294967295L || jjq.m24502b() > 4294967295L) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                return false;
            }
        }
        if (this.f20290d == (short) 10) {
            for (jjq jjq2 : jjqArr) {
                if (jjq2.m24501a() < -2147483648L || jjq2.m24502b() < -2147483648L || jjq2.m24501a() > 2147483647L || jjq2.m24502b() > 2147483647L) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                return false;
            }
        }
        this.f20294h = jjqArr;
        this.f20292f = jjqArr.length;
        return true;
    }

    private boolean m24455a(jjq jjq) {
        return m24470a(new jjq[]{jjq});
    }

    private boolean m24457a(byte[] bArr, int i, int i2) {
        if (m24460h(i2)) {
            return false;
        }
        if (this.f20290d != (short) 1 && this.f20290d != (short) 7) {
            return false;
        }
        this.f20294h = new byte[i2];
        System.arraycopy(bArr, 0, this.f20294h, 0, i2);
        this.f20292f = i2;
        return true;
    }

    public boolean m24467a(byte[] bArr) {
        return m24457a(bArr, 0, bArr.length);
    }

    private boolean m24452a(byte b) {
        return m24467a(new byte[]{b});
    }

    public boolean m24465a(Object obj) {
        int i = 0;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Short) {
            return m24477d(((Short) obj).shortValue() & 65535);
        }
        if (obj instanceof String) {
            return m24466a((String) obj);
        }
        if (obj instanceof int[]) {
            return m24468a((int[]) obj);
        }
        if (obj instanceof long[]) {
            return m24469a((long[]) obj);
        }
        if (obj instanceof jjq) {
            return m24455a((jjq) obj);
        }
        if (obj instanceof jjq[]) {
            return m24470a((jjq[]) obj);
        }
        if (obj instanceof byte[]) {
            return m24467a((byte[]) obj);
        }
        if (obj instanceof Integer) {
            return m24477d(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return m24454a(((Long) obj).longValue());
        }
        if (obj instanceof Byte) {
            return m24452a(((Byte) obj).byteValue());
        }
        int[] iArr;
        int i2;
        if (obj instanceof Short[]) {
            Short[] shArr = (Short[]) obj;
            iArr = new int[shArr.length];
            for (i2 = 0; i2 < shArr.length; i2++) {
                iArr[i2] = shArr[i2] == null ? 0 : shArr[i2].shortValue() & 65535;
            }
            return m24468a(iArr);
        } else if (obj instanceof Integer[]) {
            Integer[] numArr = (Integer[]) obj;
            iArr = new int[numArr.length];
            for (i2 = 0; i2 < numArr.length; i2++) {
                iArr[i2] = numArr[i2] == null ? 0 : numArr[i2].intValue();
            }
            return m24468a(iArr);
        } else if (obj instanceof Long[]) {
            Long[] lArr = (Long[]) obj;
            long[] jArr = new long[lArr.length];
            while (i < lArr.length) {
                jArr[i] = lArr[i] == null ? 0 : lArr[i].longValue();
                i++;
            }
            return m24469a(jArr);
        } else if (!(obj instanceof Byte[])) {
            return false;
        } else {
            Byte[] bArr = (Byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            for (i2 = 0; i2 < bArr.length; i2++) {
                bArr2[i2] = bArr[i2] == null ? (byte) 0 : bArr[i2].byteValue();
            }
            return m24467a(bArr2);
        }
    }

    private String m24461l() {
        if (this.f20294h == null) {
            return null;
        }
        if (this.f20294h instanceof String) {
            return (String) this.f20294h;
        }
        if (!(this.f20294h instanceof byte[])) {
            return null;
        }
        byte[] bArr = (byte[]) this.f20294h;
        if (bArr.length <= 0 || bArr[bArr.length - 1] != (byte) 0) {
            return new String(bArr, f20286a);
        }
        return new String(bArr, 0, bArr.length - 1, f20286a);
    }

    public int[] m24483g() {
        if (this.f20294h == null || !(this.f20294h instanceof long[])) {
            return null;
        }
        long[] jArr = (long[]) this.f20294h;
        int[] iArr = new int[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            iArr[i] = (int) jArr[i];
        }
        return iArr;
    }

    public Object m24484h() {
        return this.f20294h;
    }

    private String m24462m() {
        if (this.f20294h == null) {
            return "";
        }
        if (this.f20294h instanceof byte[]) {
            if (this.f20290d == (short) 2) {
                return m24461l();
            }
            return Arrays.toString((byte[]) this.f20294h);
        } else if (this.f20294h instanceof long[]) {
            if (((long[]) this.f20294h).length == 1) {
                return String.valueOf(((long[]) this.f20294h)[0]);
            }
            return Arrays.toString((long[]) this.f20294h);
        } else if (!(this.f20294h instanceof Object[])) {
            return this.f20294h.toString();
        } else {
            if (((Object[]) this.f20294h).length != 1) {
                return Arrays.toString((Object[]) this.f20294h);
            }
            Object obj = ((Object[]) this.f20294h)[0];
            if (obj == null) {
                return "";
            }
            return obj.toString();
        }
    }

    protected long m24479e(int i) {
        if (this.f20294h instanceof long[]) {
            return ((long[]) this.f20294h)[i];
        }
        if (this.f20294h instanceof byte[]) {
            return (long) ((byte[]) this.f20294h)[i];
        }
        String str = "Cannot get integer value from ";
        String valueOf = String.valueOf(jjm.m24458b(this.f20290d));
        throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    protected byte[] m24485i() {
        return (byte[]) this.f20294h;
    }

    protected jjq m24480f(int i) {
        if (this.f20290d == (short) 10 || this.f20290d == (short) 5) {
            return ((jjq[]) this.f20294h)[i];
        }
        String str = "Cannot get RATIONAL value from ";
        String valueOf = String.valueOf(jjm.m24458b(this.f20290d));
        throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    protected void m24473b(byte[] bArr) {
        m24459b(bArr, 0, bArr.length);
    }

    private void m24459b(byte[] bArr, int i, int i2) {
        if (this.f20290d == (short) 7 || this.f20290d == (short) 1) {
            System.arraycopy(this.f20294h, 0, bArr, 0, Math.min(this.f20292f, i2));
            return;
        }
        String str = "Cannot get BYTE value from ";
        String valueOf = String.valueOf(jjm.m24458b(this.f20290d));
        throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    protected int m24486j() {
        return this.f20295i;
    }

    protected void m24482g(int i) {
        this.f20295i = i;
    }

    protected void m24464a(boolean z) {
        this.f20291e = z;
    }

    protected boolean m24487k() {
        return this.f20291e;
    }

    private boolean m24460h(int i) {
        return this.f20291e && this.f20292f != i;
    }

    private static String m24458b(short s) {
        switch (s) {
            case (short) 1:
                return "UNSIGNED_BYTE";
            case (short) 2:
                return "ASCII";
            case (short) 3:
                return "UNSIGNED_SHORT";
            case (short) 4:
                return "UNSIGNED_LONG";
            case (short) 5:
                return "UNSIGNED_RATIONAL";
            case (short) 7:
                return "UNDEFINED";
            case (short) 9:
                return "LONG";
            case (short) 10:
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
        if (jjm.f20289c != this.f20289c || jjm.f20292f != this.f20292f || jjm.f20290d != this.f20290d) {
            return false;
        }
        if (this.f20294h != null) {
            if (jjm.f20294h == null) {
                return false;
            }
            if (this.f20294h instanceof long[]) {
                if (jjm.f20294h instanceof long[]) {
                    return Arrays.equals((long[]) this.f20294h, (long[]) jjm.f20294h);
                }
                return false;
            } else if (this.f20294h instanceof jjq[]) {
                if (jjm.f20294h instanceof jjq[]) {
                    return Arrays.equals((jjq[]) this.f20294h, (jjq[]) jjm.f20294h);
                }
                return false;
            } else if (!(this.f20294h instanceof byte[])) {
                return this.f20294h.equals(jjm.f20294h);
            } else {
                if (jjm.f20294h instanceof byte[]) {
                    return Arrays.equals((byte[]) this.f20294h, (byte[]) jjm.f20294h);
                }
                return false;
            }
        } else if (jjm.f20294h == null) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (this.f20294h == null ? 0 : this.f20294h.hashCode()) + ((((((this.f20289c + 527) * 31) + this.f20292f) * 31) + this.f20290d) * 31);
    }

    public String toString() {
        String valueOf = String.valueOf(String.format("tag id: %04X\n", new Object[]{Short.valueOf(this.f20289c)}));
        int i = this.f20293g;
        String valueOf2 = String.valueOf(jjm.m24458b(this.f20290d));
        int i2 = this.f20292f;
        int i3 = this.f20295i;
        String valueOf3 = String.valueOf(m24462m());
        return new StringBuilder(((String.valueOf(valueOf).length() + 74) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append("ifd id: ").append(i).append("\ntype: ").append(valueOf2).append("\ncount: ").append(i2).append("\noffset: ").append(i3).append("\nvalue: ").append(valueOf3).append("\n").toString();
    }
}
