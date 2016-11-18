package p000;

public final class lre extends nyx<lre> {
    public lqc[] f26208a;
    public lrf[] f26209b;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30150b(nyt);
    }

    public lre() {
        m30151d();
    }

    private lre m30151d() {
        this.responseHeader = null;
        this.f26208a = lqc.m30002d();
        this.f26209b = lrf.m30156d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26208a != null && this.f26208a.length > 0) {
            for (nzf nzf : this.f26208a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f26209b != null && this.f26209b.length > 0) {
            while (i < this.f26209b.length) {
                nzf nzf2 = this.f26209b[i];
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26208a != null && this.f26208a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f26208a) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f26209b != null && this.f26209b.length > 0) {
            while (i < this.f26209b.length) {
                nzf nzf2 = this.f26209b[i];
                if (nzf2 != null) {
                    b += nyu.d(3, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private lre m30150b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
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
                    b = nzl.b(nyt, 18);
                    if (this.f26208a == null) {
                        a = 0;
                    } else {
                        a = this.f26208a.length;
                    }
                    obj = new lqc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26208a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqc();
                    nyt.a(obj[a]);
                    this.f26208a = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f26209b == null) {
                        a = 0;
                    } else {
                        a = this.f26209b.length;
                    }
                    obj = new lrf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26209b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lrf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lrf();
                    nyt.a(obj[a]);
                    this.f26209b = obj;
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
