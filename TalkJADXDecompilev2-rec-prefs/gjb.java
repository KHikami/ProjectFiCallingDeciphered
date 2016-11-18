package p000;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.SparseArray;

public final class gjb extends giz {
    private static volatile int f15339e = 0;
    private final SparseArray<gjc> f15340f;
    private final Object f15341g = new Object();
    private final int f15342h;
    private int f15343i;
    private int f15344j;
    private boolean f15345k = false;
    private final int f15346l;
    private final int f15347m;
    private int f15348n = 0;

    protected gjb(int i, int i2, int i3, int i4, String str) {
        boolean z = false;
        super(str);
        this.f15342h = i;
        this.f15340f = new SparseArray();
        if (i4 >= 0) {
            z = true;
        }
        iil.m21874a("Expected condition to be true", z);
        this.f15346l = i4;
        this.f15347m = gjb.m17794c(i4, i4);
        if (i4 != 0) {
            this.f15345k = true;
            this.f15343i = i2;
            this.f15344j = i3;
        }
    }

    private static int m17794c(int i, int i2) {
        if (i > 65535 || i2 > 65535) {
            return 0;
        }
        return (i << 16) | i2;
    }

    private static String m17791a(int i) {
        return (i >>> 16) + "x" + (65535 & i);
    }

