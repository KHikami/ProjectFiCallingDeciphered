package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class arl implements ard {
    private static final Config a = Config.ARGB_8888;
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

    private synchronized void b(int i) {
        while (this.g > i) {
            Bitmap a = this.b.a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    c();
                }
                this.g = 0;
            } else {
                this.g -= this.b.c(a);
                this.k++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    String str = "Evicting bitmap=";
                    String valueOf = String.valueOf(this.b.b(a));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
                b();
                a.recycle();
            }
        }
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
