/* compiled from: PG */
public final class dlf extends deh {
    private static volatile dlf[] a;
    private String b;
    private String c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private int i;
    private dll[] j;
    private dkq k;
    private dle l;

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
                case rk.bP /*24*/:
                    this.d = Integer.valueOf(dee.e());
                    continue;
                case 32:
                    this.e = Integer.valueOf(dee.e());
                    continue;
                case 40:
                    this.f = Integer.valueOf(dee.e());
                    continue;
                case 48:
                    this.g = Integer.valueOf(dee.e());
                    continue;
                case 56:
                    this.h = Integer.valueOf(dee.e());
                    continue;
                case 64:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                        case rl.e /*3*/:
                        case rl.f /*4*/:
                        case rl.g /*5*/:
                        case rl.i /*6*/:
                            this.i = a;
                            break;
                        default:
                            continue;
                    }
                case 74:
                    int b = dep.b(dee, 74);
                    if (this.j == null) {
                        a = 0;
                    } else {
                        a = this.j.length;
                    }
                    Object obj = new dll[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dll();
                        dee.a(obj[a]);
                        dee.a();
                        a++;
                    }
                    obj[a] = new dll();
                    dee.a(obj[a]);
                    this.j = obj;
                    continue;
                case 82:
                    if (this.k == null) {
                        this.k = new dkq();
                    }
                    dee.a(this.k);
                    continue;
                case 90:
                    if (this.l == null) {
                        this.l = new dle();
                    }
                    dee.a(this.l);
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

    public static dlf[] d() {
        if (a == null) {
            synchronized (del.b) {
                if (a == null) {
                    a = new dlf[0];
                }
            }
        }
        return a;
    }

    public dlf() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = oe.INVALID_ID;
        this.j = dll.d();
        this.r = -1;
    }

    public final void a(def def) {
        if (this.b != null) {
            def.a(1, this.b);
        }
        if (this.c != null) {
            def.a(2, this.c);
        }
        if (this.d != null) {
            def.a(3, this.d.intValue());
        }
        if (this.e != null) {
            def.a(4, this.e.intValue());
        }
        if (this.f != null) {
            def.a(5, this.f.intValue());
        }
        if (this.g != null) {
            def.b(6, this.g.intValue());
        }
        if (this.h != null) {
            def.b(7, this.h.intValue());
        }
        if (this.i != oe.INVALID_ID) {
            def.a(8, this.i);
        }
        if (this.j != null && this.j.length > 0) {
            for (dem dem : this.j) {
                if (dem != null) {
                    def.a(9, dem);
                }
            }
        }
        if (this.k != null) {
            def.a(10, this.k);
        }
        if (this.l != null) {
            def.a(11, this.l);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.b != null) {
            a += def.b(1, this.b);
        }
        if (this.c != null) {
            a += def.b(2, this.c);
        }
        if (this.d != null) {
            a += def.c(3, this.d.intValue());
        }
        if (this.e != null) {
            a += def.c(4, this.e.intValue());
        }
        if (this.f != null) {
            a += def.c(5, this.f.intValue());
        }
        if (this.g != null) {
            a += def.d(6, this.g.intValue());
        }
        if (this.h != null) {
            a += def.d(7, this.h.intValue());
        }
        if (this.i != oe.INVALID_ID) {
            a += def.c(8, this.i);
        }
        if (this.j != null && this.j.length > 0) {
            int i = a;
            for (dem dem : this.j) {
                if (dem != null) {
                    i += def.b(9, dem);
                }
            }
            a = i;
        }
        if (this.k != null) {
            a += def.b(10, this.k);
        }
        if (this.l != null) {
            return a + def.b(11, this.l);
        }
        return a;
    }
}
