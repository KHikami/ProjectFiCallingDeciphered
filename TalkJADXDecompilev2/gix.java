package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class gix implements gja, iip {
    public static final boolean a = false;
    public final giz b;
    private int c;
    private final LinkedHashMap<String, gkt> d;
    private final Object e = new Object();
    private boolean f;

    static {
        kae kae = glk.t;
    }

    public gix(Context context, int i) {
        boolean z;
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
            case 0:
                return true;
            case 1:
                h();
                return true;
            case 2:
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r14) {
        /*
        r13 = this;
        r2 = 0;
        r4 = r13.e;
        monitor-enter(r4);
        r13.c();	 Catch:{ all -> 0x0131 }
        r0 = a;	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x001b;
    L_0x000b:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0131 }
        r1 = 42;
        r0.<init>(r1);	 Catch:{ all -> 0x0131 }
        r1 = "Begin BitmapCache prune: lowMemory = ";
        r0 = r0.append(r1);	 Catch:{ all -> 0x0131 }
        r0.append(r14);	 Catch:{ all -> 0x0131 }
    L_0x001b:
        r0 = r13.d;	 Catch:{ all -> 0x0131 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0131 }
        r5 = r0.iterator();	 Catch:{ all -> 0x0131 }
        r1 = r2;
        r3 = r2;
    L_0x0027:
        r0 = r5.hasNext();	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x004e;
    L_0x002d:
        r0 = r5.next();	 Catch:{ all -> 0x0131 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0131 }
        r0 = r0.getValue();	 Catch:{ all -> 0x0131 }
        r0 = (defpackage.gkt) r0;	 Catch:{ all -> 0x0131 }
        r6 = r0.i();	 Catch:{ all -> 0x0131 }
        if (r6 != 0) goto L_0x0041;
    L_0x003f:
        r3 = r3 + 1;
    L_0x0041:
        r0 = r0.f();	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x0137;
    L_0x0047:
        r0 = defpackage.gix.c(r0);	 Catch:{ all -> 0x0131 }
        r0 = r0 + r1;
    L_0x004c:
        r1 = r0;
        goto L_0x0027;
    L_0x004e:
        r0 = a;	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x0078;
    L_0x0052:
        r0 = r13.c;	 Catch:{ all -> 0x0131 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0131 }
        r6 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r5.<init>(r6);	 Catch:{ all -> 0x0131 }
        r6 = "Evictable bitmap count: ";
        r5 = r5.append(r6);	 Catch:{ all -> 0x0131 }
        r5 = r5.append(r3);	 Catch:{ all -> 0x0131 }
        r6 = "; total cache (bytes) = ";
        r5 = r5.append(r6);	 Catch:{ all -> 0x0131 }
        r5 = r5.append(r1);	 Catch:{ all -> 0x0131 }
        r6 = "; max cache size (bytes) = ";
        r5 = r5.append(r6);	 Catch:{ all -> 0x0131 }
        r5.append(r0);	 Catch:{ all -> 0x0131 }
    L_0x0078:
        if (r3 != 0) goto L_0x007c;
    L_0x007a:
        monitor-exit(r4);	 Catch:{ all -> 0x0131 }
    L_0x007b:
        return;
    L_0x007c:
        if (r14 == 0) goto L_0x0100;
    L_0x007e:
        r3 = r2;
    L_0x007f:
        r0 = r13.d;	 Catch:{ all -> 0x0131 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0131 }
        r5 = r0.iterator();	 Catch:{ all -> 0x0131 }
        r12 = r2;
        r2 = r1;
        r1 = r12;
    L_0x008c:
        r0 = r5.hasNext();	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x010f;
    L_0x0092:
        r0 = r5.next();	 Catch:{ all -> 0x0131 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0131 }
        r0 = r0.getValue();	 Catch:{ all -> 0x0131 }
        r0 = (defpackage.gkt) r0;	 Catch:{ all -> 0x0131 }
        if (r2 <= r3) goto L_0x0134;
    L_0x00a0:
        r6 = r0.i();	 Catch:{ all -> 0x0131 }
        if (r6 != 0) goto L_0x0134;
    L_0x00a6:
        r6 = r0.c();	 Catch:{ all -> 0x0131 }
        r5.remove();	 Catch:{ all -> 0x0131 }
        if (r6 == 0) goto L_0x0134;
    L_0x00af:
        r0 = defpackage.gix.c(r6);	 Catch:{ all -> 0x0131 }
        r7 = a;	 Catch:{ all -> 0x0131 }
        if (r7 == 0) goto L_0x00f7;
    L_0x00b7:
        r7 = r6.getWidth();	 Catch:{ all -> 0x0131 }
        r8 = r6.getHeight();	 Catch:{ all -> 0x0131 }
        r9 = r13.c;	 Catch:{ all -> 0x0131 }
        r9 = r2 - r9;
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0131 }
        r11 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r10.<init>(r11);	 Catch:{ all -> 0x0131 }
        r11 = "Evicting bitmap: size (";
        r10 = r10.append(r11);	 Catch:{ all -> 0x0131 }
        r7 = r10.append(r7);	 Catch:{ all -> 0x0131 }
        r10 = "x";
        r7 = r7.append(r10);	 Catch:{ all -> 0x0131 }
        r7 = r7.append(r8);	 Catch:{ all -> 0x0131 }
        r8 = "); bytes: ";
        r7 = r7.append(r8);	 Catch:{ all -> 0x0131 }
        r7 = r7.append(r0);	 Catch:{ all -> 0x0131 }
        r8 = "; need to evict: ";
        r7 = r7.append(r8);	 Catch:{ all -> 0x0131 }
        r7 = r7.append(r9);	 Catch:{ all -> 0x0131 }
        r8 = " bytes more.";
        r7.append(r8);	 Catch:{ all -> 0x0131 }
    L_0x00f7:
        r2 = r2 - r0;
        r0 = r0 + r1;
        if (r14 == 0) goto L_0x0105;
    L_0x00fb:
        r6.recycle();	 Catch:{ all -> 0x0131 }
        r1 = r0;
        goto L_0x008c;
    L_0x0100:
        r0 = r13.c;	 Catch:{ all -> 0x0131 }
        r3 = r0;
        goto L_0x007f;
    L_0x0105:
        r1 = r13.b;	 Catch:{ all -> 0x0131 }
        r1.a(r6);	 Catch:{ all -> 0x0131 }
        r1 = r2;
    L_0x010b:
        r2 = r1;
        r1 = r0;
        goto L_0x008c;
    L_0x010f:
        r0 = a;	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x012e;
    L_0x0113:
        if (r1 <= 0) goto L_0x012e;
    L_0x0115:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0131 }
        r2 = 60;
        r0.<init>(r2);	 Catch:{ all -> 0x0131 }
        r2 = "************************* Pruned total of ";
        r0 = r0.append(r2);	 Catch:{ all -> 0x0131 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x0131 }
        r1 = " bytes.";
        r0.append(r1);	 Catch:{ all -> 0x0131 }
        r13.c();	 Catch:{ all -> 0x0131 }
    L_0x012e:
        monitor-exit(r4);	 Catch:{ all -> 0x0131 }
        goto L_0x007b;
    L_0x0131:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0131 }
        throw r0;
    L_0x0134:
        r0 = r1;
        r1 = r2;
        goto L_0x010b;
    L_0x0137:
        r0 = r1;
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: gix.a(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap a(int r7, int r8) {
        /*
        r6 = this;
        r2 = 0;
        r0 = r6.f;
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        r0 = r2;
    L_0x0006:
        return r0;
    L_0x0007:
        r3 = r6.e;
        monitor-enter(r3);
        r0 = a;	 Catch:{ all -> 0x00e7 }
        if (r0 == 0) goto L_0x0038;
    L_0x000e:
        r0 = r6.d;	 Catch:{ all -> 0x00e7 }
        r0 = r0.size();	 Catch:{ all -> 0x00e7 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e7 }
        r4 = 100;
        r1.<init>(r4);	 Catch:{ all -> 0x00e7 }
        r4 = "BitmapCache getBitmap starting evictions cache size=";
        r1 = r1.append(r4);	 Catch:{ all -> 0x00e7 }
        r0 = r1.append(r0);	 Catch:{ all -> 0x00e7 }
        r1 = " width=";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00e7 }
        r0 = r0.append(r7);	 Catch:{ all -> 0x00e7 }
        r1 = " height=";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00e7 }
        r0.append(r8);	 Catch:{ all -> 0x00e7 }
    L_0x0038:
        r1 = 0;
        r0 = r6.d;	 Catch:{ all -> 0x00e7 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x00e7 }
        r4 = r0.iterator();	 Catch:{ all -> 0x00e7 }
    L_0x0043:
        r0 = r4.hasNext();	 Catch:{ all -> 0x00e7 }
        if (r0 == 0) goto L_0x0062;
    L_0x0049:
        r0 = r4.next();	 Catch:{ all -> 0x00e7 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x00e7 }
        r0 = r0.getValue();	 Catch:{ all -> 0x00e7 }
        r0 = (defpackage.gkt) r0;	 Catch:{ all -> 0x00e7 }
        r0 = r0.f();	 Catch:{ all -> 0x00e7 }
        if (r0 == 0) goto L_0x0121;
    L_0x005b:
        r0 = defpackage.gix.c(r0);	 Catch:{ all -> 0x00e7 }
        r0 = r0 + r1;
    L_0x0060:
        r1 = r0;
        goto L_0x0043;
    L_0x0062:
        r0 = r6.c;	 Catch:{ all -> 0x00e7 }
        if (r1 > r0) goto L_0x0090;
    L_0x0066:
        r0 = a;	 Catch:{ all -> 0x00e7 }
        if (r0 == 0) goto L_0x008c;
    L_0x006a:
        r0 = r6.c;	 Catch:{ all -> 0x00e7 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e7 }
        r5 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r4.<init>(r5);	 Catch:{ all -> 0x00e7 }
        r5 = "BitmapCache getAvailableBitmap: currentCacheSize ";
        r4 = r4.append(r5);	 Catch:{ all -> 0x00e7 }
        r1 = r4.append(r1);	 Catch:{ all -> 0x00e7 }
        r4 = " < ";
        r1 = r1.append(r4);	 Catch:{ all -> 0x00e7 }
        r0 = r1.append(r0);	 Catch:{ all -> 0x00e7 }
        r1 = " available. So not evicting any bitmaps.";
        r0.append(r1);	 Catch:{ all -> 0x00e7 }
    L_0x008c:
        monitor-exit(r3);	 Catch:{ all -> 0x00e7 }
        r0 = r2;
        goto L_0x0006;
    L_0x0090:
        r0 = r6.d;	 Catch:{ all -> 0x00e7 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x00e7 }
        r4 = r0.iterator();	 Catch:{ all -> 0x00e7 }
        r1 = r2;
    L_0x009b:
        r0 = r4.hasNext();	 Catch:{ all -> 0x00e7 }
        if (r0 == 0) goto L_0x00ea;
    L_0x00a1:
        r0 = r4.next();	 Catch:{ all -> 0x00e7 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x00e7 }
        r0 = r0.getValue();	 Catch:{ all -> 0x00e7 }
        r0 = (defpackage.gkt) r0;	 Catch:{ all -> 0x00e7 }
        r2 = r0.i();	 Catch:{ all -> 0x00e7 }
        if (r2 != 0) goto L_0x011f;
    L_0x00b3:
        r2 = r0.a(r7, r8);	 Catch:{ all -> 0x00e7 }
        if (r2 == 0) goto L_0x011f;
    L_0x00b9:
        r2 = r0.g();	 Catch:{ all -> 0x00e7 }
        if (r2 == 0) goto L_0x011f;
    L_0x00bf:
        r1 = a;	 Catch:{ all -> 0x00e7 }
        if (r1 == 0) goto L_0x00d6;
    L_0x00c3:
        r1 = "BitmapCache getAvailableBitmap evicting: ";
        r2 = r0.toString();	 Catch:{ all -> 0x00e7 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00e7 }
        r5 = r2.length();	 Catch:{ all -> 0x00e7 }
        if (r5 == 0) goto L_0x00e1;
    L_0x00d3:
        r1.concat(r2);	 Catch:{ all -> 0x00e7 }
    L_0x00d6:
        r0 = r0.c();	 Catch:{ all -> 0x00e7 }
        r4.remove();	 Catch:{ all -> 0x00e7 }
        if (r0 != 0) goto L_0x00eb;
    L_0x00df:
        r1 = r0;
        goto L_0x009b;
    L_0x00e1:
        r2 = new java.lang.String;	 Catch:{ all -> 0x00e7 }
        r2.<init>(r1);	 Catch:{ all -> 0x00e7 }
        goto L_0x00d6;
    L_0x00e7:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00e7 }
        throw r0;
    L_0x00ea:
        r0 = r1;
    L_0x00eb:
        r1 = a;	 Catch:{ all -> 0x00e7 }
        if (r1 == 0) goto L_0x0119;
    L_0x00ef:
        r1 = r6.d;	 Catch:{ all -> 0x00e7 }
        r1 = r1.size();	 Catch:{ all -> 0x00e7 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e7 }
        r4 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r2.<init>(r4);	 Catch:{ all -> 0x00e7 }
        r4 = "BitmapCache getAvailableBitmap finished evictions cache size=";
        r2 = r2.append(r4);	 Catch:{ all -> 0x00e7 }
        r1 = r2.append(r1);	 Catch:{ all -> 0x00e7 }
        r2 = " width=";
        r1 = r1.append(r2);	 Catch:{ all -> 0x00e7 }
        r1 = r1.append(r7);	 Catch:{ all -> 0x00e7 }
        r2 = " height=";
        r1 = r1.append(r2);	 Catch:{ all -> 0x00e7 }
        r1.append(r8);	 Catch:{ all -> 0x00e7 }
    L_0x0119:
        monitor-exit(r3);	 Catch:{ all -> 0x00e7 }
        r6.c();
        goto L_0x0006;
    L_0x011f:
        r0 = r1;
        goto L_0x00df;
    L_0x0121:
        r0 = r1;
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: gix.a(int, int):android.graphics.Bitmap");
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

    public Bitmap b(byte[] bArr, int i, int i2, int i3) {
        bm.a(i >= 0);
        bm.a(i2 >= 0);
        bm.a(i3 % 90 == 0);
        if (i3 % 180 == 0) {
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        Options a = giz.a(0, 0);
        a.inJustDecodeBounds = true;
        try {
            Bitmap a2;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, a);
            a.inJustDecodeBounds = false;
            int i5 = a.outWidth;
            int i6 = a.outHeight;
            if (a) {
                new StringBuilder(111).append("BitmapCache.decodeByteArray: bitmap.w=").append(i5).append(" bitmap.h=").append(i6).append(", limit.w=").append(i2).append(" limit.h=").append(i);
            }
            if (i5 > i2 || i6 > i) {
                int i7 = 1;
                while (true) {
                    if (i5 <= i2 && i6 <= i) {
                        break;
                    }
                    i5 /= 2;
                    i6 /= 2;
                    i7 <<= 1;
                }
                if (a) {
                    new StringBuilder(52).append("BitmapCache.decodeByteArray: sample size=").append(i7);
                }
                a.inSampleSize = i7;
            }
            if (a) {
                new StringBuilder(66).append("BitmapCache.decodeByteArray: decode to w=").append(i5).append(" h=").append(i6);
            }
            int i8 = 0;
            while (true) {
                try {
                    a2 = this.b.a(bArr, a, i5, i6, (gja) this);
                    break;
                } catch (OutOfMemoryError e) {
                    glk.d("Babel", "out of memory for decoding a " + bArr.length + " sized bitmap", new Object[0]);
                    int i9 = i8 + 1;
                    if (a(i9)) {
                        i8 = i9;
                    } else {
                        glk.d("Babel", "out of memory: gave up on decoding a " + bArr.length + " sized bitmap", new Object[0]);
                        throw e;
                    }
                }
            }
            if (a2 == null || i3 % 360 == 0) {
                return a2;
            }
            int i10 = 0;
            while (true) {
                try {
                    break;
                } catch (OutOfMemoryError e2) {
                    glk.d("Babel", "out of memory for rotating a " + bArr.length + " sized bitmap", new Object[0]);
                    int i11 = i10 + 1;
                    if (a(i11)) {
                        i10 = i11;
                    } else {
                        glk.d("Babel", "out of memory: gave up on rotating a " + bArr.length + " sized bitmap", new Object[0]);
                        throw e2;
                    }
                }
            }
            i5 = a2.getWidth();
            i6 = a2.getHeight();
            Matrix matrix = new Matrix();
            matrix.setRotate((float) i3, ((float) i5) / 2.0f, ((float) i6) / 2.0f);
            Bitmap createBitmap = Bitmap.createBitmap(a2, 0, 0, i5, i6, matrix, true);
            if (!(createBitmap == null || a2 == createBitmap)) {
                a(a2);
            }
            return createBitmap;
        } catch (Throwable e3) {
            glk.d("Babel", "can not decode bitmap dimensions", e3);
            return null;
        }
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
