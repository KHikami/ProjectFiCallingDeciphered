/* compiled from: PG */
public final class dlj extends deh {
    public int a;
    public Integer b;

    public dlj() {
        this.a = oe.INVALID_ID;
        this.b = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != oe.INVALID_ID) {
            def.a(1, this.a);
        }
        if (this.b != null) {
            def.a(2, this.b.intValue());
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != oe.INVALID_ID) {
            a += def.c(1, this.a);
        }
        if (this.b != null) {
            return a + def.c(2, this.b.intValue());
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
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case rk.bX /*16*/:
                    this.b = Integer.valueOf(dee.e());
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
