package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class aah {
    private final CompoundButton f26a;
    private ColorStateList f27b = null;
    private Mode f28c = null;
    private boolean f29d = false;
    private boolean f30e = false;
    private boolean f31f;

    aah(CompoundButton compoundButton) {
        this.f26a = compoundButton;
    }

    void m64a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f26a.getContext().obtainStyledAttributes(attributeSet, wi.aF, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(wi.aG)) {
                int resourceId = obtainStyledAttributes.getResourceId(wi.aG, 0);
                if (resourceId != 0) {
                    this.f26a.setButtonDrawable(wk.b(this.f26a.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(wi.aH)) {
                rq.a.a(this.f26a, obtainStyledAttributes.getColorStateList(wi.aH));
            }
            if (obtainStyledAttributes.hasValue(wi.aI)) {
                rq.a.a(this.f26a, aci.m376a(obtainStyledAttributes.getInt(wi.aI, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    void m62a(ColorStateList colorStateList) {
        this.f27b = colorStateList;
        this.f29d = true;
        m59b();
    }

    void m63a(Mode mode) {
        this.f28c = mode;
        this.f30e = true;
        m59b();
    }

    void m61a() {
        if (this.f31f) {
            this.f31f = false;
            return;
        }
        this.f31f = true;
        m59b();
    }

    private void m59b() {
        Drawable a = rq.a(this.f26a);
        if (a == null) {
            return;
        }
        if (this.f29d || this.f30e) {
            a = jb.m23755e(a).mutate();
            if (this.f29d) {
                jb.m23746a(a, this.f27b);
            }
            if (this.f30e) {
                jb.m23749a(a, this.f28c);
            }
            if (a.isStateful()) {
                a.setState(this.f26a.getDrawableState());
            }
            this.f26a.setButtonDrawable(a);
        }
    }

    int m60a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = rq.a(this.f26a);
        if (a != null) {
            return i + a.getIntrinsicWidth();
        }
        return i;
    }
}
