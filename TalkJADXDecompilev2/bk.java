package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

public final class bk {
    private static final bl a;

    static {
        if (VERSION.SDK_INT >= 11) {
            a = new bn();
        } else {
            a = new bm();
        }
    }

    public static void a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        a.a(viewGroup, view, rect);
    }
}
