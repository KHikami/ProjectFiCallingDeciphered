package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

final class mik extends mig implements SortedSet<K> {
    final /* synthetic */ mic f27793b;

    mik(mic mic, SortedMap<K, Collection<V>> sortedMap) {
        this.f27793b = mic;
        super(mic, sortedMap);
    }

    private SortedMap<K, Collection<V>> m32211b() {
        return (SortedMap) super.m32199a();
    }

    public Comparator<? super K> comparator() {
        return m32211b().comparator();
    }

    public K first() {
        return m32211b().firstKey();
    }

    public SortedSet<K> headSet(K k) {
        return new mik(this.f27793b, m32211b().headMap(k));
    }

    public K last() {
        return m32211b().lastKey();
    }

    public SortedSet<K> subSet(K k, K k2) {
        return new mik(this.f27793b, m32211b().subMap(k, k2));
    }

    public SortedSet<K> tailSet(K k) {
        return new mik(this.f27793b, m32211b().tailMap(k));
    }
}
