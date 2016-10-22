import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: PG */
class wg {
    private static final int[] b;
    final TextView a;
    private aaf c;
    private aaf d;
    private aaf e;
    private aaf f;

    static wg a(TextView textView) {
        if (VERSION.SDK_INT >= 17) {
            return new wh(textView);
        }
        return new wg(textView);
    }

    static {
        b = new int[]{16842804, 16843119, 16843117, 16843120, 16843118};
    }

    wg(TextView textView) {
        this.a = textView;
    }

    void a(AttributeSet attributeSet, int i) {
        boolean z;
        Context context = this.a.getContext();
        vi a = vi.a();
        aah a2 = aah.a(context, attributeSet, b, i, 0);
        int g = a2.g(0, -1);
        if (a2.e(1)) {
            this.c = a(context, a, a2.g(1, 0));
        }
        if (a2.e(2)) {
            this.d = a(context, a, a2.g(2, 0));
        }
        if (a2.e(3)) {
            this.e = a(context, a, a2.g(3, 0));
        }
        if (a2.e(4)) {
            this.f = a(context, a, a2.g(4, 0));
        }
        a2.a.recycle();
        boolean z2 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        ColorStateList colorStateList = null;
        boolean z3;
        if (g != -1) {
            aah a3 = aah.a(context, g, rk.bw);
            if (z2 || !a3.e(rk.bz)) {
                z3 = false;
                z = false;
            } else {
                z = a3.a(rk.bz, false);
                int i2 = 1;
            }
            if (VERSION.SDK_INT < 23 && a3.e(rk.bx)) {
                colorStateList = a3.d(rk.bx);
            }
            a3.a.recycle();
        } else {
            z3 = false;
            z = false;
        }
        aah a4 = aah.a(context, attributeSet, rk.bw, i, 0);
        if (!z2 && a4.e(rk.bz)) {
            z = a4.a(rk.bz, false);
            i2 = 1;
        }
        if (VERSION.SDK_INT < 23 && a4.e(rk.bx)) {
            colorStateList = a4.d(rk.bx);
        }
        a4.a.recycle();
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        if (!z2 && r0 != 0) {
            a(z);
        }
    }

    final void a(Context context, int i) {
        aah a = aah.a(context, i, rk.bw);
        if (a.e(rk.bz)) {
            a(a.a(rk.bz, false));
        }
        if (VERSION.SDK_INT < 23 && a.e(rk.bx)) {
            ColorStateList d = a.d(rk.bx);
            if (d != null) {
                this.a.setTextColor(d);
            }
        }
        a.a.recycle();
    }

    private void a(boolean z) {
        this.a.setTransformationMethod(z ? new rr(this.a.getContext()) : null);
    }

    void a() {
        if (this.c != null || this.d != null || this.e != null || this.f != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.c);
            a(compoundDrawables[1], this.d);
            a(compoundDrawables[2], this.e);
            a(compoundDrawables[3], this.f);
        }
    }

    final void a(Drawable drawable, aaf aaf) {
        if (drawable != null && aaf != null) {
            vi.a(drawable, aaf, this.a.getDrawableState());
        }
    }

    protected static aaf a(Context context, vi viVar, int i) {
        ColorStateList b = viVar.b(context, i);
        if (b == null) {
            return null;
        }
        aaf aaf = new aaf();
        aaf.d = true;
        aaf.a = b;
        return aaf;
    }
}
