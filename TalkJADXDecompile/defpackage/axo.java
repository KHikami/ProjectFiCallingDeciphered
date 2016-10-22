package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.view.Gravity;
import java.nio.ByteBuffer;

/* renamed from: axo */
public class axo extends Drawable implements Animatable, axu {
    private final axp a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private Paint i;
    private Rect j;

    public axo(Context context, ani ani, ard ard, aoc<Bitmap> aoc_android_graphics_Bitmap, int i, int i2, Bitmap bitmap) {
        this(new axp(ard, new axs(ami.a(context), ani, i, i2, aoc_android_graphics_Bitmap, bitmap)));
    }

    axo(axp axp) {
        this.e = true;
        this.g = -1;
        this.a = (axp) gwb.I((Object) axp);
    }

    public int a() {
        return this.a.b.d();
    }

    public Bitmap b() {
        return this.a.b.a();
    }

    public void a(aoc<Bitmap> aoc_android_graphics_Bitmap, Bitmap bitmap) {
        this.a.b.a(aoc_android_graphics_Bitmap, bitmap);
    }

    public ByteBuffer c() {
        return this.a.b.f();
    }

    public int d() {
        return this.a.b.g();
    }

    public int e() {
        return this.a.b.e();
    }

    public void start() {
        this.c = true;
        this.f = 0;
        if (this.e) {
            h();
        }
    }

    public void stop() {
        this.c = false;
        i();
    }

    private void h() {
        gwb.a(!this.d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.a.b.g() == 1) {
            invalidateSelf();
        } else if (!this.b) {
            this.b = true;
            this.a.b.a((axu) this);
            invalidateSelf();
        }
    }

    private void i() {
        this.b = false;
        this.a.b.b(this);
    }

    public boolean setVisible(boolean z, boolean z2) {
        gwb.a(!this.d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.e = z;
        if (!z) {
            i();
        } else if (this.c) {
            h();
        }
        return super.setVisible(z, z2);
    }

    public int getIntrinsicWidth() {
        return this.a.b.b();
    }

    public int getIntrinsicHeight() {
        return this.a.b.c();
    }

    public boolean isRunning() {
        return this.b;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    public void draw(Canvas canvas) {
        if (!this.d) {
            if (this.h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), j());
                this.h = false;
            }
            canvas.drawBitmap(this.a.b.i(), null, j(), k());
        }
    }

    public void setAlpha(int i) {
        k().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        k().setColorFilter(colorFilter);
    }

    private Rect j() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    private Paint k() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    public int getOpacity() {
        return -2;
    }

    public void f() {
        if (VERSION.SDK_INT < 11 || getCallback() != null) {
            invalidateSelf();
            if (e() == d() - 1) {
                this.f++;
            }
            if (this.g != -1 && this.f >= this.g) {
                stop();
                return;
            }
            return;
        }
        stop();
        invalidateSelf();
    }

    public ConstantState getConstantState() {
        return this.a;
    }

    public void g() {
        this.d = true;
        this.a.b.h();
    }
}
