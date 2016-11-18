package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class arl implements ard {
    private static final Config f2219a = Config.ARGB_8888;
    private final arn f2220b;
    private final Set<Config> f2221c;
    private final int f2222d;
    private final arm f2223e;
    private int f2224f;
    private int f2225g;
    private int f2226h;
    private int f2227i;
    private int f2228j;
    private int f2229k;

    private arl(int i, arn arn, Set<Config> set) {
        this.f2222d = i;
        this.f2224f = i;
        this.f2220b = arn;
        this.f2221c = set;
        this.f2223e = new arm();
    }

    public synchronized void mo361a(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (bitmap.isRecycled()) {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        } else if (bitmap.isMutable() && this.f2220b.mo354c(bitmap) <= this.f2224f && this.f2221c.contains(bitmap.getConfig())) {
            int c = this.f2220b.mo354c(bitmap);
            this.f2220b.mo351a(bitmap);
            this.f2228j++;
            this.f2225g = c + this.f2225g;
            if (Log.isLoggable("LruBitmapPool", 2)) {
                r0 = "Put bitmap in pool=";
                String valueOf = String.valueOf(this.f2220b.mo353b(bitmap));
                if (valueOf.length() != 0) {
                    r0.concat(valueOf);
                } else {
                    valueOf = new String(r0);
                }
            }
            m3859b();
            m3860b(this.f2224f);
        } else {
            if (Log.isLoggable("LruBitmapPool", 2)) {
                r0 = String.valueOf(this.f2220b.mo353b(bitmap));
                boolean isMutable = bitmap.isMutable();
                new StringBuilder(String.valueOf(r0).length() + 78).append("Reject bitmap from pool, bitmap: ").append(r0).append(", is mutable: ").append(isMutable).append(", is allowed config: ").append(this.f2221c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        }
    }

    public Bitmap mo358a(int i, int i2, Config config) {
        Bitmap c = m3861c(i, i2, config);
        if (c == null) {
            return Bitmap.createBitmap(i, i2, config);
        }
        c.eraseColor(0);
        return c;
    }

    public Bitmap mo362b(int i, int i2, Config config) {
        Bitmap c = m3861c(i, i2, config);
        if (c == null) {
            return Bitmap.createBitmap(i, i2, config);
        }
        return c;
    }

    private synchronized Bitmap m3861c(int i, int i2, Config config) {
        Bitmap a;
        String str;
        String valueOf;
        a = this.f2220b.mo350a(i, i2, config != null ? config : f2219a);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                str = "Missing bitmap=";
                valueOf = String.valueOf(this.f2220b.mo352b(i, i2, config));
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            this.f2227i++;
        } else {
            this.f2226h++;
            this.f2225g -= this.f2220b.mo354c(a);
            if (VERSION.SDK_INT >= 12) {
                a.setHasAlpha(true);
            }
            if (VERSION.SDK_INT >= 19) {
                a.setPremultiplied(true);
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            str = "Get bitmap=";
            valueOf = String.valueOf(this.f2220b.mo352b(i, i2, config));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        m3859b();
        return a;
    }

    public void mo359a() {
        m3860b(0);
    }

    public void mo360a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            new StringBuilder(29).append("trimMemory, level=").append(i);
        }
        if (i >= 40) {
            mo359a();
        } else if (i >= 20) {
            m3860b(this.f2224f / 2);
        }
    }

    private synchronized void m3860b(int i) {
        while (this.f2225g > i) {
            Bitmap a = this.f2220b.mo349a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    m3862c();
                }
                this.f2225g = 0;
            } else {
                this.f2225g -= this.f2220b.mo354c(a);
                this.f2229k++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    String str = "Evicting bitmap=";
                    String valueOf = String.valueOf(this.f2220b.mo353b(a));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
                m3859b();
                a.recycle();
            }
        }
    }

    private void m3859b() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m3862c();
        }
    }

    private void m3862c() {
        int i = this.f2226h;
        int i2 = this.f2227i;
        int i3 = this.f2228j;
        int i4 = this.f2229k;
        int i5 = this.f2225g;
        int i6 = this.f2224f;
        String valueOf = String.valueOf(this.f2220b);
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
