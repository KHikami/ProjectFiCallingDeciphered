package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class ann implements ani {
    private static final String f1902a = ann.class.getSimpleName();
    private int[] f1903b;
    private final int[] f1904c;
    private ByteBuffer f1905d;
    private byte[] f1906e;
    private byte[] f1907f;
    private int f1908g;
    private int f1909h;
    private short[] f1910i;
    private byte[] f1911j;
    private byte[] f1912k;
    private byte[] f1913l;
    private int[] f1914m;
    private int f1915n;
    private anl f1916o;
    private anj f1917p;
    private Bitmap f1918q;
    private boolean f1919r;
    private int f1920s;
    private int f1921t;
    private int f1922u;
    private int f1923v;
    private boolean f1924w;

    public ann(anj anj, anl anl, ByteBuffer byteBuffer, int i) {
        this(anj);
        m3507a(anl, byteBuffer, i);
    }

    private ann(anj anj) {
        this.f1904c = new int[256];
        this.f1908g = 0;
        this.f1909h = 0;
        this.f1917p = anj;
        this.f1916o = new anl();
    }

    public ByteBuffer mo297a() {
        return this.f1905d;
    }

    public void mo298b() {
        this.f1915n = (this.f1915n + 1) % this.f1916o.f1887c;
    }

    public int m3505a(int i) {
        if (i < 0 || i >= this.f1916o.f1887c) {
            return -1;
        }
        return ((ank) this.f1916o.f1889e.get(i)).f1882i;
    }

    public int mo299c() {
        if (this.f1916o.f1887c <= 0 || this.f1915n < 0) {
            return 0;
        }
        return m3505a(this.f1915n);
    }

    public int mo300d() {
        return this.f1916o.f1887c;
    }

    public int mo301e() {
        return this.f1915n;
    }

    public int mo302f() {
        return (this.f1905d.limit() + this.f1913l.length) + (this.f1914m.length << 2);
    }

    public synchronized Bitmap mo303g() {
        Bitmap bitmap;
        if (this.f1916o.f1887c <= 0 || this.f1915n < 0) {
            if (Log.isLoggable(f1902a, 3)) {
                int i = this.f1916o.f1887c;
                new StringBuilder(72).append("Unable to decode frame, frameCount=").append(i).append(", framePointer=").append(this.f1915n);
            }
            this.f1920s = 1;
        }
        if (this.f1920s == 1 || this.f1920s == 2) {
            if (Log.isLoggable(f1902a, 3)) {
                new StringBuilder(42).append("Unable to decode frame, status=").append(this.f1920s);
            }
            bitmap = null;
        } else {
            ank ank;
            int[] iArr;
            this.f1920s = 0;
            ank ank2 = (ank) this.f1916o.f1889e.get(this.f1915n);
            int i2 = this.f1915n - 1;
            if (i2 >= 0) {
                ank = (ank) this.f1916o.f1889e.get(i2);
            } else {
                ank = null;
            }
            if (ank2.f1884k != null) {
                iArr = ank2.f1884k;
            } else {
                iArr = this.f1916o.f1885a;
            }
            this.f1903b = iArr;
            if (this.f1903b == null) {
                if (Log.isLoggable(f1902a, 3)) {
                    new StringBuilder(49).append("No valid color table found for frame #").append(this.f1915n);
                }
                this.f1920s = 1;
                bitmap = null;
            } else {
                if (ank2.f1879f) {
                    System.arraycopy(this.f1903b, 0, this.f1904c, 0, this.f1903b.length);
                    this.f1903b = this.f1904c;
                    this.f1903b[ank2.f1881h] = 0;
                }
                bitmap = m3500a(ank2, ank);
            }
        }
        return bitmap;
    }

    public void mo304h() {
        this.f1916o = null;
        if (this.f1913l != null) {
            this.f1917p.m3481a(this.f1913l);
        }
        if (this.f1914m != null) {
            this.f1917p.m3482a(this.f1914m);
        }
        if (this.f1918q != null) {
            this.f1917p.m3480a(this.f1918q);
        }
        this.f1918q = null;
        this.f1905d = null;
        this.f1924w = false;
        if (this.f1906e != null) {
            this.f1917p.m3481a(this.f1906e);
        }
        if (this.f1907f != null) {
            this.f1917p.m3481a(this.f1907f);
        }
    }

    public synchronized void m3507a(anl anl, ByteBuffer byteBuffer, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
        int highestOneBit = Integer.highestOneBit(i);
        this.f1920s = 0;
        this.f1916o = anl;
        this.f1924w = false;
        this.f1915n = -1;
        this.f1905d = byteBuffer.asReadOnlyBuffer();
        this.f1905d.position(0);
        this.f1905d.order(ByteOrder.LITTLE_ENDIAN);
        this.f1919r = false;
        for (ank ank : anl.f1889e) {
            if (ank.f1880g == 3) {
                this.f1919r = true;
                break;
            }
        }
        this.f1921t = highestOneBit;
        this.f1923v = anl.f1890f / highestOneBit;
        this.f1922u = anl.f1891g / highestOneBit;
        this.f1913l = this.f1917p.m3483a(anl.f1890f * anl.f1891g);
        this.f1914m = this.f1917p.m3484b(this.f1923v * this.f1922u);
    }

    private Bitmap m3500a(ank ank, ank ank2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr = this.f1914m;
        if (ank2 == null) {
            Arrays.fill(iArr, 0);
        }
        if (ank2 != null && ank2.f1880g > 0) {
            if (ank2.f1880g == 2) {
                i = 0;
                if (!ank.f1879f) {
                    i = this.f1916o.f1896l;
                    if (ank.f1884k != null && this.f1916o.f1894j == ank.f1881h) {
                        i = 0;
                    }
                } else if (this.f1915n == 0) {
                    this.f1924w = true;
                }
                i2 = ank2.f1876c / this.f1921t;
                i3 = ((ank2.f1875b / this.f1921t) * this.f1923v) + (ank2.f1874a / this.f1921t);
                i4 = i3 + ((ank2.f1877d / this.f1921t) * this.f1923v);
                while (i3 < i4) {
                    i5 = i3 + i2;
                    for (i6 = i3; i6 < i5; i6++) {
                        iArr[i6] = i;
                    }
                    i3 += this.f1923v;
                }
            } else if (ank2.f1880g == 3 && this.f1918q != null) {
                this.f1918q.getPixels(iArr, 0, this.f1923v, 0, 0, this.f1923v, this.f1922u);
            }
        }
        this.f1908g = 0;
        this.f1909h = 0;
        if (ank != null) {
            this.f1905d.position(ank.f1883j);
        }
        if (ank == null) {
            i = this.f1916o.f1890f * this.f1916o.f1891g;
        } else {
            i = ank.f1876c * ank.f1877d;
        }
        if (this.f1913l == null || this.f1913l.length < i) {
            this.f1913l = this.f1917p.m3483a(i);
        }
        if (this.f1910i == null) {
            this.f1910i = new short[4096];
        }
        if (this.f1911j == null) {
            this.f1911j = new byte[4096];
        }
        if (this.f1912k == null) {
            this.f1912k = new byte[4097];
        }
        int j = m3502j();
        int i8 = 1 << j;
        int i9 = i8 + 1;
        i2 = i8 + 2;
        int i10 = -1;
        i6 = j + 1;
        i3 = (1 << i6) - 1;
        for (i4 = 0; i4 < i8; i4++) {
            this.f1910i[i4] = (short) 0;
            this.f1911j[i4] = (byte) i4;
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
                i3 = m3503k();
                if (i3 <= 0) {
                    this.f1920s = 3;
                    break;
                }
                i6 = 0;
            }
            i4 += (this.f1906e[i6] & 255) << i5;
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
                            this.f1912k[i12] = this.f1911j[i13];
                            i12 = i5;
                            i14 = i13;
                            i10 = i13;
                            i5 = i15;
                        } else {
                            if (i13 >= i2) {
                                i5 = i12 + 1;
                                this.f1912k[i12] = (byte) i14;
                                i12 = i5;
                                i14 = i10;
                            } else {
                                i14 = i13;
                            }
                            while (i14 >= i8) {
                                i5 = i12 + 1;
                                this.f1912k[i12] = this.f1911j[i14];
                                short s = this.f1910i[i14];
                                i12 = i5;
                            }
                            i14 = this.f1911j[i14] & 255;
                            i5 = i12 + 1;
                            this.f1912k[i12] = (byte) i14;
                            if (i2 < 4096) {
                                this.f1910i[i2] = (short) i10;
                                this.f1911j[i2] = (byte) i14;
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
                                this.f1913l[i4] = this.f1912k[i11];
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
                        this.f1920s = 3;
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
            this.f1913l[i6] = (byte) 0;
        }
        i7 = ank.f1877d / this.f1921t;
        j = ank.f1875b / this.f1921t;
        i8 = ank.f1876c / this.f1921t;
        i9 = ank.f1874a / this.f1921t;
        i2 = 1;
        i3 = 8;
        i6 = 0;
        Object obj = this.f1915n == 0 ? 1 : null;
        i14 = 0;
        while (i14 < i7) {
            if (ank.f1878e) {
                if (i6 >= i7) {
                    i2++;
                    switch (i2) {
                        case 2:
                            i6 = 4;
                            break;
                        case 3:
                            i6 = 2;
                            i3 = 4;
                            break;
                        case 4:
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
            if (i6 < this.f1922u) {
                i3 = this.f1923v * i6;
                i2 = i3 + i9;
                i6 = i2 + i8;
                if (this.f1923v + i3 < i6) {
                    i16 = this.f1923v + i3;
                } else {
                    i16 = i6;
                }
                i3 = ank.f1876c * (this.f1921t * i14);
                int i19 = i3 + ((i16 - i2) * this.f1921t);
                for (i17 = i2; i17 < i16; i17++) {
                    if (this.f1921t == 1) {
                        i6 = this.f1903b[this.f1913l[i3] & 255];
                    } else {
                        int i20;
                        int i21 = ank.f1876c;
                        i12 = 0;
                        i11 = 0;
                        i5 = 0;
                        i4 = 0;
                        i2 = 0;
                        i6 = i3;
                        while (i6 < this.f1921t + i3 && i6 < this.f1913l.length && i6 < i19) {
                            i20 = this.f1903b[this.f1913l[i6] & 255];
                            if (i20 != 0) {
                                i12 += i20 >>> 24;
                                i11 += (i20 >> 16) & 255;
                                i5 += (i20 >> 8) & 255;
                                i4 += i20 & 255;
                                i2++;
                            }
                            i6++;
                        }
                        i6 = i3 + i21;
                        while (i6 < (i3 + i21) + this.f1921t && i6 < this.f1913l.length && i6 < i19) {
                            i20 = this.f1903b[this.f1913l[i6] & 255];
                            if (i20 != 0) {
                                i12 += i20 >>> 24;
                                i11 += (i20 >> 16) & 255;
                                i5 += (i20 >> 8) & 255;
                                i4 += i20 & 255;
                                i2++;
                            }
                            i6++;
                        }
                        if (i2 == 0) {
                            i6 = 0;
                        } else {
                            i6 = ((((i12 / i2) << 24) | ((i11 / i2) << 16)) | ((i5 / i2) << 8)) | (i4 / i2);
                        }
                    }
                    if (i6 != 0) {
                        iArr[i17] = i6;
                    } else if (!(this.f1924w || obj == null)) {
                        this.f1924w = true;
                    }
                    i3 += this.f1921t;
                }
            }
            i14++;
            i6 = i10;
            i3 = i13;
            i2 = i15;
        }
        if (this.f1919r && (ank.f1880g == 0 || ank.f1880g == 1)) {
            if (this.f1918q == null) {
                this.f1918q = m3504l();
            }
            this.f1918q.setPixels(iArr, 0, this.f1923v, 0, 0, this.f1923v, this.f1922u);
        }
        Bitmap l = m3504l();
        l.setPixels(iArr, 0, this.f1923v, 0, 0, this.f1923v, this.f1922u);
        return l;
    }

    private void m3501i() {
        if (this.f1908g <= this.f1909h) {
            if (this.f1907f == null) {
                this.f1907f = this.f1917p.m3483a(16384);
            }
            this.f1909h = 0;
            this.f1908g = Math.min(this.f1905d.remaining(), 16384);
            this.f1905d.get(this.f1907f, 0, this.f1908g);
        }
    }

    private int m3502j() {
        try {
            m3501i();
            byte[] bArr = this.f1907f;
            int i = this.f1909h;
            this.f1909h = i + 1;
            return bArr[i] & 255;
        } catch (Exception e) {
            this.f1920s = 1;
            return 0;
        }
    }

    private int m3503k() {
        int j = m3502j();
        if (j > 0) {
            try {
                if (this.f1906e == null) {
                    this.f1906e = this.f1917p.m3483a(255);
                }
                int i = this.f1908g - this.f1909h;
                if (i >= j) {
                    System.arraycopy(this.f1907f, this.f1909h, this.f1906e, 0, j);
                    this.f1909h += j;
                } else if (this.f1905d.remaining() + i >= j) {
                    System.arraycopy(this.f1907f, this.f1909h, this.f1906e, 0, i);
                    this.f1909h = this.f1908g;
                    m3501i();
                    int i2 = j - i;
                    System.arraycopy(this.f1907f, 0, this.f1906e, i, i2);
                    this.f1909h += i2;
                } else {
                    this.f1920s = 1;
                }
            } catch (Exception e) {
                this.f1920s = 1;
            }
        }
        return j;
    }

    private Bitmap m3504l() {
        Bitmap a = this.f1917p.m3479a(this.f1923v, this.f1922u, this.f1924w ? Config.ARGB_8888 : Config.RGB_565);
        if (VERSION.SDK_INT >= 12) {
            a.setHasAlpha(true);
        }
        return a;
    }
}
