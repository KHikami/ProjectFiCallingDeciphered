import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

final class mik extends mig implements SortedSet<K> {
    final /* synthetic */ mic b;

    mik(mic mic, SortedMap<K, Collection<V>> sortedMap) {
        this.b = mic;
        super(mic, sortedMap);
    }

    private SortedMap<K, Collection<V>> b() {
        return (SortedMap) super.a();
    }

    public Comparator<? super K> comparator() {
        return b().comparator();
    }

    public K first() {
        return b().firstKey();
    }

    public SortedSet<K> headSet(K k) {
        return new mik(this.b, b().headMap(k));
    }

    public K last() {
        return b().lastKey();
    }

    public SortedSet<K> subSet(K k, K k2) {
        return new mik(this.b, b().subMap(k, k2));
    }

    public SortedSet<K> tailSet(K k) {
        return new mik(this.b, b().tailMap(k));
    }
}
