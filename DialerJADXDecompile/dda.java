/* compiled from: PG */
public final class dda extends dem {
    public long a;
    public ddb b;
    public String[] c;
    private long d;

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rl.j /*8*/:
                    this.a = dee.f();
                    continue;
                case rk.bX /*16*/:
                    this.d = dee.f();
                    continue;
                case rk.k /*26*/:
                    if (this.b == null) {
                        this.b = new ddb();
                    }
                    dee.a(this.b);
                    continue;
                case 34:
                    int b = dep.b(dee, 34);
                    a = this.c == null ? 0 : this.c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = dee.d();
                        dee.a();
                        a++;
                    }
                    obj[a] = dee.d();
                    this.c = obj;
                    continue;
                default:
                    if (!dee.a(a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public dda() {
        this.a = 0;
        this.d = 0;
        this.b = null;
        this.c = dep.b;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != 0) {
            def.a(1, this.a);
        }
        if (this.d != 0) {
            def.a(2, this.d);
        }
        if (this.b != null) {
            def.a(3, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (String str : this.c) {
                if (str != null) {
                    def.a(4, str);
                }
            }
        }
        super.a(def);
    }

    protected final int a() {
        int i = 0;
        int a = super.a();
        if (this.a != 0) {
            a += def.d(1, this.a);
        }
        if (this.d != 0) {
            a += def.d(2, this.d);
        }
        if (this.b != null) {
            a += def.b(3, this.b);
        }
        if (this.c == null || this.c.length <= 0) {
            return a;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.c.length) {
            String str = this.c[i];
            if (str != null) {
                i3++;
                i2 += def.a(str);
            }
            i++;
        }
        return (a + i2) + (i3 * 1);
    }
}
