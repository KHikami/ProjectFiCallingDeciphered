package defpackage;

/* compiled from: PG */
/* renamed from: dew */
public final class dew extends deh {
    public int a;
    private int b;

    public dew() {
        this.b = 0;
        this.a = 0;
        this.n = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.b != 0) {
            def.a(1, this.b);
        }
        if (this.a != 0) {
            def.a(2, this.a);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.b != 0) {
            a += def.c(1, this.b);
        }
        if (this.a != 0) {
            return a + def.c(2, this.a);
        }
        return a;
    }

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rl.j /*8*/:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                        case rl.e /*3*/:
                        case rl.f /*4*/:
                        case rl.g /*5*/:
                        case rl.i /*6*/:
                        case rl.h /*7*/:
                        case rl.j /*8*/:
                        case rl.l /*9*/:
                        case rl.m /*10*/:
                        case rl.n /*11*/:
                        case rl.k /*12*/:
                        case rk.i /*13*/:
                        case rk.bV /*14*/:
                        case rk.bY /*15*/:
                        case rk.bX /*16*/:
                        case rk.bZ /*17*/:
                        case rk.bW /*18*/:
                        case rk.m /*19*/:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case rk.bX /*16*/:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                        case rl.e /*3*/:
                        case rl.f /*4*/:
                        case rl.g /*5*/:
                        case rl.i /*6*/:
                        case rl.h /*7*/:
                        case rl.j /*8*/:
                        case rl.l /*9*/:
                        case rl.m /*10*/:
                        case rl.n /*11*/:
                        case rl.k /*12*/:
                        case rk.i /*13*/:
                        case rk.bV /*14*/:
                        case rk.bY /*15*/:
                        case rk.bX /*16*/:
                        case rk.bZ /*17*/:
                        case rk.bW /*18*/:
                        case rk.m /*19*/:
                            this.a = a;
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
