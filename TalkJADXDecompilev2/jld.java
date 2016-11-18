package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public final class jld implements jin {
    private static final int b = ((int) Math.round(Math.sqrt(16.0d)));
    private static final kae c = new kae("debug.social.bitmap_pool", (byte) 0);
    private static final String[] d = new String[]{"put", "evict", "hit", "inexact hit", "miss"};
    private final jkz e;
    private final jlg f = new jlg();
    private final jlk g = new jlk();
    private final int h;
    private int i;
    private final Map<jla, int[]> j = new HashMap();

    public jld(int i) {
        this.h = i;
        if (VERSION.SDK_INT >= 19) {
            this.e = new jli();
        } else {
            this.e = new jle();
        }
    }

    public synchronized void a(Bitmap bitmap) {
        jla a = this.e.a(bitmap);
        if (a.c <= ((long) this.h) && bitmap.getConfig() == Config.ARGB_8888 && bitmap.isMutable()) {
            this.f.a(a, bitmap);
            this.g.a(a);
            if (Log.isLoggable("BitmapPoolLru", 2)) {
                String valueOf = String.valueOf(a);
                new StringBuilder(String.valueOf(valueOf).length() + 24).append("Putting bitmap in pool: ").append(valueOf);
            }
            this.i = (int) (a.c + ((long) this.i));
            a(this.h);
        } else {
            bitmap.recycle();
        }
    }

    public Bitmap a(int i, int i2) {
        return a(i, i2, jlc.EXACT);
    }

    private synchronized Bitmap a(int i, int i2, jlc jlc) {
        Bitmap a;
        jla a2;
        jla a3 = this.e.a(i, i2);
        a = this.f.a(a3);
        if (a == null) {
            a2 = this.e.a(a3, this.g.a(a3, this.e.a(b * i, b * i2)), jlc);
            if (a2 != null) {
                a = this.f.a(a2);
            }
        } else {
            a2 = a3;
        }
        String valueOf;
        String valueOf2;
        if (a != null) {
            this.e.a(a3, a);
            this.i = (int) (((long) this.i) - a2.c);
            this.g.b(a2);
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

    public synchronized void a() {
        a(0);
    }

    public synchronized float b() {
        return ((float) this.i) / ((float) this.h);
    }

    private void a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(String.format("Target byte size must be >= 0, got: %s", new Object[]{Integer.valueOf(i)}));
        }
        while (this.i > i) {
            Bitmap a = this.f.a();
            jla a2 = this.e.a(a);
            this.g.b(a2);
            this.i = (int) (((long) this.i) - a2.c);
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

    public synchronized void a(PrintWriter printWriter) {
        printWriter.print("current size: ");
        printWriter.println(this.i);
        printWriter.println("Profiling is currently inactive; to activate set the property debug.social.bitmap_pool to true.");
    }
}
