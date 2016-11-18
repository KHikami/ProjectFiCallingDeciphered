package p000;

import java.util.Comparator;
import java.util.SortedSet;

final class miq extends mil implements SortedSet<V> {
    final /* synthetic */ mic f27799a;

    miq(mic mic, K k, SortedSet<V> sortedSet, mil mil) {
        this.f27799a = mic;
        super(mic, k, sortedSet, mil);
    }

    private SortedSet<V> m32214g() {
        return (SortedSet) m32204e();
    }

    public Comparator<? super V> comparator() {
        return m32214g().comparator();
    }

    public V first() {
        m32200a();
        return m32214g().first();
    }

    public V last() {
        m32200a();
        return m32214g().last();
    }

    public SortedSet<V> headSet(V v) {
        mil f;
        m32200a();
        mic mic = this.f27799a;
        Object c = m32202c();
        SortedSet headSet = m32214g().headSet(v);
        if (m32205f() != null) {
            f = m32205f();
        }
        return new miq(mic, c, headSet, f);
    }

    public SortedSet<V> subSet(V v, V v2) {
        mil f;
        m32200a();
        mic mic = this.f27799a;
        Object c = m32202c();
        SortedSet subSet = m32214g().subSet(v, v2);
        if (m32205f() != null) {
            f = m32205f();
        }
        return new miq(mic, c, subSet, f);
    }

    public SortedSet<V> tailSet(V v) {
        mil f;
        m32200a();
        mic mic = this.f27799a;
        Object c = m32202c();
        SortedSet tailSet = m32214g().tailSet(v);
        if (m32205f() != null) {
            f = m32205f();
        }
        return new miq(mic, c, tailSet, f);
    }
}
