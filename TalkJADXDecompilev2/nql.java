package defpackage;

public final class nql extends nyx<nql> {
    public Boolean a;
    public Boolean b;
    public ntb c;
    public nqm d;
    public nsa e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nql() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.booleanValue());
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        if (this.d != null) {
            nyu.b(3, this.d);
        }
        if (this.e != null) {
            nyu.b(4, this.e);
        }
        if (this.b != null) {
            nyu.a(5, this.b.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.c != null) {
            b += nyu.d(2, this.c);
        }
        if (this.d != null) {
            b += nyu.d(3, this.d);
        }
        if (this.e != null) {
            b += nyu.d(4, this.e);
        }
        if (this.b == null) {
            return b;
        }
        this.b.booleanValue();
        return b + (nyu.h(5) + 1);
    }

    private nql b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new ntb();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dx /*26*/:
                    if (this.d == null) {
                        this.d = new nqm();
                    }
                    nyt.a(this.d);
                    continue;
                case 34:
                    if (this.e == null) {
                        this.e = new nsa();
                    }
                    nyt.a(this.e);
                    continue;
                case 40:
                    this.b = Boolean.valueOf(nyt.i());
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
