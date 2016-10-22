package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: ij */
public class ij {
    private static Object[] d;
    private static int e;
    private static Object[] f;
    private static int g;
    int[] a;
    Object[] b;
    int c;

    private int a(Object obj, int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int a = hx.a(this.a, i2, i);
        if (a < 0 || obj.equals(this.b[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (obj.equals(this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.a[a] == i) {
            if (obj.equals(this.b[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    private int a() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int a = hx.a(this.a, i, 0);
        if (a < 0 || this.b[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.a[a] == 0) {
            if (this.b[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    final void a(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (hv.class) {
                if (f != null) {
                    objArr = f;
                    this.b = objArr;
                    f = (Object[]) objArr[0];
                    this.a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (hv.class) {
                if (d != null) {
                    objArr = d;
                    this.b = objArr;
                    d = (Object[]) objArr[0];
                    this.a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    e--;
                    return;
                }
            }
        }
        this.a = new int[i];
        this.b = new Object[(i << 1)];
    }

    static void a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (hv.class) {
                if (g < 10) {
                    objArr[0] = f;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f = objArr;
                    g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (hv.class) {
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
        }
    }

    public ij() {
        this.a = hx.a;
        this.b = hx.c;
        this.c = 0;
    }

    public ij(int i) {
        if (i == 0) {
            this.a = hx.a;
            this.b = hx.c;
        } else {
            a(i);
        }
        this.c = 0;
    }

    public void clear() {
        if (this.c != 0) {
            ij.a(this.a, this.b, this.c);
            this.a = hx.a;
            this.b = hx.c;
            this.c = 0;
        }
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public final int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    final int b(Object obj) {
        int i = 1;
        int i2 = this.c << 1;
        Object[] objArr = this.b;
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

    public Object get(Object obj) {
        int a = a(obj);
        return a >= 0 ? this.b[(a << 1) + 1] : null;
    }

    public final Object b(int i) {
        return this.b[i << 1];
    }

    public final Object c(int i) {
        return this.b[(i << 1) + 1];
    }

    public final Object a(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object obj2 = this.b[i2];
        this.b[i2] = obj;
        return obj2;
    }

    public boolean isEmpty() {
        return this.c <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int a;
        int i;
        int i2 = 8;
        if (obj == null) {
            a = a();
            i = 0;
        } else {
            i = obj.hashCode();
            a = a(obj, i);
        }
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            Object obj3 = this.b[i3];
            this.b[i3] = obj2;
            return obj3;
        }
        a ^= -1;
        if (this.c >= this.a.length) {
            if (this.c >= 8) {
                i2 = this.c + (this.c >> 1);
            } else if (this.c < 4) {
                i2 = 4;
            }
            Object obj4 = this.a;
            Object obj5 = this.b;
            a(i2);
            if (this.a.length > 0) {
                System.arraycopy(obj4, 0, this.a, 0, obj4.length);
                System.arraycopy(obj5, 0, this.b, 0, obj5.length);
            }
            ij.a(obj4, obj5, this.c);
        }
        if (a < this.c) {
            System.arraycopy(this.a, a, this.a, a + 1, this.c - a);
            System.arraycopy(this.b, a << 1, this.b, (a + 1) << 1, (this.c - a) << 1);
        }
        this.a[a] = i;
        this.b[a << 1] = obj;
        this.b[(a << 1) + 1] = obj2;
        this.c++;
        return null;
    }

    public Object remove(Object obj) {
        int a = a(obj);
        if (a >= 0) {
            return d(a);
        }
        return null;
    }

    public final Object d(int i) {
        int i2 = 8;
        Object obj = this.b[(i << 1) + 1];
        if (this.c <= 1) {
            ij.a(this.a, this.b, this.c);
            this.a = hx.a;
            this.b = hx.c;
            this.c = 0;
        } else if (this.a.length <= 8 || this.c >= this.a.length / 3) {
            this.c--;
            if (i < this.c) {
                System.arraycopy(this.a, i + 1, this.a, i, this.c - i);
                System.arraycopy(this.b, (i + 1) << 1, this.b, i << 1, (this.c - i) << 1);
            }
            this.b[this.c << 1] = null;
            this.b[(this.c << 1) + 1] = null;
        } else {
            if (this.c > 8) {
                i2 = this.c + (this.c >> 1);
            }
            Object obj2 = this.a;
            Object obj3 = this.b;
            a(i2);
            this.c--;
            if (i > 0) {
                System.arraycopy(obj2, 0, this.a, 0, i);
                System.arraycopy(obj3, 0, this.b, 0, i << 1);
            }
            if (i < this.c) {
                System.arraycopy(obj2, i + 1, this.a, i, this.c - i);
                System.arraycopy(obj3, (i + 1) << 1, this.b, i << 1, (this.c - i) << 1);
            }
        }
        return obj;
    }

    public int size() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        int i;
        Object b;
        Object c;
        Object obj2;
        if (obj instanceof ij) {
            ij ijVar = (ij) obj;
            if (size() != ijVar.size()) {
                return false;
            }
            i = 0;
            while (i < this.c) {
                try {
                    b = b(i);
                    c = c(i);
                    obj2 = ijVar.get(b);
                    if (c == null) {
                        if (obj2 != null || !ijVar.containsKey(b)) {
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
            while (i < this.c) {
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
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
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
        StringBuilder stringBuilder = new StringBuilder(this.c * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.c; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            ij b = b(i);
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
