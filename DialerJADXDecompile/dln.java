/* compiled from: PG */
public final class dln extends deh {
    public dld a;
    public Long b;
    public String c;
    public dlo d;
    public dkr e;
    public dku f;
    public dlj g;
    public dli h;
    public dlb i;
    private dlg j;
    private dkt k;
    private dkw l;
    private dla m;

    public dln() {
        this.b = null;
        this.c = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.a(1, this.a);
        }
        if (this.b != null) {
            def.c(2, this.b.longValue());
        }
        if (this.c != null) {
            def.a(3, this.c);
        }
        if (this.d != null) {
            def.a(4, this.d);
        }
        if (this.e != null) {
            def.a(5, this.e);
        }
        if (this.j != null) {
            def.a(6, this.j);
        }
        if (this.f != null) {
            def.a(7, this.f);
        }
        if (this.g != null) {
            def.a(8, this.g);
        }
        if (this.h != null) {
            def.a(9, this.h);
        }
        if (this.k != null) {
            def.a(10, this.k);
        }
        if (this.l != null) {
            def.a(11, this.l);
        }
        if (this.m != null) {
            def.a(12, this.m);
        }
        if (this.i != null) {
            def.a(13, this.i);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null) {
            a += def.b(1, this.a);
        }
        if (this.b != null) {
            this.b.longValue();
            a += def.b(2) + 8;
        }
        if (this.c != null) {
            a += def.b(3, this.c);
        }
        if (this.d != null) {
            a += def.b(4, this.d);
        }
        if (this.e != null) {
            a += def.b(5, this.e);
        }
        if (this.j != null) {
            a += def.b(6, this.j);
        }
        if (this.f != null) {
            a += def.b(7, this.f);
        }
        if (this.g != null) {
            a += def.b(8, this.g);
        }
        if (this.h != null) {
            a += def.b(9, this.h);
        }
        if (this.k != null) {
            a += def.b(10, this.k);
        }
        if (this.l != null) {
            a += def.b(11, this.l);
        }
        if (this.m != null) {
            a += def.b(12, this.m);
        }
        if (this.i != null) {
            return a + def.b(13, this.i);
        }
        return a;
    }

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rl.m /*10*/:
                    if (this.a == null) {
                        this.a = new dld();
                    }
                    dee.a(this.a);
                    continue;
                case rk.bZ /*17*/:
                    this.b = Long.valueOf(dee.h());
                    continue;
                case rk.k /*26*/:
                    this.c = dee.d();
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new dlo();
                    }
                    dee.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new dkr();
                    }
                    dee.a(this.e);
                    continue;
                case 50:
                    if (this.j == null) {
                        this.j = new dlg();
                    }
                    dee.a(this.j);
                    continue;
                case 58:
                    if (this.f == null) {
                        this.f = new dku();
                    }
                    dee.a(this.f);
                    continue;
                case 66:
                    if (this.g == null) {
                        this.g = new dlj();
                    }
                    dee.a(this.g);
                    continue;
                case 74:
                    if (this.h == null) {
                        this.h = new dli();
                    }
                    dee.a(this.h);
                    continue;
                case 82:
                    if (this.k == null) {
                        this.k = new dkt();
                    }
                    dee.a(this.k);
                    continue;
                case 90:
                    if (this.l == null) {
                        this.l = new dkw();
                    }
                    dee.a(this.l);
                    continue;
                case 98:
                    if (this.m == null) {
                        this.m = new dla();
                    }
                    dee.a(this.m);
                    continue;
                case 106:
                    if (this.i == null) {
                        this.i = new dlb();
                    }
                    dee.a(this.i);
                    continue;
                default:
                    if (!super.a(dee, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
