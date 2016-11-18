package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

final class ch extends ConstantState {
    private final ConstantState a;

    public ch(ConstantState constantState) {
        this.a = constantState;
    }

    public Drawable newDrawable() {
        Drawable caVar = new ca();
        caVar.b = (VectorDrawable) this.a.newDrawable();
        return caVar;
    }

    public Drawable newDrawable(Resources resources) {
        Drawable caVar = new ca();
        caVar.b = (VectorDrawable) this.a.newDrawable(resources);
        return caVar;
    }

    public Drawable newDrawable(Resources resources, Theme theme) {
        Drawable caVar = new ca();
        caVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
        return caVar;
    }

    public boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
}
