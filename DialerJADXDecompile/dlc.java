/* compiled from: PG */
public final class dlc extends deh {
    public dkp a;
    private dky b;

    public dlc() {
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.a(1, this.a);
        }
        if (this.b != null) {
            def.a(2, this.b);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null) {
            a += def.b(1, this.a);
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
                case rl.m /*10*/:
                    if (this.a == null) {
                        this.a = new dkp();
                    }
                    dee.a(this.a);
                    continue;
                case rk.bW /*18*/:
                    if (this.b == null) {
                        this.b = new dky();
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
