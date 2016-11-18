package p000;

import java.util.ArrayList;
import java.util.List;

public final class azd {
    private final List<aze<?, ?>> f2580a = new ArrayList();

    public synchronized <T, R> List<aoa<T, R>> m4407a(Class<T> cls, Class<R> cls2) {
        List<aoa<T, R>> arrayList;
        arrayList = new ArrayList();
        for (aze aze : this.f2580a) {
            if (aze.m4411a(cls, cls2)) {
                arrayList.add(aze.f2582b);
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> m4409b(Class<T> cls, Class<R> cls2) {
        List<Class<R>> arrayList;
        arrayList = new ArrayList();
        for (aze aze : this.f2580a) {
            if (aze.m4411a(cls, cls2)) {
                arrayList.add(aze.f2581a);
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void m4408a(aoa<T, R> aoa_T__R, Class<T> cls, Class<R> cls2) {
        this.f2580a.add(new aze(cls, cls2, aoa_T__R));
    }

    public synchronized <T, R> void m4410b(aoa<T, R> aoa_T__R, Class<T> cls, Class<R> cls2) {
        this.f2580a.add(0, new aze(cls, cls2, aoa_T__R));
    }
}
