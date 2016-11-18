package p000;

public final class may extends nyx<may> {
    public lxy[] f27186a;
    public max[] f27187b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31508b(nyt);
    }

    public may() {
        m31509d();
    }

    private may m31509d() {
        this.f27186a = lxy.m31077d();
        this.f27187b = max.m31503d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27186a != null && this.f27186a.length > 0) {
            for (nzf nzf : this.f27186a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f27187b != null && this.f27187b.length > 0) {
            while (i < this.f27187b.length) {
                nzf nzf2 = this.f27187b[i];
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
        if (this.f27186a != null && this.f27186a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f27186a) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f27187b != null && this.f27187b.length > 0) {
            while (i < this.f27187b.length) {
                nzf nzf2 = this.f27187b[i];
                if (nzf2 != null) {
                    b += nyu.d(3, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private may m31508b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f27186a == null) {
                        a = 0;
                    } else {
                        a = this.f27186a.length;
                    }
                    obj = new lxy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27186a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lxy();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lxy();
                    nyt.a(obj[a]);
                    this.f27186a = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f27187b == null) {
                        a = 0;
                    } else {
                        a = this.f27187b.length;
                    }
                    obj = new max[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27187b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new max();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new max();
                    nyt.a(obj[a]);
                    this.f27187b = obj;
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
