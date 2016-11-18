package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class gix implements gja, iip {
    public static final boolean f15326a = false;
    public final giz f15327b;
    private int f15328c;
    private final LinkedHashMap<String, gkt> f15329d;
    private final Object f15330e = new Object();
    private boolean f15331f;

    static {
        kae kae = glk.f15573t;
    }

    public gix(Context context, int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bm.m6137a(z);
        int memoryClass = (((ActivityManager) context.getSystemService("activity")).getMemoryClass() << 10) << 10;
        this.f15328c = (int) (((double) memoryClass) / 10.0d);
        if (f15326a) {
            new StringBuilder(159).append("Initializing BitmapCache; maxMemory available (bytes): ").append(memoryClass).append("; expected cacheSize (bytes): ").append(this.f15328c).append("; min (bytes): 2097152").append("; max (bytes): 25165824");
        }
        this.f15328c = Math.max(this.f15328c, 2097152);
        this.f15328c = Math.min(this.f15328c, 25165824);
        if (f15326a) {
            new StringBuilder(43).append("Initialized cache size (bytes): ").append(this.f15328c);
        }
        this.f15329d = new LinkedHashMap(0, 0.75f, true);
        this.f15331f = giz.m17780a(context);
        this.f15327b = giz.m17779a(context, 5, 30, 100, i, "Image");
    }

    public gkt m17769a(String str, gkt gkt) {
        gkt gkt2;
        boolean z = true;
        bm.m6122a((Object) gkt);
        if (f15326a) {
            bm.m6150b(!m17776b(gkt.m17898e()));
            if (this.f15327b.mo2290b(gkt.m17898e())) {
                z = false;
            }
            bm.m6150b(z);
        }
        synchronized (this.f15330e) {
            gkt2 = (gkt) this.f15329d.put(str, gkt);
            m17765c();
        }
        return gkt2;
    }

    private void m17765c() {
        int i = 0;
        if (f15326a) {
            synchronized (this.f15330e) {
                int i2 = 0;
                int i3 = 0;
                for (Entry entry : this.f15329d.entrySet()) {
                    gkt gkt = (gkt) entry.getValue();
                    Bitmap f = gkt.m17899f();
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
                        new StringBuilder(String.valueOf(str).length() + 73).append("*** Bitmap (refcount = ").append(gkt.m17902i()).append(") ;   size: ").append(width).append(" x ").append(height).append(": ").append(str);
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

    public gkt m17768a(String str) {
        gkt gkt;
        synchronized (this.f15330e) {
            m17765c();
            gkt = (gkt) this.f15329d.get(str);
            if (gkt == null) {
                m17762a(false);
            } else {
                gkt.mo2291a();
            }
        }
        return gkt;
    }

    public void mo2283h() {
        m17762a(true);
    }

    public void mo2282b(int i) {
        m17762a(i != 5);
    }

    private boolean m17763a(int i) {
        if (f15326a) {
            new StringBuilder(33).append("BitmapCache evictSome=").append(i);
        }
        m17765c();
        switch (i) {
            case 0:
                return true;
            case 1:
                mo2283h();
                return true;
            case 2:
                glk.m17981d("Babel_BitmapCache", "Warning: BitmapCache hitting too many OOMs.", new Object[0]);
                iio.f17742a.m21892a();
                return true;
            default:
                return false;
        }
    }

    private static int m17764c(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        return bitmap.getByteCount();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17762a(boolean z) {
        synchronized (this.f15330e) {
            Iterator it;
            m17765c();
            if (f15326a) {
                new StringBuilder(42).append("Begin BitmapCache prune: lowMemory = ").append(z);
            }
            int i = 0;
            int i2 = 0;
            for (Entry value : this.f15329d.entrySet()) {
                int c;
                gkt gkt = (gkt) value.getValue();
                if (gkt.m17902i() == 0) {
                    i2++;
                }
                Bitmap f = gkt.m17899f();
                if (f != null) {
                    c = gix.m17764c(f) + i;
                } else {
                    c = i;
                }
                i = c;
            }
            if (f15326a) {
                new StringBuilder(108).append("Evictable bitmap count: ").append(i2).append("; total cache (bytes) = ").append(i).append("; max cache size (bytes) = ").append(this.f15328c);
            }
            if (i2 == 0) {
                return;
            }
            i2 = z ? 0 : this.f15328c;
            it = this.f15329d.entrySet().iterator();
            int i3 = i;
            i = 0;
            while (it.hasNext()) {
                gkt = (gkt) ((Entry) it.next()).getValue();
                if (i3 > i2 && gkt.m17902i() == 0) {
                    Bitmap c2 = gkt.m17896c();
                    it.remove();
                    if (c2 != null) {
                        c = gix.m17764c(c2);
                        if (f15326a) {
                            int i4 = i3 - this.f15328c;
                            new StringBuilder(107).append("Evicting bitmap: size (").append(c2.getWidth()).append("x").append(c2.getHeight()).append("); bytes: ").append(c).append("; need to evict: ").append(i4).append(" bytes more.");
                        }
                        i3 -= c;
                        c += i;
                        if (z) {
                            c2.recycle();
                            i = c;
                        } else {
                            this.f15327b.mo2288a(c2);
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
            if (f15326a && i > 0) {
                new StringBuilder(60).append("************************* Pruned total of ").append(i).append(" bytes.");
                m17765c();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Bitmap mo2281a(int i, int i2) {
        if (!this.f15331f) {
            return null;
        }
        synchronized (this.f15330e) {
            Iterator it;
            if (f15326a) {
                new StringBuilder(100).append("BitmapCache getBitmap starting evictions cache size=").append(this.f15329d.size()).append(" width=").append(i).append(" height=").append(i2);
            }
            int i3 = 0;
            for (Entry value : this.f15329d.entrySet()) {
                int c;
                Bitmap f = ((gkt) value.getValue()).m17899f();
                if (f != null) {
                    c = gix.m17764c(f) + i3;
                } else {
                    c = i3;
                }
                i3 = c;
            }
            if (i3 > this.f15328c) {
                it = this.f15329d.entrySet().iterator();
                Bitmap bitmap = null;
                while (it.hasNext()) {
                    gkt gkt = (gkt) ((Entry) it.next()).getValue();
                    if (gkt.m17902i() == 0 && gkt.m17894a(i, i2) && gkt.m17900g()) {
                        if (f15326a) {
                            String str = "BitmapCache getAvailableBitmap evicting: ";
                            String valueOf = String.valueOf(gkt.toString());
                            if (valueOf.length() != 0) {
                                str.concat(valueOf);
                            } else {
                                valueOf = new String(str);
                            }
                        }
                        f = gkt.m17896c();
                        it.remove();
                        if (f == null) {
                        }
                        break;
                    }
                    f = bitmap;
                    bitmap = f;
                }
                f = bitmap;
                if (f15326a) {
                    new StringBuilder(109).append("BitmapCache getAvailableBitmap finished evictions cache size=").append(this.f15329d.size()).append(" width=").append(i).append(" height=").append(i2);
                }
            } else if (f15326a) {
                new StringBuilder(114).append("BitmapCache getAvailableBitmap: currentCacheSize ").append(i3).append(" < ").append(this.f15328c).append(" available. So not evicting any bitmaps.");
            }
        }
    }

    public Bitmap m17772b(int i, int i2) {
        m17765c();
        return this.f15327b.mo2284a(i, i2, this);
    }

    public Bitmap m17767a(byte[] bArr, int i, int i2, int i3) {
        try {
            return m17773b(bArr, i, i2, i3);
        } catch (OutOfMemoryError e) {
            return null;
        }
    }

    public Bitmap m17773b(byte[] bArr, int i, int i2, int i3) {
        bm.m6137a(i >= 0);
        bm.m6137a(i2 >= 0);
        bm.m6137a(i3 % 90 == 0);
        if (i3 % 180 == 0) {
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        Options a = giz.m17778a(0, 0);
        a.inJustDecodeBounds = true;
        try {
            Bitmap a2;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, a);
            a.inJustDecodeBounds = false;
            int i5 = a.outWidth;
            int i6 = a.outHeight;
            if (f15326a) {
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
                if (f15326a) {
                    new StringBuilder(52).append("BitmapCache.decodeByteArray: sample size=").append(i7);
                }
                a.inSampleSize = i7;
            }
            if (f15326a) {
                new StringBuilder(66).append("BitmapCache.decodeByteArray: decode to w=").append(i5).append(" h=").append(i6);
            }
            int i8 = 0;
            while (true) {
                try {
                    a2 = this.f15327b.mo2286a(bArr, a, i5, i6, (gja) this);
                    break;
                } catch (OutOfMemoryError e) {
                    glk.m17981d("Babel", "out of memory for decoding a " + bArr.length + " sized bitmap", new Object[0]);
                    int i9 = i8 + 1;
                    if (m17763a(i9)) {
                        i8 = i9;
                    } else {
                        glk.m17981d("Babel", "out of memory: gave up on decoding a " + bArr.length + " sized bitmap", new Object[0]);
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
                    glk.m17981d("Babel", "out of memory for rotating a " + bArr.length + " sized bitmap", new Object[0]);
                    int i11 = i10 + 1;
                    if (m17763a(i11)) {
                        i10 = i11;
                    } else {
                        glk.m17981d("Babel", "out of memory: gave up on rotating a " + bArr.length + " sized bitmap", new Object[0]);
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
                m17771a(a2);
            }
            return createBitmap;
        } catch (Throwable e3) {
            glk.m17980d("Babel", "can not decode bitmap dimensions", e3);
            return null;
        }
    }

    public void m17771a(Bitmap bitmap) {
        if (bitmap != null) {
            m17765c();
            this.f15327b.mo2288a(bitmap);
        }
    }

    boolean m17776b(Bitmap bitmap) {
        synchronized (this.f15330e) {
            for (gkt f : this.f15329d.values()) {
                if (f.m17899f() == bitmap) {
                    return true;
                }
            }
            return false;
        }
    }

    LinkedHashMap<String, gkt> m17770a() {
        return this.f15329d;
    }

    giz m17774b() {
        return this.f15327b;
    }
}
