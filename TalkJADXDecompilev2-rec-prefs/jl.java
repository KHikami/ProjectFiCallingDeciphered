package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

final class jl extends jk {
    jl(jk jkVar, Resources resources) {
        super(jkVar);
    }

    public Drawable newDrawable(Resources resources) {
        return new jj(this, resources);
    }
}
