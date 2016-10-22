/* compiled from: PG */
public final class dli extends deh {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    private String i;

    public dli() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.b(1, this.a.longValue());
        }
        if (this.b != null) {
            def.b(2, this.b.longValue());
        }
        if (this.c != null) {
            def.b(3, this.c.longValue());
        }
        if (this.d != null) {
            def.b(4, this.d.longValue());
        }
        if (this.e != null) {
            def.b(5, this.e.longValue());
        }
        if (this.f != null) {
            def.b(6, this.f.longValue());
        }
        if (this.g != null) {
            def.b(7, this.g.longValue());
        }
        if (this.h != null) {
            def.b(8, this.h.longValue());
        }
        if (this.i != null) {
            def.a(9, this.i);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null) {
            a += def.e(1, this.a.longValue());
        }
        if (this.b != null) {
            a += def.e(2, this.b.longValue());
        }
        if (this.c != null) {
            a += def.e(3, this.c.longValue());
        }
        if (this.d != null) {
            a += def.e(4, this.d.longValue());
        }
        if (this.e != null) {
            a += def.e(5, this.e.longValue());
        }
        if (this.f != null) {
            a += def.e(6, this.f.longValue());
        }
        if (this.g != null) {
            a += def.e(7, this.g.longValue());
        }
        if (this.h != null) {
            a += def.e(8, this.h.longValue());
        }
        if (this.i != null) {
            return a + def.b(9, this.i);
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
                    this.a = Long.valueOf(dee.f());
                    continue;
                case rk.bX /*16*/:
                    this.b = Long.valueOf(dee.f());
                    continue;
                case rk.bP /*24*/:
                    this.c = Long.valueOf(dee.f());
                    continue;
                case 32:
                    this.d = Long.valueOf(dee.f());
                    continue;
                case 40:
                    this.e = Long.valueOf(dee.f());
                    continue;
                case 48:
                    this.f = Long.valueOf(dee.f());
                    continue;
                case 56:
                    this.g = Long.valueOf(dee.f());
                    continue;
                case 64:
                    this.h = Long.valueOf(dee.f());
                    continue;
                case 74:
                    this.i = dee.d();
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
