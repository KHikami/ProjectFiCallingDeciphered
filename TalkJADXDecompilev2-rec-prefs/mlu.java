package p000;

import java.util.Iterator;
import java.util.Map.Entry;

final class mlu extends mny<Entry<K, V>> {
    final /* synthetic */ Iterator f27896a;

    mlu(Iterator it) {
        this.f27896a = it;
    }

    public /* synthetic */ Object next() {
        return m32493a();
    }

    public boolean hasNext() {
        return this.f27896a.hasNext();
    }

    private Entry<K, V> m32493a() {
        return mls.m32481a((Entry) this.f27896a.next());
    }
}
