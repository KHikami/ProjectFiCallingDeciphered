package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class ice<E> implements Collection<E>, Set<E> {
    static Object[] a;
    static int b;
    static Object[] c;
    static int d;
    int[] e = icg.b;
    Object[] f = icg.d;
    int g = 0;
    ich<E, E> h;

    int a(Object obj, int i) {
        int i2 = this.g;
        if (i2 == 0) {
            return -1;
        }
        int a = icg.a(this.e, i2, i);
        if (a < 0 || obj.equals(this.f[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.e[i3] == i) {
            if (obj.equals(this.f[i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.e[a] == i) {
            if (obj.equals(this.f[a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    int a() {
        int i = this.g;
        if (i == 0) {
            return -1;
        }
        int a = icg.a(this.e, i, 0);
        if (a < 0 || this.f[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.e[i2] == 0) {
            if (this.f[i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.e[a] == 0) {
            if (this.f[a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    private void b(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (ice.class) {
                if (c != null) {
                    objArr = c;
                    this.f = objArr;
                    c = (Object[]) objArr[0];
                    this.e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    d--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ice.class) {
                if (a != null) {
                    objArr = a;
                    this.f = objArr;
                    a = (Object[]) objArr[0];
                    this.e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    b--;
                    return;
                }
            }
        }
        this.e = new int[i];
        this.f = new Object[i];
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (ice.class) {
                if (d < 10) {
                    objArr[0] = c;
                    objArr[1] = iArr;
                    for (i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    c = objArr;
                    d++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (ice.class) {
                if (b < 10) {
                    objArr[0] = a;
                    objArr[1] = iArr;
                    for (i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    a = objArr;
                    b++;
                }
            }
        }
    }

    public void clear() {
        if (this.g != 0) {
            ice.a(this.e, this.f, this.g);
            this.e = icg.b;
            this.f = icg.d;
            this.g = 0;
        }
    }

    private void c(int i) {
        if (this.e.length < i) {
            Object obj = this.e;
            Object obj2 = this.f;
            b(i);
            if (this.g > 0) {
                System.arraycopy(obj, 0, this.e, 0, this.g);
                System.arraycopy(obj2, 0, this.f, 0, this.g);
            }
            ice.a(obj, obj2, this.g);
        }
    }

    public boolean contains(Object obj) {
        return obj == null ? a() >= 0 : a(obj, obj.hashCode()) >= 0;
    }

    private E d(int i) {
        return this.f[i];
    }

    public boolean isEmpty() {
        return this.g <= 0;
    }

    public boolean add(E e) {
        int a;
        int i;
        int i2 = 8;
        if (e == null) {
            a = a();
            i = 0;
        } else {
            i = e.hashCode();
            a = a(e, i);
        }
        if (a >= 0) {
            return false;
        }
        a ^= -1;
        if (this.g >= this.e.length) {
            if (this.g >= 8) {
                i2 = this.g + (this.g >> 1);
            } else if (this.g < 4) {
                i2 = 4;
            }
            Object obj = this.e;
            Object obj2 = this.f;
            b(i2);
            if (this.e.length > 0) {
                System.arraycopy(obj, 0, this.e, 0, obj.length);
                System.arraycopy(obj2, 0, this.f, 0, obj2.length);
            }
            ice.a(obj, obj2, this.g);
        }
        if (a < this.g) {
            System.arraycopy(this.e, a, this.e, a + 1, this.g - a);
            System.arraycopy(this.f, a, this.f, a + 1, this.g - a);
        }
        this.e[a] = i;
        this.f[a] = e;
        this.g++;
        return true;
    }

    public boolean remove(Object obj) {
        int a = obj == null ? a() : a(obj, obj.hashCode());
        if (a < 0) {
            return false;
        }
        a(a);
        return true;
    }

    public E a(int i) {
        int i2 = 8;
        E e = this.f[i];
        if (this.g <= 1) {
            ice.a(this.e, this.f, this.g);
            this.e = icg.b;
            this.f = icg.d;
            this.g = 0;
        } else if (this.e.length <= 8 || this.g >= this.e.length / 3) {
            this.g--;
            if (i < this.g) {
                System.arraycopy(this.e, i + 1, this.e, i, this.g - i);
                System.arraycopy(this.f, i + 1, this.f, i, this.g - i);
            }
            this.f[this.g] = null;
        } else {
            if (this.g > 8) {
                i2 = this.g + (this.g >> 1);
            }
            Object obj = this.e;
            Object obj2 = this.f;
            b(i2);
            this.g--;
            if (i > 0) {
                System.arraycopy(obj, 0, this.e, 0, i);
                System.arraycopy(obj2, 0, this.f, 0, i);
            }
            if (i < this.g) {
                System.arraycopy(obj, i + 1, this.e, i, this.g - i);
                System.arraycopy(obj2, i + 1, this.f, i, this.g - i);
            }
        }
        return e;
    }

    public int size() {
        return this.g;
    }

    public Object[] toArray() {
        Object obj = new Object[this.g];
        System.arraycopy(this.f, 0, obj, 0, this.g);
        return obj;
    }

    public <T> T[] toArray(T[] tArr) {
        Object obj;
        if (tArr.length < this.g) {
            obj = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.g);
        } else {
            obj = tArr;
        }
        System.arraycopy(this.f, 0, obj, 0, this.g);
        if (obj.length > this.g) {
            obj[this.g] = null;
        }
        return obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        int i = 0;
        while (i < this.g) {
            try {
                if (!set.contains(d(i))) {
                    return false;
                }
                i++;
            } catch (NullPointerException e) {
                return false;
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int[] iArr = this.e;
        int i2 = 0;
        while (i < this.g) {
            i2 += iArr[i];
            i++;
        }
        return i2;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.g * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.g; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            ice d = d(i);
            if (d != this) {
                stringBuilder.append(d);
            } else {
                stringBuilder.append("(this Set)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        c(this.g + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.g - 1; i >= 0; i--) {
            if (!collection.contains(this.f[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    public Iterator<E> iterator() {
        if (this.h == null) {
            this.h = new icf(this);
        }
        return this.h.d().iterator();
    }
}
