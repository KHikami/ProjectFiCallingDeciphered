package defpackage;

/* renamed from: lp */
public final class lp<E> implements Cloneable {
    private static final Object a;
    private boolean b;
    private int[] c;
    private Object[] d;
    private int e;

    public /* synthetic */ Object clone() {
        return c();
    }

    static {
        a = new Object();
    }

    public lp() {
        this(10);
    }

    public lp(int i) {
        this.b = false;
        if (i == 0) {
            this.c = la.a;
            this.d = la.c;
        } else {
            int a = la.a(i);
            this.c = new int[a];
            this.d = new Object[a];
        }
        this.e = 0;
    }

    private lp<E> c() {
        try {
            lp<E> lpVar = (lp) super.clone();
            try {
                lpVar.c = (int[]) this.c.clone();
                lpVar.d = (Object[]) this.d.clone();
                return lpVar;
            } catch (CloneNotSupportedException e) {
                return lpVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public E a(int i) {
        return b(i, null);
    }

    private E b(int i, E e) {
        int a = la.a(this.c, this.e, i);
        if (a < 0 || this.d[a] == a) {
            return null;
        }
        return this.d[a];
    }

    private void g(int i) {
        int a = la.a(this.c, this.e, i);
        if (a >= 0 && this.d[a] != a) {
            this.d[a] = a;
            this.b = true;
        }
    }

    public void b(int i) {
        g(i);
    }

    public void c(int i) {
        if (this.d[i] != a) {
            this.d[i] = a;
            this.b = true;
        }
    }

    private void d() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public void a(int i, E e) {
        int a = la.a(this.c, this.e, i);
        if (a >= 0) {
            this.d[a] = e;
            return;
        }
        a ^= -1;
        if (a >= this.e || this.d[a] != a) {
            if (this.b && this.e >= this.c.length) {
                d();
                a = la.a(this.c, this.e, i) ^ -1;
            }
            if (this.e >= this.c.length) {
                int a2 = la.a(this.e + 1);
                Object obj = new int[a2];
                Object obj2 = new Object[a2];
                System.arraycopy(this.c, 0, obj, 0, this.c.length);
                System.arraycopy(this.d, 0, obj2, 0, this.d.length);
                this.c = obj;
                this.d = obj2;
            }
            if (this.e - a != 0) {
                System.arraycopy(this.c, a, this.c, a + 1, this.e - a);
                System.arraycopy(this.d, a, this.d, a + 1, this.e - a);
            }
            this.c[a] = i;
            this.d[a] = e;
            this.e++;
            return;
        }
        this.c[a] = i;
        this.d[a] = e;
    }

    public int a() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    public int d(int i) {
        if (this.b) {
            d();
        }
        return this.c[i];
    }

    public E e(int i) {
        if (this.b) {
            d();
        }
        return this.d[i];
    }

    public int f(int i) {
        if (this.b) {
            d();
        }
        return la.a(this.c, this.e, i);
    }

    public void b() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public String toString() {
        if (a() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(d(i));
            stringBuilder.append('=');
            lp e = e(i);
            if (e != this) {
                stringBuilder.append(e);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
