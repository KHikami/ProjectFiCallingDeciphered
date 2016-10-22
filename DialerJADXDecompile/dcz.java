/* compiled from: PG */
public final class dcz extends dem {
    public String a;
    public long b;
    public long c;
    public String[] d;
    public String e;
    private String f;
    private long g;

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rl.m /*10*/:
                    this.a = dee.d();
                    continue;
                case rk.bW /*18*/:
                    this.f = dee.d();
                    continue;
                case rk.bP /*24*/:
                    this.b = dee.f();
                    continue;
                case 32:
                    this.g = dee.f();
                    continue;
                case 40:
                    this.c = dee.f();
                    continue;
                case 50:
                    int b = dep.b(dee, 50);
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
                case 58:
                    this.e = dee.d();
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

    public dcz() {
        this.a = "";
        this.f = "";
        this.b = 0;
        this.g = 0;
        this.c = 0;
        this.d = dep.b;
        this.e = "";
        this.r = -1;
    }

    public final void a(def def) {
        if (!this.a.equals("")) {
            def.a(1, this.a);
        }
        if (!this.f.equals("")) {
            def.a(2, this.f);
        }
        if (this.b != 0) {
            def.a(3, this.b);
        }
        if (this.g != 0) {
            def.a(4, this.g);
        }
        if (this.c != 0) {
            def.a(5, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (String str : this.d) {
                if (str != null) {
                    def.a(6, str);
                }
            }
        }
        if (!this.e.equals("")) {
            def.a(7, this.e);
        }
        super.a(def);
    }

    protected final int a() {
        int i = 0;
        int a = super.a();
        if (!this.a.equals("")) {
            a += def.b(1, this.a);
        }
        if (!this.f.equals("")) {
            a += def.b(2, this.f);
        }
        if (this.b != 0) {
            a += def.d(3, this.b);
        }
        if (this.g != 0) {
            a += def.d(4, this.g);
        }
        if (this.c != 0) {
            a += def.d(5, this.c);
        }
        if (this.d != null && this.d.length > 0) {
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
            a = (a + i2) + (i3 * 1);
        }
        if (this.e.equals("")) {
            return a;
        }
        return a + def.b(7, this.e);
    }
}
