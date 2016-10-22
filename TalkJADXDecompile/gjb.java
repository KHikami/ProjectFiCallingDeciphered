import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.SparseArray;

public final class gjb extends giz {
    private static volatile int e;
    private final SparseArray<gjc> f;
    private final Object g;
    private final int h;
    private int i;
    private int j;
    private boolean k;
    private final int l;
    private final int m;
    private int n;

    static {
        e = 0;
    }

    protected gjb(int i, int i2, int i3, int i4, String str) {
        boolean z = false;
        super(str);
        this.g = new Object();
        this.k = false;
        this.n = 0;
        this.h = i;
        this.f = new SparseArray();
        if (i4 >= 0) {
            z = true;
        }
        iil.a("Expected condition to be true", z);
        this.l = i4;
        this.m = c(i4, i4);
        if (i4 != 0) {
            this.k = true;
            this.i = i2;
            this.j = i3;
        }
    }

    private static int c(int i, int i2) {
        if (i > 65535 || i2 > 65535) {
            return 0;
        }
        return (i << 16) | i2;
    }

    private static String a(int i) {
        return (i >>> 16) + "x" + (65535 & i);
    }

    private Bitmap b(int i, int i2, gja gja) {
        String valueOf;
        Bitmap bitmap;
        String str;
        int c = c(i, i2);
        String str2;
        if (c != 0) {
            synchronized (this.g) {
                Bitmap a;
                if (this.k) {
                    for (int i3 = 0; i3 < this.i; i3++) {
                        a = super.a(this.l, this.l, null);
                        this.n++;
                        a(a);
                    }
                    this.k = false;
                }
                gjc gjc = (gjc) this.f.get(c);
                if (gjc == null || gjc.a <= 0) {
                    if (b) {
                        str2 = this.c;
                        valueOf = String.valueOf(a(c));
                        new StringBuilder((String.valueOf(str2).length() + 45) + String.valueOf(valueOf).length()).append("BitmapPoolICS(").append(str2).append(") no bitmaps in pool for size: ").append(valueOf);
                    }
                    Object obj = null;
                } else {
                    if (b) {
                        valueOf = this.c;
                        String valueOf2 = String.valueOf(a(c));
                        int i4 = gjc.a;
                        String valueOf3 = String.valueOf(gjc.b[gjc.a - 1]);
                        new StringBuilder(((String.valueOf(valueOf).length() + 81) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("BitmapPoolICS(").append(valueOf).append(") found bitmap from pool for size=").append(valueOf2).append(" numAvailable=").append(i4).append(" Bitmap=").append(valueOf3);
                    }
                    gjc.a--;
                    a = gjc.b[gjc.a];
                    gjc.b[gjc.a] = null;
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
        if (bitmap == null && c == this.m) {
            ActivityManager activityManager = (ActivityManager) gwb.H().getSystemService("activity");
            MemoryInfo memoryInfo = new MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.lowMemory || this.n >= this.j) {
                bitmap = null;
            } else {
                bitmap = super.a(this.l, this.l, null);
                this.n++;
            }
        }
        if (bitmap == null && gja != null) {
            bitmap = gja.a(i, i2);
            if (b) {
                if (bitmap != null) {
                    str = this.c;
                    valueOf = String.valueOf(a(c));
                    new StringBuilder((String.valueOf(str).length() + 53) + String.valueOf(valueOf).length()).append("BitmapPoolICS(").append(str).append(") found bitmap from provider for size: ").append(valueOf);
                } else {
                    str = this.c;
                    valueOf = String.valueOf(a(c));
                    new StringBuilder((String.valueOf(str).length() + 49) + String.valueOf(valueOf).length()).append("BitmapPoolICS(").append(str).append(") no bitmaps in provider for size: ").append(valueOf);
                }
            }
        }
        if (b) {
            valueOf = this.c;
            String valueOf4 = String.valueOf(a(c));
            str = bitmap == null ? "To Be Allocated" : bitmap.toString();
            new StringBuilder(((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf4).length()) + String.valueOf(str).length()).append("BitmapPoolICS(").append(valueOf).append(") final findPoolBitmap: ").append(valueOf4).append(" bitmap=").append(str);
        }
        return bitmap;
    }

    private void a(Options options, int i, int i2, gja gja) {
        if (!options.inJustDecodeBounds) {
            options.inBitmap = b(i, i2, gja);
        }
    }

    public Bitmap a(int i, int i2, gja gja) {
        Bitmap b = b(i, i2, gja);
        if (b == null) {
            if (c(i, i2) == this.m) {
                this.n++;
            }
            return super.a(i, i2, null);
        }
        b.eraseColor(0);
        b.setHasAlpha(true);
        return b;
    }

    public void a(Bitmap bitmap) {
        iil.b("Expected condition to be false", blc.a(bitmap));
        if (b) {
            iil.b("Expected condition to be false", b(bitmap));
            iil.b("Expected condition to be false", gkd.a().b(bitmap));
        }
        if (b) {
            String str = this.c;
            String valueOf = String.valueOf(bitmap == null ? null : bitmap.toString());
            new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(valueOf).length()).append("BitmapPoolICS(").append(str).append(") put bitmap b=").append(valueOf);
        }
        if (bitmap == null) {
            str = this.c;
            glk.c("Babel", new StringBuilder(String.valueOf(str).length() + 37).append("BitmapPoolICS(").append(str).append(") receiving null bitmap").toString(), new Exception());
            return;
        }
        int c = c(bitmap.getWidth(), bitmap.getHeight());
        if (c == 0 || !bitmap.isMutable()) {
            c(bitmap);
            return;
        }
        synchronized (this.g) {
            gjc gjc = (gjc) this.f.get(c);
            if (gjc == null) {
                gjc = new gjc(c == this.m ? this.i : this.h);
                this.f.append(c, gjc);
            }
            if (gjc.a < gjc.b.length) {
                gjc.b[gjc.a] = bitmap;
                gjc.a++;
                if (b) {
                    str = this.c;
                    String valueOf2 = String.valueOf(a(c));
                    new StringBuilder((String.valueOf(str).length() + 79) + String.valueOf(valueOf2).length()).append("BitmapPoolICS(").append(str).append(") putting bitmap into size pool ").append(valueOf2).append(" which now has ").append(gjc.a).append(" items.");
                }
            } else {
                if (b) {
                    str = this.c;
                    String valueOf3 = String.valueOf(a(c));
                    new StringBuilder((String.valueOf(str).length() + 92) + String.valueOf(valueOf3).length()).append("BitmapPoolICS(").append(str).append(") tried putting bitmap into size pool ").append(valueOf3).append(" but it was full with ").append(gjc.a).append(" items.");
                }
                if (c == this.m) {
                    this.n--;
                }
                c(bitmap);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        r7 = this;
        r2 = 0;
        r4 = r7.g;
        monitor-enter(r4);
        r3 = r2;
    L_0x0005:
        r0 = r7.f;	 Catch:{ all -> 0x0037 }
        r0 = r0.size();	 Catch:{ all -> 0x0037 }
        if (r3 >= r0) goto L_0x0030;
    L_0x000d:
        r0 = r7.f;	 Catch:{ all -> 0x0037 }
        r0 = r0.valueAt(r3);	 Catch:{ all -> 0x0037 }
        r0 = (gjc) r0;	 Catch:{ all -> 0x0037 }
        r1 = r2;
    L_0x0016:
        r5 = r0.a;	 Catch:{ all -> 0x0037 }
        if (r1 >= r5) goto L_0x0029;
    L_0x001a:
        r5 = r0.b;	 Catch:{ all -> 0x0037 }
        r5 = r5[r1];	 Catch:{ all -> 0x0037 }
        r7.c(r5);	 Catch:{ all -> 0x0037 }
        r5 = r0.b;	 Catch:{ all -> 0x0037 }
        r6 = 0;
        r5[r1] = r6;	 Catch:{ all -> 0x0037 }
        r1 = r1 + 1;
        goto L_0x0016;
    L_0x0029:
        r1 = 0;
        r0.a = r1;	 Catch:{ all -> 0x0037 }
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0005;
    L_0x0030:
        r0 = r7.f;	 Catch:{ all -> 0x0037 }
        r0.clear();	 Catch:{ all -> 0x0037 }
        monitor-exit(r4);	 Catch:{ all -> 0x0037 }
        return;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0037 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: gjb.a():void");
    }

    public boolean b(int i, int i2) {
        int c = c(i, i2);
        if (c == 0) {
            return super.b(i, i2);
        }
        synchronized (this.g) {
            gjc gjc = (gjc) this.f.get(c);
            if (gjc == null || gjc.a != gjc.b.length) {
                return false;
            }
            return true;
        }
    }

    boolean b(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        gjc gjc = (gjc) this.f.get(c(bitmap.getWidth(), bitmap.getHeight()));
        if (gjc == null) {
            return false;
        }
        for (int i = 0; i < gjc.a; i++) {
            if (gjc.b[i] == bitmap) {
                return true;
            }
        }
        return false;
    }

    SparseArray<gjc> b() {
        return this.f;
    }

    public Bitmap a(int i, Options options, int i2, int i3, gja gja) {
        Bitmap decodeResource;
        Object obj = null;
        iil.b("Expected non-null", (Object) options);
        a(options, i2, i3, null);
        try {
            decodeResource = BitmapFactory.decodeResource(this.a, i, options);
        } catch (IllegalArgumentException e) {
            if (options.inBitmap != null) {
                options.inBitmap = null;
                decodeResource = BitmapFactory.decodeResource(this.a, i, options);
                int i4 = e + 1;
                e = i4;
                if (i4 % 100 == 0) {
                    glk.d("Babel", "Pooled bitmap consistently not being reused count = " + e, new Object[0]);
                }
            }
            decodeResource = null;
        } catch (OutOfMemoryError e2) {
            glk.d("Babel", "Oom decoding resource " + i, new Object[0]);
            iio.a.a();
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

    public Bitmap a(byte[] bArr, Options options, int i, int i2, gja gja) {
        Bitmap decodeByteArray;
        Object obj = null;
        iil.b("Expected non-null", (Object) options);
        a(options, i, i2, gja);
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
                int i3 = e + 1;
                e = i3;
                if (i3 % 100 == 0) {
                    glk.d("Babel", "Pooled bitmap consistently not being reused count = " + e, new Object[0]);
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
