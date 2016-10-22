import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

class abf {
    final TextView a;
    private afn b;
    private afn c;
    private afn d;
    private afn e;

    static abf a(TextView textView) {
        if (VERSION.SDK_INT >= 17) {
            return new abg(textView);
        }
        return new abf(textView);
    }

    abf(TextView textView) {
        this.a = textView;
    }

    void a(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        Context context = this.a.getContext();
        aai a = aai.a();
        afp a2 = afp.a(context, attributeSet, wi.W, i, 0);
        int g = a2.g(wi.ad, -1);
        if (a2.g(wi.Z)) {
            this.b = a(context, a, a2.g(wi.Z, 0));
        }
        if (a2.g(wi.ac)) {
            this.c = a(context, a, a2.g(wi.ac, 0));
        }
        if (a2.g(wi.aa)) {
            this.d = a(context, a, a2.g(wi.aa, 0));
        }
        if (a2.g(wi.X)) {
            this.e = a(context, a, a2.g(wi.X, 0));
        }
        a2.a();
        boolean z3 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        ColorStateList colorStateList = null;
        if (g != -1) {
            afp a3 = afp.a(context, g, wi.da);
            if (z3 || !a3.g(wi.df)) {
                z = false;
                z2 = false;
            } else {
                z2 = a3.a(wi.df, false);
                z = true;
            }
            if (VERSION.SDK_INT < 23 && a3.g(wi.db)) {
                colorStateList = a3.e(wi.db);
            }
            a3.a();
        } else {
            z = false;
            z2 = false;
        }
        afp a4 = afp.a(context, attributeSet, wi.da, i, 0);
        if (!z3 && a4.g(wi.df)) {
            z2 = a4.a(wi.df, false);
            z = true;
        }
        if (VERSION.SDK_INT < 23 && a4.g(wi.db)) {
            colorStateList = a4.e(wi.db);
        }
        a4.a();
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        if (!z3 && r0) {
            a(z2);
        }
    }

    void a(Context context, int i) {
        afp a = afp.a(context, i, wi.da);
        if (a.g(wi.df)) {
            a(a.a(wi.df, false));
        }
        if (VERSION.SDK_INT < 23 && a.g(wi.db)) {
            ColorStateList e = a.e(wi.db);
            if (e != null) {
                this.a.setTextColor(e);
            }
        }
        a.a();
    }

    void a(boolean z) {
        this.a.setTransformationMethod(z ? new wq(this.a.getContext()) : null);
    }

    void a() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
    }

    final void a(Drawable drawable, afn afn) {
        if (drawable != null && afn != null) {
            aai.a(drawable, afn, this.a.getDrawableState());
        }
    }

    protected static afn a(Context context, aai aai, int i) {
        ColorStateList b = aai.b(context, i);
        if (b == null) {
            return null;
        }
        afn afn = new afn();
        afn.e = true;
        afn.b = b;
        return afn;
    }
}
