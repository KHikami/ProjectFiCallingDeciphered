package p000;

public final class lc<E> implements Cloneable {
    private static final Object f24539a = new Object();
    private boolean f24540b;
    private long[] f24541c;
    private Object[] f24542d;
    private int f24543e;

    public /* synthetic */ Object clone() {
        return m28548c();
    }

    public lc() {
        this(10);
    }

    private lc(int i) {
        this.f24540b = false;
        int b = la.m28317b(10);
        this.f24541c = new long[b];
        this.f24542d = new Object[b];
        this.f24543e = 0;
    }

    private lc<E> m28548c() {
        try {
            lc<E> lcVar = (lc) super.clone();
            try {
                lcVar.f24541c = (long[]) this.f24541c.clone();
                lcVar.f24542d = (Object[]) this.f24542d.clone();
                return lcVar;
            } catch (CloneNotSupportedException e) {
                return lcVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public E m28551a(long j) {
        return m28552a(j, null);
    }

    public E m28552a(long j, E e) {
        int a = la.m28315a(this.f24541c, this.f24543e, j);
        if (a < 0 || this.f24542d[a] == f24539a) {
            return null;
        }
        return this.f24542d[a];
    }

    public void m28556b(long j) {
        int a = la.m28315a(this.f24541c, this.f24543e, j);
        if (a >= 0 && this.f24542d[a] != f24539a) {
            this.f24542d[a] = f24539a;
            this.f24540b = true;
        }
    }

    public void m28558c(long j) {
        m28556b(j);
    }

    public void m28553a(int i) {
        if (this.f24542d[i] != f24539a) {
            this.f24542d[i] = f24539a;
            this.f24540b = true;
        }
    }

    private void m28549d() {
        int i = this.f24543e;
        long[] jArr = this.f24541c;
        Object[] objArr = this.f24542d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f24539a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f24540b = false;
        this.f24543e = i2;
    }

    public void m28557b(long j, E e) {
        int a = la.m28315a(this.f24541c, this.f24543e, j);
        if (a >= 0) {
            this.f24542d[a] = e;
            return;
        }
        a ^= -1;
        if (a >= this.f24543e || this.f24542d[a] != f24539a) {
            if (this.f24540b && this.f24543e >= this.f24541c.length) {
                m28549d();
                a = la.m28315a(this.f24541c, this.f24543e, j) ^ -1;
            }
            if (this.f24543e >= this.f24541c.length) {
                int b = la.m28317b(this.f24543e + 1);
                Object obj = new long[b];
                Object obj2 = new Object[b];
                System.arraycopy(this.f24541c, 0, obj, 0, this.f24541c.length);
                System.arraycopy(this.f24542d, 0, obj2, 0, this.f24542d.length);
                this.f24541c = obj;
                this.f24542d = obj2;
            }
            if (this.f24543e - a != 0) {
                System.arraycopy(this.f24541c, a, this.f24541c, a + 1, this.f24543e - a);
                System.arraycopy(this.f24542d, a, this.f24542d, a + 1, this.f24543e - a);
            }
            this.f24541c[a] = j;
            this.f24542d[a] = e;
            this.f24543e++;
            return;
        }
        this.f24541c[a] = j;
        this.f24542d[a] = e;
    }

    public int m28550a() {
        if (this.f24540b) {
            m28549d();
        }
        return this.f24543e;
    }

    private long m28547c(int i) {
        if (this.f24540b) {
            m28549d();
        }
        return this.f24541c[i];
    }

    public E m28554b(int i) {
        if (this.f24540b) {
            m28549d();
        }
        return this.f24542d[i];
    }

    public void m28555b() {
        int i = this.f24543e;
        Object[] objArr = this.f24542d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f24543e = 0;
        this.f24540b = false;
    }

    public void m28559c(long j, E e) {
        if (this.f24543e == 0 || j > this.f24541c[this.f24543e - 1]) {
            if (this.f24540b && this.f24543e >= this.f24541c.length) {
                m28549d();
            }
            int i = this.f24543e;
            if (i >= this.f24541c.length) {
                int b = la.m28317b(i + 1);
                Object obj = new long[b];
                Object obj2 = new Object[b];
                System.arraycopy(this.f24541c, 0, obj, 0, this.f24541c.length);
                System.arraycopy(this.f24542d, 0, obj2, 0, this.f24542d.length);
                this.f24541c = obj;
                this.f24542d = obj2;
            }
            this.f24541c[i] = j;
            this.f24542d[i] = e;
            this.f24543e = i + 1;
            return;
        }
        m28557b(j, e);
    }

    public String toString() {
        if (m28550a() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f24543e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f24543e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m28547c(i));
            stringBuilder.append('=');
            lc b = m28554b(i);
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
