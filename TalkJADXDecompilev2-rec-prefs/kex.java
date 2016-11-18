package p000;

import java.util.AbstractMap;
import java.util.Map.Entry;
import java.util.Set;

public class kex<K, V> extends AbstractMap<K, V> implements Cloneable {
    int f21541a;
    Object[] f21542b;

    public /* synthetic */ Object clone() {
        return m25699a();
    }

    public final int size() {
        return this.f21541a;
    }

    public final V m25697a(int i) {
        if (i < 0 || i >= this.f21541a) {
            return null;
        }
        return m25696c((i << 1) + 1);
    }

    public final V m25698a(int i, V v) {
        int i2 = this.f21541a;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        i2 = (i << 1) + 1;
        V c = m25696c(i2);
        this.f21542b[i2] = v;
        return c;
    }

    public final boolean containsKey(Object obj) {
        return -2 != m25694a(obj);
    }

    public final V get(Object obj) {
        return m25696c(m25694a(obj) + 1);
    }

    public final V remove(Object obj) {
        return m25700b(m25694a(obj));
    }

    private void m25695a(int i, K k, V v) {
        Object[] objArr = this.f21542b;
        objArr[i] = k;
        objArr[i + 1] = v;
    }

    private V m25696c(int i) {
        if (i < 0) {
            return null;
        }
        return this.f21542b[i];
    }

    private int m25694a(Object obj) {
        int i = this.f21541a << 1;
        Object[] objArr = this.f21542b;
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

    V m25700b(int i) {
        int i2 = this.f21541a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V c = m25696c(i + 1);
        Object obj = this.f21542b;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(obj, i + 2, obj, i, i3);
        }
        this.f21541a--;
        m25695a(i2 - 2, null, null);
        return c;
    }

    public void clear() {
        this.f21541a = 0;
        this.f21542b = null;
    }

    public final boolean containsValue(Object obj) {
        int i = this.f21541a << 1;
        Object[] objArr = this.f21542b;
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

    public kex<K, V> m25699a() {
        try {
            kex<K, V> kex_K__V = (kex) super.clone();
            Object obj = this.f21542b;
            if (obj == null) {
                return kex_K__V;
            }
            int length = obj.length;
            Object obj2 = new Object[length];
            kex_K__V.f21542b = obj2;
            System.arraycopy(obj, 0, obj2, 0, length);
            return kex_K__V;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public final V put(K k, V v) {
        int i;
        int a = m25694a((Object) k) >> 1;
        if (a == -1) {
            i = this.f21541a;
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
        Object[] objArr = this.f21542b;
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
                this.f21542b = null;
            } else {
                length = this.f21541a;
                Object obj = this.f21542b;
                if (length == 0 || a != obj.length) {
                    Object obj2 = new Object[a];
                    this.f21542b = obj2;
                    if (length != 0) {
                        System.arraycopy(obj, 0, obj2, 0, length << 1);
                    }
                }
            }
        }
        a = i << 1;
        V c = m25696c(a + 1);
        m25695a(a, k, v);
        if (i2 > this.f21541a) {
            this.f21541a = i2;
        }
        return c;
    }
}
