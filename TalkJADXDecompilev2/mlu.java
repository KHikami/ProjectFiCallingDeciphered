package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

final class mlu extends mny<Entry<K, V>> {
    final /* synthetic */ Iterator a;

    mlu(Iterator it) {
        this.a = it;
    }

    public /* synthetic */ Object next() {
        return a();
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }

    private Entry<K, V> a() {
        return mls.a((Entry) this.a.next());
    }
}
