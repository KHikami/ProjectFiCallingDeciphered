package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class nwd {
    static final nwd a = new nwd((byte) 0);
    private static volatile boolean b = false;
    private static final Class<?> c = nwd.b();
    private final Map<nwe, nwb> d;

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static nwd a() {
        return nwc.a();
    }

    public <ContainingType extends nxi> nwb a(ContainingType containingType, int i) {
        return (nwb) this.d.get(new nwe(containingType, i));
    }

    nwd() {
        this.d = new HashMap();
    }

    private nwd(byte b) {
        this.d = Collections.emptyMap();
    }
}
