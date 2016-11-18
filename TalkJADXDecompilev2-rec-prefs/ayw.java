package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class ayw implements ayo {
    private final Set<azx<?>> f2570a = Collections.newSetFromMap(new WeakHashMap());

    public void m4382a(azx<?> azx_) {
        this.f2570a.add(azx_);
    }

    public void m4384b(azx<?> azx_) {
        this.f2570a.remove(azx_);
    }

    public void mo260d() {
        for (azx d : baq.m4683a(this.f2570a)) {
            d.mo260d();
        }
    }

    public void h_() {
        for (azx h_ : baq.m4683a(this.f2570a)) {
            h_.h_();
        }
    }

    public void mo261f() {
        for (azx f : baq.m4683a(this.f2570a)) {
            f.mo261f();
        }
    }

    public List<azx<?>> m4381a() {
        return new ArrayList(this.f2570a);
    }

    public void m4383b() {
        this.f2570a.clear();
    }
}
