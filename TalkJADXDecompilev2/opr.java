package defpackage;

public final class opr extends nyx<opr> {
    public Boolean a;
    public Boolean b;
    public oqu c;
    public Boolean d;
    public oqu e;
    public Boolean f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public opr() {
        d();
    }

    private opr d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.a(6, this.f.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f == null) {
            return b;
        }
        this.f.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private opr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new oqu();
                    }
                    nyt.a(this.c);
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new oqu();
                    }
                    nyt.a(this.e);
                    continue;
                case 48:
                    this.f = Boolean.valueOf(nyt.i());
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
