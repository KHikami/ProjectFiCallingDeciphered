package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class aab extends AutoCompleteTextView implements nv {
    private static final int[] f7a = new int[]{16843126};
    private aac f8b;
    private abf f9c;

    public aab(Context context) {
        this(context, null);
    }

    public aab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.f860F);
    }

    public aab(Context context, AttributeSet attributeSet, int i) {
        super(afm.m924a(context), attributeSet, i);
        afp a = afp.m927a(getContext(), attributeSet, f7a, i, 0);
        if (a.m944g(0)) {
            setDropDownBackgroundDrawable(a.m930a(0));
        }
        a.m931a();
        this.f8b = new aac(this);
        this.f8b.m45a(attributeSet, i);
        this.f9c = abf.m178a((TextView) this);
        this.f9c.mo17a(attributeSet, i);
        this.f9c.mo16a();
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(wk.b(getContext(), i));
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f8b != null) {
            this.f8b.m42a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f8b != null) {
            this.f8b.m41a();
        }
    }

    public void mo1a(ColorStateList colorStateList) {
        if (this.f8b != null) {
            this.f8b.m43a(colorStateList);
        }
    }

    public ColorStateList mo3c() {
        return this.f8b != null ? this.f8b.m46b() : null;
    }

    public void mo2a(Mode mode) {
        if (this.f8b != null) {
            this.f8b.m44a(mode);
        }
    }

    public Mode mo4d() {
        return this.f8b != null ? this.f8b.m47c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f8b != null) {
            this.f8b.m48d();
        }
        if (this.f9c != null) {
            this.f9c.mo16a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f9c != null) {
            this.f9c.m181a(context, i);
        }
    }
}
