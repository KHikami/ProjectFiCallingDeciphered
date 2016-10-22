package defpackage;

/* renamed from: iyw */
public abstract class iyw {
    public int b;
    iyw c;
    int d;

    public abstract int a(iyz iyz);

    public abstract int a(iyz iyz, int i);

    public abstract String b(iyz iyz);

    public abstract String b(iyz iyz, int i);

    protected iyw(int i) {
        this.b = i;
    }

    public int d(iyz iyz) {
        return iyz.h(this.b);
    }

    public int a(iyz iyz, String str) {
        ba.a((Object) str);
        int a = a(iyz);
        for (int i = 0; i < a; i++) {
            if (str.equals(b(iyz, i))) {
                return a(iyz, i);
            }
        }
        return 0;
    }

    public int d(iyz iyz, int i) {
        int a = a(iyz);
        for (int i2 = 0; i2 < a; i2++) {
            if (i == a(iyz, i2)) {
                return i2;
            }
        }
        return -1;
    }
}
