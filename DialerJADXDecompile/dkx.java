/* compiled from: PG */
public final class dkx extends deh {
    private Long a;
    private String b;

    public dkx() {
        this.a = null;
        this.b = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.c(1, this.a.longValue());
        }
        if (this.b != null) {
            def.a(2, this.b);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null) {
            this.a.longValue();
            a += def.b(1) + 8;
        }
        if (this.b != null) {
            return a + def.b(2, this.b);
        }
        return a;
    }

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rl.l /*9*/:
                    this.a = Long.valueOf(dee.h());
                    continue;
                case rk.bW /*18*/:
                    this.b = dee.d();
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
