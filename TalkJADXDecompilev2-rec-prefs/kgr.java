package p000;

import java.net.URLDecoder;

public final class kgr {
    public static final kgs f21659a = new kgt("-_.*", true);
    public static final kgs f21660b = new kgt("-_.!~*'()@:$&,;=", false);
    public static final kgs f21661c = new kgt("-_.!~*'()@:$&,;=+/?", false);
    public static final kgs f21662d = new kgt("-_.!~*'():$&,;=", false);
    public static final kgs f21663e = new kgt("-_.!~*'()@:$,;/?:", false);

    public static String m25774a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
