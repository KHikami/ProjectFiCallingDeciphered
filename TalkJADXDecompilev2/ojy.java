package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class ojy {
    public static final ojy a = new ojy(new ojv(), ojw.a);
    private final ConcurrentMap<String, ojx> b = new ConcurrentHashMap();

    private ojy(ojx... ojxArr) {
        for (ojx ojx : ojxArr) {
            this.b.put(ojx.a(), ojx);
        }
    }

    public ojx a(String str) {
        return (ojx) this.b.get(str);
    }
}
