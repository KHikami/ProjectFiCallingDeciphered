/* compiled from: PG */
public final class der extends deh {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;

    public der() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.n = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != 0) {
            def.b(1, this.a);
        }
        if (this.b != 0) {
            def.b(2, this.b);
        }
        if (this.c != 0) {
            def.b(3, this.c);
        }
        if (this.d != 0) {
            def.b(4, this.d);
        }
        if (this.e != 0) {
            def.b(5, this.e);
        }
        if (this.f != 0) {
            def.b(6, this.f);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != 0) {
            a += def.e(1, this.a);
        }
        if (this.b != 0) {
            a += def.e(2, this.b);
        }
        if (this.c != 0) {
            a += def.e(3, this.c);
        }
        if (this.d != 0) {
            a += def.e(4, this.d);
        }
        if (this.e != 0) {
            a += def.e(5, this.e);
        }
        if (this.f != 0) {
            return a + def.e(6, this.f);
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
                    this.a = dee.f();
                    continue;
                case rk.bX /*16*/:
                    this.b = dee.f();
                    continue;
                case rk.bP /*24*/:
                    this.c = dee.f();
                    continue;
                case 32:
                    this.d = dee.f();
                    continue;
                case 40:
                    this.e = dee.f();
                    continue;
                case 48:
                    this.f = dee.f();
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
