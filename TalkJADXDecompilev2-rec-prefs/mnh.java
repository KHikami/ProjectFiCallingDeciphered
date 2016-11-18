package p000;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;

abstract class mnh<E> extends AbstractSet<E> {
    mnh() {
    }

    public boolean removeAll(Collection<?> collection) {
        return ba.m4587a((Set) this, (Collection) collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return super.retainAll((Collection) bm.m6122a((Object) collection));
    }
}
