package defpackage;

public final class obo extends nyx<obo> {
    public static final nyy<nzs, obo> a = nyy.a(11, obo.class, 217977098);
    private static final obo[] l = new obo[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public obs g;
    public String h;
    public String i;
    public nzs j;
    public obu k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public obo() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = null;
        this.i = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b);
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.i != null) {
            nyu.a(4, this.i);
        }
        if (this.f != null) {
            nyu.a(5, this.f);
        }
        if (this.g != null) {
            nyu.b(6, this.g);
        }
        if (this.e != null) {
            nyu.a(7, this.e);
        }
        if (this.h != null) {
            nyu.a(11, this.h);
        }
        if (this.j != null) {
            nyu.b(12, this.j);
        }
        if (this.k != null) {
            nyu.b(13, this.k);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.b(1, this.b);
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.i != null) {
            b += nyu.b(4, this.i);
        }
        if (this.f != null) {
            b += nyu.b(5, this.f);
        }
        if (this.g != null) {
            b += nyu.d(6, this.g);
        }
        if (this.e != null) {
            b += nyu.b(7, this.e);
        }
        if (this.h != null) {
            b += nyu.b(11, this.h);
        }
        if (this.j != null) {
            b += nyu.d(12, this.j);
        }
        if (this.k != null) {
            return b + nyu.d(13, this.k);
        }
        return b;
    }

    private obo b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 34:
                    this.i = nyt.j();
                    continue;
                case 42:
                    this.f = nyt.j();
                    continue;
                case 50:
                    if (this.g == null) {
                        this.g = new obs();
                    }
                    nyt.a(this.g);
                    continue;
                case 58:
                    this.e = nyt.j();
                    continue;
                case 90:
                    this.h = nyt.j();
                    continue;
                case 98:
                    if (this.j == null) {
                        this.j = new nzs();
                    }
                    nyt.a(this.j);
                    continue;
                case 106:
                    if (this.k == null) {
                        this.k = new obu();
                    }
                    nyt.a(this.k);
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
