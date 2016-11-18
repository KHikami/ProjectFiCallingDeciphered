package defpackage;

public final class nda extends nyx<nda> {
    public ndc a;
    public ndd b;
    public nde c;
    public ndf d;
    public ndb e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nda() {
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
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
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            return b + nyu.d(5, this.e);
        }
        return b;
    }

    private nda b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new ndc();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new ndd();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new nde();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new ndf();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new ndb();
                    }
                    nyt.a(this.e);
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
