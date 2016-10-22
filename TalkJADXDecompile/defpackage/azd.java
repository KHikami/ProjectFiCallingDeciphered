package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: azd */
public final class azd {
    private final List<aze<?, ?>> a;

    public azd() {
        this.a = new ArrayList();
    }

    public synchronized <T, R> List<aoa<T, R>> a(Class<T> cls, Class<R> cls2) {
        List<aoa<T, R>> arrayList;
        arrayList = new ArrayList();
        for (aze aze : this.a) {
            if (aze.a(cls, cls2)) {
                arrayList.add(aze.b);
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> b(Class<T> cls, Class<R> cls2) {
        List<Class<R>> arrayList;
        arrayList = new ArrayList();
        for (aze aze : this.a) {
            if (aze.a(cls, cls2)) {
                arrayList.add(aze.a);
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void a(aoa<T, R> aoa_T__R, Class<T> cls, Class<R> cls2) {
        this.a.add(new aze(cls, cls2, aoa_T__R));
    }

    public synchronized <T, R> void b(aoa<T, R> aoa_T__R, Class<T> cls, Class<R> cls2) {
        this.a.add(0, new aze(cls, cls2, aoa_T__R));
    }
}
