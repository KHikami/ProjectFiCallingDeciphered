/* compiled from: PG */
public final class dkv extends deh {
    public Boolean a;

    public dkv() {
        this.a = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.a(1, this.a.booleanValue());
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a == null) {
            return a;
        }
        this.a.booleanValue();
        return a + (def.b(1) + 1);
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
