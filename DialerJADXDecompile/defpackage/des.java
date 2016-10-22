package defpackage;

/* compiled from: PG */
/* renamed from: des */
public final class des extends deh {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;

    public des() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = 0;
        this.n = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (!this.a.equals("")) {
            def.a(1, this.a);
        }
        if (!this.b.equals("")) {
            def.a(2, this.b);
        }
        if (!this.c.equals("")) {
            def.a(3, this.c);
        }
        if (!this.d.equals("")) {
            def.a(4, this.d);
        }
        if (!this.e.equals("")) {
            def.a(5, this.e);
        }
        if (this.f != 0) {
            def.a(6, this.f);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (!this.a.equals("")) {
            a += def.b(1, this.a);
        }
        if (!this.b.equals("")) {
            a += def.b(2, this.b);
        }
        if (!this.c.equals("")) {
            a += def.b(3, this.c);
        }
        if (!this.d.equals("")) {
            a += def.b(4, this.d);
        }
        if (!this.e.equals("")) {
            a += def.b(5, this.e);
        }
        if (this.f != 0) {
            return a + def.c(6, this.f);
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
                    this.a = dee.d();
                    continue;
                case rk.bW /*18*/:
                    this.b = dee.d();
                    continue;
                case rk.k /*26*/:
                    this.c = dee.d();
                    continue;
                case 34:
                    this.d = dee.d();
                    continue;
                case 42:
                    this.e = dee.d();
                    continue;
                case 48:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                        case rl.e /*3*/:
                        case rl.f /*4*/:
                            this.f = a;
                            break;
                        default:
                            continue;
                    }
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
