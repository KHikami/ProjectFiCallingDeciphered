package p000;

public final class lyl extends nyx<lyl> {
    public lyh f26902a;
    public lzj f26903b;
    public lyh[] f26904c;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31152b(nyt);
    }

    public lyl() {
        m31153d();
    }

    private lyl m31153d() {
        this.responseHeader = null;
        this.f26902a = null;
        this.f26903b = null;
        this.f26904c = lyh.m31132d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26902a != null) {
            nyu.b(2, this.f26902a);
        }
        if (this.f26903b != null) {
            nyu.b(3, this.f26903b);
        }
        if (this.f26904c != null && this.f26904c.length > 0) {
            for (nzf nzf : this.f26904c) {
                if (nzf != null) {
                    nyu.b(4, nzf);
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
        if (this.f26902a != null) {
            b += nyu.d(2, this.f26902a);
        }
        if (this.f26903b != null) {
            b += nyu.d(3, this.f26903b);
        }
        if (this.f26904c == null || this.f26904c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26904c) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private lyl m31152b(nyt nyt) {
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
                    if (this.f26902a == null) {
                        this.f26902a = new lyh();
                    }
                    nyt.a(this.f26902a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26903b == null) {
                        this.f26903b = new lzj();
                    }
                    nyt.a(this.f26903b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f26904c == null) {
                        a = 0;
                    } else {
                        a = this.f26904c.length;
                    }
                    Object obj = new lyh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26904c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lyh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lyh();
                    nyt.a(obj[a]);
                    this.f26904c = obj;
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
