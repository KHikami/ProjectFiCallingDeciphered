import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

public class abh extends TextView implements nv {
    private aac a;
    private abf b;

    public abh(Context context) {
        this(context, null);
    }

    public abh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public abh(Context context, AttributeSet attributeSet, int i) {
        super(afm.a(context), attributeSet, i);
        this.a = new aac(this);
        this.a.a(attributeSet, i);
        this.b = abf.a((TextView) this);
        this.b.a(attributeSet, i);
        this.b.a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.a != null) {
            this.a.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.a != null) {
            this.a.a();
        }
    }

    public void a(ColorStateList colorStateList) {
        if (this.a != null) {
            this.a.a(colorStateList);
        }
    }

    public ColorStateList c() {
        return this.a != null ? this.a.b() : null;
    }

    public void a(Mode mode) {
        if (this.a != null) {
            this.a.a(mode);
        }
    }

    public Mode d() {
        return this.a != null ? this.a.c() : null;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.b != null) {
            this.b.a(context, i);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null) {
            this.a.d();
        }
        if (this.b != null) {
            this.b.a();
        }
    }
}
