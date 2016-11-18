package p000;

import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.TreeMap;

final class jjh {
    private static final Charset f20252a = Charset.forName("US-ASCII");
    private static final short f20253t = jjb.m24360a(jjb.f20180C);
    private static final short f20254u = jjb.m24360a(jjb.f20181D);
    private static final short f20255v = jjb.m24360a(jjb.am);
    private static final short f20256w = jjb.m24360a(jjb.f20182E);
    private static final short f20257x = jjb.m24360a(jjb.f20183F);
    private static final short f20258y = jjb.m24360a(jjb.f20212i);
    private static final short f20259z = jjb.m24360a(jjb.f20216m);
    private final TreeMap<Integer, Object> f20260A = new TreeMap();
    private final jja f20261b;
    private final int f20262c;
    private int f20263d = 0;
    private int f20264e = 0;
    private int f20265f;
    private jjm f20266g;
    private jjk f20267h;
    private jjm f20268i;
    private jjm f20269j;
    private boolean f20270k;
    private boolean f20271l = false;
    private int f20272m;
    private int f20273n = 0;
    private int f20274o;
    private byte[] f20275p;
    private int f20276q;
    private int f20277r;
    private final jjb f20278s;

    private boolean m24421a(int i) {
        switch (i) {
            case 0:
                if ((this.f20262c & 1) == 0) {
                    return false;
                }
                return true;
            case 1:
                if ((this.f20262c & 2) == 0) {
                    return false;
                }
                return true;
            case 2:
                if ((this.f20262c & 4) == 0) {
                    return false;
                }
                return true;
            case 3:
                return (this.f20262c & 16) != 0;
            case 4:
                if ((this.f20262c & 8) == 0) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    private boolean m24428l() {
        return (this.f20262c & 32) != 0;
    }

    jjh(InputStream inputStream, int i, jjb jjb) {
        if (inputStream == null) {
            throw new IOException("Null argument inputStream to ExifParser");
        }
        this.f20278s = jjb;
        this.f20271l = m24423a(inputStream);
        this.f20261b = new jja(inputStream);
        this.f20262c = i;
        if (this.f20271l) {
            short c = this.f20261b.m24352c();
            if ((short) 18761 == c) {
                this.f20261b.m24350a(ByteOrder.LITTLE_ENDIAN);
            } else if ((short) 19789 == c) {
                this.f20261b.m24350a(ByteOrder.BIG_ENDIAN);
            } else {
                throw new jjd("Invalid TIFF header");
            }
            if (this.f20261b.m24352c() != (short) 42) {
                throw new jjd("Invalid TIFF header");
            }
            long f = this.f20261b.m24355f();
            if (f > 2147483647L) {
                throw new jjd("Invalid offset " + f);
            }
            this.f20276q = (int) f;
            this.f20265f = 0;
            if (m24421a(0) || m24429m()) {
                m24420a(0, f);
                int i2 = ((int) f) - 8;
                if (i2 < 0) {
                    throw new jjd("Invalid offset " + f);
                } else if (i2 > 0) {
                    this.f20275p = new byte[i2];
                    m24438a(this.f20275p);
                }
            }
        }
    }

    protected static jjh m24419a(InputStream inputStream, jjb jjb) {
        return new jjh(inputStream, 63, jjb);
    }

    protected int m24437a() {
        if (!this.f20271l) {
            return 6;
        }
        int a = this.f20261b.m24347a();
        int i = (this.f20263d + 2) + (this.f20264e * 12);
        if (a < i) {
            this.f20266g = m24430n();
            if (this.f20266g == null) {
                return m24437a();
            }
            if (!this.f20270k) {
                return 1;
            }
            m24427c(this.f20266g);
            return 1;
        }
        if (a == i) {
            if (this.f20265f == 0) {
                long q = m24433q();
                if ((m24421a(1) || m24428l()) && q != 0) {
                    m24420a(1, q);
                }
            } else {
                int i2;
                if (this.f20260A.isEmpty()) {
                    i2 = 4;
                } else {
                    i2 = ((Integer) this.f20260A.firstEntry().getKey()).intValue() - this.f20261b.m24347a();
                }
                if (i2 >= 4) {
                    long q2 = m24433q();
                    if (q2 != 0 && Log.isLoggable("ExifParser", 5)) {
                        new StringBuilder(46).append("Invalid link to next IFD: ").append(q2);
                    }
                } else if (Log.isLoggable("ExifParser", 5)) {
                    new StringBuilder(45).append("Invalid size of link to next IFD: ").append(i2);
                }
            }
        }
        while (!this.f20260A.isEmpty()) {
            Entry pollFirstEntry = this.f20260A.pollFirstEntry();
            Object value = pollFirstEntry.getValue();
            try {
                m24424b(((Integer) pollFirstEntry.getKey()).intValue());
                if (value instanceof jjj) {
                    this.f20265f = ((jjj) value).f20281a;
                    this.f20264e = this.f20261b.m24353d();
                    this.f20263d = ((Integer) pollFirstEntry.getKey()).intValue();
                    if (((this.f20264e * 12) + this.f20263d) + 2 > this.f20272m) {
                        if (Log.isLoggable("ExifParser", 5)) {
                            new StringBuilder(31).append("Invalid size of IFD ").append(this.f20265f);
                        }
                        return 6;
                    }
                    this.f20270k = m24429m();
                    if (((jjj) value).f20282b) {
                        return 0;
                    }
                    m24440b();
                } else if (value instanceof jjk) {
                    this.f20267h = (jjk) value;
                    return this.f20267h.f20284b;
                } else {
                    jji jji = (jji) value;
                    this.f20266g = jji.f20279a;
                    if (this.f20266g.m24474c() != (short) 7) {
                        m24441b(this.f20266g);
                        m24427c(this.f20266g);
                    }
                    if (jji.f20280b) {
                        return 2;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("ExifParser", 5)) {
                    String valueOf = String.valueOf(pollFirstEntry.getKey());
                    String valueOf2 = String.valueOf(value.getClass().getName());
                    new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length()).append("Failed to skip to data at: ").append(valueOf).append(" for ").append(valueOf2).append(", the file may be broken.");
                }
            }
        }
        if (this.f20274o == 0 && m24431o()) {
            return 5;
        }
        return 6;
    }

    protected void m24440b() {
        int i = (this.f20264e * 12) + (this.f20263d + 2);
        int a = this.f20261b.m24347a();
        if (a <= i) {
            if (this.f20270k) {
                while (a < i) {
                    this.f20266g = m24430n();
                    a += 12;
                    if (this.f20266g != null) {
                        m24427c(this.f20266g);
                    }
                }
            } else {
                m24424b(i);
            }
            long q = m24433q();
            if (this.f20265f != 0) {
                return;
            }
            if ((m24421a(1) || m24428l()) && q > 0) {
                m24420a(1, q);
            }
        }
    }

    private boolean m24429m() {
        switch (this.f20265f) {
            case 0:
                if (m24421a(2) || m24421a(4) || m24421a(3) || m24421a(1)) {
                    return true;
                }
                return false;
            case 1:
                return m24428l();
            case 2:
                return m24421a(3);
            default:
                return false;
        }
    }

    protected jjm m24442c() {
        return this.f20266g;
    }

    protected int m24443d() {
        return this.f20265f;
    }

    protected int m24444e() {
        return this.f20267h.f20283a;
    }

    protected int m24445f() {
        if (this.f20268i == null) {
            return 0;
        }
        return (int) this.f20268i.m24479e(0);
    }

    protected int m24446g() {
        if (this.f20269j == null) {
            return 0;
        }
        return (int) this.f20269j.m24479e(0);
    }

    private void m24424b(int i) {
        this.f20261b.m24349a((long) i);
        while (!this.f20260A.isEmpty() && ((Integer) this.f20260A.firstKey()).intValue() < i) {
            this.f20260A.pollFirstEntry();
        }
    }

    protected void m24439a(jjm jjm) {
        if (jjm.m24486j() >= this.f20261b.m24347a()) {
            this.f20260A.put(Integer.valueOf(jjm.m24486j()), new jji(jjm, true));
        }
    }

    private void m24420a(int i, long j) {
        this.f20260A.put(Integer.valueOf((int) j), new jjj(i, m24421a(i)));
    }

    private void m24425b(int i, long j) {
        this.f20260A.put(Integer.valueOf((int) j), new jjk(4, i));
    }

    private jjm m24430n() {
        boolean z = true;
        short c = this.f20261b.m24352c();
        short c2 = this.f20261b.m24352c();
        long f = this.f20261b.m24355f();
        if (f > 2147483647L) {
            throw new jjd("Number of component is larger then Integer.MAX_VALUE");
        } else if (jjm.m24456a(c2)) {
            int i = (int) f;
            int i2 = this.f20265f;
            if (((int) f) == 0) {
                z = false;
            }
            jjm jjm = new jjm(c, c2, i, i2, z);
            int d = jjm.m24476d();
            if (d > 4) {
                long f2 = this.f20261b.m24355f();
                if (f2 > 2147483647L) {
                    throw new jjd("offset is larger then Integer.MAX_VALUE");
                } else if (this.f20275p == null || f2 >= ((long) this.f20276q) || c2 != (short) 7) {
                    jjm.m24482g((int) f2);
                    return jjm;
                } else {
                    byte[] bArr = new byte[((int) f)];
                    System.arraycopy(this.f20275p, ((int) f2) - 8, bArr, 0, (int) f);
                    jjm.m24467a(bArr);
                    return jjm;
                }
            }
            boolean k = jjm.m24487k();
            jjm.m24464a(false);
            m24441b(jjm);
            jjm.m24464a(k);
            this.f20261b.skip((long) (4 - d));
            jjm.m24482g(this.f20261b.m24347a() - 4);
            return jjm;
        } else {
            if (Log.isLoggable("ExifParser", 5)) {
                String.format("Tag %04x: Invalid data type %d", new Object[]{Short.valueOf(c), Short.valueOf(c2)});
            }
            this.f20261b.skip(4);
            return null;
        }
    }

    private void m24427c(jjm jjm) {
        int i = 0;
        if (jjm.m24478e() != 0) {
            short b = jjm.m24471b();
            int a = jjm.m24463a();
            if (b == f20253t && m24422a(a, jjb.f20180C)) {
                if (m24421a(2) || m24421a(3)) {
                    m24420a(2, jjm.m24479e(0));
                }
            } else if (b == f20254u && m24422a(a, jjb.f20181D)) {
                if (m24421a(4)) {
                    m24420a(4, jjm.m24479e(0));
                }
            } else if (b == f20255v && m24422a(a, jjb.am)) {
                if (m24421a(3)) {
                    m24420a(3, jjm.m24479e(0));
                }
            } else if (b == f20256w && m24422a(a, jjb.f20182E)) {
                if (m24428l()) {
                    this.f20260A.put(Integer.valueOf((int) jjm.m24479e(0)), new jjk(3));
                }
            } else if (b == f20257x && m24422a(a, jjb.f20183F)) {
                if (m24428l()) {
                    this.f20269j = jjm;
                }
            } else if (b == f20258y && m24422a(a, jjb.f20212i)) {
                if (!m24428l()) {
                    return;
                }
                if (jjm.m24481f()) {
                    while (i < jjm.m24478e()) {
                        jjm.m24474c();
                        m24425b(i, jjm.m24479e(i));
                        i++;
                    }
                    return;
                }
                this.f20260A.put(Integer.valueOf(jjm.m24486j()), new jji(jjm, false));
            } else if (b == f20259z && m24422a(a, jjb.f20216m) && m24428l() && jjm.m24481f()) {
                this.f20268i = jjm;
            }
        }
    }

    private boolean m24422a(int i, int i2) {
        int i3 = this.f20278s.m24379a().get(i2);
        if (i3 == 0) {
            return false;
        }
        return jjb.m24366a(i3, i);
    }

    protected void m24441b(jjm jjm) {
        String valueOf;
        int i;
        int i2 = 0;
        short c = jjm.m24474c();
        if (c == (short) 2 || c == (short) 7 || c == (short) 1) {
            int e = jjm.m24478e();
            if (!this.f20260A.isEmpty() && ((Integer) this.f20260A.firstEntry().getKey()).intValue() < e + this.f20261b.m24347a()) {
                Object value = this.f20260A.firstEntry().getValue();
                if (value instanceof jjk) {
                    if (Log.isLoggable("ExifParser", 5)) {
                        valueOf = String.valueOf(jjm);
                        new StringBuilder(String.valueOf(valueOf).length() + 35).append("Thumbnail overlaps value for tag: \n").append(valueOf);
                    }
                    Entry pollFirstEntry = this.f20260A.pollFirstEntry();
                    if (Log.isLoggable("ExifParser", 5)) {
                        valueOf = String.valueOf(pollFirstEntry.getKey());
                        new StringBuilder(String.valueOf(valueOf).length() + 26).append("Invalid thumbnail offset: ").append(valueOf);
                    }
                } else {
                    String valueOf2;
                    if (value instanceof jjj) {
                        if (Log.isLoggable("ExifParser", 5)) {
                            i = ((jjj) value).f20281a;
                            valueOf2 = String.valueOf(jjm);
                            new StringBuilder(String.valueOf(valueOf2).length() + 41).append("Ifd ").append(i).append(" overlaps value for tag: \n").append(valueOf2);
                        }
                    } else if ((value instanceof jji) && Log.isLoggable("ExifParser", 5)) {
                        valueOf = String.valueOf(((jji) value).f20279a);
                        valueOf2 = String.valueOf(jjm);
                        new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf2).length()).append("Tag value for tag: \n").append(valueOf).append(" overlaps value for tag: \n").append(valueOf2);
                    }
                    i = ((Integer) this.f20260A.firstEntry().getKey()).intValue() - this.f20261b.m24347a();
                    if (Log.isLoggable("ExifParser", 5)) {
                        valueOf2 = String.valueOf(jjm);
                        new StringBuilder(String.valueOf(valueOf2).length() + 52).append("Invalid size of tag: \n").append(valueOf2).append(" setting count to: ").append(i);
                    }
                    jjm.m24475c(i);
                }
            }
        }
        int[] iArr;
        switch (jjm.m24474c()) {
            case (short) 1:
            case (short) 7:
                byte[] bArr = new byte[jjm.m24478e()];
                m24438a(bArr);
                jjm.m24467a(bArr);
                break;
            case (short) 2:
                jjm.m24466a(m24426c(jjm.m24478e()));
                break;
            case (short) 3:
                iArr = new int[jjm.m24478e()];
                e = iArr.length;
                while (i2 < e) {
                    iArr[i2] = m24432p();
                    i2++;
                }
                jjm.m24468a(iArr);
                break;
            case (short) 4:
                long[] jArr = new long[jjm.m24478e()];
                e = jArr.length;
                while (i2 < e) {
                    jArr[i2] = m24433q();
                    i2++;
                }
                jjm.m24469a(jArr);
                break;
            case (short) 5:
                jjq[] jjqArr = new jjq[jjm.m24478e()];
                e = jjqArr.length;
                while (i2 < e) {
                    jjqArr[i2] = m24434r();
                    i2++;
                }
                jjm.m24470a(jjqArr);
                break;
            case (short) 9:
                iArr = new int[jjm.m24478e()];
                e = iArr.length;
                while (i2 < e) {
                    iArr[i2] = m24435s();
                    i2++;
                }
                jjm.m24468a(iArr);
                break;
            case (short) 10:
                jjq[] jjqArr2 = new jjq[jjm.m24478e()];
                int length = jjqArr2.length;
                for (i = 0; i < length; i++) {
                    jjqArr2[i] = m24436t();
                }
                jjm.m24470a(jjqArr2);
                break;
        }
        if (Log.isLoggable("ExifParser", 2)) {
            valueOf = String.valueOf(jjm);
            new StringBuilder(String.valueOf(valueOf).length() + 1).append("\n").append(valueOf);
        }
    }