    private Bitmap m17793b(int i, int i2, gja gja) {
        String valueOf;
        Bitmap bitmap;
        String str;
        int c = gjb.m17794c(i, i2);
        String str2;
        if (c != 0) {
            synchronized (this.f15341g) {
                Bitmap a;
                if (this.f15345k) {
                    for (int i3 = 0; i3 < this.f15343i; i3++) {
                        a = super.mo2284a(this.f15346l, this.f15346l, null);
                        this.f15348n++;
                        mo2288a(a);
                    }
                    this.f15345k = false;
                }
                gjc gjc = (gjc) this.f15340f.get(c);
                if (gjc == null || gjc.f15349a <= 0) {
                    if (b) {
                        str2 = this.c;
                        valueOf = String.valueOf(gjb.m17791a(c));
                        new StringBuilder((String.valueOf(str2).length() + 45) + String.valueOf(valueOf).length()).append("BitmapPoolICS(").append(str2).append(") no bitmaps in pool for size: ").append(valueOf);
                    }
                    Object obj = null;
                } else {
                    if (b) {
                        valueOf = this.c;
                        String valueOf2 = String.valueOf(gjb.m17791a(c));
                        int i4 = gjc.f15349a;
                        String valueOf3 = String.valueOf(gjc.f15350b[gjc.f15349a - 1]);
                        new StringBuilder(((String.valueOf(valueOf).length() + 81) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("BitmapPoolICS(").append(valueOf).append(") found bitmap from pool for size=").append(valueOf2).append(" numAvailable=").append(i4).append(" Bitmap=").append(valueOf3);
                    }
                    gjc.f15349a--;
                    a = gjc.f15350b[gjc.f15349a];
                    gjc.f15350b[gjc.f15349a] = null;
                    bitmap = a;
                }
            }
        } else {
            if (b) {
                str2 = this.c;
                new StringBuilder(String.valueOf(str2).length() + 57).append("BitmapPoolICS(").append(str2).append(") unsupported size: ").append(i).append("x").append(i2);
            }
            bitmap = null;
        }
        if (bitmap == null && c == this.f15347m) {
            ActivityManager activityManager = (ActivityManager) gwb.m1400H().getSystemService("activity");
            MemoryInfo memoryInfo = new MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.lowMemory || this.f15348n >= this.f15344j) {
                bitmap = null;
            } else {
                bitmap = super.mo2284a(this.f15346l, this.f15346l, null);
                this.f15348n++;
            }
        }
        if (bitmap == null && gja != null) {
            bitmap = gja.mo2281a(i, i2);
            if (b) {
                if (bitmap != null) {
                    str = this.c;
                    valueOf = String.valueOf(gjb.m17791a(c));
                    new StringBuilder((String.valueOf(str).length() + 53) + String.valueOf(valueOf).length()).append("BitmapPoolICS(").append(str).append(") found bitmap from provider for size: ").append(valueOf);
                } else {
                    str = this.c;
                    valueOf = String.valueOf(gjb.m17791a(c));
                    new StringBuilder((String.valueOf(str).length() + 49) + String.valueOf(valueOf).length()).append("BitmapPoolICS(").append(str).append(") no bitmaps in provider for size: ").append(valueOf);
                }
            }
        }
        if (b) {
            valueOf = this.c;
            String valueOf4 = String.valueOf(gjb.m17791a(c));
            str = bitmap == null ? "To Be Allocated" : bitmap.toString();
            new StringBuilder(((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf4).length()) + String.valueOf(str).length()).append("BitmapPoolICS(").append(valueOf).append(") final findPoolBitmap: ").append(valueOf4).append(" bitmap=").append(str);
        }
        return bitmap;
    }

    private void m17792a(Options options, int i, int i2, gja gja) {
        if (!options.inJustDecodeBounds) {
            options.inBitmap = m17793b(i, i2, gja);
        }
    }

    public Bitmap mo2284a(int i, int i2, gja gja) {
        Bitmap b = m17793b(i, i2, gja);
        if (b == null) {
            if (gjb.m17794c(i, i2) == this.f15347m) {
                this.f15348n++;
            }
            return super.mo2284a(i, i2, null);
        }
        b.eraseColor(0);
        b.setHasAlpha(true);
        return b;
    }

    public void mo2288a(Bitmap bitmap) {
        iil.m21879b("Expected condition to be false", blc.m5743a(bitmap));
        if (b) {
            iil.m21879b("Expected condition to be false", mo2290b(bitmap));
            iil.m21879b("Expected condition to be false", gkd.m17873a().m17776b(bitmap));
        }
        if (b) {
            String str = this.c;
            String valueOf = String.valueOf(bitmap == null ? null : bitmap.toString());
            new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(valueOf).length()).append("BitmapPoolICS(").append(str).append(") put bitmap b=").append(valueOf);
        }
        if (bitmap == null) {
            str = this.c;
            glk.m17978c("Babel", new StringBuilder(String.valueOf(str).length() + 37).append("BitmapPoolICS(").append(str).append(") receiving null bitmap").toString(), new Exception());
            return;
        }
        int c = gjb.m17794c(bitmap.getWidth(), bitmap.getHeight());
        if (c == 0 || !bitmap.isMutable()) {
            m17789c(bitmap);
            return;
        }
        synchronized (this.f15341g) {
            gjc gjc = (gjc) this.f15340f.get(c);
            if (gjc == null) {
                gjc = new gjc(c == this.f15347m ? this.f15343i : this.f15342h);
                this.f15340f.append(c, gjc);
            }
            if (gjc.f15349a < gjc.f15350b.length) {
                gjc.f15350b[gjc.f15349a] = bitmap;
                gjc.f15349a++;
                if (b) {
                    str = this.c;
                    String valueOf2 = String.valueOf(gjb.m17791a(c));
                    new StringBuilder((String.valueOf(str).length() + 79) + String.valueOf(valueOf2).length()).append("BitmapPoolICS(").append(str).append(") putting bitmap into size pool ").append(valueOf2).append(" which now has ").append(gjc.f15349a).append(" items.");
                }
            } else {
                if (b) {
                    str = this.c;
                    String valueOf3 = String.valueOf(gjb.m17791a(c));
                    new StringBuilder((String.valueOf(str).length() + 92) + String.valueOf(valueOf3).length()).append("BitmapPoolICS(").append(str).append(") tried putting bitmap into size pool ").append(valueOf3).append(" but it was full with ").append(gjc.f15349a).append(" items.");
                }
                if (c == this.f15347m) {
                    this.f15348n--;
                }
                m17789c(bitmap);
            }
        }
    }

