package p000;

import java.util.Collection;
import java.util.Set;

final class mip extends mil implements Set<V> {
    final /* synthetic */ mic f27798a;

    mip(mic mic, K k, Set<V> set) {
        this.f27798a = mic;
        super(mic, k, set, null);
    }

    public boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean a = ba.m4587a((Set) this.c, (Collection) collection);
        if (!a) {
            return a;
        }
        int size2 = this.c.size();
        this.f27798a.f27769b = (size2 - size) + this.f27798a.f27769b;
        m32201b();
        return a;
    }
}
