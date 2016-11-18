package defpackage;

import java.net.URLDecoder;

public final class kgr {
    public static final kgs a = new kgt("-_.*", true);
    public static final kgs b = new kgt("-_.!~*'()@:$&,;=", false);
    public static final kgs c = new kgt("-_.!~*'()@:$&,;=+/?", false);
    public static final kgs d = new kgt("-_.!~*'():$&,;=", false);
    public static final kgs e = new kgt("-_.!~*'()@:$,;/?:", false);

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
