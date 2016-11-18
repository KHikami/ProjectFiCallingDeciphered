package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

public class abh extends TextView implements nv {
    private aac f153a;
    private abf f154b;

    public abh(Context context) {
        this(context, null);
    }

    public abh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public abh(Context context, AttributeSet attributeSet, int i) {
        super(afm.m924a(context), attributeSet, i);
        this.f153a = new aac(this);
        this.f153a.m45a(attributeSet, i);
        this.f154b = abf.m178a((TextView) this);
        this.f154b.mo17a(attributeSet, i);
        this.f154b.mo16a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f153a != null) {
            this.f153a.m42a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f153a != null) {
            this.f153a.m41a();
        }
    }

    public void mo1a(ColorStateList colorStateList) {
        if (this.f153a != null) {
            this.f153a.m43a(colorStateList);
        }
    }

    public ColorStateList mo3c() {
        return this.f153a != null ? this.f153a.m46b() : null;
    }

    public void mo2a(Mode mode) {
        if (this.f153a != null) {
            this.f153a.m44a(mode);
        }
    }

    public Mode mo4d() {
        return this.f153a != null ? this.f153a.m47c() : null;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f154b != null) {
            this.f154b.m181a(context, i);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f153a != null) {
            this.f153a.m48d();
        }
        if (this.f154b != null) {
            this.f154b.mo16a();
        }
    }
}
