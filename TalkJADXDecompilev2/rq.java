package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;

public final class rq {
    public static final rs a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            a = new rr();
        } else if (i >= 21) {
            a = new rt();
        } else {
            a = new rs();
        }
    }

    public static Drawable a(CompoundButton compoundButton) {
        return a.a(compoundButton);
    }
}
