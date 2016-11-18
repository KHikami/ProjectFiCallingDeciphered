package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class jo extends jm {
    public jo(Drawable drawable) {
        super(drawable);
    }

    jo(jk jkVar, Resources resources) {
        super(jkVar, resources);
    }

    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }

    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    jk b() {
        return new jp(this.b, null);
    }
}
