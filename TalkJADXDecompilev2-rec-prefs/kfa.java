package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class kfa extends AbstractSet<Entry<K, V>> {
    final /* synthetic */ kex f21551a;

    kfa(kex kex) {
        this.f21551a = kex;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new kez(this.f21551a);
    }

    public int size() {
        return this.f21551a.f21541a;
    }
}
