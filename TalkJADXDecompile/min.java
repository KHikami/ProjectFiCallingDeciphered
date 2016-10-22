import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class min extends mil implements List<V> {
    final /* synthetic */ mic g;

    min(mic mic, K k, List<V> list, mil mil) {
        this.g = mic;
        super(mic, k, list, mil);
    }

    List<V> g() {
        return (List) e();
    }

    public boolean addAll(int i, Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = g().addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = e().size();
        this.g.b = (size2 - size) + this.g.b;
        if (size != 0) {
            return addAll;
        }
        d();
        return addAll;
    }

    public V get(int i) {
        a();
        return g().get(i);
    }

    public V set(int i, V v) {
        a();
        return g().set(i, v);
    }

    public void add(int i, V v) {
        a();
        boolean isEmpty = e().isEmpty();
        g().add(i, v);
        this.f.b = this.g.b + 1;
        if (isEmpty) {
            d();
        }
    }

    public V remove(int i) {
        a();
        V remove = g().remove(i);
        this.g.f.b = this.g.b - 1;
        b();
        return remove;
    }

    public int indexOf(Object obj) {
        a();
        return g().indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        a();
        return g().lastIndexOf(obj);
    }

    public ListIterator<V> listIterator() {
        a();
        return new mio(this);
    }

    public ListIterator<V> listIterator(int i) {
        a();
        return new mio(this, i);
    }

    public List<V> subList(int i, int i2) {
        mil f;
        a();
        mic mic = this.g;
        Object c = c();
        List subList = g().subList(i, i2);
        if (f() != null) {
            f = f();
        }
        return mic.a(c, subList, f);
    }
}
