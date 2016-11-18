package defpackage;

import android.content.Context;

public final class cqn {
    public static final String a = cqj.class.getName();
    public static final String b = cxd.class.getName();
    private static cqm c;

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new cqm();
        }
        jyn.a(cqj.class, c.a(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new cqm();
        }
        jyn.a(cxd.class, c.a());
    }
}
