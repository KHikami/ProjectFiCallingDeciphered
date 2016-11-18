package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class axp extends ConstantState {
    final ard f2498a;
    final axs f2499b;

    public axp(ard ard, axs axs) {
        this.f2498a = ard;
        this.f2499b = axs;
    }

    public Drawable newDrawable(Resources resources) {
        return newDrawable();
    }

    public Drawable newDrawable() {
        return new axo(this);
    }

    public int getChangingConfigurations() {
        return 0;
    }
}
