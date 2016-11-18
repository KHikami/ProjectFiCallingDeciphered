package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;

public final class mj {
    static final mk a;

    static {
        if (VERSION.SDK_INT >= 17) {
            a = new mm();
        } else {
            a = new ml();
        }
    }

    public static void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        a.a(i, i2, i3, rect, rect2, i4);
    }

    public static int a(int i, int i2) {
        return a.a(i, i2);
    }
}
