package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* compiled from: PG */
/* renamed from: vv */
public final class vv extends RadioButton implements pg {
    private vi a;
    private vh b;

    public vv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, buf.U);
    }

    private vv(Context context, AttributeSet attributeSet, int i) {
        super(aae.a(context), attributeSet, i);
        this.a = vi.a();
        this.b = new vh(this, this.a);
        this.b.a(attributeSet, i);
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.b != null) {
            this.b.a();
        }
    }

    public final void setButtonDrawable(int i) {
        Drawable a;
        if (this.a != null) {
            a = this.a.a(getContext(), i, false);
        } else {
            a = gd.a(getContext(), i);
        }
        setButtonDrawable(a);
    }

    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.b != null ? this.b.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public final void a(ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    public final void a(Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }
}
