/* compiled from: PG */
public final class dlp extends deh {
    private static volatile dlp[] a;
    private dkx b;
    private Integer c;
    private Long d;

    public static dlp[] d() {
        if (a == null) {
            synchronized (del.b) {
                if (a == null) {
                    a = new dlp[0];
                }
            }
        }
        return a;
    }

    public dlp() {
        this.c = null;
        this.d = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.b != null) {
            def.a(1, this.b);
        }
        if (this.c != null) {
            def.a(2, this.c.intValue());
        }
        if (this.d != null) {
            def.b(3, this.d.longValue());
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.b != null) {
            a += def.b(1, this.b);
        }
        if (this.c != null) {
            a += def.c(2, this.c.intValue());
        }
        if (this.d != null) {
            return a + def.e(3, this.d.longValue());
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
                    if (this.b == null) {
                        this.b = new dkx();
                    }
                    dee.a(this.b);
                    continue;
                case rk.bX /*16*/:
                    this.c = Integer.valueOf(dee.e());
                    continue;
                case rk.bP /*24*/:
                    this.d = Long.valueOf(dee.f());
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
