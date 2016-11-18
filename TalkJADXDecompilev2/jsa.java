package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

public final class jsa {
    public static final String a = CronetEngine.class.getName();
    private static jrz b;

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new jrz();
        }
        jyn.a(CronetEngine.class, ((jsb) gwb.a((Object) context, jsb.class)).a());
    }
}
