package p000;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

final class jjg extends FilterOutputStream {
    private jjc f20245a;
    private int f20246b = 0;
    private int f20247c;
    private int f20248d;
    private byte[] f20249e = new byte[1];
    private ByteBuffer f20250f = ByteBuffer.allocate(4);
    private final jjb f20251g;

    protected jjg(OutputStream outputStream, jjb jjb) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f20251g = jjb;
    }

    protected void m24416a(jjc jjc) {
        this.f20245a = jjc;
    }

    private int m24408a(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(i - this.f20250f.position(), i3);
        this.f20250f.put(bArr, i2, min);
        return min;
    }

    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            if ((this.f20247c > 0 || this.f20248d > 0 || this.f20246b != 2) && i2 > 0) {
                int min;
                if (this.f20247c > 0) {
                    min = Math.min(this.f20247c, i2);
                    i2 -= min;
                    this.f20247c -= min;
                    i += min;
                }
                if (this.f20248d > 0) {
                    min = Math.min(this.f20248d, i2);
                    this.out.write(bArr, i, min);
                    i2 -= min;
                    this.f20248d -= min;
                    i += min;
                }
                if (i2 != 0) {
                    switch (this.f20246b) {
                        case 0:
                            min = m24408a(2, bArr, i, i2);
                            i += min;
                            i2 -= min;
                            if (this.f20250f.position() >= 2) {
                                this.f20250f.rewind();
                                if (this.f20250f.getShort() == (short) -40) {
                                    this.out.write(this.f20250f.array(), 0, 2);
                                    this.f20246b = 1;
                                    this.f20250f.rewind();
                                    m24410a();
                                    break;
                                }
                                throw new IOException("Not a valid jpeg image, cannot write exif");
                            }
                            return;
                        case 1:
                            min = m24408a(4, bArr, i, i2);
                            i += min;
                            i2 -= min;
                            if (this.f20250f.position() == 2 && this.f20250f.getShort() == (short) -39) {
                                this.out.write(this.f20250f.array(), 0, 2);
                                this.f20250f.rewind();
                            }
                            if (this.f20250f.position() >= 4) {
                                this.f20250f.rewind();
                                short s = this.f20250f.getShort();
                                if (s == (short) -31) {
                                    this.f20247c = (this.f20250f.getShort() & 65535) - 2;
                                    this.f20246b = 2;
                                } else if (jjo.m24496a(s)) {
                                    this.out.write(this.f20250f.array(), 0, 4);
                                    this.f20246b = 2;
                                } else {
                                    this.out.write(this.f20250f.array(), 0, 4);
                                    this.f20248d = (this.f20250f.getShort() & 65535) - 2;
                                }
                                this.f20250f.rewind();
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
        this.f20249e[0] = (byte) (i & 255);
        write(this.f20249e);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    private void m24410a() {
        int i = 0;
        if (this.f20245a != null) {
            jjc jjc = this.f20245a;
            ArrayList arrayList = new ArrayList();
            List h = jjc.m24404h();
            if (h != null) {
                for (int i2 = 0; i2 < h.size(); i2++) {
                    jjm jjm = (jjm) jjc.m24404h().get(0);
                    if (jjm.m24484h() == null && !jjb.m24370a(jjm.m24471b())) {
                        jjc.m24396b(jjm.m24471b(), jjm.m24463a());
                        arrayList.add(jjm);
                    }
                }
            }
            m24414b();
            int c = m24415c();
            if (c + 8 > 65535) {
                throw new IOException("Exif header is too large (>64Kb)");
            }
            jjp jjp = new jjp(this.out);
            jjp.m24498a(ByteOrder.BIG_ENDIAN);
            jjp.m24500a((short) -31);
            jjp.m24500a((short) ((c + 2) + jjo.f20300a.length));
            jjp.write(jjo.f20300a);
            if (this.f20245a.m24403g() == ByteOrder.BIG_ENDIAN) {
                jjp.m24500a((short) 19789);
            } else {
                jjp.m24500a((short) 18761);
            }
            jjp.m24498a(this.f20245a.m24403g());
            jjp.m24500a((short) 42);
            jjp.m24497a(8);
            jjg.m24412a(this.f20245a.m24395b(0), jjp);
            jjg.m24412a(this.f20245a.m24395b(2), jjp);
            jjn b = this.f20245a.m24395b(3);
            if (b != null) {
                jjg.m24412a(b, jjp);
            }
            b = this.f20245a.m24395b(4);
            if (b != null) {
                jjg.m24412a(b, jjp);
            }
            if (this.f20245a.m24395b(1) != null) {
                jjg.m24412a(this.f20245a.m24395b(1), jjp);
            }
            m24413a(jjp);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                this.f20245a.m24388a((jjm) obj);
            }
            if (this.f20245a.m24398b()) {
                byte[] a = this.f20245a.m24393a();
                jjp.m24498a(ByteOrder.BIG_ENDIAN);
                jjp.m24500a((short) -31);
                jjp.m24500a((short) ((a.length + 2) + jjo.f20301b.length));
                jjp.write(jjo.f20301b);
                jjp.write(a);
            }
        }
    }

    private void m24413a(jjp jjp) {
        if (this.f20245a.m24400d()) {
            jjp.write(this.f20245a.m24399c());
        } else if (this.f20245a.m24402f()) {
            for (int i = 0; i < this.f20245a.m24401e(); i++) {
                jjp.write(this.f20245a.m24394a(i));
            }
        }
    }

    private static void m24412a(jjn jjn, jjp jjp) {
        int i;
        int i2 = 0;
        jjm[] a = jjn.m24491a();
        jjp.m24500a((short) a.length);
        for (jjm jjm : a) {
            jjp.m24500a(jjm.m24471b());
            jjp.m24500a(jjm.m24474c());
            jjp.m24497a(jjm.m24478e());
            if (Log.isLoggable("ExifOutputStream", 2)) {
                String valueOf = String.valueOf(jjm);
                new StringBuilder(String.valueOf(valueOf).length() + 1).append("\n").append(valueOf);
            }
            if (jjm.m24476d() > 4) {
                jjp.m24497a(jjm.m24486j());
            } else {
                jjg.m24411a(jjm, jjp);
                int d = 4 - jjm.m24476d();
                for (i = 0; i < d; i++) {
                    jjp.write(0);
                }
            }
        }
        jjp.m24497a(jjn.m24495d());
        i = a.length;
        while (i2 < i) {
            jjm jjm2 = a[i2];
            if (jjm2.m24476d() > 4) {
                jjg.m24411a(jjm2, jjp);
            }
            i2++;
        }
    }

    private static int m24409a(jjn jjn, int i) {
        int c = i + (((jjn.m24494c() * 12) + 2) + 4);
        int i2 = c;
        for (jjm jjm : jjn.m24491a()) {
            if (jjm.m24476d() > 4) {
                jjm.m24482g(i2);
                i2 += jjm.m24476d();
            }
        }
        return i2;
    }

    private void m24414b() {
        jjn b = this.f20245a.m24395b(0);
        if (b == null) {
            b = new jjn(0);
            this.f20245a.m24391a(b);
        }
        jjm c = this.f20251g.m24385c(jjb.f20180C);
        if (c == null) {
            throw new IOException("No definition for crucial exif tag: " + jjb.f20180C);
        }
        jjm c2;
        b.m24488a(c);
        jjn b2 = this.f20245a.m24395b(2);
        if (b2 == null) {
            b2 = new jjn(2);
            this.f20245a.m24391a(b2);
        }
        if (this.f20245a.m24395b(4) != null) {
            c2 = this.f20251g.m24385c(jjb.f20181D);
            if (c2 == null) {
                throw new IOException("No definition for crucial exif tag: " + jjb.f20181D);
            }
            b.m24488a(c2);
        }
        if (this.f20245a.m24395b(3) != null) {
            jjm c3 = this.f20251g.m24385c(jjb.am);
            if (c3 == null) {
                throw new IOException("No definition for crucial exif tag: " + jjb.am);
            }
            b2.m24488a(c3);
        }
        b = this.f20245a.m24395b(1);
        if (this.f20245a.m24400d()) {
            if (b == null) {
                b = new jjn(1);
                this.f20245a.m24391a(b);
            }
            c = this.f20251g.m24385c(jjb.f20182E);
            if (c == null) {
                throw new IOException("No definition for crucial exif tag: " + jjb.f20182E);
            }
            b.m24488a(c);
            c = this.f20251g.m24385c(jjb.f20183F);
            if (c == null) {
                throw new IOException("No definition for crucial exif tag: " + jjb.f20183F);
            }
            c.m24477d(this.f20245a.m24399c().length);
            b.m24488a(c);
            b.m24493b(jjb.m24360a(jjb.f20212i));
            b.m24493b(jjb.m24360a(jjb.f20216m));
        } else if (this.f20245a.m24402f()) {
            if (b == null) {
                b = new jjn(1);
                this.f20245a.m24391a(b);
            }
            int e = this.f20245a.m24401e();
            c2 = this.f20251g.m24385c(jjb.f20212i);
            if (c2 == null) {
                throw new IOException("No definition for crucial exif tag: " + jjb.f20212i);
            }
            jjm c4 = this.f20251g.m24385c(jjb.f20216m);
            if (c4 == null) {
                throw new IOException("No definition for crucial exif tag: " + jjb.f20216m);
            }
            long[] jArr = new long[e];
            for (e = 0; e < this.f20245a.m24401e(); e++) {
                jArr[e] = (long) this.f20245a.m24394a(e).length;
            }
            c4.m24469a(jArr);
            b.m24488a(c2);
            b.m24488a(c4);
            b.m24493b(jjb.m24360a(jjb.f20182E));
            b.m24493b(jjb.m24360a(jjb.f20183F));
        } else if (b != null) {
            b.m24493b(jjb.m24360a(jjb.f20212i));
            b.m24493b(jjb.m24360a(jjb.f20216m));
            b.m24493b(jjb.m24360a(jjb.f20182E));
            b.m24493b(jjb.m24360a(jjb.f20183F));
        }
    }

    private int m24415c() {
        jjn b = this.f20245a.m24395b(0);
        int a = jjg.m24409a(b, 8);
        b.m24489a(jjb.m24360a(jjb.f20180C)).m24477d(a);
        jjn b2 = this.f20245a.m24395b(2);
        a = jjg.m24409a(b2, a);
        jjn b3 = this.f20245a.m24395b(3);
        if (b3 != null) {
            b2.m24489a(jjb.m24360a(jjb.am)).m24477d(a);
            a = jjg.m24409a(b3, a);
        }
        b2 = this.f20245a.m24395b(4);
        if (b2 != null) {
            b.m24489a(jjb.m24360a(jjb.f20181D)).m24477d(a);
            a = jjg.m24409a(b2, a);
        }
        b2 = this.f20245a.m24395b(1);
        if (b2 != null) {
            b.m24490a(a);
            a = jjg.m24409a(b2, a);
        }
        if (this.f20245a.m24400d()) {
            b2.m24489a(jjb.m24360a(jjb.f20182E)).m24477d(a);
            return this.f20245a.m24399c().length + a;
        } else if (!this.f20245a.m24402f()) {
            return a;
        } else {
            long[] jArr = new long[this.f20245a.m24401e()];
            int i = a;
            for (a = 0; a < this.f20245a.m24401e(); a++) {
                jArr[a] = (long) i;
                i += this.f20245a.m24394a(a).length;
            }
            b2.m24489a(jjb.m24360a(jjb.f20212i)).m24469a(jArr);
            return i;
        }
    }

    private static void m24411a(jjm jjm, jjp jjp) {
        int i = 0;
        if (jjm.m24481f()) {
            int e;
            switch (jjm.m24474c()) {
                case (short) 1:
                case (short) 7:
                    byte[] bArr = new byte[jjm.m24478e()];
                    jjm.m24473b(bArr);
                    jjp.write(bArr);
                    return;
                case (short) 2:
                    byte[] i2 = jjm.m24485i();
                    if (i2.length == jjm.m24478e()) {
                        i2[i2.length - 1] = (byte) 0;
                        jjp.write(i2);
                        return;
                    }
                    jjp.write(i2);
                    jjp.write(0);
                    return;
                case (short) 3:
                    e = jjm.m24478e();
                    while (i < e) {
                        jjp.m24500a((short) ((int) jjm.m24479e(i)));
                        i++;
                    }
                    return;
                case (short) 4:
                case (short) 9:
                    e = jjm.m24478e();
                    while (i < e) {
                        jjp.m24497a((int) jjm.m24479e(i));
                        i++;
                    }
                    return;
                case (short) 5:
                case (short) 10:
                    e = jjm.m24478e();
                    while (i < e) {
                        jjp.m24499a(jjm.m24480f(i));
                        i++;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
