package p000;

public final class lqy extends nyx<lqy> {
    public muu f26185a;
    public String f26186b;
    public Boolean f26187c;
    public muu[] f26188d;
    public ltu f26189e;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30120b(nyt);
    }

    public lqy() {
        m30121d();
    }

    private lqy m30121d() {
        this.requestHeader = null;
        this.f26185a = null;
        this.f26186b = null;
        this.f26187c = null;
        this.f26188d = muu.m33010d();
        this.f26189e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26185a != null) {
            nyu.b(2, this.f26185a);
        }
        if (this.f26186b != null) {
            nyu.a(3, this.f26186b);
        }
        if (this.f26187c != null) {
            nyu.a(4, this.f26187c.booleanValue());
        }
        if (this.f26188d != null && this.f26188d.length > 0) {
            for (nzf nzf : this.f26188d) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.f26189e != null) {
            nyu.b(6, this.f26189e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26185a != null) {
            b += nyu.d(2, this.f26185a);
        }
        if (this.f26186b != null) {
            b += nyu.b(3, this.f26186b);
        }
        if (this.f26187c != null) {
            this.f26187c.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f26188d != null && this.f26188d.length > 0) {
            int i = b;
            for (nzf nzf : this.f26188d) {
                if (nzf != null) {
                    i += nyu.d(5, nzf);
                }
            }
            b = i;
        }
        if (this.f26189e != null) {
            return b + nyu.d(6, this.f26189e);
        }
        return b;
    }

    private lqy m30120b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26185a == null) {
                        this.f26185a = new muu();
                    }
                    nyt.a(this.f26185a);
                    continue;
                case wi.dx /*26*/:
                    this.f26186b = nyt.j();
                    continue;
                case 32:
                    this.f26187c = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.f26188d == null) {
                        a = 0;
                    } else {
                        a = this.f26188d.length;
                    }
                    Object obj = new muu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26188d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new muu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new muu();
                    nyt.a(obj[a]);
                    this.f26188d = obj;
                    continue;
                case 50:
                    if (this.f26189e == null) {
                        this.f26189e = new ltu();
                    }
                    nyt.a(this.f26189e);
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
