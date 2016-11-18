package p000;

public final class mbo extends nyx<mbo> {
    public lzj f27237a;
    public man[] f27238b;
    public mbn[] f27239c;
    public mbn f27240d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31604b(nyt);
    }

    public mbo() {
        m31605d();
    }

    private mbo m31605d() {
        this.f27237a = null;
        this.f27238b = man.m31450d();
        this.f27239c = mbn.m31599d();
        this.f27240d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27237a != null) {
            nyu.b(1, this.f27237a);
        }
        if (this.f27238b != null && this.f27238b.length > 0) {
            for (nzf nzf : this.f27238b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f27239c != null && this.f27239c.length > 0) {
            while (i < this.f27239c.length) {
                nzf nzf2 = this.f27239c[i];
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27240d != null) {
            nyu.b(4, this.f27240d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27237a != null) {
            b += nyu.d(1, this.f27237a);
        }
        if (this.f27238b != null && this.f27238b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f27238b) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f27239c != null && this.f27239c.length > 0) {
            while (i < this.f27239c.length) {
                nzf nzf2 = this.f27239c[i];
                if (nzf2 != null) {
                    b += nyu.d(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27240d != null) {
            return b + nyu.d(4, this.f27240d);
        }
        return b;
    }

    private mbo m31604b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27237a == null) {
                        this.f27237a = new lzj();
                    }
                    nyt.a(this.f27237a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f27238b == null) {
                        a = 0;
                    } else {
                        a = this.f27238b.length;
                    }
                    obj = new man[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27238b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new man();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new man();
                    nyt.a(obj[a]);
                    this.f27238b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f27239c == null) {
                        a = 0;
                    } else {
                        a = this.f27239c.length;
                    }
                    obj = new mbn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27239c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mbn();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mbn();
                    nyt.a(obj[a]);
                    this.f27239c = obj;
                    continue;
                case 34:
                    if (this.f27240d == null) {
                        this.f27240d = new mbn();
                    }
                    nyt.a(this.f27240d);
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
