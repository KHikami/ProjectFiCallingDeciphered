package defpackage;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jjg */
final class jjg extends FilterOutputStream {
    private jjc a;
    private int b;
    private int c;
    private int d;
    private byte[] e;
    private ByteBuffer f;
    private final jjb g;

    protected jjg(OutputStream outputStream, jjb jjb) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.b = 0;
        this.e = new byte[1];
        this.f = ByteBuffer.allocate(4);
        this.g = jjb;
    }

    protected void a(jjc jjc) {
        this.a = jjc;
    }

    private int a(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(i - this.f.position(), i3);
        this.f.put(bArr, i2, min);
        return min;
    }

    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            if ((this.c > 0 || this.d > 0 || this.b != 2) && i2 > 0) {
                int min;
                if (this.c > 0) {
                    min = Math.min(this.c, i2);
                    i2 -= min;
                    this.c -= min;
                    i += min;
                }
                if (this.d > 0) {
                    min = Math.min(this.d, i2);
                    this.out.write(bArr, i, min);
                    i2 -= min;
                    this.d -= min;
                    i += min;
                }
                if (i2 != 0) {
                    switch (this.b) {
                        case wi.w /*0*/:
                            min = a(2, bArr, i, i2);
                            i += min;
                            i2 -= min;
                            if (this.f.position() >= 2) {
                                this.f.rewind();
                                if (this.f.getShort() == (short) -40) {
                                    this.out.write(this.f.array(), 0, 2);
                                    this.b = 1;
                                    this.f.rewind();
                                    a();
                                    break;
                                }
                                throw new IOException("Not a valid jpeg image, cannot write exif");
                            }
                            return;
                        case wi.j /*1*/:
                            min = a(4, bArr, i, i2);
                            i += min;
                            i2 -= min;
                            if (this.f.position() == 2 && this.f.getShort() == (short) -39) {
                                this.out.write(this.f.array(), 0, 2);
                                this.f.rewind();
                            }
                            if (this.f.position() >= 4) {
                                this.f.rewind();
                                short s = this.f.getShort();
                                if (s == (short) -31) {
                                    this.c = (this.f.getShort() & 65535) - 2;
                                    this.b = 2;
                                } else if (jjo.a(s)) {
                                    this.out.write(this.f.array(), 0, 4);
                                    this.b = 2;
                                } else {
                                    this.out.write(this.f.array(), 0, 4);
                                    this.d = (this.f.getShort() & 65535) - 2;
                                }
                                this.f.rewind();
                                break;
                            }
                            return;
                        default:
                            break;
                    }
                }
                return;
            } else if (i2 > 0) {
                this.out.write(bArr, i, i2);
                return;
            } else {
                return;
            }
        }
    }

    public void write(int i) {
        this.e[0] = (byte) (i & 255);
        write(this.e);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    private void a() {
        int i = 0;
        if (this.a != null) {
            jjc jjc = this.a;
            ArrayList arrayList = new ArrayList();
            List h = jjc.h();
            if (h != null) {
                for (int i2 = 0; i2 < h.size(); i2++) {
                    jjm jjm = (jjm) jjc.h().get(0);
                    if (jjm.h() == null && !jjb.a(jjm.b())) {
                        jjc.b(jjm.b(), jjm.a());
                        arrayList.add(jjm);
                    }
                }
            }
            b();
            int c = c();
            if (c + 8 > 65535) {
                throw new IOException("Exif header is too large (>64Kb)");
            }
            jjp jjp = new jjp(this.out);
            jjp.a(ByteOrder.BIG_ENDIAN);
            jjp.a((short) -31);
            jjp.a((short) ((c + 2) + jjo.a.length));
            jjp.write(jjo.a);
            if (this.a.g() == ByteOrder.BIG_ENDIAN) {
                jjp.a((short) 19789);
            } else {
                jjp.a((short) 18761);
            }
            jjp.a(this.a.g());
            jjp.a((short) 42);
            jjp.a(8);
            jjg.a(this.a.b(0), jjp);
            jjg.a(this.a.b(2), jjp);
            jjn b = this.a.b(3);
            if (b != null) {
                jjg.a(b, jjp);
            }
            b = this.a.b(4);
            if (b != null) {
                jjg.a(b, jjp);
            }
            if (this.a.b(1) != null) {
                jjg.a(this.a.b(1), jjp);
            }
            a(jjp);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                this.a.a((jjm) obj);
            }
            if (this.a.b()) {
                byte[] a = this.a.a();
                jjp.a(ByteOrder.BIG_ENDIAN);
                jjp.a((short) -31);
                jjp.a((short) ((a.length + 2) + jjo.b.length));
                jjp.write(jjo.b);
                jjp.write(a);
            }
        }
    }

    private void a(jjp jjp) {
        if (this.a.d()) {
            jjp.write(this.a.c());
        } else if (this.a.f()) {
            for (int i = 0; i < this.a.e(); i++) {
                jjp.write(this.a.a(i));
            }
        }
    }

    private static void a(jjn jjn, jjp jjp) {
        int i;
        int i2 = 0;
        jjm[] a = jjn.a();
        jjp.a((short) a.length);
        for (jjm jjm : a) {
            jjp.a(jjm.b());
            jjp.a(jjm.c());
            jjp.a(jjm.e());
            if (Log.isLoggable("ExifOutputStream", 2)) {
                String valueOf = String.valueOf(jjm);
                new StringBuilder(String.valueOf(valueOf).length() + 1).append("\n").append(valueOf);
            }
            if (jjm.d() > 4) {
                jjp.a(jjm.j());
            } else {
                jjg.a(jjm, jjp);
                int d = 4 - jjm.d();
                for (i = 0; i < d; i++) {
                    jjp.write(0);
                }
            }
        }
        jjp.a(jjn.d());
        i = a.length;
        while (i2 < i) {
            jjm jjm2 = a[i2];
            if (jjm2.d() > 4) {
                jjg.a(jjm2, jjp);
            }
            i2++;
        }
    }

    private static int a(jjn jjn, int i) {
        int c = i + (((jjn.c() * 12) + 2) + 4);
        int i2 = c;
        for (jjm jjm : jjn.a()) {
            if (jjm.d() > 4) {
                jjm.g(i2);
                i2 += jjm.d();
            }
        }
        return i2;
    }

    private void b() {
        jjn b = this.a.b(0);
        if (b == null) {
            b = new jjn(0);
            this.a.a(b);
        }
        jjm c = this.g.c(jjb.C);
        if (c == null) {
            throw new IOException("No definition for crucial exif tag: " + jjb.C);
        }
        jjm c2;
        b.a(c);
        jjn b2 = this.a.b(2);
        if (b2 == null) {
            b2 = new jjn(2);
            this.a.a(b2);
        }
        if (this.a.b(4) != null) {
            c2 = this.g.c(jjb.D);
            if (c2 == null) {
                throw new IOException("No definition for crucial exif tag: " + jjb.D);
            }
            b.a(c2);
        }
        if (this.a.b(3) != null) {
            jjm c3 = this.g.c(jjb.am);
            if (c3 == null) {
                throw new IOException("No definition for crucial exif tag: " + jjb.am);
            }
            b2.a(c3);
        }
        b = this.a.b(1);
        if (this.a.d()) {
            if (b == null) {
                b = new jjn(1);
                this.a.a(b);
            }
            c = this.g.c(jjb.E);
            if (c == null) {
                throw new IOException("No definition for crucial exif tag: " + jjb.E);
            }
            b.a(c);
            c = this.g.c(jjb.F);
            if (c == null) {
                throw new IOException("No definition for crucial exif tag: " + jjb.F);
            }
            c.d(this.a.c().length);
            b.a(c);
            b.b(jjb.a(jjb.i));
            b.b(jjb.a(jjb.m));
        } else if (this.a.f()) {
            if (b == null) {
                b = new jjn(1);
                this.a.a(b);
            }
            int e = this.a.e();
            c2 = this.g.c(jjb.i);
            if (c2 == null) {
                throw new IOException("No definition for crucial exif tag: " + jjb.i);
            }
            jjm c4 = this.g.c(jjb.m);
            if (c4 == null) {
                throw new IOException("No definition for crucial exif tag: " + jjb.m);
            }
            long[] jArr = new long[e];
            for (e = 0; e < this.a.e(); e++) {
                jArr[e] = (long) this.a.a(e).length;
            }
            c4.a(jArr);
            b.a(c2);
            b.a(c4);
            b.b(jjb.a(jjb.E));
            b.b(jjb.a(jjb.F));
        } else if (b != null) {
            b.b(jjb.a(jjb.i));
            b.b(jjb.a(jjb.m));
            b.b(jjb.a(jjb.E));
            b.b(jjb.a(jjb.F));
        }
    }

    private int c() {
        jjn b = this.a.b(0);
        int a = jjg.a(b, 8);
        b.a(jjb.a(jjb.C)).d(a);
        jjn b2 = this.a.b(2);
        a = jjg.a(b2, a);
        jjn b3 = this.a.b(3);
        if (b3 != null) {
            b2.a(jjb.a(jjb.am)).d(a);
            a = jjg.a(b3, a);
        }
        b2 = this.a.b(4);
        if (b2 != null) {
            b.a(jjb.a(jjb.D)).d(a);
            a = jjg.a(b2, a);
        }
        b2 = this.a.b(1);
        if (b2 != null) {
            b.a(a);
            a = jjg.a(b2, a);
        }
        if (this.a.d()) {
            b2.a(jjb.a(jjb.E)).d(a);
            return this.a.c().length + a;
        } else if (!this.a.f()) {
            return a;
        } else {
            long[] jArr = new long[this.a.e()];
            int i = a;
            for (a = 0; a < this.a.e(); a++) {
                jArr[a] = (long) i;
                i += this.a.a(a).length;
            }
            b2.a(jjb.a(jjb.i)).a(jArr);
            return i;
        }
    }

    private static void a(jjm jjm, jjp jjp) {
        int i = 0;
        if (jjm.f()) {
            int e;
            switch (jjm.c()) {
                case wi.j /*1*/:
                case wi.q /*7*/:
                    byte[] bArr = new byte[jjm.e()];
                    jjm.b(bArr);
                    jjp.write(bArr);
                case wi.l /*2*/:
                    byte[] i2 = jjm.i();
                    if (i2.length == jjm.e()) {
                        i2[i2.length - 1] = (byte) 0;
                        jjp.write(i2);
                        return;
                    }
                    jjp.write(i2);
                    jjp.write(0);
                case wi.z /*3*/:
                    e = jjm.e();
                    while (i < e) {
                        jjp.a((short) ((int) jjm.e(i)));
                        i++;
                    }
                case wi.h /*4*/:
                case wi.n /*9*/:
                    e = jjm.e();
                    while (i < e) {
                        jjp.a((int) jjm.e(i));
                        i++;
                    }
                case wi.p /*5*/:
                case wi.dr /*10*/:
                    e = jjm.e();
                    while (i < e) {
                        jjp.a(jjm.f(i));
                        i++;
                    }
                default:
            }
        }
    }
}