    public void mo2287a() {
        synchronized (this.f15341g) {
            for (int i = 0; i < this.f15340f.size(); i++) {
                gjc gjc = (gjc) this.f15340f.valueAt(i);
                for (int i2 = 0; i2 < gjc.f15349a; i2++) {
                    m17789c(gjc.f15350b[i2]);
                    gjc.f15350b[i2] = null;
                }
                gjc.f15349a = 0;
            }
            this.f15340f.clear();
        }
    }

    public boolean mo2289b(int i, int i2) {
        int c = gjb.m17794c(i, i2);
        if (c == 0) {
            return super.mo2289b(i, i2);
        }
        synchronized (this.f15341g) {
            gjc gjc = (gjc) this.f15340f.get(c);
            if (gjc == null || gjc.f15349a != gjc.f15350b.length) {
                return false;
            }
            return true;
        }
    }

    boolean mo2290b(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        gjc gjc = (gjc) this.f15340f.get(gjb.m17794c(bitmap.getWidth(), bitmap.getHeight()));
        if (gjc == null) {
            return false;
        }
        for (int i = 0; i < gjc.f15349a; i++) {
            if (gjc.f15350b[i] == bitmap) {
                return true;
            }
        }
        return false;
    }

    SparseArray<gjc> m17800b() {
        return this.f15340f;
    }

    public Bitmap mo2285a(int i, Options options, int i2, int i3, gja gja) {
        Bitmap decodeResource;
        Object obj = null;
        iil.m21875b("Expected non-null", (Object) options);
        m17792a(options, i2, i3, null);
        try {
            decodeResource = BitmapFactory.decodeResource(this.a, i, options);
        } catch (IllegalArgumentException e) {
            if (options.inBitmap != null) {
                options.inBitmap = null;
                decodeResource = BitmapFactory.decodeResource(this.a, i, options);
                int i4 = f15339e + 1;
                f15339e = i4;
                if (i4 % 100 == 0) {
                    glk.m17981d("Babel", "Pooled bitmap consistently not being reused count = " + f15339e, new Object[0]);
                }
            }
            decodeResource = null;
        } catch (OutOfMemoryError e2) {
            glk.m17981d("Babel", "Oom decoding resource " + i, new Object[0]);
            iio.f17742a.m21892a();
            decodeResource = null;
        }
        if (b) {
            String str = this.c;
            if (decodeResource != null) {
                obj = decodeResource.toString();
            }
            String valueOf = String.valueOf(obj);
            new StringBuilder((String.valueOf(str).length() + 80) + String.valueOf(valueOf).length()).append("BitmapPoolICS(").append(str).append(") decodeSampledBitmapFromResource ICS for ").append(i).append(" bytes gave: ").append(valueOf);
        }
        return decodeResource;
    }

    public Bitmap mo2286a(byte[] bArr, Options options, int i, int i2, gja gja) {
        Bitmap decodeByteArray;
        Object obj = null;
        iil.m21875b("Expected non-null", (Object) options);
        m17792a(options, i, i2, gja);
        try {
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (IllegalArgumentException e) {
            if (b) {
                String str = this.c;
                new StringBuilder(String.valueOf(str).length() + 41).append("BitmapPoolICS(").append(str).append(") Unable to use pool bitmap");
            }
            if (options.inBitmap != null) {
                options.inBitmap = null;
                decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i3 = f15339e + 1;
                f15339e = i3;
                if (i3 % 100 == 0) {
                    glk.m17981d("Babel", "Pooled bitmap consistently not being reused count = " + f15339e, new Object[0]);
                }
            } else {
                decodeByteArray = null;
            }
        }
        if (b) {
            String str2 = this.c;
            int length = bArr.length;
            if (decodeByteArray != null) {
                obj = decodeByteArray.toString();
            }
            String valueOf = String.valueOf(obj);
            new StringBuilder((String.valueOf(str2).length() + 64) + String.valueOf(valueOf).length()).append("BitmapPoolICS(").append(str2).append(") decodeByteArray ICS for ").append(length).append(" bytes gave: ").append(valueOf);
        }
        return decodeByteArray;
    }
}
