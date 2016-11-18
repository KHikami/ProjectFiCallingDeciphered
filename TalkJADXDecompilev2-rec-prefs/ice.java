package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class ice<E> implements Collection<E>, Set<E> {
    static Object[] f17557a;
    static int f17558b;
    static Object[] f17559c;
    static int f17560d;
    int[] f17561e = icg.f17568b;
    Object[] f17562f = icg.f17570d;
    int f17563g = 0;
    ich<E, E> f17564h;

    int m21575a(Object obj, int i) {
        int i2 = this.f17563g;
        if (i2 == 0) {
            return -1;
        }
        int a = icg.m21593a(this.f17561e, i2, i);
        if (a < 0 || obj.equals(this.f17562f[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f17561e[i3] == i) {
            if (obj.equals(this.f17562f[i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f17561e[a] == i) {
            if (obj.equals(this.f17562f[a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    int m21574a() {
        int i = this.f17563g;
        if (i == 0) {
            return -1;
        }
        int a = icg.m21593a(this.f17561e, i, 0);
        if (a < 0 || this.f17562f[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f17561e[i2] == 0) {
            if (this.f17562f[i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f17561e[a] == 0) {
            if (this.f17562f[a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    private void m21571b(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (ice.class) {
                if (f17559c != null) {
                    objArr = f17559c;
                    this.f17562f = objArr;
                    f17559c = (Object[]) objArr[0];
                    this.f17561e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f17560d--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ice.class) {
                if (f17557a != null) {
                    objArr = f17557a;
                    this.f17562f = objArr;
                    f17557a = (Object[]) objArr[0];
                    this.f17561e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f17558b--;
                    return;
                }
            }
        }
        this.f17561e = new int[i];
        this.f17562f = new Object[i];
    }

    private static void m21570a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (ice.class) {
                if (f17560d < 10) {
                    objArr[0] = f17559c;
                    objArr[1] = iArr;
                    for (i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f17559c = objArr;
                    f17560d++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (ice.class) {
                if (f17558b < 10) {
                    objArr[0] = f17557a;
                    objArr[1] = iArr;
                    for (i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f17557a = objArr;
                    f17558b++;
                }
            }
        }
    }

    public void clear() {
        if (this.f17563g != 0) {
            ice.m21570a(this.f17561e, this.f17562f, this.f17563g);
            this.f17561e = icg.f17568b;
            this.f17562f = icg.f17570d;
            this.f17563g = 0;
        }
    }

    private void m21572c(int i) {
        if (this.f17561e.length < i) {
            Object obj = this.f17561e;
            Object obj2 = this.f17562f;
            m21571b(i);
            if (this.f17563g > 0) {
                System.arraycopy(obj, 0, this.f17561e, 0, this.f17563g);
                System.arraycopy(obj2, 0, this.f17562f, 0, this.f17563g);
            }
            ice.m21570a(obj, obj2, this.f17563g);
        }
    }

    public boolean contains(Object obj) {
        return obj == null ? m21574a() >= 0 : m21575a(obj, obj.hashCode()) >= 0;
    }

    private E m21573d(int i) {
        return this.f17562f[i];
    }

    public boolean isEmpty() {
        return this.f17563g <= 0;
    }

    public boolean add(E e) {
        int a;
        int i;
        int i2 = 8;
        if (e == null) {
            a = m21574a();
            i = 0;
        } else {
            i = e.hashCode();
            a = m21575a(e, i);
        }
        if (a >= 0) {
            return false;
        }
        a ^= -1;
        if (this.f17563g >= this.f17561e.length) {
            if (this.f17563g >= 8) {
                i2 = this.f17563g + (this.f17563g >> 1);
            } else if (this.f17563g < 4) {
                i2 = 4;
            }
            Object obj = this.f17561e;
            Object obj2 = this.f17562f;
            m21571b(i2);
            if (this.f17561e.length > 0) {
                System.arraycopy(obj, 0, this.f17561e, 0, obj.length);
                System.arraycopy(obj2, 0, this.f17562f, 0, obj2.length);
            }
            ice.m21570a(obj, obj2, this.f17563g);
        }
        if (a < this.f17563g) {
            System.arraycopy(this.f17561e, a, this.f17561e, a + 1, this.f17563g - a);
            System.arraycopy(this.f17562f, a, this.f17562f, a + 1, this.f17563g - a);
        }
        this.f17561e[a] = i;
        this.f17562f[a] = e;
        this.f17563g++;
        return true;
    }

    public boolean remove(Object obj) {
        int a = obj == null ? m21574a() : m21575a(obj, obj.hashCode());
        if (a < 0) {
            return false;
        }
        m21576a(a);
        return true;
    }

    public E m21576a(int i) {
        int i2 = 8;
        E e = this.f17562f[i];
        if (this.f17563g <= 1) {
            ice.m21570a(this.f17561e, this.f17562f, this.f17563g);
            this.f17561e = icg.f17568b;
            this.f17562f = icg.f17570d;
            this.f17563g = 0;
        } else if (this.f17561e.length <= 8 || this.f17563g >= this.f17561e.length / 3) {
            this.f17563g--;
            if (i < this.f17563g) {
                System.arraycopy(this.f17561e, i + 1, this.f17561e, i, this.f17563g - i);
                System.arraycopy(this.f17562f, i + 1, this.f17562f, i, this.f17563g - i);
            }
            this.f17562f[this.f17563g] = null;
        } else {
            if (this.f17563g > 8) {
                i2 = this.f17563g + (this.f17563g >> 1);
            }
            Object obj = this.f17561e;
            Object obj2 = this.f17562f;
            m21571b(i2);
            this.f17563g--;
            if (i > 0) {
                System.arraycopy(obj, 0, this.f17561e, 0, i);
                System.arraycopy(obj2, 0, this.f17562f, 0, i);
            }
            if (i < this.f17563g) {
                System.arraycopy(obj, i + 1, this.f17561e, i, this.f17563g - i);
                System.arraycopy(obj2, i + 1, this.f17562f, i, this.f17563g - i);
            }
        }
        return e;
    }

    public int size() {
        return this.f17563g;
    }

    public Object[] toArray() {
        Object obj = new Object[this.f17563g];
        System.arraycopy(this.f17562f, 0, obj, 0, this.f17563g);
        return obj;
    }

    public <T> T[] toArray(T[] tArr) {
        Object obj;
        if (tArr.length < this.f17563g) {
            obj = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f17563g);
        } else {
            obj = tArr;
        }
        System.arraycopy(this.f17562f, 0, obj, 0, this.f17563g);
        if (obj.length > this.f17563g) {
            obj[this.f17563g] = null;
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
        while (i < this.f17563g) {
            try {
                if (!set.contains(m21573d(i))) {
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
        int[] iArr = this.f17561e;
        int i2 = 0;
        while (i < this.f17563g) {
            i2 += iArr[i];
            i++;
        }
        return i2;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f17563g * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.f17563g; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            ice d = m21573d(i);
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
        m21572c(this.f17563g + collection.size());
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
        for (int i = this.f17563g - 1; i >= 0; i--) {
            if (!collection.contains(this.f17562f[i])) {
                m21576a(i);
                z = true;
            }
        }
        return z;
    }

    public Iterator<E> iterator() {
        if (this.f17564h == null) {
            this.f17564h = new icf(this);
        }
        return this.f17564h.m21586d().iterator();
    }
}
