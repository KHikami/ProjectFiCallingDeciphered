/* compiled from: PG */
public final class dle extends deh {
    private int a;

    public dle() {
        this.a = oe.INVALID_ID;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != oe.INVALID_ID) {
            def.a(1, this.a);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != oe.INVALID_ID) {
            return a + def.c(1, this.a);
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
                        case oe.HOST_ID /*-1*/:
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
