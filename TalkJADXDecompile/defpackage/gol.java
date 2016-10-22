package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: gol */
public final class gol extends Drawable implements gjr {
    private Paint a;
    private gjo b;
    private Bitmap c;
    private boolean d;
    private Runnable e;

    public gol(gjo gjo) {
        this.d = true;
        a(gjo);
    }

    public void a(gjo gjo) {
        this.a = new Paint(2);
        c();
        if (gjo != null) {
            this.b = gjo;
            this.b.a((gjr) this);
            this.b.a(this.d);
        }
    }

    public void a(Runnable runnable) {
        this.e = runnable;
    }

    public void a() {
        if (this.b != null) {
            this.b.g();
        }
    }

    public void b() {
        if (this.b != null) {
            this.b.h();
        }
    }

    public void c() {
        if (this.b != null) {
            this.b.h();
            this.b.a(null);
            this.b.j();
            this.b = null;
        }
        this.c = null;
        this.e = null;
    }

    public void a(boolean z) {
        this.d = false;
        if (this.b != null) {
            this.b.a(false);
        }
    }

    public void draw(Canvas canvas) {
        if (this.c != null && !this.c.isRecycled()) {
            canvas.drawBitmap(this.c, 0.0f, 0.0f, this.a);
        }
    }

    public void a(Bitmap bitmap) {
        if (this.e != null) {
            this.e.run();
            this.e = null;
        }
        this.c = bitmap;
        invalidateSelf();
    }

    public int getIntrinsicWidth() {
        return this.b != null ? this.b.d() : 0;
    }

    public int getIntrinsicHeight() {
        return this.b != null ? this.b.e() : 0;
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
