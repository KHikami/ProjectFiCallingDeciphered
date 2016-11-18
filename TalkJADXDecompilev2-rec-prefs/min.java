package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class min extends mil implements List<V> {
    final /* synthetic */ mic f27789g;

    min(mic mic, K k, List<V> list, mil mil) {
        this.f27789g = mic;
        super(mic, k, list, mil);
    }

    List<V> m32206g() {
        return (List) m32204e();
    }

    public boolean addAll(int i, Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = m32206g().addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = m32204e().size();
        this.f27789g.f27769b = (size2 - size) + this.f27789g.f27769b;
        if (size != 0) {
            return addAll;
        }
        m32203d();
        return addAll;
    }

    public V get(int i) {
        m32200a();
        return m32206g().get(i);
    }

    public V set(int i, V v) {
        m32200a();
        return m32206g().set(i, v);
    }

    public void add(int i, V v) {
        m32200a();
        boolean isEmpty = m32204e().isEmpty();
        m32206g().add(i, v);
        this.f27789g.f27769b = this.f27789g.f27769b + 1;
        if (isEmpty) {
            m32203d();
        }
    }

    public V remove(int i) {
        m32200a();
        V remove = m32206g().remove(i);
        this.f27789g.f27769b = this.f27789g.f27769b - 1;
        m32201b();
        return remove;
    }

    public int indexOf(Object obj) {
        m32200a();
        return m32206g().indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        m32200a();
        return m32206g().lastIndexOf(obj);
    }

    public ListIterator<V> listIterator() {
        m32200a();
        return new mio(this);
    }

    public ListIterator<V> listIterator(int i) {
        m32200a();
        return new mio(this, i);
    }

    public List<V> subList(int i, int i2) {
        mil f;
        m32200a();
        mic mic = this.f27789g;
        Object c = m32202c();
        List subList = m32206g().subList(i, i2);
        if (m32205f() != null) {
            f = m32205f();
        }
        return mic.m32171a(c, subList, f);
    }
}
