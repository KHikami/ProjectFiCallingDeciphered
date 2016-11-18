package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public final class jld implements jin {
    private static final int f20401b = ((int) Math.round(Math.sqrt(16.0d)));
    private static final kae f20402c = new kae("debug.social.bitmap_pool", (byte) 0);
    private static final String[] f20403d = new String[]{"put", "evict", "hit", "inexact hit", "miss"};
    private final jkz f20404e;
    private final jlg f20405f = new jlg();
    private final jlk f20406g = new jlk();
    private final int f20407h;
    private int f20408i;
    private final Map<jla, int[]> f20409j = new HashMap();

    public jld(int i) {
        this.f20407h = i;
        if (VERSION.SDK_INT >= 19) {
            this.f20404e = new jli();
        } else {
            this.f20404e = new jle();
        }
    }

    public synchronized void m24631a(Bitmap bitmap) {
        jla a = this.f20404e.mo3559a(bitmap);
        if (a.f20396c <= ((long) this.f20407h) && bitmap.getConfig() == Config.ARGB_8888 && bitmap.isMutable()) {
            this.f20405f.m24643a(a, bitmap);
            this.f20406g.m24654a(a);
            if (Log.isLoggable("BitmapPoolLru", 2)) {
                String valueOf = String.valueOf(a);
                new StringBuilder(String.valueOf(valueOf).length() + 24).append("Putting bitmap in pool: ").append(valueOf);
            }
            this.f20408i = (int) (a.f20396c + ((long) this.f20408i));
            m24628a(this.f20407h);
        } else {
            bitmap.recycle();
        }
    }

    public Bitmap m24629a(int i, int i2) {
        return m24627a(i, i2, jlc.EXACT);
    }

    private synchronized Bitmap m24627a(int i, int i2, jlc jlc) {
        Bitmap a;
        jla a2;
        jla a3 = this.f20404e.mo3558a(i, i2);
        a = this.f20405f.m24642a(a3);
        if (a == null) {
            a2 = this.f20404e.mo3560a(a3, this.f20406g.m24653a(a3, this.f20404e.mo3558a(f20401b * i, f20401b * i2)), jlc);
            if (a2 != null) {
                a = this.f20405f.m24642a(a2);
            }
        } else {
            a2 = a3;
        }
        String valueOf;
        String valueOf2;
        if (a != null) {
            this.f20404e.mo3561a(a3, a);
            this.f20408i = (int) (((long) this.f20408i) - a2.f20396c);
            this.f20406g.m24655b(a2);
            if (Log.isLoggable("BitmapPoolLru", 2)) {
                valueOf = String.valueOf(a2);
                valueOf2 = String.valueOf(a3);
                new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Got bitmap: ").append(valueOf).append(" for: ").append(valueOf2);
            }
        } else if (Log.isLoggable("BitmapPoolLru", 3)) {
            valueOf = String.valueOf(a3);
            valueOf2 = String.valueOf(jlc);
            new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length()).append("Missing bitmap: ").append(valueOf).append(" match type: ").append(valueOf2);
        }
        return a;
    }

    public synchronized void m24630a() {
        m24628a(0);
    }

    public synchronized float m24633b() {
        return ((float) this.f20408i) / ((float) this.f20407h);
    }

    private void m24628a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(String.format("Target byte size must be >= 0, got: %s", new Object[]{Integer.valueOf(i)}));
        }
        while (this.f20408i > i) {
            Bitmap a = this.f20405f.m24641a();
            jla a2 = this.f20404e.mo3559a(a);
            this.f20406g.m24655b(a2);
            this.f20408i = (int) (((long) this.f20408i) - a2.f20396c);
            if (a == null) {
                throw new IllegalStateException("Pool is larger than its max size, but has no more bitmaps to evict.");
            }
            a.recycle();
            if (Log.isLoggable("BitmapPoolLru", 2)) {
                String valueOf = String.valueOf(a2);
                new StringBuilder(String.valueOf(valueOf).length() + 16).append("Evicted bitmap: ").append(valueOf);
            }
        }
    }

    public synchronized void mo3452a(PrintWriter printWriter) {
        printWriter.print("current size: ");
        printWriter.println(this.f20408i);
        printWriter.println("Profiling is currently inactive; to activate set the property debug.social.bitmap_pool to true.");
    }
}
