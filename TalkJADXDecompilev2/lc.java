package defpackage;

public final class lc<E> implements Cloneable {
    private static final Object a = new Object();
    private boolean b;
    private long[] c;
    private Object[] d;
    private int e;

    public /* synthetic */ Object clone() {
        return c();
    }

    public lc() {
        this(10);
    }

    private lc(int i) {
        this.b = false;
        int b = la.b(10);
        this.c = new long[b];
        this.d = new Object[b];
        this.e = 0;
    }

    private lc<E> c() {
        try {
            lc<E> lcVar = (lc) super.clone();
            try {
                lcVar.c = (long[]) this.c.clone();
                lcVar.d = (Object[]) this.d.clone();
                return lcVar;
            } catch (CloneNotSupportedException e) {
                return lcVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public E a(long j) {
        return a(j, null);
    }

    public E a(long j, E e) {
        int a = la.a(this.c, this.e, j);
        if (a < 0 || this.d[a] == a) {
            return null;
        }
        return this.d[a];
    }

    public void b(long j) {
        int a = la.a(this.c, this.e, j);
        if (a >= 0 && this.d[a] != a) {
            this.d[a] = a;
            this.b = true;
        }
    }

    public void c(long j) {
        b(j);
    }

    public void a(int i) {
        if (this.d[i] != a) {
            this.d[i] = a;
            this.b = true;
        }
    }

    private void d() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public void b(long j, E e) {
        int a = la.a(this.c, this.e, j);
        if (a >= 0) {
            this.d[a] = e;
            return;
        }
        a ^= -1;
        if (a >= this.e || this.d[a] != a) {
            if (this.b && this.e >= this.c.length) {
                d();
                a = la.a(this.c, this.e, j) ^ -1;
            }
            if (this.e >= this.c.length) {
                int b = la.b(this.e + 1);
                Object obj = new long[b];
                Object obj2 = new Object[b];
                System.arraycopy(this.c, 0, obj, 0, this.c.length);
                System.arraycopy(this.d, 0, obj2, 0, this.d.length);
                this.c = obj;
                this.d = obj2;
            }
            if (this.e - a != 0) {
                System.arraycopy(this.c, a, this.c, a + 1, this.e - a);
                System.arraycopy(this.d, a, this.d, a + 1, this.e - a);
            }
            this.c[a] = j;
            this.d[a] = e;
            this.e++;
            return;
        }
        this.c[a] = j;
        this.d[a] = e;
    }

    public int a() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    private long c(int i) {
        if (this.b) {
            d();
        }
        return this.c[i];
    }

    public E b(int i) {
        if (this.b) {
            d();
        }
        return this.d[i];
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

    public void c(long j, E e) {
        if (this.e == 0 || j > this.c[this.e - 1]) {
            if (this.b && this.e >= this.c.length) {
                d();
            }
            int i = this.e;
            if (i >= this.c.length) {
                int b = la.b(i + 1);
                Object obj = new long[b];
                Object obj2 = new Object[b];
                System.arraycopy(this.c, 0, obj, 0, this.c.length);
                System.arraycopy(this.d, 0, obj2, 0, this.d.length);
                this.c = obj;
                this.d = obj2;
            }
            this.c[i] = j;
            this.d[i] = e;
            this.e = i + 1;
            return;
        }
        b(j, e);
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
            stringBuilder.append(c(i));
            stringBuilder.append('=');
            lc b = b(i);
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
