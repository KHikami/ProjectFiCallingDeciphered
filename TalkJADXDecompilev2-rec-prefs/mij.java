package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

final class mij extends mid implements SortedMap<K, Collection<V>> {
    SortedSet<K> f27791c;
    final /* synthetic */ mic f27792d;

    /* synthetic */ Set mo3797b() {
        return m32209f();
    }

    public /* synthetic */ Set keySet() {
        return m32208e();
    }

    mij(mic mic, SortedMap<K, Collection<V>> sortedMap) {
        this.f27792d = mic;
        super(mic, sortedMap);
    }

    private SortedMap<K, Collection<V>> m32207d() {
        return (SortedMap) this.a;
    }

    public Comparator<? super K> comparator() {
        return m32207d().comparator();
    }

    public K firstKey() {
        return m32207d().firstKey();
    }

    public K lastKey() {
        return m32207d().lastKey();
    }

    public SortedMap<K, Collection<V>> headMap(K k) {
        return new mij(this.f27792d, m32207d().headMap(k));
    }

    public SortedMap<K, Collection<V>> subMap(K k, K k2) {
        return new mij(this.f27792d, m32207d().subMap(k, k2));
    }

    public SortedMap<K, Collection<V>> tailMap(K k) {
        return new mij(this.f27792d, m32207d().tailMap(k));
    }

    private SortedSet<K> m32208e() {
        SortedSet<K> sortedSet = this.f27791c;
        if (sortedSet != null) {
            return sortedSet;
        }
        sortedSet = m32209f();
        this.f27791c = sortedSet;
        return sortedSet;
    }

    private SortedSet<K> m32209f() {
        return new mik(this.f27792d, m32207d());
    }
}
