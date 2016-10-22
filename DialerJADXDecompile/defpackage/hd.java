package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* compiled from: PG */
/* renamed from: hd */
public final class hd extends ha {
    public hd(Drawable drawable) {
        super(drawable);
    }

    hd(hb hbVar, Resources resources) {
        super(hbVar, resources);
    }

    final hb b() {
        return new he(this.b, null);
    }

    protected final Drawable a(ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }
}
