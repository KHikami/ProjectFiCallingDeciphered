import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class ayw implements ayo {
    private final Set<azx<?>> a;

    public ayw() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    public void a(azx<?> azx_) {
        this.a.add(azx_);
    }

    public void b(azx<?> azx_) {
        this.a.remove(azx_);
    }

    public void d() {
        for (azx d : baq.a(this.a)) {
            d.d();
        }
    }

    public void h_() {
        for (azx h_ : baq.a(this.a)) {
            h_.h_();
        }
    }

    public void f() {
        for (azx f : baq.a(this.a)) {
            f.f();
        }
    }

    public List<azx<?>> a() {
        return new ArrayList(this.a);
    }

    public void b() {
        this.a.clear();
    }
}
