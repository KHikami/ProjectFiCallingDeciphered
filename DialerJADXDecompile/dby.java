/* compiled from: PG */
public final class dby extends deh {
    public dbx a;

    public dby() {
        this.a = null;
        this.n = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.a(1, this.a);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null) {
            return a + def.b(1, this.a);
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
                        this.a = new dbx();
                    }
                    dee.a(this.a);
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
