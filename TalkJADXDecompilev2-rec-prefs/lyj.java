package p000;

public final class lyj extends nyx<lyj> {
    public lyh f26895a;
    public String f26896b;
    public lzj f26897c;
    public lyh[] f26898d;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31142b(nyt);
    }

    public lyj() {
        m31143d();
    }

    private lyj m31143d() {
        this.responseHeader = null;
        this.f26895a = null;
        this.f26896b = null;
        this.f26897c = null;
        this.f26898d = lyh.m31132d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26895a != null) {
            nyu.b(2, this.f26895a);
        }
        if (this.f26897c != null) {
            nyu.b(3, this.f26897c);
        }
        if (this.f26896b != null) {
            nyu.a(4, this.f26896b);
        }
        if (this.f26898d != null && this.f26898d.length > 0) {
            for (nzf nzf : this.f26898d) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26895a != null) {
            b += nyu.d(2, this.f26895a);
        }
        if (this.f26897c != null) {
            b += nyu.d(3, this.f26897c);
        }
        if (this.f26896b != null) {
            b += nyu.b(4, this.f26896b);
        }
        if (this.f26898d == null || this.f26898d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26898d) {
            if (nzf != null) {
                i += nyu.d(5, nzf);
            }
        }
        return i;
    }

    private lyj m31142b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26895a == null) {
                        this.f26895a = new lyh();
                    }
                    nyt.a(this.f26895a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26897c == null) {
                        this.f26897c = new lzj();
                    }
                    nyt.a(this.f26897c);
                    continue;
                case 34:
                    this.f26896b = nyt.j();
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.f26898d == null) {
                        a = 0;
                    } else {
                        a = this.f26898d.length;
                    }
                    Object obj = new lyh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26898d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lyh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lyh();
                    nyt.a(obj[a]);
                    this.f26898d = obj;
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
