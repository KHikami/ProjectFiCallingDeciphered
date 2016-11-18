package p000;

public final class lkx extends nyx<lkx> {
    public String f25284a;
    public String f25285b;
    public Integer f25286c;
    public Integer f25287d;
    public lky[] f25288e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29288b(nyt);
    }

    public lkx() {
        m29289d();
    }

    private lkx m29289d() {
        this.f25284a = null;
        this.f25285b = null;
        this.f25286c = null;
        this.f25287d = null;
        this.f25288e = lky.m29294d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25284a != null) {
            nyu.a(1, this.f25284a);
        }
        if (this.f25285b != null) {
            nyu.a(2, this.f25285b);
        }
        if (this.f25286c != null) {
            nyu.a(3, this.f25286c.intValue());
        }
        if (this.f25287d != null) {
            nyu.a(4, this.f25287d.intValue());
        }
        if (this.f25288e != null && this.f25288e.length > 0) {
            for (nzf nzf : this.f25288e) {
                if (nzf != null) {
                    nyu.a(5, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25284a != null) {
            b += nyu.b(1, this.f25284a);
        }
        if (this.f25285b != null) {
            b += nyu.b(2, this.f25285b);
        }
        if (this.f25286c != null) {
            b += nyu.f(3, this.f25286c.intValue());
        }
        if (this.f25287d != null) {
            b += nyu.f(4, this.f25287d.intValue());
        }
        if (this.f25288e == null || this.f25288e.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f25288e) {
            if (nzf != null) {
                i += nyu.c(5, nzf);
            }
        }
        return i;
    }

    private lkx m29288b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25284a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f25285b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f25286c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f25287d = Integer.valueOf(nyt.f());
                    continue;
                case 43:
                    int b = nzl.b(nyt, 43);
                    if (this.f25288e == null) {
                        a = 0;
                    } else {
                        a = this.f25288e.length;
                    }
                    Object obj = new lky[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25288e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lky();
                        nyt.a(obj[a], 5);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lky();
                    nyt.a(obj[a], 5);
                    this.f25288e = obj;
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
