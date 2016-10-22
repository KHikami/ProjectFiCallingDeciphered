package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;

/* compiled from: PG */
/* renamed from: nv */
public final class nv {
    public static final nx a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            a = new nw();
        } else if (i >= 21) {
            a = new ny();
        } else {
            a = new nx();
        }
    }

    public static Drawable a(CompoundButton compoundButton) {
        return a.a(compoundButton);
    }
}
