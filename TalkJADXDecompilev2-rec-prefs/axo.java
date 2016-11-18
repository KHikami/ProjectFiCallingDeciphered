package p000;

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

public class axo extends Drawable implements Animatable, axu {
    private final axp f2488a;
    private boolean f2489b;
    private boolean f2490c;
    private boolean f2491d;
    private boolean f2492e;
    private int f2493f;
    private int f2494g;
    private boolean f2495h;
    private Paint f2496i;
    private Rect f2497j;

    public axo(Context context, ani ani, ard ard, aoc<Bitmap> aoc_android_graphics_Bitmap, int i, int i2, Bitmap bitmap) {
        this(new axp(ard, new axs(ami.m2900a(context), ani, i, i2, aoc_android_graphics_Bitmap, bitmap)));
    }

    axo(axp axp) {
        this.f2492e = true;
        this.f2494g = -1;
        this.f2488a = (axp) gwb.m1404I((Object) axp);
    }

    public int m4284a() {
        return this.f2488a.f2499b.m4306d();
    }

    public Bitmap m4286b() {
        return this.f2488a.f2499b.m4299a();
    }

    public void m4285a(aoc<Bitmap> aoc_android_graphics_Bitmap, Bitmap bitmap) {
        this.f2488a.f2499b.m4300a(aoc_android_graphics_Bitmap, bitmap);
    }

    public ByteBuffer m4287c() {
        return this.f2488a.f2499b.m4308f();
    }

    public int m4288d() {
        return this.f2488a.f2499b.m4309g();
    }

    public int m4289e() {
        return this.f2488a.f2499b.m4307e();
    }

    public void start() {
        this.f2490c = true;
        this.f2493f = 0;
        if (this.f2492e) {
            m4280h();
        }
    }

    public void stop() {
        this.f2490c = false;
        m4281i();
    }

    private void m4280h() {
        gwb.m1887a(!this.f2491d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f2488a.f2499b.m4309g() == 1) {
            invalidateSelf();
        } else if (!this.f2489b) {
            this.f2489b = true;
            this.f2488a.f2499b.m4302a((axu) this);
            invalidateSelf();
        }
    }

    private void m4281i() {
        this.f2489b = false;
        this.f2488a.f2499b.m4304b(this);
    }

    public boolean setVisible(boolean z, boolean z2) {
        gwb.m1887a(!this.f2491d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f2492e = z;
        if (!z) {
            m4281i();
        } else if (this.f2490c) {
            m4280h();
        }
        return super.setVisible(z, z2);
    }

    public int getIntrinsicWidth() {
        return this.f2488a.f2499b.m4303b();
    }

    public int getIntrinsicHeight() {
        return this.f2488a.f2499b.m4305c();
    }

    public boolean isRunning() {
        return this.f2489b;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2495h = true;
    }

    public void draw(Canvas canvas) {
        if (!this.f2491d) {
            if (this.f2495h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m4282j());
                this.f2495h = false;
            }
            canvas.drawBitmap(this.f2488a.f2499b.m4311i(), null, m4282j(), m4283k());
        }
    }

    public void setAlpha(int i) {
        m4283k().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m4283k().setColorFilter(colorFilter);
    }

    private Rect m4282j() {
        if (this.f2497j == null) {
            this.f2497j = new Rect();
        }
        return this.f2497j;
    }

    private Paint m4283k() {
        if (this.f2496i == null) {
            this.f2496i = new Paint(2);
        }
        return this.f2496i;
    }

    public int getOpacity() {
        return -2;
    }

    public void mo407f() {
        if (VERSION.SDK_INT < 11 || getCallback() != null) {
            invalidateSelf();
            if (m4289e() == m4288d() - 1) {
                this.f2493f++;
            }
            if (this.f2494g != -1 && this.f2493f >= this.f2494g) {
                stop();
                return;
            }
            return;
        }
        stop();
        invalidateSelf();
    }

    public ConstantState getConstantState() {
        return this.f2488a;
    }

    public void m4291g() {
        this.f2491d = true;
        this.f2488a.f2499b.m4310h();
    }
}
