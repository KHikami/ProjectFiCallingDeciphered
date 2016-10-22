import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class azc {
    private final AtomicReference<bap> a;
    private final ky<bap, List<Class<?>>> b;

    public azc() {
        this.a = new AtomicReference();
        this.b = new ky();
    }

    public List<Class<?>> a(Class<?> cls, Class<?> cls2) {
        Object bap;
        List<Class<?>> list;
        bap bap2 = (bap) this.a.getAndSet(null);
        if (bap2 == null) {
            bap = new bap(cls, cls2);
        } else {
            bap2.a(cls, cls2);
            bap bap3 = bap2;
        }
        synchronized (this.b) {
            list = (List) this.b.get(bap);
        }
        this.a.set(bap);
        return list;
    }

    public void a(Class<?> cls, Class<?> cls2, List<Class<?>> list) {
        synchronized (this.b) {
            this.b.put(new bap(cls, cls2), list);
        }
    }
}
