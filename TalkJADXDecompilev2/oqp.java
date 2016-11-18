package defpackage;

public final class oqp extends nyx<oqp> {
    public oqn a;
    public oqn b;
    public oqv c;
    public oqv d;
    public oqm e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oqp() {
        d();
    }

    private oqp d() {
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
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.d != null) {
            nyu.b(3, this.d);
        }
        if (this.e != null) {
            nyu.b(4, this.e);
        }
        if (this.c != null) {
            nyu.b(5, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.d != null) {
            b += nyu.d(3, this.d);
        }
        if (this.e != null) {
            b += nyu.d(4, this.e);
        }
        if (this.c != null) {
            return b + nyu.d(5, this.c);
        }
        return b;
    }

    private oqp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new oqn();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new oqn();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.d == null) {
                        this.d = new oqv();
                    }
                    nyt.a(this.d);
                    continue;
                case 34:
                    if (this.e == null) {
                        this.e = new oqm();
                    }
                    nyt.a(this.e);
                    continue;
                case 42:
                    if (this.c == null) {
                        this.c = new oqv();
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
