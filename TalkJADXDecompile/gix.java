import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class gix implements gja, iip {
    public static final boolean a;
    public final giz b;
    private int c;
    private final LinkedHashMap<String, gkt> d;
    private final Object e;
    private boolean f;

    static {
        kae kae = glk.t;
        a = false;
    }

    public gix(Context context, int i) {
        boolean z;
        this.e = new Object();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bm.a(z);
        int memoryClass = (((ActivityManager) context.getSystemService("activity")).getMemoryClass() << 10) << 10;
        this.c = (int) (((double) memoryClass) / 10.0d);
        if (a) {
            new StringBuilder(159).append("Initializing BitmapCache; maxMemory available (bytes): ").append(memoryClass).append("; expected cacheSize (bytes): ").append(this.c).append("; min (bytes): 2097152").append("; max (bytes): 25165824");
        }
        this.c = Math.max(this.c, 2097152);
        this.c = Math.min(this.c, 25165824);
        if (a) {
            new StringBuilder(43).append("Initialized cache size (bytes): ").append(this.c);
        }
        this.d = new LinkedHashMap(0, 0.75f, true);
        this.f = giz.a(context);
        this.b = giz.a(context, 5, 30, 100, i, "Image");
    }

    public gkt a(String str, gkt gkt) {
        gkt gkt2;
        boolean z = true;
        bm.a((Object) gkt);
        if (a) {
            bm.b(!b(gkt.e()));
            if (this.b.b(gkt.e())) {
                z = false;
            }
            bm.b(z);
        }
        synchronized (this.e) {
            gkt2 = (gkt) this.d.put(str, gkt);
            c();
        }
        return gkt2;
    }

    private void c() {
        int i = 0;
        if (a) {
            synchronized (this.e) {
                int i2 = 0;
                int i3 = 0;
                for (Entry entry : this.d.entrySet()) {
                    gkt gkt = (gkt) entry.getValue();
                    Bitmap f = gkt.f();
                    if (f != null) {
                        int width = f.getWidth();
                        int height = f.getHeight();
                        i3 += width * height;
                        i2++;
                        i += f.getByteCount();
                        String str = (String) entry.getKey();
                        if (str.startsWith("//")) {
                            String str2 = "https:";
                            str = String.valueOf(str);
                            if (str.length() != 0) {
                                str = str2.concat(str);
                            } else {
                                str = new String(str2);
                            }
                        }
                        new StringBuilder(String.valueOf(str).length() + 73).append("*** Bitmap (refcount = ").append(gkt.i()).append(") ;   size: ").append(width).append(" x ").append(height).append(": ").append(str);
                    }
                    i2 = i2;
                    i3 = i3;
                    i = i;
                }
                double d = ((double) i) / 1024.0d;
                new StringBuilder(168).append("*****   Total Pixel Area : ").append(i3).append(" sq pixels; numBitmaps = ").append(i2).append("; totalBytes = ").append(i).append("; in KB = ").append(d).append("; in MB = ").append(d / 1024.0d);
            }
        }
    }

    public gkt a(String str) {
        gkt gkt;
        synchronized (this.e) {
            c();
            gkt = (gkt) this.d.get(str);
            if (gkt == null) {
                a(false);
            } else {
                gkt.a();
            }
        }
        return gkt;
    }

    public void h() {
        a(true);
    }

    public void b(int i) {
        a(i != 5);
    }

    private boolean a(int i) {
        if (a) {
            new StringBuilder(33).append("BitmapCache evictSome=").append(i);
        }
        c();
        switch (i) {
            case wi.w /*0*/:
                return true;
            case wi.j /*1*/:
                h();
                return true;
            case wi.l /*2*/:
                glk.d("Babel_BitmapCache", "Warning: BitmapCache hitting too many OOMs.", new Object[0]);
                iio.a.a();
                return true;
            default:
                return false;
        }
    }

    private static int c(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        return bitmap.getByteCount();
    }

    private void a(boolean z) {
        synchronized (this.e) {
            Iterator it;
            int c;
            c();
            if (a) {
                new StringBuilder(42).append("Begin BitmapCache prune: lowMemory = ").append(z);
            }
            int i = 0;
            int i2 = 0;
            for (Entry value : this.d.entrySet()) {
                gkt gkt = (gkt) value.getValue();
                if (gkt.i() == 0) {
                    i2++;
                }
                Bitmap f = gkt.f();
                if (f != null) {
                    c = c(f) + i;
                } else {
                    c = i;
                }
                i = c;
            }
            if (a) {
                new StringBuilder(108).append("Evictable bitmap count: ").append(i2).append("; total cache (bytes) = ").append(i).append("; max cache size (bytes) = ").append(this.c);
            }
            if (i2 == 0) {
                return;
            }
            i2 = z ? 0 : this.c;
            it = this.d.entrySet().iterator();
            int i3 = i;
            i = 0;
            while (it.hasNext()) {
                gkt = (gkt) ((Entry) it.next()).getValue();
                if (i3 > i2 && gkt.i() == 0) {
                    Bitmap c2 = gkt.c();
                    it.remove();
                    if (c2 != null) {
                        c = c(c2);
                        if (a) {
                            int i4 = i3 - this.c;
                            new StringBuilder(107).append("Evicting bitmap: size (").append(c2.getWidth()).append("x").append(c2.getHeight()).append("); bytes: ").append(c).append("; need to evict: ").append(i4).append(" bytes more.");
                        }
                        i3 -= c;
                        c += i;
                        if (z) {
                            c2.recycle();
                            i = c;
                        } else {
                            this.b.a(c2);
                            i = i3;
                            i3 = i;
                            i = c;
                        }
                    }
                }
                c = i;
                i = i3;
                i3 = i;
                i = c;
            }
            if (a && i > 0) {
                new StringBuilder(60).append("************************* Pruned total of ").append(i).append(" bytes.");
                c();
            }
        }
    }

    public Bitmap a(int i, int i2) {
        if (!this.f) {
            return null;
        }
        synchronized (this.e) {
            Iterator it;
            if (a) {
                new StringBuilder(100).append("BitmapCache getBitmap starting evictions cache size=").append(this.d.size()).append(" width=").append(i).append(" height=").append(i2);
            }
            int i3 = 0;
            for (Entry value : this.d.entrySet()) {
                int c;
                Bitmap f = ((gkt) value.getValue()).f();
                if (f != null) {
                    c = c(f) + i3;
                } else {
                    c = i3;
                }
                i3 = c;
            }
            if (i3 <= this.c) {
                if (a) {
                    new StringBuilder(114).append("BitmapCache getAvailableBitmap: currentCacheSize ").append(i3).append(" < ").append(this.c).append(" available. So not evicting any bitmaps.");
                }
                return null;
            }
            it = this.d.entrySet().iterator();
            Bitmap bitmap = null;
            while (it.hasNext()) {
                gkt gkt = (gkt) ((Entry) it.next()).getValue();
                if (gkt.i() == 0 && gkt.a(i, i2) && gkt.g()) {
                    if (a) {
                        String str = "BitmapCache getAvailableBitmap evicting: ";
                        String valueOf = String.valueOf(gkt.toString());
                        if (valueOf.length() != 0) {
                            str.concat(valueOf);
                        } else {
                            valueOf = new String(str);
                        }
                    }
                    f = gkt.c();
                    it.remove();
                    if (f == null) {
                    }
                    if (a) {
                        new StringBuilder(109).append("BitmapCache getAvailableBitmap finished evictions cache size=").append(this.d.size()).append(" width=").append(i).append(" height=").append(i2);
                    }
                    c();
                    return f;
                }
                f = bitmap;
                bitmap = f;
            }
            f = bitmap;
            if (a) {
                new StringBuilder(109).append("BitmapCache getAvailableBitmap finished evictions cache size=").append(this.d.size()).append(" width=").append(i).append(" height=").append(i2);
            }
            c();
            return f;
        }
    }

    public Bitmap b(int i, int i2) {
        c();
        return this.b.a(i, i2, this);
    }

    public Bitmap a(byte[] bArr, int i, int i2, int i3) {
        try {
            return b(bArr, i, i2, i3);
        } catch (OutOfMemoryError e) {
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap b(byte[] r11, int r12, int r13, int r14) {
        /*
        r10 = this;
        if (r12 < 0) goto L_0x006f;
    L_0x0002:
        r0 = 1;
    L_0x0003:
        bm.a(r0);
        if (r13 < 0) goto L_0x0071;
    L_0x0008:
        r0 = 1;
    L_0x0009:
        bm.a(r0);
        r0 = r14 % 90;
        if (r0 != 0) goto L_0x0073;
    L_0x0010:
        r0 = 1;
    L_0x0011:
        bm.a(r0);
        r0 = r14 % 180;
        if (r0 == 0) goto L_0x0198;
    L_0x0018:
        r0 = 0;
        r1 = 0;
        r2 = giz.a(r0, r1);
        r0 = 1;
        r2.inJustDecodeBounds = r0;
        r0 = 0;
        r1 = r11.length;	 Catch:{ Exception -> 0x0075 }
        android.graphics.BitmapFactory.decodeByteArray(r11, r0, r1, r2);	 Catch:{ Exception -> 0x0075 }
        r0 = 0;
        r2.inJustDecodeBounds = r0;
        r3 = r2.outWidth;
        r4 = r2.outHeight;
        r0 = a;
        if (r0 == 0) goto L_0x005f;
    L_0x0031:
        r0 = new java.lang.StringBuilder;
        r1 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r0.<init>(r1);
        r1 = "BitmapCache.decodeByteArray: bitmap.w=";
        r0 = r0.append(r1);
        r0 = r0.append(r3);
        r1 = " bitmap.h=";
        r0 = r0.append(r1);
        r0 = r0.append(r4);
        r1 = ", limit.w=";
        r0 = r0.append(r1);
        r0 = r0.append(r13);
        r1 = " limit.h=";
        r0 = r0.append(r1);
        r0.append(r12);
    L_0x005f:
        if (r3 > r13) goto L_0x0063;
    L_0x0061:
        if (r4 <= r12) goto L_0x0095;
    L_0x0063:
        r0 = 1;
    L_0x0064:
        if (r3 > r13) goto L_0x0068;
    L_0x0066:
        if (r4 <= r12) goto L_0x007f;
    L_0x0068:
        r3 = r3 / 2;
        r4 = r4 / 2;
        r0 = r0 << 1;
        goto L_0x0064;
    L_0x006f:
        r0 = 0;
        goto L_0x0003;
    L_0x0071:
        r0 = 0;
        goto L_0x0009;
    L_0x0073:
        r0 = 0;
        goto L_0x0011;
    L_0x0075:
        r0 = move-exception;
        r1 = "Babel";
        r2 = "can not decode bitmap dimensions";
        glk.d(r1, r2, r0);
        r0 = 0;
    L_0x007e:
        return r0;
    L_0x007f:
        r1 = a;
        if (r1 == 0) goto L_0x0093;
    L_0x0083:
        r1 = new java.lang.StringBuilder;
        r5 = 52;
        r1.<init>(r5);
        r5 = "BitmapCache.decodeByteArray: sample size=";
        r1 = r1.append(r5);
        r1.append(r0);
    L_0x0093:
        r2.inSampleSize = r0;
    L_0x0095:
        r0 = a;
        if (r0 == 0) goto L_0x00b3;
    L_0x0099:
        r0 = new java.lang.StringBuilder;
        r1 = 66;
        r0.<init>(r1);
        r1 = "BitmapCache.decodeByteArray: decode to w=";
        r0 = r0.append(r1);
        r0 = r0.append(r3);
        r1 = " h=";
        r0 = r0.append(r1);
        r0.append(r4);
    L_0x00b3:
        r0 = 0;
        r6 = r0;
    L_0x00b5:
        r0 = r10.b;	 Catch:{ OutOfMemoryError -> 0x00ee }
        r1 = r11;
        r5 = r10;
        r0 = r0.a(r1, r2, r3, r4, r5);	 Catch:{ OutOfMemoryError -> 0x00ee }
        if (r0 == 0) goto L_0x007e;
    L_0x00bf:
        r1 = r14 % 360;
        if (r1 == 0) goto L_0x007e;
    L_0x00c3:
        r1 = 0;
        r7 = r1;
    L_0x00c5:
        r3 = r0.getWidth();	 Catch:{ OutOfMemoryError -> 0x0143 }
        r4 = r0.getHeight();	 Catch:{ OutOfMemoryError -> 0x0143 }
        r5 = new android.graphics.Matrix;	 Catch:{ OutOfMemoryError -> 0x0143 }
        r5.<init>();	 Catch:{ OutOfMemoryError -> 0x0143 }
        r1 = (float) r14;	 Catch:{ OutOfMemoryError -> 0x0143 }
        r2 = (float) r3;	 Catch:{ OutOfMemoryError -> 0x0143 }
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r6;
        r6 = (float) r4;	 Catch:{ OutOfMemoryError -> 0x0143 }
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r6 / r8;
        r5.setRotate(r1, r2, r6);	 Catch:{ OutOfMemoryError -> 0x0143 }
        r1 = 0;
        r2 = 0;
        r6 = 1;
        r1 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ OutOfMemoryError -> 0x0143 }
        if (r1 == 0) goto L_0x00ec;
    L_0x00e7:
        if (r0 == r1) goto L_0x00ec;
    L_0x00e9:
        r10.a(r0);	 Catch:{ OutOfMemoryError -> 0x0143 }
    L_0x00ec:
        r0 = r1;
        goto L_0x007e;
    L_0x00ee:
        r0 = move-exception;
        r1 = "Babel";
        r5 = r11.length;
        r7 = new java.lang.StringBuilder;
        r8 = 53;
        r7.<init>(r8);
        r8 = "out of memory for decoding a ";
        r7 = r7.append(r8);
        r5 = r7.append(r5);
        r7 = " sized bitmap";
        r5 = r5.append(r7);
        r5 = r5.toString();
        r7 = 0;
        r7 = new java.lang.Object[r7];
        glk.d(r1, r5, r7);
        r1 = r6 + 1;
        r5 = r10.a(r1);
        if (r5 != 0) goto L_0x0140;
    L_0x011b:
        r1 = "Babel";
        r2 = r11.length;
        r3 = new java.lang.StringBuilder;
        r4 = 61;
        r3.<init>(r4);
        r4 = "out of memory: gave up on decoding a ";
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r3 = " sized bitmap";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = 0;
        r3 = new java.lang.Object[r3];
        glk.d(r1, r2, r3);
        throw r0;
    L_0x0140:
        r6 = r1;
        goto L_0x00b5;
    L_0x0143:
        r1 = move-exception;
        r2 = "Babel";
        r3 = r11.length;
        r4 = new java.lang.StringBuilder;
        r5 = 53;
        r4.<init>(r5);
        r5 = "out of memory for rotating a ";
        r4 = r4.append(r5);
        r3 = r4.append(r3);
        r4 = " sized bitmap";
        r3 = r3.append(r4);
        r3 = r3.toString();
        r4 = 0;
        r4 = new java.lang.Object[r4];
        glk.d(r2, r3, r4);
        r2 = r7 + 1;
        r3 = r10.a(r2);
        if (r3 != 0) goto L_0x0195;
    L_0x0170:
        r0 = "Babel";
        r2 = r11.length;
        r3 = new java.lang.StringBuilder;
        r4 = 61;
        r3.<init>(r4);
        r4 = "out of memory: gave up on rotating a ";
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r3 = " sized bitmap";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = 0;
        r3 = new java.lang.Object[r3];
        glk.d(r0, r2, r3);
        throw r1;
    L_0x0195:
        r7 = r2;
        goto L_0x00c5;
    L_0x0198:
        r9 = r13;
        r13 = r12;
        r12 = r9;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: gix.b(byte[], int, int, int):android.graphics.Bitmap");
    }

    public void a(Bitmap bitmap) {
        if (bitmap != null) {
            c();
            this.b.a(bitmap);
        }
    }

    boolean b(Bitmap bitmap) {
        synchronized (this.e) {
            for (gkt f : this.d.values()) {
                if (f.f() == bitmap) {
                    return true;
                }
            }
            return false;
        }
    }

    LinkedHashMap<String, gkt> a() {
        return this.d;
    }

    giz b() {
        return this.b;
    }
}
