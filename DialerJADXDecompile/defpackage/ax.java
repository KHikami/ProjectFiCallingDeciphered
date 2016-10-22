package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: ax */
public final class ax {
    private static final ay a;

    static {
        if (VERSION.SDK_INT >= 11) {
            a = new ba();
        } else {
            a = new az();
        }
    }

    public static void a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        a.a(viewGroup, view, rect);
    }
}
