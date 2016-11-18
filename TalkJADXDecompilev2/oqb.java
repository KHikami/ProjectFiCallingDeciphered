package defpackage;

public final class oqb extends nyx<oqb> {
    public String a;
    public String b;
    public String c;
    public Boolean d;
    public String e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oqb() {
        d();
    }

    private oqb d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(5, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.a(8, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.e != null) {
            return b + nyu.b(8, this.e);
        }
        return b;
    }

    private oqb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 40:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    this.e = nyt.j();
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
