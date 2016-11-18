package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;

abstract class mnh<E> extends AbstractSet<E> {
    mnh() {
    }

    public boolean removeAll(Collection<?> collection) {
        return ba.a((Set) this, (Collection) collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return super.retainAll((Collection) bm.a((Object) collection));
    }
}
