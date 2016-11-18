package defpackage;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

abstract class ich<K, V> {
    icj b;

    protected abstract int a();

    protected abstract int a(Object obj);

    protected abstract Object a(int i);

    protected abstract Map<K, V> b();

    protected abstract void b(int i);

    protected abstract void c();

    ich() {
    }

    public Object[] c(int i) {
        int a = a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = a(i2);
        }
        return objArr;
    }

    public <T> T[] a(T[] tArr, int i) {
        T[] tArr2;
        int a = a();
        if (tArr.length < a) {
            tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        } else {
            tArr2 = tArr;
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr2[i2] = a(i2);
        }
        if (tArr2.length > a) {
            tArr2[a] = null;
        }
        return tArr2;
    }

    public static <T> boolean a(Set<T> set, Object obj) {
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

    public Set<K> d() {
        if (this.b == null) {
            this.b = new icj(this);
        }
        return this.b;
    }
}
