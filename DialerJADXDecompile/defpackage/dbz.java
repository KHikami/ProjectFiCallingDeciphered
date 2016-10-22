package defpackage;

/* compiled from: PG */
/* renamed from: dbz */
public final class dbz extends deh {
    public String a;
    public String b;
    public String c;
    public long d;
    public int e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    private int o;

    public dbz() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = "";
        this.g = "";
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.o = 0;
        this.l = 0;
        this.m = false;
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
        if (this.d != 0) {
            def.b(4, this.d);
        }
        if (this.e != 0) {
            def.a(5, this.e);
        }
        if (!this.f.equals("")) {
            def.a(6, this.f);
        }
        if (!this.g.equals("")) {
            def.a(7, this.g);
        }
        if (this.h) {
            def.a(8, this.h);
        }
        if (this.i) {
            def.a(9, this.i);
        }
        if (this.j) {
            def.a(10, this.j);
        }
        if (this.k) {
            def.a(11, this.k);
        }
        if (this.o != 0) {
            def.a(12, this.o);
        }
        if (this.l != 0) {
            def.a(15, this.l);
        }
        if (this.m) {
            def.a(16, this.m);
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
        if (this.d != 0) {
            a += def.e(4, this.d);
        }
        if (this.e != 0) {
            a += def.c(5, this.e);
        }
        if (!this.f.equals("")) {
            a += def.b(6, this.f);
        }
        if (!this.g.equals("")) {
            a += def.b(7, this.g);
        }
        if (this.h) {
            boolean z = this.h;
            a += def.b(8) + 1;
        }
        if (this.i) {
            z = this.i;
            a += def.b(9) + 1;
        }
        if (this.j) {
            z = this.j;
            a += def.b(10) + 1;
        }
        if (this.k) {
            z = this.k;
            a += def.b(11) + 1;
        }
        if (this.o != 0) {
            a += def.c(12, this.o);
        }
        if (this.l != 0) {
            a += def.c(15, this.l);
        }
        if (!this.m) {
            return a;
        }
        z = this.m;
        return a + (def.b(16) + 1);
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
                case 32:
                    this.d = dee.f();
                    continue;
                case 40:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                        case rl.e /*3*/:
                        case rl.f /*4*/:
                        case rl.g /*5*/:
                            this.e = a;
                            break;
                        default:
                            continue;
                    }
                case 50:
                    this.f = dee.d();
                    continue;
                case 58:
                    this.g = dee.d();
                    continue;
                case 64:
                    this.h = dee.c();
                    continue;
                case 72:
                    this.i = dee.c();
                    continue;
                case 80:
                    this.j = dee.c();
                    continue;
                case 88:
                    this.k = dee.c();
                    continue;
                case 96:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                        case rl.e /*3*/:
                            this.o = a;
                            break;
                        default:
                            continue;
                    }
                case 120:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                        case rl.e /*3*/:
                        case rl.f /*4*/:
                            this.l = a;
                            break;
                        default:
                            continue;
                    }
                case 128:
                    this.m = dee.c();
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
