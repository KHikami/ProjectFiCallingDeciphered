package defpackage;

import java.net.URLDecoder;

/* renamed from: kgr */
public final class kgr {
    public static final kgs a;
    public static final kgs b;
    public static final kgs c;
    public static final kgs d;
    public static final kgs e;

    static {
        a = new kgt("-_.*", true);
        b = new kgt("-_.!~*'()@:$&,;=", false);
        c = new kgt("-_.!~*'()@:$&,;=+/?", false);
        d = new kgt("-_.!~*'():$&,;=", false);
        e = new kgt("-_.!~*'()@:$,;/?:", false);
    }

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
