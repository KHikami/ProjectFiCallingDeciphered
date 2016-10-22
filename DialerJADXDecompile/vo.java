import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: PG */
public final class vo extends ImageButton implements ki {
    private vd a;
    private vp b;

    public vo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, buf.Q);
    }

    private vo(Context context, AttributeSet attributeSet, int i) {
        super(aae.a(context), attributeSet, i);
        vi a = vi.a();
        this.a = new vd(this, a);
        this.a.a(attributeSet, i);
        this.b = new vp(this, a);
        this.b.a(attributeSet, i);
    }

    public final void setImageResource(int i) {
        this.b.a(i);
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.a != null) {
            this.a.a(i);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.a != null) {
            this.a.b(null);
        }
    }

    public final void a(ColorStateList colorStateList) {
        if (this.a != null) {
            this.a.a(colorStateList);
        }
    }

    public final ColorStateList c() {
        return this.a != null ? this.a.a() : null;
    }

    public final void a(Mode mode) {
        if (this.a != null) {
            this.a.a(mode);
        }
    }

    public final Mode d() {
        return this.a != null ? this.a.b() : null;
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null) {
            this.a.c();
        }
    }

    public final boolean hasOverlappingRendering() {
        return this.b.a() && super.hasOverlappingRendering();
    }
}
