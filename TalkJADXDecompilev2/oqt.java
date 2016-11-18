package defpackage;

public final class oqt extends nyx<oqt> {
    public String a;
    public Boolean b;
    public Boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oqt() {
        d();
    }

    private oqt d() {
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
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.a(8, this.g);
        }
        if (this.h != null) {
            nyu.a(9, this.h);
        }
        if (this.i != null) {
            nyu.a(10, this.i);
        }
        if (this.j != null) {
            nyu.a(11, this.j);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            b += nyu.b(6, this.f);
        }
        if (this.g != null) {
            b += nyu.b(8, this.g);
        }
        if (this.h != null) {
            b += nyu.b(9, this.h);
        }
        if (this.i != null) {
            b += nyu.b(10, this.i);
        }
        if (this.j != null) {
            return b + nyu.b(11, this.j);
        }
        return b;
    }

    private oqt b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 66:
                    this.g = nyt.j();
                    continue;
                case 74:
                    this.h = nyt.j();
                    continue;
                case 82:
                    this.i = nyt.j();
                    continue;
                case 90:
                    this.j = nyt.j();
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
