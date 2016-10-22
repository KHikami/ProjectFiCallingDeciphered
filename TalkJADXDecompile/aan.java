import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class aan extends ImageButton implements nv {
    private aac a;
    private aao b;

    public aan(Context context) {
        this(context, null);
    }

    public aan(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.T);
    }

    public aan(Context context, AttributeSet attributeSet, int i) {
        super(afm.a(context), attributeSet, i);
        this.a = new aac(this);
        this.a.a(attributeSet, i);
        this.b = new aao(this);
        this.b.a(attributeSet, i);
    }

    public void setImageResource(int i) {
        this.b.a(i);
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

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null) {
            this.a.d();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.b.a() && super.hasOverlappingRendering();
    }
}
