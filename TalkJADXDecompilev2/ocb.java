package defpackage;

public final class ocb extends nyx<ocb> {
    public static final nyy<nzr, ocb> a = nyy.a(11, ocb.class, 218917042);
    private static final ocb[] k = new ocb[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public nzr j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ocb() {
        d();
    }

    private ocb d() {
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
        if (this.b != null) {
            nyu.a(1, this.b);
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.f != null) {
            nyu.a(5, this.f);
        }
        if (this.g != null) {
            nyu.a(6, this.g);
        }
        if (this.h != null) {
            nyu.a(7, this.h);
        }
        if (this.i != null) {
            nyu.a(8, this.i);
        }
        if (this.j != null) {
            nyu.b(9, this.j);
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
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.f != null) {
            b += nyu.b(5, this.f);
        }
        if (this.g != null) {
            b += nyu.b(6, this.g);
        }
        if (this.h != null) {
            b += nyu.b(7, this.h);
        }
        if (this.i != null) {
            b += nyu.b(8, this.i);
        }
        if (this.j != null) {
            return b + nyu.d(9, this.j);
        }
        return b;
    }

    private ocb b(nyt nyt) {
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
                    this.e = nyt.j();
                    continue;
                case 42:
                    this.f = nyt.j();
                    continue;
                case 50:
                    this.g = nyt.j();
                    continue;
                case 58:
                    this.h = nyt.j();
                    continue;
                case 66:
                    this.i = nyt.j();
                    continue;
                case 74:
                    if (this.j == null) {
                        this.j = new nzr();
                    }
                    nyt.a(this.j);
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
