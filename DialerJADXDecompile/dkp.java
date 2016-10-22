/* compiled from: PG */
public final class dkp extends deh {
    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;

    public dkp() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            def.a(1, this.a.intValue());
        }
        if (this.b != null) {
            def.a(2, this.b.intValue());
        }
        if (this.c != null) {
            def.a(3, this.c.intValue());
        }
        if (this.d != null) {
            def.a(4, this.d.intValue());
        }
        if (this.e != null) {
            def.a(5, this.e.intValue());
        }
        if (this.f != null) {
            def.a(6, this.f.intValue());
        }
        if (this.g != null) {
            def.a(7, this.g.intValue());
        }
        if (this.h != null) {
            def.a(8, this.h.intValue());
        }
        if (this.i != null) {
            def.a(9, this.i.intValue());
        }
        if (this.j != null) {
            def.a(10, this.j.intValue());
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null) {
            a += def.c(1, this.a.intValue());
        }
        if (this.b != null) {
            a += def.c(2, this.b.intValue());
        }
        if (this.c != null) {
            a += def.c(3, this.c.intValue());
        }
        if (this.d != null) {
            a += def.c(4, this.d.intValue());
        }
        if (this.e != null) {
            a += def.c(5, this.e.intValue());
        }
        if (this.f != null) {
            a += def.c(6, this.f.intValue());
        }
        if (this.g != null) {
            a += def.c(7, this.g.intValue());
        }
        if (this.h != null) {
            a += def.c(8, this.h.intValue());
        }
        if (this.i != null) {
            a += def.c(9, this.i.intValue());
        }
        if (this.j != null) {
            return a + def.c(10, this.j.intValue());
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
                    this.a = Integer.valueOf(dee.e());
                    continue;
                case rk.bX /*16*/:
                    this.b = Integer.valueOf(dee.e());
                    continue;
                case rk.bP /*24*/:
                    this.c = Integer.valueOf(dee.e());
                    continue;
                case 32:
                    this.d = Integer.valueOf(dee.e());
                    continue;
                case 40:
                    this.e = Integer.valueOf(dee.e());
                    continue;
                case 48:
                    this.f = Integer.valueOf(dee.e());
                    continue;
                case 56:
                    this.g = Integer.valueOf(dee.e());
                    continue;
                case 64:
                    this.h = Integer.valueOf(dee.e());
                    continue;
                case 72:
                    this.i = Integer.valueOf(dee.e());
                    continue;
                case 80:
                    this.j = Integer.valueOf(dee.e());
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
