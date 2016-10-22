package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: PG */
/* renamed from: vy */
final class vy extends vu {
    final SeekBar b;
    Drawable c;
    private ColorStateList d;
    private Mode e;
    private boolean f;
    private boolean g;

    vy(SeekBar seekBar, vi viVar) {
        super(seekBar, viVar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        aah a = aah.a(this.b.getContext(), attributeSet, rk.P, i, 0);
        Drawable b = a.b(rk.Q);
        if (b != null) {
            this.b.setThumb(b);
        }
        b = a.a(rk.R);
        if (this.c != null) {
            this.c.setCallback(null);
        }
        this.c = b;
        if (b != null) {
            b.setCallback(this.b);
            gr.a.b(b, kn.f(this.b));
            if (b.isStateful()) {
                b.setState(this.b.getDrawableState());
            }
            a();
        }
        this.b.invalidate();
        if (a.e(rk.T)) {
            this.e = xi.a(a.a(rk.T, -1), this.e);
            this.g = true;
        }
        if (a.e(rk.S)) {
            this.d = a.d(rk.S);
            this.f = true;
        }
        a.a.recycle();
        a();
    }

    private final void a() {
        if (this.c == null) {
            return;
        }
        if (this.f || this.g) {
            this.c = this.c.mutate();
            if (this.f) {
                this.c.setTintList(this.d);
            }
            if (this.g) {
                this.c.setTintMode(this.e);
            }
            if (this.c.isStateful()) {
                this.c.setState(this.b.getDrawableState());
            }
        }
    }
}
