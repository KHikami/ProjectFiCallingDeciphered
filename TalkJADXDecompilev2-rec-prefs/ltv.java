package p000;

public final class ltv extends nyx<ltv> {
    public Boolean f26414a;
    public Boolean f26415b;
    public lpp[] f26416c;
    public ltg f26417d;
    public lry f26418e;
    public lpq f26419f;
    public lpo f26420g;
    public lnx f26421h;
    public lwg f26422i;
    public lso f26423j;
    public lur f26424k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30511b(nyt);
    }

    public ltv() {
        m30512d();
    }

    private ltv m30512d() {
        this.f26414a = null;
        this.f26415b = null;
        this.f26416c = lpp.m29931d();
        this.f26417d = null;
        this.f26418e = null;
        this.f26419f = null;
        this.f26420g = null;
        this.f26421h = null;
        this.f26422i = null;
        this.f26423j = null;
        this.f26424k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26414a != null) {
            nyu.a(1, this.f26414a.booleanValue());
        }
        if (this.f26415b != null) {
            nyu.a(2, this.f26415b.booleanValue());
        }
        if (this.f26416c != null && this.f26416c.length > 0) {
            for (nzf nzf : this.f26416c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f26417d != null) {
            nyu.b(4, this.f26417d);
        }
        if (this.f26418e != null) {
            nyu.b(5, this.f26418e);
        }
        if (this.f26419f != null) {
            nyu.b(6, this.f26419f);
        }
        if (this.f26420g != null) {
            nyu.b(7, this.f26420g);
        }
        if (this.f26421h != null) {
            nyu.b(8, this.f26421h);
        }
        if (this.f26422i != null) {
            nyu.b(9, this.f26422i);
        }
        if (this.f26423j != null) {
            nyu.b(10, this.f26423j);
        }
        if (this.f26424k != null) {
            nyu.b(11, this.f26424k);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26414a != null) {
            this.f26414a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f26415b != null) {
            this.f26415b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f26416c != null && this.f26416c.length > 0) {
            int i = b;
            for (nzf nzf : this.f26416c) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f26417d != null) {
            b += nyu.d(4, this.f26417d);
        }
        if (this.f26418e != null) {
            b += nyu.d(5, this.f26418e);
        }
        if (this.f26419f != null) {
            b += nyu.d(6, this.f26419f);
        }
        if (this.f26420g != null) {
            b += nyu.d(7, this.f26420g);
        }
        if (this.f26421h != null) {
            b += nyu.d(8, this.f26421h);
        }
        if (this.f26422i != null) {
            b += nyu.d(9, this.f26422i);
        }
        if (this.f26423j != null) {
            b += nyu.d(10, this.f26423j);
        }
        if (this.f26424k != null) {
            return b + nyu.d(11, this.f26424k);
        }
        return b;
    }

    private ltv m30511b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26414a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f26415b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f26416c == null) {
                        a = 0;
                    } else {
                        a = this.f26416c.length;
                    }
                    Object obj = new lpp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26416c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lpp();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lpp();
                    nyt.a(obj[a]);
                    this.f26416c = obj;
                    continue;
                case 34:
                    if (this.f26417d == null) {
                        this.f26417d = new ltg();
                    }
                    nyt.a(this.f26417d);
                    continue;
                case 42:
                    if (this.f26418e == null) {
                        this.f26418e = new lry();
                    }
                    nyt.a(this.f26418e);
                    continue;
                case 50:
                    if (this.f26419f == null) {
                        this.f26419f = new lpq();
                    }
                    nyt.a(this.f26419f);
                    continue;
                case 58:
                    if (this.f26420g == null) {
                        this.f26420g = new lpo();
                    }
                    nyt.a(this.f26420g);
                    continue;
                case 66:
                    if (this.f26421h == null) {
                        this.f26421h = new lnx();
                    }
                    nyt.a(this.f26421h);
                    continue;
                case 74:
                    if (this.f26422i == null) {
                        this.f26422i = new lwg();
                    }
                    nyt.a(this.f26422i);
                    continue;
                case 82:
                    if (this.f26423j == null) {
                        this.f26423j = new lso();
                    }
                    nyt.a(this.f26423j);
                    continue;
                case 90:
                    if (this.f26424k == null) {
                        this.f26424k = new lur();
                    }
                    nyt.a(this.f26424k);
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
