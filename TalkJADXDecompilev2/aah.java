package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class aah {
    private final CompoundButton a;
    private ColorStateList b = null;
    private Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    aah(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, wi.aF, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(wi.aG)) {
                int resourceId = obtainStyledAttributes.getResourceId(wi.aG, 0);
                if (resourceId != 0) {
                    this.a.setButtonDrawable(wk.b(this.a.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(wi.aH)) {
                rq.a.a(this.a, obtainStyledAttributes.getColorStateList(wi.aH));
            }
            if (obtainStyledAttributes.hasValue(wi.aI)) {
                rq.a.a(this.a, aci.a(obtainStyledAttributes.getInt(wi.aI, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    void a(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        b();
    }

    void a(Mode mode) {
        this.c = mode;
        this.e = true;
        b();
    }

    void a() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        b();
    }

    private void b() {
        Drawable a = rq.a(this.a);
        if (a == null) {
            return;
        }
        if (this.d || this.e) {
            a = jb.e(a).mutate();
            if (this.d) {
                jb.a(a, this.b);
            }
            if (this.e) {
                jb.a(a, this.c);
            }
            if (a.isStateful()) {
                a.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(a);
        }
    }

    int a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = rq.a(this.a);
        if (a != null) {
            return i + a.getIntrinsicWidth();
        }
        return i;
    }
}