    private boolean m24423a(InputStream inputStream) {
        jja jja = new jja(inputStream);
        if (jja.m24352c() != (short) -40) {
            throw new jjd("Invalid JPEG format");
        }
        short c = jja.m24352c();
        while (c != (short) -39 && !jjo.m24496a(c)) {
            int d = jja.m24353d();
            if (c == (short) -31 && d >= jjo.f20300a.length + 2) {
                byte[] bArr = new byte[jjo.f20300a.length];
                jja.read(bArr, 0, jjo.f20300a.length);
                d -= jjo.f20300a.length;
                if (Arrays.equals(bArr, jjo.f20300a)) {
                    this.f20277r = jja.m24347a();
                    this.f20272m = d;
                    this.f20273n = this.f20277r + this.f20272m;
                    return true;
                }
            }
            if (d < 2 || ((long) (d - 2)) != jja.skip((long) (d - 2))) {
                return false;
            }
            c = jja.m24352c();
        }
        return false;
    }

    private boolean m24431o() {
        int a = (this.f20272m - this.f20261b.m24347a()) - 2;
        if (a > 0 && this.f20261b.skip((long) a) != ((long) a)) {
            return false;
        }
        this.f20261b.m24350a(ByteOrder.BIG_ENDIAN);
        try {
            short c = this.f20261b.m24352c();
            while (c != (short) -39 && !jjo.m24496a(c)) {
                a = this.f20261b.m24353d();
                if (c == (short) -31 && a >= jjo.f20301b.length + 2) {
                    byte[] bArr = new byte[jjo.f20301b.length];
                    m24417a(bArr, 0, jjo.f20301b.length);
                    a -= jjo.f20301b.length;
                    if (Arrays.equals(bArr, jjo.f20301b)) {
                        this.f20274o = a - 2;
                        return true;
                    }
                }
                if (a < 2 || ((long) (a - 2)) != this.f20261b.skip((long) (a - 2))) {
                    return false;
                }
                c = this.f20261b.m24352c();
            }
            return false;
        } catch (EOFException e) {
            return false;
        }
    }

    byte[] m24447h() {
        byte[] bArr = new byte[this.f20274o];
        m24417a(bArr, 0, this.f20274o);
        return bArr;
    }

    protected int m24448i() {
        return this.f20273n;
    }

    protected int m24449j() {
        return this.f20277r;
    }

    private int m24417a(byte[] bArr, int i, int i2) {
        return this.f20261b.read(bArr, 0, i2);
    }

    protected int m24438a(byte[] bArr) {
        return this.f20261b.read(bArr);
    }

    private String m24426c(int i) {
        return m24418a(i, f20252a);
    }

    private String m24418a(int i, Charset charset) {
        if (i > 0) {
            return this.f20261b.m24348a(i, charset);
        }
        return "";
    }

    private int m24432p() {
        return this.f20261b.m24352c() & 65535;
    }

    private long m24433q() {
        return ((long) m24435s()) & 4294967295L;
    }

    private jjq m24434r() {
        return new jjq(m24433q(), m24433q());
    }

    private int m24435s() {
        return this.f20261b.m24354e();
    }

    private jjq m24436t() {
        return new jjq((long) m24435s(), (long) m24435s());
    }

    protected ByteOrder m24450k() {
        return this.f20261b.m24351b();
    }
}
