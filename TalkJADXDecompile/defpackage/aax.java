package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import oa;

/* renamed from: aax */
final class aax extends aat {
    private final SeekBar a;
    private Drawable b;
    private ColorStateList c;
    private Mode d;
    private boolean e;
    private boolean f;

    aax(SeekBar seekBar) {
        super(seekBar);
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = false;
        this.a = seekBar;
    }

    void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        afp a = afp.a(this.a.getContext(), attributeSet, wi.R, i, 0);
        Drawable b = a.b(wi.S);
        if (b != null) {
            this.a.setThumb(b);
        }
        a(a.a(wi.T));
        if (a.g(wi.V)) {
            this.d = aci.a(a.a(wi.V, -1), this.d);
            this.f = true;
        }
        if (a.g(wi.U)) {
            this.c = a.e(wi.U);
            this.e = true;
        }
        a.a();
        d();
    }

    private void a(Drawable drawable) {
        if (this.b != null) {
            this.b.setCallback(null);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.a);
            jb.b(drawable, oa.d(this.a));
            if (drawable.isStateful()) {
                drawable.setState(this.a.getDrawableState());
            }
            d();
        }
        this.a.invalidate();
    }

    private void d() {
        if (this.b == null) {
            return;
        }
        if (this.e || this.f) {
            this.b = jb.e(this.b.mutate());
            if (this.e) {
                jb.a(this.b, this.c);
            }
            if (this.f) {
                jb.a(this.b, this.d);
            }
            if (this.b.isStateful()) {
                this.b.setState(this.a.getDrawableState());
            }
        }
    }

    void b() {
        if (this.b != null) {
            this.b.jumpToCurrentState();
        }
    }

    void c() {
        Drawable drawable = this.b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.a.getDrawableState())) {
            this.a.invalidateDrawable(drawable);
        }
    }

    void a(Canvas canvas) {
        int i = 1;
        if (this.b != null) {
            int max = this.a.getMax();
            if (max > 1) {
                int intrinsicWidth = this.b.getIntrinsicWidth();
                int intrinsicHeight = this.b.getIntrinsicHeight();
                intrinsicWidth = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.b.setBounds(-intrinsicWidth, -i, intrinsicWidth, i);
                float width = ((float) ((this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight())) / ((float) max);
                intrinsicHeight = canvas.save();
                canvas.translate((float) this.a.getPaddingLeft(), (float) (this.a.getHeight() / 2));
                for (i = 0; i <= max; i++) {
                    this.b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(intrinsicHeight);
            }
        }
    }
}
