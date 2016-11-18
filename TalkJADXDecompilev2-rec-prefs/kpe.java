package p000;

public final class kpe extends nyx<kpe> {
    public krk f22617a;
    public kpv f22618b;
    public Boolean f22619c;
    public Boolean f22620d;
    public Boolean f22621e;
    public kpg f22622f;
    public kqy f22623g;
    public krh f22624h;
    public String f22625i;
    public kqw f22626j;
    public Boolean f22627k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26889b(nyt);
    }

    public kpe() {
        m26890d();
    }

    private kpe m26890d() {
        this.f22617a = null;
        this.f22618b = null;
        this.f22619c = null;
        this.f22620d = null;
        this.f22621e = null;
        this.f22622f = null;
        this.f22623g = null;
        this.f22624h = null;
        this.f22625i = null;
        this.f22626j = null;
        this.f22627k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22617a != null) {
            nyu.b(1, this.f22617a);
        }
        if (this.f22618b != null) {
            nyu.b(2, this.f22618b);
        }
        if (this.f22619c != null) {
            nyu.a(3, this.f22619c.booleanValue());
        }
        if (this.f22620d != null) {
            nyu.a(4, this.f22620d.booleanValue());
        }
        if (this.f22621e != null) {
            nyu.a(5, this.f22621e.booleanValue());
        }
        if (this.f22622f != null) {
            nyu.b(6, this.f22622f);
        }
        if (this.f22623g != null) {
            nyu.b(7, this.f22623g);
        }
        if (this.f22624h != null) {
            nyu.b(8, this.f22624h);
        }
        if (this.f22625i != null) {
            nyu.a(9, this.f22625i);
        }
        if (this.f22626j != null) {
            nyu.b(10, this.f22626j);
        }
        if (this.f22627k != null) {
            nyu.a(11, this.f22627k.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22617a != null) {
            b += nyu.d(1, this.f22617a);
        }
        if (this.f22618b != null) {
            b += nyu.d(2, this.f22618b);
        }
        if (this.f22619c != null) {
            this.f22619c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f22620d != null) {
            this.f22620d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f22621e != null) {
            this.f22621e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f22622f != null) {
            b += nyu.d(6, this.f22622f);
        }
        if (this.f22623g != null) {
            b += nyu.d(7, this.f22623g);
        }
        if (this.f22624h != null) {
            b += nyu.d(8, this.f22624h);
        }
        if (this.f22625i != null) {
            b += nyu.b(9, this.f22625i);
        }
        if (this.f22626j != null) {
            b += nyu.d(10, this.f22626j);
        }
        if (this.f22627k == null) {
            return b;
        }
        this.f22627k.booleanValue();
        return b + (nyu.h(11) + 1);
    }

    private kpe m26889b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22617a == null) {
                        this.f22617a = new krk();
                    }
                    nyt.a(this.f22617a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22618b == null) {
                        this.f22618b = new kpv();
                    }
                    nyt.a(this.f22618b);
                    continue;
                case wi.dA /*24*/:
                    this.f22619c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f22620d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.f22621e = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    if (this.f22622f == null) {
                        this.f22622f = new kpg();
                    }
                    nyt.a(this.f22622f);
                    continue;
                case 58:
                    if (this.f22623g == null) {
                        this.f22623g = new kqy();
                    }
                    nyt.a(this.f22623g);
                    continue;
                case 66:
                    if (this.f22624h == null) {
                        this.f22624h = new krh();
                    }
                    nyt.a(this.f22624h);
                    continue;
                case 74:
                    this.f22625i = nyt.j();
                    continue;
                case 82:
                    if (this.f22626j == null) {
                        this.f22626j = new kqw();
                    }
                    nyt.a(this.f22626j);
                    continue;
                case 88:
                    this.f22627k = Boolean.valueOf(nyt.i());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
