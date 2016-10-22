/* compiled from: PG */
public final class hz implements Cloneable {
    public static final Object a;
    public boolean b;
    public long[] c;
    public Object[] d;
    public int e;

    public final /* synthetic */ Object clone() {
        return b();
    }

    static {
        a = new Object();
    }

    public hz() {
        this(10);
    }

    private hz(int i) {
        this.b = false;
        int b = hx.b(10);
        this.c = new long[b];
        this.d = new Object[b];
        this.e = 0;
    }

    private hz b() {
        try {
            hz hzVar = (hz) super.clone();
            try {
                hzVar.c = (long[]) this.c.clone();
                hzVar.d = (Object[]) this.d.clone();
                return hzVar;
            } catch (CloneNotSupportedException e) {
                return hzVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    private final void c() {
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

    public final void a(long j, Object obj) {
        int a = hx.a(this.c, this.e, j);
        if (a >= 0) {
            this.d[a] = obj;
            return;
        }
        a ^= -1;
        if (a >= this.e || this.d[a] != a) {
            if (this.b && this.e >= this.c.length) {
                c();
                a = hx.a(this.c, this.e, j) ^ -1;
            }
            if (this.e >= this.c.length) {
                int b = hx.b(this.e + 1);
                Object obj2 = new long[b];
                Object obj3 = new Object[b];
                System.arraycopy(this.c, 0, obj2, 0, this.c.length);
                System.arraycopy(this.d, 0, obj3, 0, this.d.length);
                this.c = obj2;
                this.d = obj3;
            }
            if (this.e - a != 0) {
                System.arraycopy(this.c, a, this.c, a + 1, this.e - a);
                System.arraycopy(this.d, a, this.d, a + 1, this.e - a);
            }
            this.c[a] = j;
            this.d[a] = obj;
            this.e++;
            return;
        }
        this.c[a] = j;
        this.d[a] = obj;
    }

    public final int a() {
        if (this.b) {
            c();
        }
        return this.e;
    }

    private long b(int i) {
        if (this.b) {
            c();
        }
        return this.c[i];
    }

    public final Object a(int i) {
        if (this.b) {
            c();
        }
        return this.d[i];
    }

    public final String toString() {
        if (a() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(b(i));
            stringBuilder.append('=');
            hz a = a(i);
            if (a != this) {
                stringBuilder.append(a);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final Object a(long j) {
        int a = hx.a(this.c, this.e, j);
        if (a < 0 || this.d[a] == a) {
            return null;
        }
        return this.d[a];
    }
}
