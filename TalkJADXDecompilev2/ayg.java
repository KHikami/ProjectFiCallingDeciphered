package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

final class ayg implements ayn {
    private final Set<ayo> a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    ayg() {
    }

    public void a(ayo ayo) {
        this.a.add(ayo);
        if (this.c) {
            ayo.f();
        } else if (this.b) {
            ayo.d();
        } else {
            ayo.h_();
        }
    }

    public void b(ayo ayo) {
        this.a.remove(ayo);
    }

    void a() {
        this.b = true;
        for (ayo d : baq.a(this.a)) {
            d.d();
        }
    }

    void b() {
        this.b = false;
        for (ayo h_ : baq.a(this.a)) {
            h_.h_();
        }
    }

    void c() {
        this.c = true;
        for (ayo f : baq.a(this.a)) {
            f.f();
        }
    }
}
