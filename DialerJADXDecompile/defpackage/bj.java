package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* compiled from: PG */
/* renamed from: bj */
final class bj extends ConstantState {
    private final ConstantState a;

    public bj(ConstantState constantState) {
        this.a = constantState;
    }

    public final Drawable newDrawable() {
        Drawable bgVar = new bg();
        bgVar.b = this.a.newDrawable();
        bgVar.b.setCallback(bgVar.a);
        return bgVar;
    }

    public final Drawable newDrawable(Resources resources) {
        Drawable bgVar = new bg();
        bgVar.b = this.a.newDrawable(resources);
        bgVar.b.setCallback(bgVar.a);
        return bgVar;
    }

    public final Drawable newDrawable(Resources resources, Theme theme) {
        Drawable bgVar = new bg();
        bgVar.b = this.a.newDrawable(resources, theme);
        bgVar.b.setCallback(bgVar.a);
        return bgVar;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
}
