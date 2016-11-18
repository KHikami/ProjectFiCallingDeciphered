package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.google.api.client.http.ExponentialBackOffPolicy;

class gof extends ImageSpan {
    final int f15783a;
    final int f15784b;
    final /* synthetic */ goc f15785c;
    private Bitmap f15786d;
    private boolean f15787e = false;

    public gof(goc goc, Drawable drawable, String str, int i, int i2) {
        this.f15785c = goc;
        super(drawable, str, 1);
        this.f15783a = i;
        this.f15784b = i2;
    }

    void m18212a() {
        synchronized (this) {
            this.f15787e = true;
            if (this.f15786d != null) {
                this.f15785c.f15773a.mo2288a(this.f15786d);
                this.f15786d = null;
            }
        }
    }

    void m18213a(Bitmap bitmap) {
        synchronized (this) {
            if (this.f15787e) {
                this.f15785c.f15773a.mo2288a(bitmap);
            } else {
                this.f15786d = bitmap;
            }
        }
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f15786d != null) {
            int dimensionPixelOffset = gwb.m1400H().getResources().getDimensionPixelOffset(gwb.eO);
            goc.f15771c.set(0, 0, this.f15786d.getWidth(), this.f15786d.getHeight());
            goc.f15772d.set(((int) f) + dimensionPixelOffset, i3, (int) (((float) dimensionPixelOffset) + (((float) this.f15783a) + f)), this.f15784b + i3);
            canvas.drawBitmap(this.f15786d, goc.f15771c, goc.f15772d, null);
        }
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        if (fontMetricsInt != null) {
            paint.getFontMetrics(this.f15785c.f15774b);
            fontMetricsInt.ascent = (int) (((double) this.f15785c.f15774b.ascent) + ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR);
            fontMetricsInt.descent = (int) (((double) this.f15785c.f15774b.descent) + ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR);
            fontMetricsInt.top = (int) (((double) this.f15785c.f15774b.top) + ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR);
            fontMetricsInt.bottom = (int) (((double) this.f15785c.f15774b.bottom) + ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR);
        }
        return size;
    }
}
