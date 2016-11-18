package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public final class gol extends Drawable implements gjr {
    private Paint f15794a;
    private gjo f15795b;
    private Bitmap f15796c;
    private boolean f15797d = true;
    private Runnable f15798e;

    public gol(gjo gjo) {
        m18220a(gjo);
    }

    public void m18220a(gjo gjo) {
        this.f15794a = new Paint(2);
        m18224c();
        if (gjo != null) {
            this.f15795b = gjo;
            this.f15795b.m17836a((gjr) this);
            this.f15795b.m17837a(this.f15797d);
        }
    }

    public void m18221a(Runnable runnable) {
        this.f15798e = runnable;
    }

    public void m18218a() {
        if (this.f15795b != null) {
            this.f15795b.m17843g();
        }
    }

    public void m18223b() {
        if (this.f15795b != null) {
            this.f15795b.m17844h();
        }
    }

    public void m18224c() {
        if (this.f15795b != null) {
            this.f15795b.m17844h();
            this.f15795b.m17836a(null);
            this.f15795b.m17846j();
            this.f15795b = null;
        }
        this.f15796c = null;
        this.f15798e = null;
    }

    public void m18222a(boolean z) {
        this.f15797d = false;
        if (this.f15795b != null) {
            this.f15795b.m17837a(false);
        }
    }

    public void draw(Canvas canvas) {
        if (this.f15796c != null && !this.f15796c.isRecycled()) {
            canvas.drawBitmap(this.f15796c, 0.0f, 0.0f, this.f15794a);
        }
    }

    public void mo596a(Bitmap bitmap) {
        if (this.f15798e != null) {
            this.f15798e.run();
            this.f15798e = null;
        }
        this.f15796c = bitmap;
        invalidateSelf();
    }

    public int getIntrinsicWidth() {
        return this.f15795b != null ? this.f15795b.m17840d() : 0;
    }

    public int getIntrinsicHeight() {
        return this.f15795b != null ? this.f15795b.m17841e() : 0;
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
        this.f15794a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f15794a.setColorFilter(colorFilter);
    }
}
