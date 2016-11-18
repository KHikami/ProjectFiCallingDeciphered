package p000;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

final class ch extends ConstantState {
    private final ConstantState f5305a;

    public ch(ConstantState constantState) {
        this.f5305a = constantState;
    }

    public Drawable newDrawable() {
        Drawable caVar = new ca();
        caVar.b = (VectorDrawable) this.f5305a.newDrawable();
        return caVar;
    }

    public Drawable newDrawable(Resources resources) {
        Drawable caVar = new ca();
        caVar.b = (VectorDrawable) this.f5305a.newDrawable(resources);
        return caVar;
    }

    public Drawable newDrawable(Resources resources, Theme theme) {
        Drawable caVar = new ca();
        caVar.b = (VectorDrawable) this.f5305a.newDrawable(resources, theme);
        return caVar;
    }

    public boolean canApplyTheme() {
        return this.f5305a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.f5305a.getChangingConfigurations();
    }
}
