package defpackage;

public final class oao extends nyx<oao> {
    public static final nyy<nzs, oao> a = nyy.a(11, oao.class, 217756658);
    public static final oao[] b = new oao[0];
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public nzs i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oao() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.c != null) {
            nyu.a(1, this.c);
        }
        if (this.d != null) {
            nyu.a(2, this.d);
        }
        if (this.e != null) {
            nyu.a(3, this.e);
        }
        if (this.f != null) {
            nyu.a(4, this.f);
        }
        if (this.g != null) {
            nyu.a(5, this.g);
        }
        if (this.h != null) {
            nyu.a(6, this.h);
        }
        if (this.i != null) {
            nyu.b(7, this.i);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.c != null) {
            b += nyu.b(1, this.c);
        }
        if (this.d != null) {
            b += nyu.b(2, this.d);
        }
        if (this.e != null) {
            b += nyu.b(3, this.e);
        }
        if (this.f != null) {
            b += nyu.b(4, this.f);
        }
        if (this.g != null) {
            b += nyu.b(5, this.g);
        }
        if (this.h != null) {
            b += nyu.b(6, this.h);
        }
        if (this.i != null) {
            return b + nyu.d(7, this.i);
        }
        return b;
    }

    private oao b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.c = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.d = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.e = nyt.j();
                    continue;
                case 34:
                    this.f = nyt.j();
                    continue;
                case 42:
                    this.g = nyt.j();
                    continue;
                case 50:
                    this.h = nyt.j();
                    continue;
                case 58:
                    if (this.i == null) {
                        this.i = new nzs();
                    }
                    nyt.a(this.i);
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
