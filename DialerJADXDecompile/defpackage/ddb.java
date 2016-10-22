package defpackage;

/* compiled from: PG */
/* renamed from: ddb */
public final class ddb extends dem {
    public dcx a;
    public dcy b;

    public ddb() {
        this.a = null;
        this.b = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.a(3, this.a);
        }
        if (this.b != null) {
            def.a(4, this.b);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null) {
            a += def.b(3, this.a);
        }
        if (this.b != null) {
            return a + def.b(4, this.b);
        }
        return a;
    }

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rk.k /*26*/:
                    if (this.a == null) {
                        this.a = new dcx();
                    }
                    dee.a(this.a);
                    continue;
                case 34:
                    if (this.b == null) {
                        this.b = new dcy();
                    }
                    dee.a(this.b);
                    continue;
                default:
                    if (!dee.a(a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
