package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

final class aax extends aat {
    private final SeekBar f69a;
    private Drawable f70b;
    private ColorStateList f71c = null;
    private Mode f72d = null;
    private boolean f73e = false;
    private boolean f74f = false;

    aax(SeekBar seekBar) {
        super(seekBar);
        this.f69a = seekBar;
    }

    void mo9a(AttributeSet attributeSet, int i) {
        super.mo9a(attributeSet, i);
        afp a = afp.m927a(this.f69a.getContext(), attributeSet, wi.f29025R, i, 0);
        Drawable b = a.m934b(wi.f29026S);
        if (b != null) {
            this.f69a.setThumb(b);
        }
        m113a(a.m930a(wi.f29027T));
        if (a.m944g(wi.f29029V)) {
            this.f72d = aci.m376a(a.m929a(wi.f29029V, -1), this.f72d);
            this.f74f = true;
        }
        if (a.m944g(wi.f29028U)) {
            this.f71c = a.m940e(wi.f29028U);
            this.f73e = true;
        }
        a.m931a();
        m114d();
    }

    private void m113a(Drawable drawable) {
        if (this.f70b != null) {
            this.f70b.setCallback(null);
        }
        this.f70b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f69a);
            jb.m23752b(drawable, oa.d(this.f69a));
            if (drawable.isStateful()) {
                drawable.setState(this.f69a.getDrawableState());
            }
            m114d();
        }
        this.f69a.invalidate();
    }

    private void m114d() {
        if (this.f70b == null) {
            return;
        }
        if (this.f73e || this.f74f) {
            this.f70b = jb.m23755e(this.f70b.mutate());
            if (this.f73e) {
                jb.m23746a(this.f70b, this.f71c);
            }
            if (this.f74f) {
                jb.m23749a(this.f70b, this.f72d);
            }
            if (this.f70b.isStateful()) {
                this.f70b.setState(this.f69a.getDrawableState());
            }
        }
    }

    void m117b() {
        if (this.f70b != null) {
            this.f70b.jumpToCurrentState();
        }
    }

    void m118c() {
        Drawable drawable = this.f70b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f69a.getDrawableState())) {
            this.f69a.invalidateDrawable(drawable);
        }
    }

    void m115a(Canvas canvas) {
        int i = 1;
        if (this.f70b != null) {
            int max = this.f69a.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f70b.getIntrinsicWidth();
                int intrinsicHeight = this.f70b.getIntrinsicHeight();
                intrinsicWidth = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f70b.setBounds(-intrinsicWidth, -i, intrinsicWidth, i);
                float width = ((float) ((this.f69a.getWidth() - this.f69a.getPaddingLeft()) - this.f69a.getPaddingRight())) / ((float) max);
                intrinsicHeight = canvas.save();
                canvas.translate((float) this.f69a.getPaddingLeft(), (float) (this.f69a.getHeight() / 2));
                for (i = 0; i <= max; i++) {
                    this.f70b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(intrinsicHeight);
            }
        }
    }
}
