package p000;

import java.util.ArrayList;
import java.util.List;

public final class ayz {
    private final List<aza<?>> f2572a = new ArrayList();

    public synchronized <T> ant<T> m4390a(Class<T> cls) {
        ant<T> ant_T;
        for (aza aza : this.f2572a) {
            if (aza.m4400a(cls)) {
                ant_T = aza.f2574a;
                break;
            }
        }
        ant_T = null;
        return ant_T;
    }

    public synchronized <T> void m4391a(Class<T> cls, ant<T> ant_T) {
        this.f2572a.add(new aza(cls, ant_T));
    }
}
