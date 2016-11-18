package p000;

public abstract class iyw {
    public int f19415b;
    iyw f19416c;
    int f19417d;

    public abstract int mo3419a(iyz iyz);

    public abstract int mo3420a(iyz iyz, int i);

    public abstract String mo3421b(iyz iyz);

    public abstract String mo3422b(iyz iyz, int i);

    protected iyw(int i) {
        this.f19415b = i;
    }

    public int m23513d(iyz iyz) {
        return iyz.m23547h(this.f19415b);
    }

    public int m23510a(iyz iyz, String str) {
        ba.m4536a((Object) str);
        int a = mo3419a(iyz);
        for (int i = 0; i < a; i++) {
            if (str.equals(mo3422b(iyz, i))) {
                return mo3420a(iyz, i);
            }
        }
        return 0;
    }

    public int m23514d(iyz iyz, int i) {
        int a = mo3419a(iyz);
        for (int i2 = 0; i2 < a; i2++) {
            if (i == mo3420a(iyz, i2)) {
                return i2;
            }
        }
        return -1;
    }
}
