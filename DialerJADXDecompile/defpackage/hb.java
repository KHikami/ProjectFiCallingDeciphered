package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* compiled from: PG */
/* renamed from: hb */
public abstract class hb extends ConstantState {
    int a;
    ConstantState b;
    ColorStateList c;
    Mode d;

    public abstract Drawable newDrawable(Resources resources);

    hb(hb hbVar) {
        this.c = null;
        this.d = ha.a;
        if (hbVar != null) {
            this.a = hbVar.a;
            this.b = hbVar.b;
            this.c = hbVar.c;
            this.d = hbVar.d;
        }
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public int getChangingConfigurations() {
        return (this.b != null ? this.b.getChangingConfigurations() : 0) | this.a;
    }
}
