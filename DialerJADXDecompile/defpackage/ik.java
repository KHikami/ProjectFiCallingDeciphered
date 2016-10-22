package defpackage;

/* compiled from: PG */
/* renamed from: ik */
public final class ik implements Cloneable {
    public static final Object a;
    public boolean b;
    public int[] c;
    public Object[] d;
    public int e;

    public final /* synthetic */ Object clone() {
        return d();
    }

    static {
        a = new Object();
    }

    public ik() {
        this(10);
    }

    public ik(int i) {
        this.b = false;
        if (i == 0) {
            this.c = hx.a;
            this.d = hx.c;
        } else {
            int a = hx.a(i);
            this.c = new int[a];
            this.d = new Object[a];
        }
        this.e = 0;
    }

    private ik d() {
        try {
            ik ikVar = (ik) super.clone();
            try {
                ikVar.c = (int[]) this.c.clone();
                ikVar.d = (Object[]) this.d.clone();
                return ikVar;
            } catch (CloneNotSupportedException e) {
                return ikVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public final void a() {
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

    public final void a(int i, Object obj) {
        int a = hx.a(this.c, this.e, i);
        if (a >= 0) {
            this.d[a] = obj;
            return;
        }
        a ^= -1;
        if (a >= this.e || this.d[a] != a) {
            if (this.b && this.e >= this.c.length) {
                a();
                a = hx.a(this.c, this.e, i) ^ -1;
            }
            if (this.e >= this.c.length) {
                int a2 = hx.a(this.e + 1);
                Object obj2 = new int[a2];
                Object obj3 = new Object[a2];
                System.arraycopy(this.c, 0, obj2, 0, this.c.length);
                System.arraycopy(this.d, 0, obj3, 0, this.d.length);
                this.c = obj2;
                this.d = obj3;
            }
            if (this.e - a != 0) {
                System.arraycopy(this.c, a, this.c, a + 1, this.e - a);
                System.arraycopy(this.d, a, this.d, a + 1, this.e - a);
            }
            this.c[a] = i;
            this.d[a] = obj;
            this.e++;
            return;
        }
        this.c[a] = i;
        this.d[a] = obj;
    }

    public final int b() {
        if (this.b) {
            a();
        }
        return this.e;
    }

    public final int b(int i) {
        if (this.b) {
            a();
        }
        return this.c[i];
    }

    public final Object c(int i) {
        if (this.b) {
            a();
        }
        return this.d[i];
    }

    public final int a(Object obj) {
        if (this.b) {
            a();
        }
        for (int i = 0; i < this.e; i++) {
            if (this.d[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public final void c() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public final String toString() {
        if (b() <= 0) {
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
            ik c = c(i);
            if (c != this) {
                stringBuilder.append(c);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final Object a(int i) {
        int a = hx.a(this.c, this.e, i);
        if (a < 0 || this.d[a] == a) {
            return null;
        }
        return this.d[a];
    }
}
