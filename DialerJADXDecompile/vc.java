import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/* compiled from: PG */
public class vc extends AutoCompleteTextView implements ki {
    private static final int[] a;
    private vi b;
    private vd c;
    private wg d;

    static {
        a = new int[]{16843126};
    }

    public vc(Context context) {
        this(context, null);
    }

    public vc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, buf.E);
    }

    public vc(Context context, AttributeSet attributeSet, int i) {
        super(aae.a(context), attributeSet, i);
        this.b = vi.a();
        aah a = aah.a(getContext(), attributeSet, a, i, 0);
        if (a.e(0)) {
            setDropDownBackgroundDrawable(a.a(0));
        }
        a.a.recycle();
        this.c = new vd(this, this.b);
        this.c.a(attributeSet, i);
        this.d = wg.a((TextView) this);
        this.d.a(attributeSet, i);
        this.d.a();
    }

    public void setDropDownBackgroundResource(int i) {
        if (this.b != null) {
            setDropDownBackgroundDrawable(this.b.a(getContext(), i, false));
        } else {
            super.setDropDownBackgroundResource(i);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.c != null) {
            this.c.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.c != null) {
            this.c.b(null);
        }
    }

    public final void a(ColorStateList colorStateList) {
        if (this.c != null) {
            this.c.a(colorStateList);
        }
    }

    public final ColorStateList c() {
        return this.c != null ? this.c.a() : null;
    }

    public final void a(Mode mode) {
        if (this.c != null) {
            this.c.a(mode);
        }
    }

    public final Mode d() {
        return this.c != null ? this.c.b() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.c != null) {
            this.c.c();
        }
        if (this.d != null) {
            this.d.a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.d != null) {
            this.d.a(context, i);
        }
    }
}
