package p000;

public final class maw extends nyx<maw> {
    public lzj f27179a;
    public lxh[] f27180b;
    public lzg[] f27181c;
    public lzg f27182d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31497b(nyt);
    }

    public maw() {
        m31498d();
    }

    private maw m31498d() {
        this.f27179a = null;
        this.f27180b = lxh.m30993d();
        this.f27181c = lzg.m31261d();
        this.f27182d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27179a != null) {
            nyu.b(1, this.f27179a);
        }
        if (this.f27180b != null && this.f27180b.length > 0) {
            for (nzf nzf : this.f27180b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f27181c != null && this.f27181c.length > 0) {
            while (i < this.f27181c.length) {
                nzf nzf2 = this.f27181c[i];
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27182d != null) {
            nyu.b(4, this.f27182d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27179a != null) {
            b += nyu.d(1, this.f27179a);
        }
        if (this.f27180b != null && this.f27180b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f27180b) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f27181c != null && this.f27181c.length > 0) {
            while (i < this.f27181c.length) {
                nzf nzf2 = this.f27181c[i];
                if (nzf2 != null) {
                    b += nyu.d(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27182d != null) {
            return b + nyu.d(4, this.f27182d);
        }
        return b;
    }

    private maw m31497b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27179a == null) {
                        this.f27179a = new lzj();
                    }
                    nyt.a(this.f27179a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f27180b == null) {
                        a = 0;
                    } else {
                        a = this.f27180b.length;
                    }
                    obj = new lxh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27180b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lxh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lxh();
                    nyt.a(obj[a]);
                    this.f27180b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f27181c == null) {
                        a = 0;
                    } else {
                        a = this.f27181c.length;
                    }
                    obj = new lzg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27181c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzg();
                    nyt.a(obj[a]);
                    this.f27181c = obj;
                    continue;
                case 34:
                    if (this.f27182d == null) {
                        this.f27182d = new lzg();
                    }
                    nyt.a(this.f27182d);
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
