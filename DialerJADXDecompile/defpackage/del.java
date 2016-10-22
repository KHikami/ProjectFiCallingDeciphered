package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: del */
public final class del {
    public static final Charset a;
    public static final Object b;

    static {
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        b = new Object();
    }

    public static void a(deh deh, deh deh2) {
        if (deh.n != null) {
            deh2.n = deh.n.a();
        }
    }
}
