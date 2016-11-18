package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;

public final class aam extends EditText implements nv {
    private aac f48a;
    private abf f49b;

    public aam(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.f872R);
    }

    private aam(Context context, AttributeSet attributeSet, int i) {
        super(afm.m924a(context), attributeSet, i);
        this.f48a = new aac(this);
        this.f48a.m45a(attributeSet, i);
        this.f49b = abf.m178a((TextView) this);
        this.f49b.mo17a(attributeSet, i);
        this.f49b.mo16a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f48a != null) {
            this.f48a.m42a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f48a != null) {
            this.f48a.m41a();
        }
    }

    public void mo1a(ColorStateList colorStateList) {
        if (this.f48a != null) {
            this.f48a.m43a(colorStateList);
        }
    }

    public ColorStateList mo3c() {
        return this.f48a != null ? this.f48a.m46b() : null;
    }

    public void mo2a(Mode mode) {
        if (this.f48a != null) {
            this.f48a.m44a(mode);
        }
    }

    public Mode mo4d() {
        return this.f48a != null ? this.f48a.m47c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f48a != null) {
            this.f48a.m48d();
        }
        if (this.f49b != null) {
            this.f49b.mo16a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f49b != null) {
            this.f49b.m181a(context, i);
        }
    }
}
