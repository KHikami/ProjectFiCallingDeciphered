package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class aap extends ImageView implements nv {
    private aac f53a;
    private aao f54b;

    public aap(Context context) {
        this(context, null);
    }

    public aap(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public aap(Context context, AttributeSet attributeSet, int i) {
        super(afm.m924a(context), attributeSet, i);
        this.f53a = new aac(this);
        this.f53a.m45a(attributeSet, i);
        this.f54b = new aao(this);
        this.f54b.m96a(attributeSet, i);
    }

    public void setImageResource(int i) {
        this.f54b.m95a(i);
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f53a != null) {
            this.f53a.m42a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f53a != null) {
            this.f53a.m41a();
        }
    }

    public void mo1a(ColorStateList colorStateList) {
        if (this.f53a != null) {
            this.f53a.m43a(colorStateList);
        }
    }

    public ColorStateList mo3c() {
        return this.f53a != null ? this.f53a.m46b() : null;
    }

    public void mo2a(Mode mode) {
        if (this.f53a != null) {
            this.f53a.m44a(mode);
        }
    }

    public Mode mo4d() {
        return this.f53a != null ? this.f53a.m47c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f53a != null) {
            this.f53a.m48d();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f54b.m97a() && super.hasOverlappingRendering();
    }
}
