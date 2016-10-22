import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.google.api.client.http.ExponentialBackOffPolicy;

class gof extends ImageSpan {
    final int a;
    final int b;
    final /* synthetic */ goc c;
    private Bitmap d;
    private boolean e;

    public gof(goc goc, Drawable drawable, String str, int i, int i2) {
        this.c = goc;
        super(drawable, str, 1);
        this.e = false;
        this.a = i;
        this.b = i2;
    }

    void a() {
        synchronized (this) {
            this.e = true;
            if (this.d != null) {
                this.c.a.a(this.d);
                this.d = null;
            }
        }
    }

    void a(Bitmap bitmap) {
        synchronized (this) {
            if (this.e) {
                this.c.a.a(bitmap);
            } else {
                this.d = bitmap;
            }
        }
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.d != null) {
            int dimensionPixelOffset = gwb.H().getResources().getDimensionPixelOffset(gwb.eO);
            goc.c.set(0, 0, this.d.getWidth(), this.d.getHeight());
            goc.d.set(((int) f) + dimensionPixelOffset, i3, (int) (((float) dimensionPixelOffset) + (((float) this.a) + f)), this.b + i3);
            canvas.drawBitmap(this.d, goc.c, goc.d, null);
        }
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        if (fontMetricsInt != null) {
            paint.getFontMetrics(this.c.b);
            fontMetricsInt.ascent = (int) (((double) this.c.b.ascent) + ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR);
            fontMetricsInt.descent = (int) (((double) this.c.b.descent) + ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR);
            fontMetricsInt.top = (int) (((double) this.c.b.top) + ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR);
            fontMetricsInt.bottom = (int) (((double) this.c.b.bottom) + ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR);
        }
        return size;
    }
}
