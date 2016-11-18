package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

final class mih implements Iterator<K> {
    Entry<K, Collection<V>> f27781a;
    final /* synthetic */ Iterator f27782b;
    final /* synthetic */ mig f27783c;

    mih(mig mig, Iterator it) {
        this.f27783c = mig;
        this.f27782b = it;
    }

    public boolean hasNext() {
        return this.f27782b.hasNext();
    }

    public K next() {
        this.f27781a = (Entry) this.f27782b.next();
        return this.f27781a.getKey();
    }

    public void remove() {
        gwb.m2106c(this.f27781a != null);
        Collection collection = (Collection) this.f27781a.getValue();
        this.f27782b.remove();
        this.f27783c.f27780a.f27769b -= collection.size();
        collection.clear();
    }
}
