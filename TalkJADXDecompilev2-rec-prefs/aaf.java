package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

public final class aaf extends CheckBox implements tk {
    private aah f23a;

    public aaf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.f862H);
    }

    private aaf(Context context, AttributeSet attributeSet, int i) {
        super(afm.m924a(context), attributeSet, i);
        this.f23a = new aah(this);
        this.f23a.m64a(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f23a != null) {
            this.f23a.m61a();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(wk.b(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f23a != null ? this.f23a.m60a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public void mo6a(ColorStateList colorStateList) {
        if (this.f23a != null) {
            this.f23a.m62a(colorStateList);
        }
    }

    public void mo7a(Mode mode) {
        if (this.f23a != null) {
            this.f23a.m63a(mode);
        }
    }
}
