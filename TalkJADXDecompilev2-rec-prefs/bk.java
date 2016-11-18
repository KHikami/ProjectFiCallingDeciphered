package p000;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

public final class bk {
    private static final bl f3604a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f3604a = new bn();
        } else {
            f3604a = new bm();
        }
    }

    public static void m5572a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        f3604a.mo612a(viewGroup, view, rect);
    }
}
