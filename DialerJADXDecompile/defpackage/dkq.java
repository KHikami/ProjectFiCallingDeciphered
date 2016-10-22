package defpackage;

/* compiled from: PG */
/* renamed from: dkq */
public final class dkq extends deh {
    public Long a;
    public Boolean b;
    public Integer c;
    public String d;

    public dkq() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.b(1, this.a.longValue());
        }
        if (this.b != null) {
            def.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            def.a(3, this.c.intValue());
        }
        if (this.d != null) {
            def.a(4, this.d);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null) {
            a += def.e(1, this.a.longValue());
        }
        if (this.b != null) {
            this.b.booleanValue();
            a += def.b(2) + 1;
        }
        if (this.c != null) {
            a += def.c(3, this.c.intValue());
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
                case rl.j /*8*/:
                    this.a = Long.valueOf(dee.f());
                    continue;
                case rk.bX /*16*/:
                    this.b = Boolean.valueOf(dee.c());
                    continue;
                case rk.bP /*24*/:
                    this.c = Integer.valueOf(dee.e());
                    continue;
                case 34:
                    this.d = dee.d();
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
