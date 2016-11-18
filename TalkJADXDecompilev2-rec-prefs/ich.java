package p000;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

abstract class ich<K, V> {
    icj f17565b;

    protected abstract int mo3134a();

    protected abstract int mo3135a(Object obj);

    protected abstract Object mo3136a(int i);

    protected abstract Map<K, V> mo3137b();

    protected abstract void mo3138b(int i);

    protected abstract void mo3139c();

    ich() {
    }

    public Object[] m21585c(int i) {
        int a = mo3134a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo3136a(i2);
        }
        return objArr;
    }

    public <T> T[] m21581a(T[] tArr, int i) {
        T[] tArr2;
        int a = mo3134a();
        if (tArr.length < a) {
            tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        } else {
            tArr2 = tArr;
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr2[i2] = mo3136a(i2);
        }
        if (tArr2.length > a) {
            tArr2[a] = null;
        }
        return tArr2;
    }

    public static <T> boolean m21577a(Set<T> set, Object obj) {
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

    public Set<K> m21586d() {
        if (this.f17565b == null) {
            this.f17565b = new icj(this);
        }
        return this.f17565b;
    }
}
