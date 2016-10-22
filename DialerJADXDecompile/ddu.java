/* compiled from: PG */
public final class ddu extends dem {
    private static volatile ddu[] a;
    private String b;
    private String c;
    private String[] d;
    private String e;
    private boolean f;
    private String g;

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rl.m /*10*/:
                    this.b = dee.d();
                    continue;
                case rk.bW /*18*/:
                    this.c = dee.d();
                    continue;
                case rk.k /*26*/:
                    int b = dep.b(dee, 26);
                    a = this.d == null ? 0 : this.d.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = dee.d();
                        dee.a();
                        a++;
                    }
                    obj[a] = dee.d();
                    this.d = obj;
                    continue;
                case 34:
                    this.e = dee.d();
                    continue;
                case 42:
                    this.g = dee.d();
                    continue;
                case 48:
                    this.f = dee.c();
                    continue;
                default:
                    if (!dep.a(dee, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public static ddu[] l_() {
        if (a == null) {
            synchronized (del.b) {
                if (a == null) {
                    a = new ddu[0];
                }
            }
        }
        return a;
    }

    public ddu() {
        this.b = "";
        this.c = "";
        this.d = dep.b;
        this.e = "";
        this.f = false;
        this.g = "";
        this.r = -1;
    }

    public final void a(def def) {
        def.a(1, this.b);
        def.a(2, this.c);
        if (this.d != null && this.d.length > 0) {
            for (String str : this.d) {
                if (str != null) {
                    def.a(3, str);
                }
            }
        }
        if (!this.e.equals("")) {
            def.a(4, this.e);
        }
        if (!this.g.equals("")) {
            def.a(5, this.g);
        }
        if (this.f) {
            def.a(6, this.f);
        }
        super.a(def);
    }

    protected final int a() {
        int i = 0;
        int a = (super.a() + def.b(1, this.b)) + def.b(2, this.c);
        if (this.d == null || this.d.length <= 0) {
            i = a;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.d.length) {
                String str = this.d[i];
                if (str != null) {
                    i3++;
                    i2 += def.a(str);
                }
                i++;
            }
            i = (a + i2) + (i3 * 1);
        }
        if (!this.e.equals("")) {
            i += def.b(4, this.e);
        }
        if (!this.g.equals("")) {
            i += def.b(5, this.g);
        }
        if (this.f) {
            return i + def.b(6, this.f);
        }
        return i;
    }
}
