package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* renamed from: jsa */
public final class jsa {
    public static final String a;
    private static jrz b;

    static {
        a = CronetEngine.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new jrz();
        }
        jyn.a(CronetEngine.class, ((jsb) gwb.a((Object) context, jsb.class)).a());
    }
}
