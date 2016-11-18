package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class axp extends ConstantState {
    final ard a;
    final axs b;

    public axp(ard ard, axs axs) {
        this.a = ard;
        this.b = axs;
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
