package p000;

import android.content.Context;

public final class drj {
    public static final String f10394a = drc.class.getName();
    public static final String f10395b = bhq.class.getName();
    private static dri f10396c;

    public static void m12550a(Context context, jyn jyn) {
        if (f10396c == null) {
            f10396c = new dri();
        }
        jyn.m25444a(drc.class, new drm(context));
    }

    public static void m12551b(Context context, jyn jyn) {
        if (f10396c == null) {
            f10396c = new dri();
        }
        jyn.m25445a(bhq.class, new bhq(drd.class), new bhq(drv.class), new bhq(drw.class));
    }
}
