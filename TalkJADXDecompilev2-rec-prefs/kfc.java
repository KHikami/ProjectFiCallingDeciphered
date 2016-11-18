package p000;

import java.util.ArrayList;

final class kfc {
    final Class<?> f21555a;
    final ArrayList<Object> f21556b = new ArrayList();

    kfc(Class<?> cls) {
        this.f21555a = cls;
    }

    Object m25705a() {
        return gwb.m1638a(this.f21556b, this.f21555a);
    }

    void m25706a(Class<?> cls, Object obj) {
        bc.m4814a(cls == this.f21555a);
        this.f21556b.add(obj);
    }
}
