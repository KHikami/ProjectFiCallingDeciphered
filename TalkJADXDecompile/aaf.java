import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

public final class aaf extends CheckBox implements tk {
    private aah a;

    public aaf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.H);
    }

    private aaf(Context context, AttributeSet attributeSet, int i) {
        super(afm.a(context), attributeSet, i);
        this.a = new aah(this);
        this.a.a(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.a != null) {
            this.a.a();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(wk.b(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.a != null ? this.a.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public void a(ColorStateList colorStateList) {
        if (this.a != null) {
            this.a.a(colorStateList);
        }
    }

    public void a(Mode mode) {
        if (this.a != null) {
            this.a.a(mode);
        }
    }
}
