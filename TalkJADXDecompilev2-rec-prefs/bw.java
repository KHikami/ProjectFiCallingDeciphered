package p000;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class bw extends ConstantState {
    private final ConstantState f4617a;

    public bw(ConstantState constantState) {
        this.f4617a = constantState;
    }

    public Drawable newDrawable() {
        Drawable btVar = new bt();
        btVar.b = this.f4617a.newDrawable();
        btVar.b.setCallback(btVar.f4354a);
        return btVar;
    }

    public Drawable newDrawable(Resources resources) {
        Drawable btVar = new bt();
        btVar.b = this.f4617a.newDrawable(resources);
        btVar.b.setCallback(btVar.f4354a);
        return btVar;
    }

    public Drawable newDrawable(Resources resources, Theme theme) {
        Drawable btVar = new bt();
        btVar.b = this.f4617a.newDrawable(resources, theme);
        btVar.b.setCallback(btVar.f4354a);
        return btVar;
    }

    public boolean canApplyTheme() {
        return this.f4617a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.f4617a.getChangingConfigurations();
    }
}
