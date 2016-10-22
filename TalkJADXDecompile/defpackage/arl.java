package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: arl */
public final class arl implements ard {
    private static final Config a;
    private final arn b;
    private final Set<Config> c;
    private final int d;
    private final arm e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    static {
        a = Config.ARGB_8888;
    }

    private arl(int i, arn arn, Set<Config> set) {
        this.d = i;
        this.f = i;
        this.b = arn;
        this.c = set;
        this.e = new arm();
    }

    public synchronized void a(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (bitmap.isRecycled()) {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        } else if (bitmap.isMutable() && this.b.c(bitmap) <= this.f && this.c.contains(bitmap.getConfig())) {
            int c = this.b.c(bitmap);
            this.b.a(bitmap);
            this.j++;
            this.g = c + this.g;
            if (Log.isLoggable("LruBitmapPool", 2)) {
                r0 = "Put bitmap in pool=";
                String valueOf = String.valueOf(this.b.b(bitmap));
                if (valueOf.length() != 0) {
                    r0.concat(valueOf);
                } else {
                    valueOf = new String(r0);
                }
            }
            b();
            b(this.f);
        } else {
            if (Log.isLoggable("LruBitmapPool", 2)) {
                r0 = String.valueOf(this.b.b(bitmap));
                boolean isMutable = bitmap.isMutable();
                new StringBuilder(String.valueOf(r0).length() + 78).append("Reject bitmap from pool, bitmap: ").append(r0).append(", is mutable: ").append(isMutable).append(", is allowed config: ").append(this.c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        }
    }

    public Bitmap a(int i, int i2, Config config) {
        Bitmap c = c(i, i2, config);
        if (c == null) {
            return Bitmap.createBitmap(i, i2, config);
        }
        c.eraseColor(0);
        return c;
    }

    public Bitmap b(int i, int i2, Config config) {
        Bitmap c = c(i, i2, config);
        if (c == null) {
            return Bitmap.createBitmap(i, i2, config);
        }
        return c;
    }

    private synchronized Bitmap c(int i, int i2, Config config) {
        Bitmap a;
        String str;
        String valueOf;
        a = this.b.a(i, i2, config != null ? config : a);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                str = "Missing bitmap=";
                valueOf = String.valueOf(this.b.b(i, i2, config));
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            this.i++;
        } else {
            this.h++;
            this.g -= this.b.c(a);
            if (VERSION.SDK_INT >= 12) {
                a.setHasAlpha(true);
            }
            if (VERSION.SDK_INT >= 19) {
                a.setPremultiplied(true);
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            str = "Get bitmap=";
            valueOf = String.valueOf(this.b.b(i, i2, config));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        b();
        return a;
    }

    public void a() {
        b(0);
    }

    public void a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            new StringBuilder(29).append("trimMemory, level=").append(i);
        }
        if (i >= 40) {
            a();
        } else if (i >= 20) {
            b(this.f / 2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void b(int r5) {
        /*
        r4 = this;
        monitor-enter(r4);
    L_0x0001:
        r0 = r4.g;	 Catch:{ all -> 0x0054 }
        if (r0 <= r5) goto L_0x001c;
    L_0x0005:
        r0 = r4.b;	 Catch:{ all -> 0x0054 }
        r0 = r0.a();	 Catch:{ all -> 0x0054 }
        if (r0 != 0) goto L_0x001e;
    L_0x000d:
        r0 = "LruBitmapPool";
        r1 = 5;
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x0054 }
        if (r0 == 0) goto L_0x0019;
    L_0x0016:
        r4.c();	 Catch:{ all -> 0x0054 }
    L_0x0019:
        r0 = 0;
        r4.g = r0;	 Catch:{ all -> 0x0054 }
    L_0x001c:
        monitor-exit(r4);
        return;
    L_0x001e:
        r1 = r4.g;	 Catch:{ all -> 0x0054 }
        r2 = r4.b;	 Catch:{ all -> 0x0054 }
        r2 = r2.c(r0);	 Catch:{ all -> 0x0054 }
        r1 = r1 - r2;
        r4.g = r1;	 Catch:{ all -> 0x0054 }
        r1 = r4.k;	 Catch:{ all -> 0x0054 }
        r1 = r1 + 1;
        r4.k = r1;	 Catch:{ all -> 0x0054 }
        r1 = "LruBitmapPool";
        r2 = 3;
        r1 = android.util.Log.isLoggable(r1, r2);	 Catch:{ all -> 0x0054 }
        if (r1 == 0) goto L_0x004d;
    L_0x0038:
        r1 = "Evicting bitmap=";
        r2 = r4.b;	 Catch:{ all -> 0x0054 }
        r2 = r2.b(r0);	 Catch:{ all -> 0x0054 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0054 }
        r3 = r2.length();	 Catch:{ all -> 0x0054 }
        if (r3 == 0) goto L_0x0057;
    L_0x004a:
        r1.concat(r2);	 Catch:{ all -> 0x0054 }
    L_0x004d:
        r4.b();	 Catch:{ all -> 0x0054 }
        r0.recycle();	 Catch:{ all -> 0x0054 }
        goto L_0x0001;
    L_0x0054:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0057:
        r2 = new java.lang.String;	 Catch:{ all -> 0x0054 }
        r2.<init>(r1);	 Catch:{ all -> 0x0054 }
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: arl.b(int):void");
    }

    private void b() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            c();
        }
    }

    private void c() {
        int i = this.h;
        int i2 = this.i;
        int i3 = this.j;
        int i4 = this.k;
        int i5 = this.g;
        int i6 = this.f;
        String valueOf = String.valueOf(this.b);
        new StringBuilder(String.valueOf(valueOf).length() + 133).append("Hits=").append(i).append(", misses=").append(i2).append(", puts=").append(i3).append(", evictions=").append(i4).append(", currentSize=").append(i5).append(", maxSize=").append(i6).append("\nStrategy=").append(valueOf);
    }

    public arl(int i) {
        arn arp;
        if (VERSION.SDK_INT >= 19) {
            arp = new arp();
        } else {
            arp = new aqz();
        }
        Set hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Config.values()));
        if (VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        this(i, arp, Collections.unmodifiableSet(hashSet));
    }
}
