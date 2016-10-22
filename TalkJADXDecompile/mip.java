import java.util.Collection;
import java.util.Set;

final class mip extends mil implements Set<V> {
    final /* synthetic */ mic a;

    mip(mic mic, K k, Set<V> set) {
        this.a = mic;
        super(mic, k, set, null);
    }

    public boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean a = ba.a((Set) this.c, (Collection) collection);
        if (!a) {
            return a;
        }
        int size2 = this.c.size();
        this.a.b = (size2 - size) + this.a.b;
        b();
        return a;
    }
}
