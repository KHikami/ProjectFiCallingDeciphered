import java.util.Comparator;
import java.util.SortedSet;

final class miq extends mil implements SortedSet<V> {
    final /* synthetic */ mic a;

    miq(mic mic, K k, SortedSet<V> sortedSet, mil mil) {
        this.a = mic;
        super(mic, k, sortedSet, mil);
    }

    private SortedSet<V> g() {
        return (SortedSet) e();
    }

    public Comparator<? super V> comparator() {
        return g().comparator();
    }

    public V first() {
        a();
        return g().first();
    }

    public V last() {
        a();
        return g().last();
    }

    public SortedSet<V> headSet(V v) {
        mil f;
        a();
        mic mic = this.a;
        Object c = c();
        SortedSet headSet = g().headSet(v);
        if (f() != null) {
            f = f();
        }
        return new miq(mic, c, headSet, f);
    }

    public SortedSet<V> subSet(V v, V v2) {
        mil f;
        a();
        mic mic = this.a;
        Object c = c();
        SortedSet subSet = g().subSet(v, v2);
        if (f() != null) {
            f = f();
        }
        return new miq(mic, c, subSet, f);
    }

    public SortedSet<V> tailSet(V v) {
        mil f;
        a();
        mic mic = this.a;
        Object c = c();
        SortedSet tailSet = g().tailSet(v);
        if (f() != null) {
            f = f();
        }
        return new miq(mic, c, tailSet, f);
    }
}
