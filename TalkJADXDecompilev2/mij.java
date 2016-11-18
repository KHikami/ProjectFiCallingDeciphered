package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

final class mij extends mid implements SortedMap<K, Collection<V>> {
    SortedSet<K> c;
    final /* synthetic */ mic d;

    /* synthetic */ Set b() {
        return f();
    }

    public /* synthetic */ Set keySet() {
        return e();
    }

    mij(mic mic, SortedMap<K, Collection<V>> sortedMap) {
        this.d = mic;
        super(mic, sortedMap);
    }

    private SortedMap<K, Collection<V>> d() {
        return (SortedMap) this.a;
    }

    public Comparator<? super K> comparator() {
        return d().comparator();
    }

    public K firstKey() {
        return d().firstKey();
    }

    public K lastKey() {
        return d().lastKey();
    }

    public SortedMap<K, Collection<V>> headMap(K k) {
        return new mij(this.d, d().headMap(k));
    }

    public SortedMap<K, Collection<V>> subMap(K k, K k2) {
        return new mij(this.d, d().subMap(k, k2));
    }

    public SortedMap<K, Collection<V>> tailMap(K k) {
        return new mij(this.d, d().tailMap(k));
    }

    private SortedSet<K> e() {
        SortedSet<K> sortedSet = this.c;
        if (sortedSet != null) {
            return sortedSet;
        }
        sortedSet = f();
        this.c = sortedSet;
        return sortedSet;
    }

    private SortedSet<K> f() {
        return new mik(this.d, d());
    }
}
