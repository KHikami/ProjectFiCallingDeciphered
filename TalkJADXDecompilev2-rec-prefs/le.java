package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class le<K, V> {
    lg f24137b;
    lh f24138c;
    lj f24139d;

    protected abstract int mo3681a();

    protected abstract int mo3682a(Object obj);

    protected abstract Object mo3683a(int i, int i2);

    protected abstract V mo3684a(int i, V v);

    protected abstract void mo3685a(int i);

    protected abstract void mo3686a(K k, V v);

    protected abstract int mo3687b(Object obj);

    protected abstract Map<K, V> mo3688b();

    protected abstract void mo3689c();

    le() {
    }

    public static <K, V> boolean m28159a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean m28161b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Object[] m28171b(int i) {
        int a = mo3681a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo3683a(i2, i);
        }
        return objArr;
    }

    public <T> T[] m28168a(T[] tArr, int i) {
        T[] tArr2;
        int a = mo3681a();
        if (tArr.length < a) {
            tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        } else {
            tArr2 = tArr;
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr2[i2] = mo3683a(i2, i);
        }
        if (tArr2.length > a) {
            tArr2[a] = null;
        }
        return tArr2;
    }

    public static <T> boolean m28160a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size() && set.containsAll(set2)) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    public Set<Entry<K, V>> m28173d() {
        if (this.f24137b == null) {
            this.f24137b = new lg(this);
        }
        return this.f24137b;
    }

    public Set<K> m28174e() {
        if (this.f24138c == null) {
            this.f24138c = new lh(this);
        }
        return this.f24138c;
    }

    public Collection<V> m28175f() {
        if (this.f24139d == null) {
            this.f24139d = new lj(this);
        }
        return this.f24139d;
    }
}
