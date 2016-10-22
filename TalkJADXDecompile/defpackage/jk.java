package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: jk */
public abstract class jk extends ConstantState {
    int a;
    ConstantState b;
    ColorStateList c;
    Mode d;

    public abstract Drawable newDrawable(Resources resources);

    jk(jk jkVar) {
        this.c = null;
        this.d = jj.a;
        if (jkVar != null) {
            this.a = jkVar.a;
            this.b = jkVar.b;
            this.c = jkVar.c;
            this.d = jkVar.d;
        }
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public int getChangingConfigurations() {
        return (this.b != null ? this.b.getChangingConfigurations() : 0) | this.a;
    }

    boolean a() {
        return this.b != null;
    }
}
