import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class bw extends ConstantState {
    private final ConstantState a;

    public bw(ConstantState constantState) {
        this.a = constantState;
    }

    public Drawable newDrawable() {
        Drawable btVar = new bt();
        btVar.b = this.a.newDrawable();
        btVar.b.setCallback(btVar.a);
        return btVar;
    }

    public Drawable newDrawable(Resources resources) {
        Drawable btVar = new bt();
        btVar.b = this.a.newDrawable(resources);
        btVar.b.setCallback(btVar.a);
        return btVar;
    }

    public Drawable newDrawable(Resources resources, Theme theme) {
        Drawable btVar = new bt();
        btVar.b = this.a.newDrawable(resources, theme);
        btVar.b.setCallback(btVar.a);
        return btVar;
    }

    public boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
}
