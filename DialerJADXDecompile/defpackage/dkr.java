package defpackage;

/* compiled from: PG */
/* renamed from: dkr */
public final class dkr extends deh {
    public String a;
    public String b;
    public int c;

    public dkr() {
        this.a = null;
        this.b = null;
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
            return a + def.c(3, this.c);
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
                case rk.bW /*18*/:
                    this.b = dee.d();
                    continue;
                case rk.bP /*24*/:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                            this.c = a;
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
