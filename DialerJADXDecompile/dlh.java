/* compiled from: PG */
public final class dlh extends deh {
    private static volatile dlh[] d;
    public String a;
    public Integer b;
    public Integer c;

    public static dlh[] d() {
        if (d == null) {
            synchronized (del.b) {
                if (d == null) {
                    d = new dlh[0];
                }
            }
        }
        return d;
    }

    public dlh() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.a(1, this.a);
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
            a += def.b(1, this.a);
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
                case rl.m /*10*/:
                    this.a = dee.d();
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
