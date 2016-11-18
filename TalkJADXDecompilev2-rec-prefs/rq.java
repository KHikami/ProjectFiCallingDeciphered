package p000;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;

public final class rq {
    public static final rs f35080a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            f35080a = new rr();
        } else if (i >= 21) {
            f35080a = new rt();
        } else {
            f35080a = new rs();
        }
    }

    public static Drawable m40565a(CompoundButton compoundButton) {
        return f35080a.mo4348a(compoundButton);
    }
}
