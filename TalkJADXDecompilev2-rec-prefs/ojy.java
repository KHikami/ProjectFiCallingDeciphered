package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class ojy {
    public static final ojy f33112a = new ojy(new ojv(), ojw.f33111a);
    private final ConcurrentMap<String, ojx> f33113b = new ConcurrentHashMap();

    private ojy(ojx... ojxArr) {
        for (ojx ojx : ojxArr) {
            this.f33113b.put(ojx.mo4156a(), ojx);
        }
    }

    public ojx m38616a(String str) {
        return (ojx) this.f33113b.get(str);
    }
}
