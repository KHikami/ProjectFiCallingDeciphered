package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class nwd {
    static final nwd f31166a = new nwd((byte) 0);
    private static volatile boolean f31167b = false;
    private static final Class<?> f31168c = nwd.m36920b();
    private final Map<nwe, nwb> f31169d;

    private static Class<?> m36920b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static nwd m36919a() {
        return nwc.m36917a();
    }

    public <ContainingType extends nxi> nwb m36921a(ContainingType containingType, int i) {
        return (nwb) this.f31169d.get(new nwe(containingType, i));
    }

    nwd() {
        this.f31169d = new HashMap();
    }

    private nwd(byte b) {
        this.f31169d = Collections.emptyMap();
    }
}
