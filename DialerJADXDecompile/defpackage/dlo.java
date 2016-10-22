package defpackage;

/* compiled from: PG */
/* renamed from: dlo */
public final class dlo extends deh {
    public Long a;

    public dlo() {
        this.a = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.b(1, this.a.longValue());
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null) {
            return a + def.e(1, this.a.longValue());
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
