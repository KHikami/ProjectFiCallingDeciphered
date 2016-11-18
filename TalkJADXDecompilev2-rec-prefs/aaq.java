package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public final class aaq extends MultiAutoCompleteTextView implements nv {
    private static final int[] f55a = new int[]{16843126};
    private aac f56b;
    private abf f57c;

    public aaq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.f860F);
    }

    private aaq(Context context, AttributeSet attributeSet, int i) {
        super(afm.m924a(context), attributeSet, i);
        afp a = afp.m927a(getContext(), attributeSet, f55a, i, 0);
        if (a.m944g(0)) {
            setDropDownBackgroundDrawable(a.m930a(0));
        }
        a.m931a();
        this.f56b = new aac(this);
        this.f56b.m45a(attributeSet, i);
        this.f57c = abf.m178a((TextView) this);
        this.f57c.mo17a(attributeSet, i);
        this.f57c.mo16a();
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(wk.b(getContext(), i));
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f56b != null) {
            this.f56b.m42a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f56b != null) {
            this.f56b.m41a();
        }
    }

    public void mo1a(ColorStateList colorStateList) {
        if (this.f56b != null) {
            this.f56b.m43a(colorStateList);
        }
    }

    public ColorStateList mo3c() {
        return this.f56b != null ? this.f56b.m46b() : null;
    }

    public void mo2a(Mode mode) {
        if (this.f56b != null) {
            this.f56b.m44a(mode);
        }
    }

    public Mode mo4d() {
        return this.f56b != null ? this.f56b.m47c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f56b != null) {
            this.f56b.m48d();
        }
        if (this.f57c != null) {
            this.f57c.mo16a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f57c != null) {
            this.f57c.m181a(context, i);
        }
    }
}
