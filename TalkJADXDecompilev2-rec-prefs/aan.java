package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class aan extends ImageButton implements nv {
    private aac f50a;
    private aao f51b;

    public aan(Context context) {
        this(context, null);
    }

    public aan(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.f874T);
    }

    public aan(Context context, AttributeSet attributeSet, int i) {
        super(afm.m924a(context), attributeSet, i);
        this.f50a = new aac(this);
        this.f50a.m45a(attributeSet, i);
        this.f51b = new aao(this);
        this.f51b.m96a(attributeSet, i);
    }

    public void setImageResource(int i) {
        this.f51b.m95a(i);
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f50a != null) {
            this.f50a.m42a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f50a != null) {
            this.f50a.m41a();
        }
    }

    public void mo1a(ColorStateList colorStateList) {
        if (this.f50a != null) {
            this.f50a.m43a(colorStateList);
        }
    }

    public ColorStateList mo3c() {
        return this.f50a != null ? this.f50a.m46b() : null;
    }

    public void mo2a(Mode mode) {
        if (this.f50a != null) {
            this.f50a.m44a(mode);
        }
    }

    public Mode mo4d() {
        return this.f50a != null ? this.f50a.m47c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f50a != null) {
            this.f50a.m48d();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f51b.m97a() && super.hasOverlappingRendering();
    }
}
