package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: wi */
public class wi extends TextView implements ki {
    private vi a;
    private vd b;
    private wg c;

    public wi(Context context) {
        this(context, null);
    }

    public wi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public wi(Context context, AttributeSet attributeSet, int i) {
        super(aae.a(context), attributeSet, i);
        this.a = vi.a();
        this.b = new vd(this, this.a);
        this.b.a(attributeSet, i);
        this.c = wg.a((TextView) this);
        this.c.a(attributeSet, i);
        this.c.a();
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
            this.b.b(null);
        }
    }

    public final void a(ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    public final ColorStateList c() {
        return this.b != null ? this.b.a() : null;
    }

    public final void a(Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }

    public final Mode d() {
        return this.b != null ? this.b.b() : null;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.c();
        }
        if (this.c != null) {
            this.c.a();
        }
    }
}
