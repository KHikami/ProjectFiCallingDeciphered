package defpackage;

import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: jjh */
final class jjh {
    private static final Charset a;
    private static final short t;
    private static final short u;
    private static final short v;
    private static final short w;
    private static final short x;
    private static final short y;
    private static final short z;
    private final TreeMap<Integer, Object> A;
    private final jja b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private jjm g;
    private jjk h;
    private jjm i;
    private jjm j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private byte[] p;
    private int q;
    private int r;
    private final jjb s;

    static {
        a = Charset.forName("US-ASCII");
        t = jjb.a(jjb.C);
        u = jjb.a(jjb.D);
        v = jjb.a(jjb.am);
        w = jjb.a(jjb.E);
        x = jjb.a(jjb.F);
        y = jjb.a(jjb.i);
        z = jjb.a(jjb.m);
    }

    private boolean a(int i) {
        switch (i) {
            case wi.w /*0*/:
                if ((this.c & 1) == 0) {
                    return false;
                }
                return true;
            case wi.j /*1*/:
                if ((this.c & 2) == 0) {
                    return false;
                }
                return true;
            case wi.l /*2*/:
                if ((this.c & 4) == 0) {
                    return false;
                }
                return true;
            case wi.z /*3*/:
                return (this.c & 16) != 0;
            case wi.h /*4*/:
                if ((this.c & 8) == 0) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    private boolean l() {
        return (this.c & 32) != 0;
    }

    jjh(InputStream inputStream, int i, jjb jjb) {
        this.d = 0;
        this.e = 0;
        this.l = false;
        this.n = 0;
        this.A = new TreeMap();
        if (inputStream == null) {
            throw new IOException("Null argument inputStream to ExifParser");
        }
        this.s = jjb;
        this.l = a(inputStream);
        this.b = new jja(inputStream);
        this.c = i;
        if (this.l) {
            short c = this.b.c();
            if ((short) 18761 == c) {
                this.b.a(ByteOrder.LITTLE_ENDIAN);
            } else if ((short) 19789 == c) {
                this.b.a(ByteOrder.BIG_ENDIAN);
            } else {
                throw new jjd("Invalid TIFF header");
            }
            if (this.b.c() != (short) 42) {
                throw new jjd("Invalid TIFF header");
            }
            long f = this.b.f();
            if (f > 2147483647L) {
                throw new jjd("Invalid offset " + f);
            }
            this.q = (int) f;
            this.f = 0;
            if (a(0) || m()) {
                a(0, f);
                int i2 = ((int) f) - 8;
                if (i2 < 0) {
                    throw new jjd("Invalid offset " + f);
                } else if (i2 > 0) {
                    this.p = new byte[i2];
                    a(this.p);
                }
            }
        }
    }

    protected static jjh a(InputStream inputStream, jjb jjb) {
        return new jjh(inputStream, 63, jjb);
    }

    protected int a() {
        if (!this.l) {
            return 6;
        }
        int a = this.b.a();
        int i = (this.d + 2) + (this.e * 12);
        if (a < i) {
            this.g = n();
            if (this.g == null) {
                return a();
            }
            if (!this.k) {
                return 1;
            }
            c(this.g);
            return 1;
        }
        if (a == i) {
            if (this.f == 0) {
                long q = q();
                if ((a(1) || l()) && q != 0) {
                    a(1, q);
                }
            } else {
                int i2;
                if (this.A.isEmpty()) {
                    i2 = 4;
                } else {
                    i2 = ((Integer) this.A.firstEntry().getKey()).intValue() - this.b.a();
                }
                if (i2 >= 4) {
                    long q2 = q();
                    if (q2 != 0 && Log.isLoggable("ExifParser", 5)) {
                        new StringBuilder(46).append("Invalid link to next IFD: ").append(q2);
                    }
                } else if (Log.isLoggable("ExifParser", 5)) {
                    new StringBuilder(45).append("Invalid size of link to next IFD: ").append(i2);
                }
            }
        }
        while (!this.A.isEmpty()) {
            Entry pollFirstEntry = this.A.pollFirstEntry();
            Object value = pollFirstEntry.getValue();
            try {
                b(((Integer) pollFirstEntry.getKey()).intValue());
                if (value instanceof jjj) {
                    this.f = ((jjj) value).a;
                    this.e = this.b.d();
                    this.d = ((Integer) pollFirstEntry.getKey()).intValue();
                    if (((this.e * 12) + this.d) + 2 > this.m) {
                        if (Log.isLoggable("ExifParser", 5)) {
                            new StringBuilder(31).append("Invalid size of IFD ").append(this.f);
                        }
                        return 6;
                    }
                    this.k = m();
                    if (((jjj) value).b) {
                        return 0;
                    }
                    b();
                } else if (value instanceof jjk) {
                    this.h = (jjk) value;
                    return this.h.b;
                } else {
                    jji jji = (jji) value;
                    this.g = jji.a;
                    if (this.g.c() != (short) 7) {
                        b(this.g);
                        c(this.g);
                    }
                    if (jji.b) {
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
        if (this.o == 0 && o()) {
            return 5;
        }
        return 6;
    }

    protected void b() {
        int i = (this.e * 12) + (this.d + 2);
        int a = this.b.a();
        if (a <= i) {
            if (this.k) {
                while (a < i) {
                    this.g = n();
                    a += 12;
                    if (this.g != null) {
                        c(this.g);
                    }
                }
            } else {
                b(i);
            }
            long q = q();
            if (this.f != 0) {
                return;
            }
            if ((a(1) || l()) && q > 0) {
                a(1, q);
            }
        }
    }

    private boolean m() {
        switch (this.f) {
            case wi.w /*0*/:
                if (a(2) || a(4) || a(3) || a(1)) {
                    return true;
                }
                return false;
            case wi.j /*1*/:
                return l();
            case wi.l /*2*/:
                return a(3);
            default:
                return false;
        }
    }

    protected jjm c() {
        return this.g;
    }

    protected int d() {
        return this.f;
    }

    protected int e() {
        return this.h.a;
    }

    protected int f() {
        if (this.i == null) {
            return 0;
        }
        return (int) this.i.e(0);
    }

    protected int g() {
        if (this.j == null) {
            return 0;
        }
        return (int) this.j.e(0);
    }

    private void b(int i) {
        this.b.a((long) i);
        while (!this.A.isEmpty() && ((Integer) this.A.firstKey()).intValue() < i) {
            this.A.pollFirstEntry();
        }
    }

    protected void a(jjm jjm) {
        if (jjm.j() >= this.b.a()) {
            this.A.put(Integer.valueOf(jjm.j()), new jji(jjm, true));
        }
    }

    private void a(int i, long j) {
        this.A.put(Integer.valueOf((int) j), new jjj(i, a(i)));
    }

    private void b(int i, long j) {
        this.A.put(Integer.valueOf((int) j), new jjk(4, i));
    }

    private jjm n() {
        boolean z = true;
        short c = this.b.c();
        short c2 = this.b.c();
        long f = this.b.f();
        if (f > 2147483647L) {
            throw new jjd("Number of component is larger then Integer.MAX_VALUE");
        } else if (jjm.a(c2)) {
            int i = (int) f;
            int i2 = this.f;
            if (((int) f) == 0) {
                z = false;
            }
            jjm jjm = new jjm(c, c2, i, i2, z);
            int d = jjm.d();
            if (d > 4) {
                long f2 = this.b.f();
                if (f2 > 2147483647L) {
                    throw new jjd("offset is larger then Integer.MAX_VALUE");
                } else if (this.p == null || f2 >= ((long) this.q) || c2 != (short) 7) {
                    jjm.g((int) f2);
                    return jjm;
                } else {
                    byte[] bArr = new byte[((int) f)];
                    System.arraycopy(this.p, ((int) f2) - 8, bArr, 0, (int) f);
                    jjm.a(bArr);
                    return jjm;
                }
            }
            boolean k = jjm.k();
            jjm.a(false);
            b(jjm);
            jjm.a(k);
            this.b.skip((long) (4 - d));
            jjm.g(this.b.a() - 4);
            return jjm;
        } else {
            if (Log.isLoggable("ExifParser", 5)) {
                String.format("Tag %04x: Invalid data type %d", new Object[]{Short.valueOf(c), Short.valueOf(c2)});
            }
            this.b.skip(4);
            return null;
        }
    }

    private void c(jjm jjm) {
        int i = 0;
        if (jjm.e() != 0) {
            short b = jjm.b();
            int a = jjm.a();
            if (b == t && a(a, jjb.C)) {
                if (a(2) || a(3)) {
                    a(2, jjm.e(0));
                }
            } else if (b == u && a(a, jjb.D)) {
                if (a(4)) {
                    a(4, jjm.e(0));
                }
            } else if (b == v && a(a, jjb.am)) {
                if (a(3)) {
                    a(3, jjm.e(0));
                }
            } else if (b == w && a(a, jjb.E)) {
                if (l()) {
                    this.A.put(Integer.valueOf((int) jjm.e(0)), new jjk(3));
                }
            } else if (b == x && a(a, jjb.F)) {
                if (l()) {
                    this.j = jjm;
                }
            } else if (b == y && a(a, jjb.i)) {
                if (!l()) {
                    return;
                }
                if (jjm.f()) {
                    while (i < jjm.e()) {
                        jjm.c();
                        b(i, jjm.e(i));
                        i++;
                    }
                    return;
                }
                this.A.put(Integer.valueOf(jjm.j()), new jji(jjm, false));
            } else if (b == z && a(a, jjb.m) && l() && jjm.f()) {
                this.i = jjm;
            }
        }
    }

    private boolean a(int i, int i2) {
        int i3 = this.s.a().get(i2);
        if (i3 == 0) {
            return false;
        }
        return jjb.a(i3, i);
    }

    protected void b(jjm jjm) {
        String valueOf;
        int i;
        int i2 = 0;
        short c = jjm.c();
        if (c == (short) 2 || c == (short) 7 || c == (short) 1) {
            int e = jjm.e();
            if (!this.A.isEmpty() && ((Integer) this.A.firstEntry().getKey()).intValue() < e + this.b.a()) {
                Object value = this.A.firstEntry().getValue();
                if (value instanceof jjk) {
                    if (Log.isLoggable("ExifParser", 5)) {
                        valueOf = String.valueOf(jjm);
                        new StringBuilder(String.valueOf(valueOf).length() + 35).append("Thumbnail overlaps value for tag: \n").append(valueOf);
                    }
                    Entry pollFirstEntry = this.A.pollFirstEntry();
                    if (Log.isLoggable("ExifParser", 5)) {
                        valueOf = String.valueOf(pollFirstEntry.getKey());
                        new StringBuilder(String.valueOf(valueOf).length() + 26).append("Invalid thumbnail offset: ").append(valueOf);
                    }
                } else {
                    String valueOf2;
                    if (value instanceof jjj) {
                        if (Log.isLoggable("ExifParser", 5)) {
                            i = ((jjj) value).a;
                            valueOf2 = String.valueOf(jjm);
                            new StringBuilder(String.valueOf(valueOf2).length() + 41).append("Ifd ").append(i).append(" overlaps value for tag: \n").append(valueOf2);
                        }
                    } else if ((value instanceof jji) && Log.isLoggable("ExifParser", 5)) {
                        valueOf = String.valueOf(((jji) value).a);
                        valueOf2 = String.valueOf(jjm);
                        new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf2).length()).append("Tag value for tag: \n").append(valueOf).append(" overlaps value for tag: \n").append(valueOf2);
                    }
                    i = ((Integer) this.A.firstEntry().getKey()).intValue() - this.b.a();
                    if (Log.isLoggable("ExifParser", 5)) {
                        valueOf2 = String.valueOf(jjm);
                        new StringBuilder(String.valueOf(valueOf2).length() + 52).append("Invalid size of tag: \n").append(valueOf2).append(" setting count to: ").append(i);
                    }
                    jjm.c(i);
                }
            }
        }
        int[] iArr;
        switch (jjm.c()) {
            case wi.j /*1*/:
            case wi.q /*7*/:
                byte[] bArr = new byte[jjm.e()];
                a(bArr);
                jjm.a(bArr);
                break;
            case wi.l /*2*/:
                jjm.a(c(jjm.e()));
                break;
            case wi.z /*3*/:
                iArr = new int[jjm.e()];
                e = iArr.length;
                while (i2 < e) {
                    iArr[i2] = p();
                    i2++;
                }
                jjm.a(iArr);
                break;
            case wi.h /*4*/:
                long[] jArr = new long[jjm.e()];
                e = jArr.length;
                while (i2 < e) {
                    jArr[i2] = q();
                    i2++;
                }
                jjm.a(jArr);
                break;
            case wi.p /*5*/:
                jjq[] jjqArr = new jjq[jjm.e()];
                e = jjqArr.length;
                while (i2 < e) {
                    jjqArr[i2] = r();
                    i2++;
                }
                jjm.a(jjqArr);
                break;
            case wi.n /*9*/:
                iArr = new int[jjm.e()];
                e = iArr.length;
                while (i2 < e) {
                    iArr[i2] = s();
                    i2++;
                }
                jjm.a(iArr);
                break;
            case wi.dr /*10*/:
                jjq[] jjqArr2 = new jjq[jjm.e()];
                int length = jjqArr2.length;
                for (i = 0; i < length; i++) {
                    jjqArr2[i] = t();
                }
                jjm.a(jjqArr2);
                break;
        }
        if (Log.isLoggable("ExifParser", 2)) {
            valueOf = String.valueOf(jjm);
            new StringBuilder(String.valueOf(valueOf).length() + 1).append("\n").append(valueOf);
        }
    }

    private boolean a(InputStream inputStream) {
        jja jja = new jja(inputStream);
        if (jja.c() != (short) -40) {
            throw new jjd("Invalid JPEG format");
        }
        short c = jja.c();
        while (c != (short) -39 && !jjo.a(c)) {
            int d = jja.d();
            if (c == (short) -31 && d >= jjo.a.length + 2) {
                byte[] bArr = new byte[jjo.a.length];
                jja.read(bArr, 0, jjo.a.length);
                d -= jjo.a.length;
                if (Arrays.equals(bArr, jjo.a)) {
                    this.r = jja.a();
                    this.m = d;
                    this.n = this.r + this.m;
                    return true;
                }
            }
            if (d < 2 || ((long) (d - 2)) != jja.skip((long) (d - 2))) {
                return false;
            }
            c = jja.c();
        }
        return false;
    }

    private boolean o() {
        int a = (this.m - this.b.a()) - 2;
        if (a > 0 && this.b.skip((long) a) != ((long) a)) {
            return false;
        }
        this.b.a(ByteOrder.BIG_ENDIAN);
        try {
            short c = this.b.c();
            while (c != (short) -39 && !jjo.a(c)) {
                a = this.b.d();
                if (c == (short) -31 && a >= jjo.b.length + 2) {
                    byte[] bArr = new byte[jjo.b.length];
                    a(bArr, 0, jjo.b.length);
                    a -= jjo.b.length;
                    if (Arrays.equals(bArr, jjo.b)) {
                        this.o = a - 2;
                        return true;
                    }
                }
                if (a < 2 || ((long) (a - 2)) != this.b.skip((long) (a - 2))) {
                    return false;
                }
                c = this.b.c();
            }
            return false;
        } catch (EOFException e) {
            return false;
        }
    }

    byte[] h() {
        byte[] bArr = new byte[this.o];
        a(bArr, 0, this.o);
        return bArr;
    }

    protected int i() {
        return this.n;
    }

    protected int j() {
        return this.r;
    }

    private int a(byte[] bArr, int i, int i2) {
        return this.b.read(bArr, 0, i2);
    }

    protected int a(byte[] bArr) {
        return this.b.read(bArr);
    }

    private String c(int i) {
        return a(i, a);
    }

    private String a(int i, Charset charset) {
        if (i > 0) {
            return this.b.a(i, charset);
        }
        return "";
    }

    private int p() {
        return this.b.c() & 65535;
    }

    private long q() {
        return ((long) s()) & 4294967295L;
    }

    private jjq r() {
        return new jjq(q(), q());
    }

    private int s() {
        return this.b.e();
    }

    private jjq t() {
        return new jjq((long) s(), (long) s());
    }

    protected ByteOrder k() {
        return this.b.b();
    }
}
