package p000;

import android.graphics.Rect;
import android.os.Build.VERSION;

public final class mj {
    static final mk f27808a;

    static {
        if (VERSION.SDK_INT >= 17) {
            f27808a = new mm();
        } else {
            f27808a = new ml();
        }
    }

    public static void m32251a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        f27808a.mo3876a(i, i2, i3, rect, rect2, i4);
    }

    public static int m32250a(int i, int i2) {
        return f27808a.mo3875a(i, i2);
    }
}
