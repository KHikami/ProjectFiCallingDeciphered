package defpackage;

public final class myn extends nyx<myn> {
    public Float a;
    public Float b;
    public myo c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public myn() {
        d();
    }

    private myn d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.floatValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.floatValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.b != null) {
            this.b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.c != null) {
            return b + nyu.d(3, this.c);
        }
        return b;
    }

    private myn b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.b = Float.valueOf(nyt.c());
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new myo();
                    }
                    nyt.a(this.c);
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
