package p000;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

final class ayg implements ayn {
    private final Set<ayo> f2538a = Collections.newSetFromMap(new WeakHashMap());
    private boolean f2539b;
    private boolean f2540c;

    ayg() {
    }

    public void mo409a(ayo ayo) {
        this.f2538a.add(ayo);
        if (this.f2540c) {
            ayo.mo261f();
        } else if (this.f2539b) {
            ayo.mo260d();
        } else {
            ayo.h_();
        }
    }

    public void mo410b(ayo ayo) {
        this.f2538a.remove(ayo);
    }

    void m4337a() {
        this.f2539b = true;
        for (ayo d : baq.m4683a(this.f2538a)) {
            d.mo260d();
        }
    }

    void m4339b() {
        this.f2539b = false;
        for (ayo h_ : baq.m4683a(this.f2538a)) {
            h_.h_();
        }
    }

    void m4341c() {
        this.f2540c = true;
        for (ayo f : baq.m4683a(this.f2538a)) {
            f.mo261f();
        }
    }
}
