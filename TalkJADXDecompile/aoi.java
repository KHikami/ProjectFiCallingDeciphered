import java.util.HashMap;
import java.util.Map;

public final class aoi {
    private static final aoh<?> b;
    private final Map<Class<?>, aoh<?>> a;

    public aoi() {
        this.a = new HashMap();
    }

    static {
        b = new aoj();
    }

    public synchronized void a(aoh<?> aoh_) {
        this.a.put(aoh_.a(), aoh_);
    }

    public synchronized <T> aog<T> a(T t) {
        aoh aoh;
        gwb.I((Object) t);
        aoh = (aoh) this.a.get(t.getClass());
        if (aoh == null) {
            for (aoh aoh2 : this.a.values()) {
                if (aoh2.a().isAssignableFrom(t.getClass())) {
                    aoh = aoh2;
                    break;
                }
            }
        }
        if (aoh == null) {
            aoh = b;
        }
        return aoh.a(t);
    }
}
