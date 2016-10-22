package defpackage;

/* compiled from: PG */
/* renamed from: ddx */
public final class ddx extends dem {
    public String a;
    public String b;
    private String c;

    public ddx() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.r = -1;
    }

    public final void a(def def) {
        if (!this.a.equals("")) {
            def.a(2, this.a);
        }
        if (!this.b.equals("")) {
            def.a(3, this.b);
        }
        if (!this.c.equals("")) {
            def.a(6, this.c);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (!this.a.equals("")) {
            a += def.b(2, this.a);
        }
        if (!this.b.equals("")) {
            a += def.b(3, this.b);
        }
        if (this.c.equals("")) {
            return a;
        }
        return a + def.b(6, this.c);
    }

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rk.bW /*18*/:
                    this.a = dee.d();
                    continue;
                case rk.k /*26*/:
                    this.b = dee.d();
                    continue;
                case 50:
                    this.c = dee.d();
                    continue;
                default:
                    if (!dep.a(dee, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
