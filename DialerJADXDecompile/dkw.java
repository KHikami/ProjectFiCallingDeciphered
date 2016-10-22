/* compiled from: PG */
public final class dkw extends deh {
    private Float a;
    private Integer b;
    private Integer c;

    public dkw() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null) {
            float floatValue = this.a.floatValue();
            def.e(1, 5);
            int floatToIntBits = Float.floatToIntBits(floatValue);
            if (def.a.remaining() < 4) {
                throw new deg(def.a.position(), def.a.limit());
            }
            def.a.putInt(floatToIntBits);
        }
        if (this.b != null) {
            def.a(2, this.b.intValue());
        }
        if (this.c != null) {
            def.a(3, this.c.intValue());
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null) {
            this.a.floatValue();
            a += def.b(1) + 4;
        }
        if (this.b != null) {
            a += def.c(2, this.b.intValue());
        }
        if (this.c != null) {
            return a + def.c(3, this.c.intValue());
        }
        return a;
    }

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rk.i /*13*/:
                    this.a = Float.valueOf(Float.intBitsToFloat(dee.g()));
                    continue;
                case rk.bX /*16*/:
                    this.b = Integer.valueOf(dee.e());
                    continue;
                case rk.bP /*24*/:
                    this.c = Integer.valueOf(dee.e());
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
