package p000;

public final class kly extends nyx<kly> {
    public String f22321a;
    public String f22322b;
    public String f22323c;
    public kjm[] f22324d;
    public String f22325e;
    public String f22326f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26476b(nyt);
    }

    public kly() {
        m26477d();
    }

    private kly m26477d() {
        this.f22321a = null;
        this.f22322b = null;
        this.f22323c = null;
        this.f22324d = kjm.m26109d();
        this.f22325e = null;
        this.f22326f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22321a != null) {
            nyu.a(1, this.f22321a);
        }
        if (this.f22322b != null) {
            nyu.a(2, this.f22322b);
        }
        if (this.f22324d != null && this.f22324d.length > 0) {
            for (nzf nzf : this.f22324d) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f22323c != null) {
            nyu.a(4, this.f22323c);
        }
        if (this.f22325e != null) {
            nyu.a(5, this.f22325e);
        }
        if (this.f22326f != null) {
            nyu.a(6, this.f22326f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22321a != null) {
            b += nyu.b(1, this.f22321a);
        }
        if (this.f22322b != null) {
            b += nyu.b(2, this.f22322b);
        }
        if (this.f22324d != null && this.f22324d.length > 0) {
            int i = b;
            for (nzf nzf : this.f22324d) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f22323c != null) {
            b += nyu.b(4, this.f22323c);
        }
        if (this.f22325e != null) {
            b += nyu.b(5, this.f22325e);
        }
        if (this.f22326f != null) {
            return b + nyu.b(6, this.f22326f);
        }
        return b;
    }

    private kly m26476b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22321a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22322b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f22324d == null) {
                        a = 0;
                    } else {
                        a = this.f22324d.length;
                    }
                    Object obj = new kjm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22324d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kjm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kjm();
                    nyt.a(obj[a]);
                    this.f22324d = obj;
                    continue;
                case 34:
                    this.f22323c = nyt.j();
                    continue;
                case 42:
                    this.f22325e = nyt.j();
                    continue;
                case 50:
                    this.f22326f = nyt.j();
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
