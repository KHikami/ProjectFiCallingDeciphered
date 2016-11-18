package p000;

import java.util.Map;

public class lo<K, V> {
    static Object[] f23981b;
    static int f23982c;
    static Object[] f23983d;
    static int f23984e;
    int[] f23985f;
    Object[] f23986g;
    int f23987h;

    int m28012a(Object obj, int i) {
        int i2 = this.f23987h;
        if (i2 == 0) {
            return -1;
        }
        int a = la.m28314a(this.f23985f, i2, i);
        if (a < 0 || obj.equals(this.f23986g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f23985f[i3] == i) {
            if (obj.equals(this.f23986g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f23985f[a] == i) {
            if (obj.equals(this.f23986g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    int m28010a() {
        int i = this.f23987h;
        if (i == 0) {
            return -1;
        }
        int a = la.m28314a(this.f23985f, i, 0);
        if (a < 0 || this.f23986g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f23985f[i2] == 0) {
            if (this.f23986g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f23985f[a] == 0) {
            if (this.f23986g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    private void m28009e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (ky.class) {
                if (f23983d != null) {
                    objArr = f23983d;
                    this.f23986g = objArr;
                    f23983d = (Object[]) objArr[0];
                    this.f23985f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f23984e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ky.class) {
                if (f23981b != null) {
                    objArr = f23981b;
                    this.f23986g = objArr;
                    f23981b = (Object[]) objArr[0];
                    this.f23985f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f23982c--;
                    return;
                }
            }
        }
        this.f23985f = new int[i];
        this.f23986g = new Object[(i << 1)];
    }

    private static void m28008a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (ky.class) {
                if (f23984e < 10) {
                    objArr[0] = f23983d;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f23983d = objArr;
                    f23984e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (ky.class) {
                if (f23982c < 10) {
                    objArr[0] = f23981b;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f23981b = objArr;
                    f23982c++;
                }
            }
        }
    }

    public lo() {
        this.f23985f = la.f24319a;
        this.f23986g = la.f24321c;
        this.f23987h = 0;
    }

    public lo(int i) {
        if (i == 0) {
            this.f23985f = la.f24319a;
            this.f23986g = la.f24321c;
        } else {
            m28009e(i);
        }
        this.f23987h = 0;
    }

    public lo(lo loVar) {
        this();
        if (loVar != null) {
            m28015a(loVar);
        }
    }

    public void clear() {
        if (this.f23987h != 0) {
            lo.m28008a(this.f23985f, this.f23986g, this.f23987h);
            this.f23985f = la.f24319a;
            this.f23986g = la.f24321c;
            this.f23987h = 0;
        }
    }

    public void m28014a(int i) {
        if (this.f23985f.length < i) {
            Object obj = this.f23985f;
            Object obj2 = this.f23986g;
            m28009e(i);
            if (this.f23987h > 0) {
                System.arraycopy(obj, 0, this.f23985f, 0, this.f23987h);
                System.arraycopy(obj2, 0, this.f23986g, 0, this.f23987h << 1);
            }
            lo.m28008a(obj, obj2, this.f23987h);
        }
    }

    public boolean containsKey(Object obj) {
        return m28011a(obj) >= 0;
    }

    public int m28011a(Object obj) {
        return obj == null ? m28010a() : m28012a(obj, obj.hashCode());
    }

    int m28016b(Object obj) {
        int i = 1;
        int i2 = this.f23987h << 1;
        Object[] objArr = this.f23986g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return m28016b(obj) >= 0;
    }

    public V get(Object obj) {
        int a = m28011a(obj);
        return a >= 0 ? this.f23986g[(a << 1) + 1] : null;
    }

    public K m28017b(int i) {
        return this.f23986g[i << 1];
    }

    public V m28018c(int i) {
        return this.f23986g[(i << 1) + 1];
    }

    public V m28013a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.f23986g[i2];
        this.f23986g[i2] = v;
        return v2;
    }

    public boolean isEmpty() {
        return this.f23987h <= 0;
    }

    public V put(K k, V v) {
        int a;
        int i;
        int i2 = 8;
        if (k == null) {
            a = m28010a();
            i = 0;
        } else {
            i = k.hashCode();
            a = m28012a((Object) k, i);
        }
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            V v2 = this.f23986g[i3];
            this.f23986g[i3] = v;
            return v2;
        }
        a ^= -1;
        if (this.f23987h >= this.f23985f.length) {
            if (this.f23987h >= 8) {
                i2 = this.f23987h + (this.f23987h >> 1);
            } else if (this.f23987h < 4) {
                i2 = 4;
            }
            Object obj = this.f23985f;
            Object obj2 = this.f23986g;
            m28009e(i2);
            if (this.f23985f.length > 0) {
                System.arraycopy(obj, 0, this.f23985f, 0, obj.length);
                System.arraycopy(obj2, 0, this.f23986g, 0, obj2.length);
            }
            lo.m28008a(obj, obj2, this.f23987h);
        }
        if (a < this.f23987h) {
            System.arraycopy(this.f23985f, a, this.f23985f, a + 1, this.f23987h - a);
            System.arraycopy(this.f23986g, a << 1, this.f23986g, (a + 1) << 1, (this.f23987h - a) << 1);
        }
        this.f23985f[a] = i;
        this.f23986g[a << 1] = k;
        this.f23986g[(a << 1) + 1] = v;
        this.f23987h++;
        return null;
    }

    public void m28015a(lo<? extends K, ? extends V> loVar) {
        int i = 0;
        int i2 = loVar.f23987h;
        m28014a(this.f23987h + i2);
        if (this.f23987h != 0) {
            while (i < i2) {
                put(loVar.m28017b(i), loVar.m28018c(i));
                i++;
            }
        } else if (i2 > 0) {
            System.arraycopy(loVar.f23985f, 0, this.f23985f, 0, i2);
            System.arraycopy(loVar.f23986g, 0, this.f23986g, 0, i2 << 1);
            this.f23987h = i2;
        }
    }

    public V remove(Object obj) {
        int a = m28011a(obj);
        if (a >= 0) {
            return m28019d(a);
        }
        return null;
    }

    public V m28019d(int i) {
        int i2 = 8;
        V v = this.f23986g[(i << 1) + 1];
        if (this.f23987h <= 1) {
            lo.m28008a(this.f23985f, this.f23986g, this.f23987h);
            this.f23985f = la.f24319a;
            this.f23986g = la.f24321c;
            this.f23987h = 0;
        } else if (this.f23985f.length <= 8 || this.f23987h >= this.f23985f.length / 3) {
            this.f23987h--;
            if (i < this.f23987h) {
                System.arraycopy(this.f23985f, i + 1, this.f23985f, i, this.f23987h - i);
                System.arraycopy(this.f23986g, (i + 1) << 1, this.f23986g, i << 1, (this.f23987h - i) << 1);
            }
            this.f23986g[this.f23987h << 1] = null;
            this.f23986g[(this.f23987h << 1) + 1] = null;
        } else {
            if (this.f23987h > 8) {
                i2 = this.f23987h + (this.f23987h >> 1);
            }
            Object obj = this.f23985f;
            Object obj2 = this.f23986g;
            m28009e(i2);
            this.f23987h--;
            if (i > 0) {
                System.arraycopy(obj, 0, this.f23985f, 0, i);
                System.arraycopy(obj2, 0, this.f23986g, 0, i << 1);
            }
            if (i < this.f23987h) {
                System.arraycopy(obj, i + 1, this.f23985f, i, this.f23987h - i);
                System.arraycopy(obj2, (i + 1) << 1, this.f23986g, i << 1, (this.f23987h - i) << 1);
            }
        }
        return v;
    }

    public int size() {
        return this.f23987h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        int i;
        Object b;
        Object c;
        Object obj2;
        if (obj instanceof lo) {
            lo loVar = (lo) obj;
            if (size() != loVar.size()) {
                return false;
            }
            i = 0;
            while (i < this.f23987h) {
                try {
                    b = m28017b(i);
                    c = m28018c(i);
                    obj2 = loVar.get(b);
                    if (c == null) {
                        if (obj2 != null || !loVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
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
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            i = 0;
            while (i < this.f23987h) {
                try {
                    b = m28017b(i);
                    c = m28018c(i);
                    obj2 = map.get(b);
                    if (c == null) {
                        if (obj2 != null || !map.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e3) {
                    return false;
                } catch (ClassCastException e4) {
                    return false;
                }
            }
            return true;
        }
    }

    public int hashCode() {
        int[] iArr = this.f23985f;
        Object[] objArr = this.f23986g;
        int i = this.f23987h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f23987h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f23987h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            lo b = m28017b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = m28018c(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
