package defpackage;

import java.util.Map;

/* renamed from: lo */
public class lo<K, V> {
    static Object[] b;
    static int c;
    static Object[] d;
    static int e;
    int[] f;
    Object[] g;
    int h;

    int a(Object obj, int i) {
        int i2 = this.h;
        if (i2 == 0) {
            return -1;
        }
        int a = la.a(this.f, i2, i);
        if (a < 0 || obj.equals(this.g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f[i3] == i) {
            if (obj.equals(this.g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f[a] == i) {
            if (obj.equals(this.g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    int a() {
        int i = this.h;
        if (i == 0) {
            return -1;
        }
        int a = la.a(this.f, i, 0);
        if (a < 0 || this.g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f[i2] == 0) {
            if (this.g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f[a] == 0) {
            if (this.g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    private void e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (ky.class) {
                if (d != null) {
                    objArr = d;
                    this.g = objArr;
                    d = (Object[]) objArr[0];
                    this.f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ky.class) {
                if (b != null) {
                    objArr = b;
                    this.g = objArr;
                    b = (Object[]) objArr[0];
                    this.f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    c--;
                    return;
                }
            }
        }
        this.f = new int[i];
        this.g = new Object[(i << 1)];
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (ky.class) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    d = objArr;
                    e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (ky.class) {
                if (c < 10) {
                    objArr[0] = b;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    b = objArr;
                    c++;
                }
            }
        }
    }

    public lo() {
        this.f = la.a;
        this.g = la.c;
        this.h = 0;
    }

    public lo(int i) {
        if (i == 0) {
            this.f = la.a;
            this.g = la.c;
        } else {
            e(i);
        }
        this.h = 0;
    }

    public lo(lo loVar) {
        this();
        if (loVar != null) {
            a(loVar);
        }
    }

    public void clear() {
        if (this.h != 0) {
            lo.a(this.f, this.g, this.h);
            this.f = la.a;
            this.g = la.c;
            this.h = 0;
        }
    }

    public void a(int i) {
        if (this.f.length < i) {
            Object obj = this.f;
            Object obj2 = this.g;
            e(i);
            if (this.h > 0) {
                System.arraycopy(obj, 0, this.f, 0, this.h);
                System.arraycopy(obj2, 0, this.g, 0, this.h << 1);
            }
            lo.a(obj, obj2, this.h);
        }
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    int b(Object obj) {
        int i = 1;
        int i2 = this.h << 1;
        Object[] objArr = this.g;
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
        return b(obj) >= 0;
    }

    public V get(Object obj) {
        int a = a(obj);
        return a >= 0 ? this.g[(a << 1) + 1] : null;
    }

    public K b(int i) {
        return this.g[i << 1];
    }

    public V c(int i) {
        return this.g[(i << 1) + 1];
    }

    public V a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.g[i2];
        this.g[i2] = v;
        return v2;
    }

    public boolean isEmpty() {
        return this.h <= 0;
    }

    public V put(K k, V v) {
        int a;
        int i;
        int i2 = 8;
        if (k == null) {
            a = a();
            i = 0;
        } else {
            i = k.hashCode();
            a = a((Object) k, i);
        }
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            V v2 = this.g[i3];
            this.g[i3] = v;
            return v2;
        }
        a ^= -1;
        if (this.h >= this.f.length) {
            if (this.h >= 8) {
                i2 = this.h + (this.h >> 1);
            } else if (this.h < 4) {
                i2 = 4;
            }
            Object obj = this.f;
            Object obj2 = this.g;
            e(i2);
            if (this.f.length > 0) {
                System.arraycopy(obj, 0, this.f, 0, obj.length);
                System.arraycopy(obj2, 0, this.g, 0, obj2.length);
            }
            lo.a(obj, obj2, this.h);
        }
        if (a < this.h) {
            System.arraycopy(this.f, a, this.f, a + 1, this.h - a);
            System.arraycopy(this.g, a << 1, this.g, (a + 1) << 1, (this.h - a) << 1);
        }
        this.f[a] = i;
        this.g[a << 1] = k;
        this.g[(a << 1) + 1] = v;
        this.h++;
        return null;
    }

    public void a(lo<? extends K, ? extends V> loVar) {
        int i = 0;
        int i2 = loVar.h;
        a(this.h + i2);
        if (this.h != 0) {
            while (i < i2) {
                put(loVar.b(i), loVar.c(i));
                i++;
            }
        } else if (i2 > 0) {
            System.arraycopy(loVar.f, 0, this.f, 0, i2);
            System.arraycopy(loVar.g, 0, this.g, 0, i2 << 1);
            this.h = i2;
        }
    }

    public V remove(Object obj) {
        int a = a(obj);
        if (a >= 0) {
            return d(a);
        }
        return null;
    }

    public V d(int i) {
        int i2 = 8;
        V v = this.g[(i << 1) + 1];
        if (this.h <= 1) {
            lo.a(this.f, this.g, this.h);
            this.f = la.a;
            this.g = la.c;
            this.h = 0;
        } else if (this.f.length <= 8 || this.h >= this.f.length / 3) {
            this.h--;
            if (i < this.h) {
                System.arraycopy(this.f, i + 1, this.f, i, this.h - i);
                System.arraycopy(this.g, (i + 1) << 1, this.g, i << 1, (this.h - i) << 1);
            }
            this.g[this.h << 1] = null;
            this.g[(this.h << 1) + 1] = null;
        } else {
            if (this.h > 8) {
                i2 = this.h + (this.h >> 1);
            }
            Object obj = this.f;
            Object obj2 = this.g;
            e(i2);
            this.h--;
            if (i > 0) {
                System.arraycopy(obj, 0, this.f, 0, i);
                System.arraycopy(obj2, 0, this.g, 0, i << 1);
            }
            if (i < this.h) {
                System.arraycopy(obj, i + 1, this.f, i, this.h - i);
                System.arraycopy(obj2, (i + 1) << 1, this.g, i << 1, (this.h - i) << 1);
            }
        }
        return v;
    }

    public int size() {
        return this.h;
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
            while (i < this.h) {
                try {
                    b = b(i);
                    c = c(i);
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
            while (i < this.h) {
                try {
                    b = b(i);
                    c = c(i);
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
        int[] iArr = this.f;
        Object[] objArr = this.g;
        int i = this.h;
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
        StringBuilder stringBuilder = new StringBuilder(this.h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            lo b = b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = c(i);
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
