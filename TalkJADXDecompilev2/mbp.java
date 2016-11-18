package defpackage;

public final class mbp extends nyx<mbp> {
    public mbf a;
    public mbl b;
    public mbo c;
    public mbb d;
    public mbm e;
    public maw f;
    public mbh g;
    public mba h;
    public mbg i;
    public may j;
    public byte[] k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mbp() {
        d();
    }

    private mbp d() {
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
        this.k = null;
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
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.b(7, this.f);
        }
        if (this.g != null) {
            nyu.b(8, this.g);
        }
        if (this.h != null) {
            nyu.b(9, this.h);
        }
        if (this.i != null) {
            nyu.b(10, this.i);
        }
        if (this.j != null) {
            nyu.b(11, this.j);
        }
        if (this.k != null) {
            nyu.a(12, this.k);
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
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(7, this.f);
        }
        if (this.g != null) {
            b += nyu.d(8, this.g);
        }
        if (this.h != null) {
            b += nyu.d(9, this.h);
        }
        if (this.i != null) {
            b += nyu.d(10, this.i);
        }
        if (this.j != null) {
            b += nyu.d(11, this.j);
        }
        if (this.k != null) {
            return b + nyu.b(12, this.k);
        }
        return b;
    }

    private mbp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new mbf();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new mbl();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new mbo();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new mbb();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new mbm();
                    }
                    nyt.a(this.e);
                    continue;
                case 58:
                    if (this.f == null) {
                        this.f = new maw();
                    }
                    nyt.a(this.f);
                    continue;
                case 66:
                    if (this.g == null) {
                        this.g = new mbh();
                    }
                    nyt.a(this.g);
                    continue;
                case 74:
                    if (this.h == null) {
                        this.h = new mba();
                    }
                    nyt.a(this.h);
                    continue;
                case 82:
                    if (this.i == null) {
                        this.i = new mbg();
                    }
                    nyt.a(this.i);
                    continue;
                case 90:
                    if (this.j == null) {
                        this.j = new may();
                    }
                    nyt.a(this.j);
                    continue;
                case 98:
                    this.k = nyt.k();
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
