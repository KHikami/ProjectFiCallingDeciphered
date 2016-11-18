package p000;

public final class mbh extends nyx<mbh> {
    public lzj f27216a;
    public lyh[] f27217b;
    public mbe[] f27218c;
    public mbe f27219d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31567b(nyt);
    }

    public mbh() {
        m31568d();
    }

    private mbh m31568d() {
        this.f27216a = null;
        this.f27217b = lyh.m31132d();
        this.f27218c = mbe.m31552d();
        this.f27219d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27216a != null) {
            nyu.b(1, this.f27216a);
        }
        if (this.f27217b != null && this.f27217b.length > 0) {
            for (nzf nzf : this.f27217b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f27218c != null && this.f27218c.length > 0) {
            while (i < this.f27218c.length) {
                nzf nzf2 = this.f27218c[i];
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27219d != null) {
            nyu.b(4, this.f27219d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27216a != null) {
            b += nyu.d(1, this.f27216a);
        }
        if (this.f27217b != null && this.f27217b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f27217b) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f27218c != null && this.f27218c.length > 0) {
            while (i < this.f27218c.length) {
                nzf nzf2 = this.f27218c[i];
                if (nzf2 != null) {
                    b += nyu.d(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27219d != null) {
            return b + nyu.d(4, this.f27219d);
        }
        return b;
    }

    private mbh m31567b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27216a == null) {
                        this.f27216a = new lzj();
                    }
                    nyt.a(this.f27216a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f27217b == null) {
                        a = 0;
                    } else {
                        a = this.f27217b.length;
                    }
                    obj = new lyh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27217b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lyh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lyh();
                    nyt.a(obj[a]);
                    this.f27217b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f27218c == null) {
                        a = 0;
                    } else {
                        a = this.f27218c.length;
                    }
                    obj = new mbe[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27218c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mbe();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mbe();
                    nyt.a(obj[a]);
                    this.f27218c = obj;
                    continue;
                case 34:
                    if (this.f27219d == null) {
                        this.f27219d = new mbe();
                    }
                    nyt.a(this.f27219d);
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
