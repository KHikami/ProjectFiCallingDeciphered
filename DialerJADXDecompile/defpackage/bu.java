package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* renamed from: bu */
final class bu extends ConstantState {
    private final ConstantState a;

    public bu(ConstantState constantState) {
        this.a = constantState;
    }

    public final Drawable newDrawable() {
        Drawable bnVar = new bn();
        bnVar.b = (VectorDrawable) this.a.newDrawable();
        return bnVar;
    }

    public final Drawable newDrawable(Resources resources) {
        Drawable bnVar = new bn();
        bnVar.b = (VectorDrawable) this.a.newDrawable(resources);
        return bnVar;
    }

    public final Drawable newDrawable(Resources resources, Theme theme) {
        Drawable bnVar = new bn();
        bnVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
        return bnVar;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
}
