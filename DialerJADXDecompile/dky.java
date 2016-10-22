/* compiled from: PG */
public final class dky extends deh {
    private Integer a;
    private Integer b;
    private Integer c;

    public dky() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.a(1, this.a.intValue());
        }
        if (this.b != null) {
            def.a(2, this.b.intValue());
        }
        if (this.c != null) {
            def.a(3, this.c.intValue());
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null) {
            a += def.c(1, this.a.intValue());
        }
        if (this.b != null) {
            a += def.c(2, this.b.intValue());
        }
        if (this.c != null) {
            return a + def.c(3, this.c.intValue());
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
                    this.a = Integer.valueOf(dee.e());
                    continue;
                case rk.bX /*16*/:
                    this.b = Integer.valueOf(dee.e());
                    continue;
                case rk.bP /*24*/:
                    this.c = Integer.valueOf(dee.e());
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
