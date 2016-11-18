package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

class abf {
    final TextView f146a;
    private afn f147b;
    private afn f148c;
    private afn f149d;
    private afn f150e;

    static abf m178a(TextView textView) {
        if (VERSION.SDK_INT >= 17) {
            return new abg(textView);
        }
        return new abf(textView);
    }

    abf(TextView textView) {
        this.f146a = textView;
    }

    void mo17a(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        Context context = this.f146a.getContext();
        aai a = aai.m66a();
        afp a2 = afp.m927a(context, attributeSet, wi.f29030W, i, 0);
        int g = a2.m943g(wi.ad, -1);
        if (a2.m944g(wi.f29033Z)) {
            this.f147b = abf.m179a(context, a, a2.m943g(wi.f29033Z, 0));
        }
        if (a2.m944g(wi.ac)) {
            this.f148c = abf.m179a(context, a, a2.m943g(wi.ac, 0));
        }
        if (a2.m944g(wi.aa)) {
            this.f149d = abf.m179a(context, a, a2.m943g(wi.aa, 0));
        }
        if (a2.m944g(wi.f29031X)) {
            this.f150e = abf.m179a(context, a, a2.m943g(wi.f29031X, 0));
        }
        a2.m931a();
        boolean z3 = this.f146a.getTransformationMethod() instanceof PasswordTransformationMethod;
        ColorStateList colorStateList = null;
        if (g != -1) {
            afp a3 = afp.m925a(context, g, wi.da);
            if (z3 || !a3.m944g(wi.df)) {
                z = false;
                z2 = false;
            } else {
                z2 = a3.m932a(wi.df, false);
                z = true;
            }
            if (VERSION.SDK_INT < 23 && a3.m944g(wi.db)) {
                colorStateList = a3.m940e(wi.db);
            }
            a3.m931a();
        } else {
            z = false;
            z2 = false;
        }
        afp a4 = afp.m927a(context, attributeSet, wi.da, i, 0);
        if (!z3 && a4.m944g(wi.df)) {
            z2 = a4.m932a(wi.df, false);
            z = true;
        }
        if (VERSION.SDK_INT < 23 && a4.m944g(wi.db)) {
            colorStateList = a4.m940e(wi.db);
        }
        a4.m931a();
        if (colorStateList != null) {
            this.f146a.setTextColor(colorStateList);
        }
        if (!z3 && r0) {
            m184a(z2);
        }
    }

    void m181a(Context context, int i) {
        afp a = afp.m925a(context, i, wi.da);
        if (a.m944g(wi.df)) {
            m184a(a.m932a(wi.df, false));
        }
        if (VERSION.SDK_INT < 23 && a.m944g(wi.db)) {
            ColorStateList e = a.m940e(wi.db);
            if (e != null) {
                this.f146a.setTextColor(e);
            }
        }
        a.m931a();
    }

    void m184a(boolean z) {
        this.f146a.setTransformationMethod(z ? new wq(this.f146a.getContext()) : null);
    }

    void mo16a() {
        if (this.f147b != null || this.f148c != null || this.f149d != null || this.f150e != null) {
            Drawable[] compoundDrawables = this.f146a.getCompoundDrawables();
            m182a(compoundDrawables[0], this.f147b);
            m182a(compoundDrawables[1], this.f148c);
            m182a(compoundDrawables[2], this.f149d);
            m182a(compoundDrawables[3], this.f150e);
        }
    }

    final void m182a(Drawable drawable, afn afn) {
        if (drawable != null && afn != null) {
            aai.m71a(drawable, afn, this.f146a.getDrawableState());
        }
    }

    protected static afn m179a(Context context, aai aai, int i) {
        ColorStateList b = aai.m83b(context, i);
        if (b == null) {
            return null;
        }
        afn afn = new afn();
        afn.f19e = true;
        afn.f16b = b;
        return afn;
    }
}
