package defpackage;

import java.util.AbstractMap;
import java.util.Map.Entry;
import java.util.Set;

public class kex<K, V> extends AbstractMap<K, V> implements Cloneable {
    int a;
    Object[] b;

    public /* synthetic */ Object clone() {
        return a();
    }

    public final int size() {
        return this.a;
    }

    public final V a(int i) {
        if (i < 0 || i >= this.a) {
            return null;
        }
        return c((i << 1) + 1);
    }

    public final V a(int i, V v) {
        int i2 = this.a;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        i2 = (i << 1) + 1;
        V c = c(i2);
        this.b[i2] = v;
        return c;
    }

    public final boolean containsKey(Object obj) {
        return -2 != a(obj);
    }

    public final V get(Object obj) {
        return c(a(obj) + 1);
    }

    public final V remove(Object obj) {
        return b(a(obj));
    }

    private void a(int i, K k, V v) {
        Object[] objArr = this.b;
        objArr[i] = k;
        objArr[i + 1] = v;
    }

    private V c(int i) {
        if (i < 0) {
            return null;
        }
        return this.b[i];
    }

    private int a(Object obj) {
        int i = this.a << 1;
        Object[] objArr = this.b;
        for (int i2 = 0; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return i2;
                }
            } else if (obj.equals(obj2)) {
                return i2;
            }
        }
        return -2;
    }

    V b(int i) {
        int i2 = this.a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V c = c(i + 1);
        Object obj = this.b;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(obj, i + 2, obj, i, i3);
        }
        this.a--;
        a(i2 - 2, null, null);
        return c;
    }

    public void clear() {
        this.a = 0;
        this.b = null;
    }

    public final boolean containsValue(Object obj) {
        int i = this.a << 1;
        Object[] objArr = this.b;
        for (int i2 = 1; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else if (obj.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final Set<Entry<K, V>> entrySet() {
        return new kfa(this);
    }

    public kex<K, V> a() {
        try {
            kex<K, V> kex_K__V = (kex) super.clone();
            Object obj = this.b;
            if (obj == null) {
                return kex_K__V;
            }
            int length = obj.length;
            Object obj2 = new Object[length];
            kex_K__V.b = obj2;
            System.arraycopy(obj, 0, obj2, 0, length);
            return kex_K__V;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public final V put(K k, V v) {
        int i;
        int a = a((Object) k) >> 1;
        if (a == -1) {
            i = this.a;
        } else {
            i = a;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = i + 1;
        if (i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] objArr = this.b;
        a = i2 << 1;
        int length = objArr == null ? 0 : objArr.length;
        if (a > length) {
            length = ((length / 2) * 3) + 1;
            if (length % 2 != 0) {
                length++;
            }
            if (length >= a) {
                a = length;
            }
            if (a == 0) {
                this.b = null;
            } else {
                length = this.a;
                Object obj = this.b;
                if (length == 0 || a != obj.length) {
                    Object obj2 = new Object[a];
                    this.b = obj2;
                    if (length != 0) {
                        System.arraycopy(obj, 0, obj2, 0, length << 1);
                    }
                }
            }
        }
        a = i << 1;
        V c = c(a + 1);
        a(a, k, v);
        if (i2 > this.a) {
            this.a = i2;
        }
        return c;
    }
}
