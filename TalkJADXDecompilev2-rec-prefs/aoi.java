package p000;

import java.util.HashMap;
import java.util.Map;

public final class aoi {
    private static final aoh<?> f1956b = new aoj();
    private final Map<Class<?>, aoh<?>> f1957a = new HashMap();

    public synchronized void m3555a(aoh<?> aoh_) {
        this.f1957a.put(aoh_.mo316a(), aoh_);
    }

    public synchronized <T> aog<T> m3554a(T t) {
        aoh aoh;
        gwb.m1404I((Object) t);
        aoh = (aoh) this.f1957a.get(t.getClass());
        if (aoh == null) {
            for (aoh aoh2 : this.f1957a.values()) {
                if (aoh2.mo316a().isAssignableFrom(t.getClass())) {
                    aoh = aoh2;
                    break;
                }
            }
        }
        if (aoh == null) {
            aoh = f1956b;
        }
        return aoh.mo315a(t);
    }
}
