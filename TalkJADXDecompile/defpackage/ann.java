package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: ann */
public class ann implements ani {
    private static final String a;
    private int[] b;
    private final int[] c;
    private ByteBuffer d;
    private byte[] e;
    private byte[] f;
    private int g;
    private int h;
    private short[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private int[] m;
    private int n;
    private anl o;
    private anj p;
    private Bitmap q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private boolean w;

    static {
        a = ann.class.getSimpleName();
    }

    public ann(anj anj, anl anl, ByteBuffer byteBuffer, int i) {
        this(anj);
        a(anl, byteBuffer, i);
    }

    private ann(anj anj) {
        this.c = new int[256];
        this.g = 0;
        this.h = 0;
        this.p = anj;
        this.o = new anl();
    }

    public ByteBuffer a() {
        return this.d;
    }

    public void b() {
        this.n = (this.n + 1) % this.o.c;
    }

    public int a(int i) {
        if (i < 0 || i >= this.o.c) {
            return -1;
        }
        return ((ank) this.o.e.get(i)).i;
    }

    public int c() {
        if (this.o.c <= 0 || this.n < 0) {
            return 0;
        }
        return a(this.n);
    }

    public int d() {
        return this.o.c;
    }

    public int e() {
        return this.n;
    }

    public int f() {
        return (this.d.limit() + this.l.length) + (this.m.length << 2);
    }

    public synchronized Bitmap g() {
        Bitmap bitmap;
        if (this.o.c <= 0 || this.n < 0) {
            if (Log.isLoggable(a, 3)) {
                int i = this.o.c;
                new StringBuilder(72).append("Unable to decode frame, frameCount=").append(i).append(", framePointer=").append(this.n);
            }
            this.s = 1;
        }
        if (this.s == 1 || this.s == 2) {
            if (Log.isLoggable(a, 3)) {
                new StringBuilder(42).append("Unable to decode frame, status=").append(this.s);
            }
            bitmap = null;
        } else {
            ank ank;
            int[] iArr;
            this.s = 0;
            ank ank2 = (ank) this.o.e.get(this.n);
            int i2 = this.n - 1;
            if (i2 >= 0) {
                ank = (ank) this.o.e.get(i2);
            } else {
                ank = null;
            }
            if (ank2.k != null) {
                iArr = ank2.k;
            } else {
                iArr = this.o.a;
            }
            this.b = iArr;
            if (this.b == null) {
                if (Log.isLoggable(a, 3)) {
                    new StringBuilder(49).append("No valid color table found for frame #").append(this.n);
                }
                this.s = 1;
                bitmap = null;
            } else {
                if (ank2.f) {
                    System.arraycopy(this.b, 0, this.c, 0, this.b.length);
                    this.b = this.c;
                    this.b[ank2.h] = 0;
                }
                bitmap = a(ank2, ank);
            }
        }
        return bitmap;
    }

    public void h() {
        this.o = null;
        if (this.l != null) {
            this.p.a(this.l);
        }
        if (this.m != null) {
            this.p.a(this.m);
        }
        if (this.q != null) {
            this.p.a(this.q);
        }
        this.q = null;
        this.d = null;
        this.w = false;
        if (this.e != null) {
            this.p.a(this.e);
        }
        if (this.f != null) {
            this.p.a(this.f);
        }
    }

    public synchronized void a(anl anl, ByteBuffer byteBuffer, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
        int highestOneBit = Integer.highestOneBit(i);
        this.s = 0;
        this.o = anl;
        this.w = false;
        this.n = -1;
        this.d = byteBuffer.asReadOnlyBuffer();
        this.d.position(0);
        this.d.order(ByteOrder.LITTLE_ENDIAN);
        this.r = false;
        for (ank ank : anl.e) {
            if (ank.g == 3) {
                this.r = true;
                break;
            }
        }
        this.t = highestOneBit;
        this.v = anl.f / highestOneBit;
        this.u = anl.g / highestOneBit;
        this.l = this.p.a(anl.f * anl.g);
        this.m = this.p.b(this.v * this.u);
    }

    private Bitmap a(ank ank, ank ank2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr = this.m;
        if (ank2 == null) {
            Arrays.fill(iArr, 0);
        }
        if (ank2 != null && ank2.g > 0) {
            if (ank2.g == 2) {
                i = 0;
                if (!ank.f) {
                    i = this.o.l;
                    if (ank.k != null && this.o.j == ank.h) {
                        i = 0;
                    }
                } else if (this.n == 0) {
                    this.w = true;
                }
                i2 = ank2.c / this.t;
                i3 = ((ank2.b / this.t) * this.v) + (ank2.a / this.t);
                i4 = i3 + ((ank2.d / this.t) * this.v);
                while (i3 < i4) {
                    i5 = i3 + i2;
                    for (i6 = i3; i6 < i5; i6++) {
                        iArr[i6] = i;
                    }
                    i3 += this.v;
                }
            } else if (ank2.g == 3 && this.q != null) {
                this.q.getPixels(iArr, 0, this.v, 0, 0, this.v, this.u);
            }
        }
        this.g = 0;
        this.h = 0;
        if (ank != null) {
            this.d.position(ank.j);
        }
        if (ank == null) {
            i = this.o.f * this.o.g;
        } else {
            i = ank.c * ank.d;
        }
        if (this.l == null || this.l.length < i) {
            this.l = this.p.a(i);
        }
        if (this.i == null) {
            this.i = new short[4096];
        }
        if (this.j == null) {
            this.j = new byte[4096];
        }
        if (this.k == null) {
            this.k = new byte[4097];
        }
        int j = j();
        int i8 = 1 << j;
        int i9 = i8 + 1;
        i2 = i8 + 2;
        int i10 = -1;
        i6 = j + 1;
        i3 = (1 << i6) - 1;
        for (i4 = 0; i4 < i8; i4++) {
            this.i[i4] = (short) 0;
            this.j[i4] = (byte) i4;
        }
        i4 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        i5 = 0;
        int i14 = i6;
        int i15 = i3;
        int i16 = i2;
        i6 = 0;
        i3 = 0;
        i2 = 0;
        while (i11 < i) {
            if (i3 == 0) {
                i3 = k();
                if (i3 <= 0) {
                    this.s = 3;
                    break;
                }
                i6 = 0;
            }
            i4 += (this.e[i6] & 255) << i5;
            int i17 = i6 + 1;
            i7 = i3 - 1;
            i6 = i14;
            i3 = i15;
            i14 = i13;
            int i18 = i5 + 8;
            i5 = i4;
            i4 = i2;
            i2 = i16;
            i16 = i18;
            while (i16 >= i6) {
                i13 = i5 & i3;
                i15 = i5 >> i6;
                i16 -= i6;
                if (i13 != i8) {
                    if (i13 <= i2) {
                        if (i13 == i9) {
                            i13 = i14;
                            i5 = i16;
                            i14 = i6;
                            i16 = i2;
                            i6 = i17;
                            i2 = i4;
                            i4 = i15;
                            i15 = i3;
                            i3 = i7;
                            break;
                        } else if (i10 == -1) {
                            i5 = i12 + 1;
                            this.k[i12] = this.j[i13];
                            i12 = i5;
                            i14 = i13;
                            i10 = i13;
                            i5 = i15;
                        } else {
                            if (i13 >= i2) {
                                i5 = i12 + 1;
                                this.k[i12] = (byte) i14;
                                i12 = i5;
                                i14 = i10;
                            } else {
                                i14 = i13;
                            }
                            while (i14 >= i8) {
                                i5 = i12 + 1;
                                this.k[i12] = this.j[i14];
                                short s = this.i[i14];
                                i12 = i5;
                            }
                            i14 = this.j[i14] & 255;
                            i5 = i12 + 1;
                            this.k[i12] = (byte) i14;
                            if (i2 < 4096) {
                                this.i[i2] = (short) i10;
                                this.j[i2] = (byte) i14;
                                i2++;
                                if ((i2 & i3) == 0 && i2 < 4096) {
                                    i6++;
                                    i3 += i2;
                                }
                            }
                            i12 = i11;
                            i11 = i5;
                            while (i11 > 0) {
                                i5 = i4 + 1;
                                i11--;
                                this.l[i4] = this.k[i11];
                                i12++;
                                i4 = i5;
                            }
                            i5 = i15;
                            i10 = i13;
                            i18 = i12;
                            i12 = i11;
                            i11 = i18;
                        }
                    } else {
                        this.s = 3;
                        i13 = i14;
                        i5 = i16;
                        i14 = i6;
                        i16 = i2;
                        i6 = i17;
                        i2 = i4;
                        i4 = i15;
                        i15 = i3;
                        i3 = i7;
                        break;
                    }
                }
                i6 = j + 1;
                i3 = (1 << i6) - 1;
                i2 = i8 + 2;
                i5 = i15;
                i10 = -1;
            }
            i13 = i14;
            i15 = i3;
            i3 = i7;
            i14 = i6;
            i6 = i17;
            i18 = i16;
            i16 = i2;
            i2 = i4;
            i4 = i5;
            i5 = i18;
        }
        for (i6 = i2; i6 < i; i6++) {
            this.l[i6] = (byte) 0;
        }
        i7 = ank.d / this.t;
        j = ank.b / this.t;
        i8 = ank.c / this.t;
        i9 = ank.a / this.t;
        i2 = 1;
        i3 = 8;
        i6 = 0;
        Object obj = this.n == 0 ? 1 : null;
        i14 = 0;
        while (i14 < i7) {
            if (ank.e) {
                if (i6 >= i7) {
                    i2++;
                    switch (i2) {
                        case wi.l /*2*/:
                            i6 = 4;
                            break;
                        case wi.z /*3*/:
                            i6 = 2;
                            i3 = 4;
                            break;
                        case wi.h /*4*/:
                            i6 = 1;
                            i3 = 2;
                            break;
                    }
                }
                i10 = i6 + i3;
                i13 = i3;
                i15 = i2;
            } else {
                i10 = i6;
                i13 = i3;
                i15 = i2;
                i6 = i14;
            }
            i6 += j;
            if (i6 < this.u) {
                i3 = this.v * i6;
                i2 = i3 + i9;
                i6 = i2 + i8;
                if (this.v + i3 < i6) {
                    i16 = this.v + i3;
                } else {
                    i16 = i6;
                }
                i3 = ank.c * (this.t * i14);
                int i19 = i3 + ((i16 - i2) * this.t);
                for (i17 = i2; i17 < i16; i17++) {
                    if (this.t == 1) {
                        i6 = this.b[this.l[i3] & 255];
                    } else {
                        int i20 = ank.c;
                        i12 = 0;
                        i11 = 0;
                        i5 = 0;
                        i4 = 0;
                        i2 = 0;
                        i6 = i3;
                        while (true) {
                            int length;
                            if (i6 < this.t + i3) {
                                length = this.l.length;
                                if (i6 < r0 && i6 < i19) {
                                    length = this.b[this.l[i6] & 255];
                                    if (length != 0) {
                                        i12 += length >>> 24;
                                        i11 += (length >> 16) & 255;
                                        i5 += (length >> 8) & 255;
                                        i4 += length & 255;
                                        i2++;
                                    }
                                    i6++;
                                }
                            }
                            i6 = i3 + i20;
                            while (true) {
                                if (i6 < (i3 + i20) + this.t) {
                                    length = this.l.length;
                                    if (i6 < r0 && i6 < i19) {
                                        length = this.b[this.l[i6] & 255];
                                        if (length != 0) {
                                            i12 += length >>> 24;
                                            i11 += (length >> 16) & 255;
                                            i5 += (length >> 8) & 255;
                                            i4 += length & 255;
                                            i2++;
                                        }
                                        i6++;
                                    }
                                }
                                if (i2 == 0) {
                                    i6 = 0;
                                } else {
                                    i6 = ((((i12 / i2) << 24) | ((i11 / i2) << 16)) | ((i5 / i2) << 8)) | (i4 / i2);
                                }
                            }
                        }
                    }
                    if (i6 != 0) {
                        iArr[i17] = i6;
                    } else if (!(this.w || obj == null)) {
                        this.w = true;
                    }
                    i3 += this.t;
                }
            }
            i14++;
            i6 = i10;
            i3 = i13;
            i2 = i15;
        }
        if (this.r && (ank.g == 0 || ank.g == 1)) {
            if (this.q == null) {
                this.q = l();
            }
            this.q.setPixels(iArr, 0, this.v, 0, 0, this.v, this.u);
        }
        Bitmap l = l();
        l.setPixels(iArr, 0, this.v, 0, 0, this.v, this.u);
        return l;
    }

    private void i() {
        if (this.g <= this.h) {
            if (this.f == null) {
                this.f = this.p.a(16384);
            }
            this.h = 0;
            this.g = Math.min(this.d.remaining(), 16384);
            this.d.get(this.f, 0, this.g);
        }
    }

    private int j() {
        try {
            i();
            byte[] bArr = this.f;
            int i = this.h;
            this.h = i + 1;
            return bArr[i] & 255;
        } catch (Exception e) {
            this.s = 1;
            return 0;
        }
    }

    private int k() {
        int j = j();
        if (j > 0) {
            try {
                if (this.e == null) {
                    this.e = this.p.a(255);
                }
                int i = this.g - this.h;
                if (i >= j) {
                    System.arraycopy(this.f, this.h, this.e, 0, j);
                    this.h += j;
                } else if (this.d.remaining() + i >= j) {
                    System.arraycopy(this.f, this.h, this.e, 0, i);
                    this.h = this.g;
                    i();
                    int i2 = j - i;
                    System.arraycopy(this.f, 0, this.e, i, i2);
                    this.h += i2;
                } else {
                    this.s = 1;
                }
            } catch (Exception e) {
                this.s = 1;
            }
        }
        return j;
    }

    private Bitmap l() {
        Bitmap a = this.p.a(this.v, this.u, this.w ? Config.ARGB_8888 : Config.RGB_565);
        if (VERSION.SDK_INT >= 12) {
            a.setHasAlpha(true);
        }
        return a;
    }
}
