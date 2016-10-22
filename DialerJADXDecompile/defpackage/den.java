package defpackage;

/* compiled from: PG */
/* renamed from: den */
public final class den extends dem {
    public long a;
    private int b;

    public den() {
        this.a = 0;
        this.b = 0;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != 0) {
            def.b(1, this.a);
        }
        if (this.b != 0) {
            def.a(2, this.b);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != 0) {
            a += def.e(1, this.a);
        }
        if (this.b != 0) {
            return a + def.c(2, this.b);
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
                    this.a = dee.f();
                    continue;
                case rk.bX /*16*/:
                    this.b = dee.e();
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
