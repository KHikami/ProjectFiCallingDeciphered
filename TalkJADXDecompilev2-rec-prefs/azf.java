package p000;

import java.util.ArrayList;
import java.util.List;

public final class azf {
    final List<azg<?>> f2584a = new ArrayList();

    public synchronized <Z> void m4413a(Class<Z> cls, aob<Z> aob_Z) {
        this.f2584a.add(new azg(cls, aob_Z));
    }

    public synchronized <Z> aob<Z> m4412a(Class<Z> cls) {
        aob<Z> aob_Z;
        int size = this.f2584a.size();
        for (int i = 0; i < size; i++) {
            azg azg = (azg) this.f2584a.get(i);
            if (azg.f2585a.isAssignableFrom(cls)) {
                aob_Z = azg.f2586b;
                break;
            }
        }
        aob_Z = null;
        return aob_Z;
    }
}
