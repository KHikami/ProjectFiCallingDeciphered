/* compiled from: PG */
public final class dld extends deh {
    public dlc a;
    public dlk b;
    public int c;
    public dkv d;

    public dld() {
        this.c = oe.INVALID_ID;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.a(1, this.a);
        }
        if (this.b != null) {
            def.a(2, this.b);
        }
        if (this.c != oe.INVALID_ID) {
            def.a(3, this.c);
        }
        if (this.d != null) {
            def.a(4, this.d);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null) {
            a += def.b(1, this.a);
        }
        if (this.b != null) {
            a += def.b(2, this.b);
        }
        if (this.c != oe.INVALID_ID) {
            a += def.c(3, this.c);
        }
        if (this.d != null) {
            return a + def.b(4, this.d);
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
                        this.a = new dlc();
                    }
                    dee.a(this.a);
                    continue;
                case rk.bW /*18*/:
                    if (this.b == null) {
                        this.b = new dlk();
                    }
                    dee.a(this.b);
                    continue;
                case rk.bP /*24*/:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                        case rl.e /*3*/:
                        case rl.f /*4*/:
                        case rl.g /*5*/:
                            this.c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.d == null) {
                        this.d = new dkv();
                    }
                    dee.a(this.d);
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
