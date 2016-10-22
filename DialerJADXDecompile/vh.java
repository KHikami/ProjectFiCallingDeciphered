import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* compiled from: PG */
final class vh {
    private final CompoundButton a;
    private final vi b;
    private ColorStateList c;
    private Mode d;
    private boolean e;
    private boolean f;
    private boolean g;

    vh(CompoundButton compoundButton, vi viVar) {
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = false;
        this.a = compoundButton;
        this.b = viVar;
    }

    final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, rk.ao, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(rk.ap)) {
                int resourceId = obtainStyledAttributes.getResourceId(rk.ap, 0);
                if (resourceId != 0) {
                    this.a.setButtonDrawable(this.b.a(this.a.getContext(), resourceId, false));
                }
            }
            if (obtainStyledAttributes.hasValue(rk.aq)) {
                nv.a.a(this.a, obtainStyledAttributes.getColorStateList(rk.aq));
            }
            if (obtainStyledAttributes.hasValue(rk.ar)) {
                nv.a.a(this.a, xi.a(obtainStyledAttributes.getInt(rk.ar, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    final void a(ColorStateList colorStateList) {
        this.c = colorStateList;
        this.e = true;
        b();
    }

    final void a(Mode mode) {
        this.d = mode;
        this.f = true;
        b();
    }

    final void a() {
        if (this.g) {
            this.g = false;
            return;
        }
        this.g = true;
        b();
    }

    private void b() {
        Drawable a = nv.a(this.a);
        if (a == null) {
            return;
        }
        if (this.e || this.f) {
            a = gr.e(a).mutate();
            if (this.e) {
                gr.a(a, this.c);
            }
            if (this.f) {
                gr.a(a, this.d);
            }
            if (a.isStateful()) {
                a.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(a);
        }
    }

    final int a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = nv.a(this.a);
        if (a != null) {
            return i + a.getIntrinsicWidth();
        }
        return i;
    }
}
