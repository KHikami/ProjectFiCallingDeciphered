package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

public final class aau extends RadioButton implements tk {
    private aah f66a;

    public aau(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.f878X);
    }

    private aau(Context context, AttributeSet attributeSet, int i) {
        super(afm.m924a(context), attributeSet, i);
        this.f66a = new aah(this);
        this.f66a.m64a(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f66a != null) {
            this.f66a.m61a();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(wk.b(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f66a != null ? this.f66a.m60a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public void mo6a(ColorStateList colorStateList) {
        if (this.f66a != null) {
            this.f66a.m62a(colorStateList);
        }
    }

    public void mo7a(Mode mode) {
        if (this.f66a != null) {
            this.f66a.m63a(mode);
        }
    }
}
