package defpackage;

/* compiled from: PG */
/* renamed from: det */
public final class det extends deh {
    public deq a;
    public dew b;
    public dev c;
    public deu d;

    public det() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.n = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.a(1, this.a);
        }
        if (this.b != null) {
            def.a(2, this.b);
        }
        if (this.c != null) {
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
        if (this.c != null) {
            a += def.b(3, this.c);
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
                        this.a = new deq();
                    }
                    dee.a(this.a);
                    continue;
                case rk.bW /*18*/:
                    if (this.b == null) {
                        this.b = new dew();
                    }
                    dee.a(this.b);
                    continue;
                case rk.k /*26*/:
                    if (this.c == null) {
                        this.c = new dev();
                    }
                    dee.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new deu();
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
