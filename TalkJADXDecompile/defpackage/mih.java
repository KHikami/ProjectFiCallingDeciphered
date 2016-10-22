package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: mih */
final class mih implements Iterator<K> {
    Entry<K, Collection<V>> a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ mig c;

    mih(mig mig, Iterator it) {
        this.c = mig;
        this.b = it;
    }

    public boolean hasNext() {
        return this.b.hasNext();
    }

    public K next() {
        this.a = (Entry) this.b.next();
        return this.a.getKey();
    }

    public void remove() {
        gwb.c(this.a != null);
        Collection collection = (Collection) this.a.getValue();
        this.b.remove();
        this.c.a.b -= collection.size();
        collection.clear();
    }
}
