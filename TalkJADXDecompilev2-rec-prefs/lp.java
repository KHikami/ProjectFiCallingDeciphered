package p000;

public final class lp<E> implements Cloneable {
    private static final Object f25972a = new Object();
    private boolean f25973b;
    private int[] f25974c;
    private Object[] f25975d;
    private int f25976e;

    public /* synthetic */ Object clone() {
        return m29840c();
    }

    public lp() {
        this(10);
    }

    public lp(int i) {
        this.f25973b = false;
        if (i == 0) {
            this.f25974c = la.f24319a;
            this.f25975d = la.f24321c;
        } else {
            int a = la.m28313a(i);
            this.f25974c = new int[a];
            this.f25975d = new Object[a];
        }
        this.f25976e = 0;
    }

    private lp<E> m29840c() {
        try {
            lp<E> lpVar = (lp) super.clone();
            try {
                lpVar.f25974c = (int[]) this.f25974c.clone();
                lpVar.f25975d = (Object[]) this.f25975d.clone();
                return lpVar;
            } catch (CloneNotSupportedException e) {
                return lpVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public E m29844a(int i) {
        return m29839b(i, null);
    }

    private E m29839b(int i, E e) {
        int a = la.m28314a(this.f25974c, this.f25976e, i);
        if (a < 0 || this.f25975d[a] == f25972a) {
            return null;
        }
        return this.f25975d[a];
    }

    private void m29842g(int i) {
        int a = la.m28314a(this.f25974c, this.f25976e, i);
        if (a >= 0 && this.f25975d[a] != f25972a) {
            this.f25975d[a] = f25972a;
            this.f25973b = true;
        }
    }

    public void m29847b(int i) {
        m29842g(i);
    }

    public void m29848c(int i) {
        if (this.f25975d[i] != f25972a) {
            this.f25975d[i] = f25972a;
            this.f25973b = true;
        }
    }

    private void m29841d() {
        int i = this.f25976e;
        int[] iArr = this.f25974c;
        Object[] objArr = this.f25975d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f25972a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f25973b = false;
        this.f25976e = i2;
    }

    public void m29845a(int i, E e) {
        int a = la.m28314a(this.f25974c, this.f25976e, i);
        if (a >= 0) {
            this.f25975d[a] = e;
            return;
        }
        a ^= -1;
        if (a >= this.f25976e || this.f25975d[a] != f25972a) {
            if (this.f25973b && this.f25976e >= this.f25974c.length) {
                m29841d();
                a = la.m28314a(this.f25974c, this.f25976e, i) ^ -1;
            }
            if (this.f25976e >= this.f25974c.length) {
                int a2 = la.m28313a(this.f25976e + 1);
                Object obj = new int[a2];
                Object obj2 = new Object[a2];
                System.arraycopy(this.f25974c, 0, obj, 0, this.f25974c.length);
                System.arraycopy(this.f25975d, 0, obj2, 0, this.f25975d.length);
                this.f25974c = obj;
                this.f25975d = obj2;
            }
            if (this.f25976e - a != 0) {
                System.arraycopy(this.f25974c, a, this.f25974c, a + 1, this.f25976e - a);
                System.arraycopy(this.f25975d, a, this.f25975d, a + 1, this.f25976e - a);
            }
            this.f25974c[a] = i;
            this.f25975d[a] = e;
            this.f25976e++;
            return;
        }
        this.f25974c[a] = i;
        this.f25975d[a] = e;
    }

    public int m29843a() {
        if (this.f25973b) {
            m29841d();
        }
        return this.f25976e;
    }

    public int m29849d(int i) {
        if (this.f25973b) {
            m29841d();
        }
        return this.f25974c[i];
    }

    public E m29850e(int i) {
        if (this.f25973b) {
            m29841d();
        }
        return this.f25975d[i];
    }

    public int m29851f(int i) {
        if (this.f25973b) {
            m29841d();
        }
        return la.m28314a(this.f25974c, this.f25976e, i);
    }

    public void m29846b() {
        int i = this.f25976e;
        Object[] objArr = this.f25975d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f25976e = 0;
        this.f25973b = false;
    }

    public String toString() {
        if (m29843a() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f25976e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f25976e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m29849d(i));
            stringBuilder.append('=');
            lp e = m29850e(i);
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
