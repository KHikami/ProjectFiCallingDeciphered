package defpackage;

public final class nmc extends nyx<nmc> {
    public niq a;
    public oyl b;
    public nti c;
    public String d;
    public String e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nmc() {
        d();
    }

    private nmc d() {
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
            nyu.b(4, this.b);
        }
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        if (this.e != null) {
            nyu.a(6, this.e);
        }
        if (this.c != null) {
            nyu.b(7, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(4, this.b);
        }
        if (this.d != null) {
            b += nyu.b(5, this.d);
        }
        if (this.e != null) {
            b += nyu.b(6, this.e);
        }
        if (this.c != null) {
            return b + nyu.d(7, this.c);
        }
        return b;
    }

    private nmc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new niq();
                    }
                    nyt.a(this.a);
                    continue;
                case 34:
                    if (this.b == null) {
                        this.b = new oyl();
                    }
                    nyt.a(this.b);
                    continue;
                case 42:
                    this.d = nyt.j();
                    continue;
                case 50:
                    this.e = nyt.j();
                    continue;
                case 58:
                    if (this.c == null) {
                        this.c = new nti();
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
