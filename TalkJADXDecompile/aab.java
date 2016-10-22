import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class aab extends AutoCompleteTextView implements nv {
    private static final int[] a;
    private aac b;
    private abf c;

    static {
        a = new int[]{16843126};
    }

    public aab(Context context) {
        this(context, null);
    }

    public aab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.F);
    }

    public aab(Context context, AttributeSet attributeSet, int i) {
        super(afm.a(context), attributeSet, i);
        afp a = afp.a(getContext(), attributeSet, a, i, 0);
        if (a.g(0)) {
            setDropDownBackgroundDrawable(a.a(0));
        }
        a.a();
        this.b = new aac(this);
        this.b.a(attributeSet, i);
        this.c = abf.a((TextView) this);
        this.c.a(attributeSet, i);
        this.c.a();
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(wk.b(getContext(), i));
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.b != null) {
            this.b.a();
        }
    }

    public void a(ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    public ColorStateList c() {
        return this.b != null ? this.b.b() : null;
    }

    public void a(Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }

    public Mode d() {
        return this.b != null ? this.b.c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.d();
        }
        if (this.c != null) {
            this.c.a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }
}
