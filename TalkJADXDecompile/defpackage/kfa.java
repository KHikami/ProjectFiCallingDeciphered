package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: kfa */
final class kfa extends AbstractSet<Entry<K, V>> {
    final /* synthetic */ kex a;

    kfa(kex kex) {
        this.a = kex;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new kez(this.a);
    }

    public int size() {
        return this.a.a;
    }
}
