package defpackage;

/* compiled from: PG */
/* renamed from: dku */
public final class dku extends deh {
    public Boolean a;
    public dlk b;

    public dku() {
        this.a = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            def.a(2, this.b);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null) {
            this.a.booleanValue();
            a += def.b(1) + 1;
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
                case rl.j /*8*/:
                    this.a = Boolean.valueOf(dee.c());
                    continue;
                case rk.bW /*18*/:
                    if (this.b == null) {
                        this.b = new dlk();
                    }
                    dee.a(this.b);
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
