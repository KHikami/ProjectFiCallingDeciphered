package defpackage;

/* compiled from: PG */
/* renamed from: dev */
public final class dev extends deh {
    public int a;
    private int b;

    public dev() {
        this.b = 0;
        this.a = 0;
        this.n = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.b != 0) {
            def.a(1, this.b);
        }
        if (this.a != 0) {
            def.a(2, this.a);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.b != 0) {
            a += def.c(1, this.b);
        }
        if (this.a != 0) {
            return a + def.c(2, this.a);
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
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rk.bY /*15*/:
                        case rk.bX /*16*/:
                        case rk.bZ /*17*/:
                        case rk.bW /*18*/:
                        case rk.m /*19*/:
                        case rk.h /*20*/:
                        case rk.g /*21*/:
                        case rk.bE /*22*/:
                        case rk.bD /*23*/:
                        case rk.bP /*24*/:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case rk.bX /*16*/:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rk.bY /*15*/:
                        case rk.bX /*16*/:
                        case rk.bZ /*17*/:
                        case rk.bW /*18*/:
                        case rk.m /*19*/:
                        case rk.h /*20*/:
                        case rk.g /*21*/:
                        case rk.bE /*22*/:
                        case rk.bD /*23*/:
                        case rk.bP /*24*/:
                            this.a = a;
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
