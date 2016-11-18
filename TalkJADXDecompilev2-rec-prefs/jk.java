package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

public abstract class jk extends ConstantState {
    int f20323a;
    ConstantState f20324b;
    ColorStateList f20325c = null;
    Mode f20326d = jj.f20168a;

    public abstract Drawable newDrawable(Resources resources);

    jk(jk jkVar) {
        if (jkVar != null) {
            this.f20323a = jkVar.f20323a;
            this.f20324b = jkVar.f20324b;
            this.f20325c = jkVar.f20325c;
            this.f20326d = jkVar.f20326d;
        }
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public int getChangingConfigurations() {
        return (this.f20324b != null ? this.f20324b.getChangingConfigurations() : 0) | this.f20323a;
    }

    boolean m24525a() {
        return this.f20324b != null;
    }
}
