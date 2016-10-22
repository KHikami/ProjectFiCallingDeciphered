package defpackage;

/* compiled from: PG */
/* renamed from: dbx */
public final class dbx extends deh {
    public String a;
    public String b;
    public int c;
    public String d;
    public den e;
    public int f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public int k;
    private String l;
    private boolean m;

    public dbx() {
        this.a = "";
        this.b = "";
        this.c = 0;
        this.d = "";
        this.e = null;
        this.f = 0;
        this.g = "";
        this.h = "";
        this.i = "";
        this.l = "";
        this.j = false;
        this.k = 0;
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
        if (this.c != 0) {
            def.a(3, this.c);
        }
        if (!this.d.equals("")) {
            def.a(4, this.d);
        }
        if (this.e != null) {
            def.a(5, this.e);
        }
        if (this.f != 0) {
            def.a(6, this.f);
        }
        if (!this.g.equals("")) {
            def.a(7, this.g);
        }
        if (!this.h.equals("")) {
            def.a(8, this.h);
        }
        if (!this.i.equals("")) {
            def.a(9, this.i);
        }
        if (!this.l.equals("")) {
            def.a(10, this.l);
        }
        if (this.j) {
            def.a(11, this.j);
        }
        if (this.k != 0) {
            def.a(12, this.k);
        }
        if (this.m) {
            def.a(13, this.m);
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
        if (this.c != 0) {
            a += def.c(3, this.c);
        }
        if (!this.d.equals("")) {
            a += def.b(4, this.d);
        }
        if (this.e != null) {
            a += def.b(5, this.e);
        }
        if (this.f != 0) {
            a += def.c(6, this.f);
        }
        if (!this.g.equals("")) {
            a += def.b(7, this.g);
        }
        if (!this.h.equals("")) {
            a += def.b(8, this.h);
        }
        if (!this.i.equals("")) {
            a += def.b(9, this.i);
        }
        if (!this.l.equals("")) {
            a += def.b(10, this.l);
        }
        if (this.j) {
            boolean z = this.j;
            a += def.b(11) + 1;
        }
        if (this.k != 0) {
            a += def.c(12, this.k);
        }
        if (!this.m) {
            return a;
        }
        z = this.m;
        return a + (def.b(13) + 1);
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
                case rk.bP /*24*/:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                            this.c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.d = dee.d();
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new den();
                    }
                    dee.a(this.e);
                    continue;
                case 48:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                        case rl.e /*3*/:
                            this.f = a;
                            break;
                        default:
                            continue;
                    }
                case 58:
                    this.g = dee.d();
                    continue;
                case 66:
                    this.h = dee.d();
                    continue;
                case 74:
                    this.i = dee.d();
                    continue;
                case 82:
                    this.l = dee.d();
                    continue;
                case 88:
                    this.j = dee.c();
                    continue;
                case 96:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                            this.k = a;
                            break;
                        default:
                            continue;
                    }
                case 104:
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
