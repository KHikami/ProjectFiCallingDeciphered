package p000;

public final class lcs extends nyx<lcs> {
    public lct[] f24610a;
    public lcn[] f24611b;
    public lcy[] f24612c;
    public lcp f24613d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28647b(nyt);
    }

    public lcs() {
        m28648d();
    }

    private lcs m28648d() {
        this.f24610a = lct.m28653d();
        this.f24611b = lcn.m28622d();
        this.f24612c = lcy.m28681d();
        this.f24613d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f24610a != null && this.f24610a.length > 0) {
            for (nzf nzf : this.f24610a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f24611b != null && this.f24611b.length > 0) {
            for (nzf nzf2 : this.f24611b) {
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
            }
        }
        if (this.f24612c != null && this.f24612c.length > 0) {
            while (i < this.f24612c.length) {
                nzf nzf3 = this.f24612c[i];
                if (nzf3 != null) {
                    nyu.b(3, nzf3);
                }
                i++;
            }
        }
        if (this.f24613d != null) {
            nyu.b(4, this.f24613d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f24610a != null && this.f24610a.length > 0) {
            i = b;
            for (nzf nzf : this.f24610a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f24611b != null && this.f24611b.length > 0) {
            i = b;
            for (nzf nzf2 : this.f24611b) {
                if (nzf2 != null) {
                    i += nyu.d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.f24612c != null && this.f24612c.length > 0) {
            while (i2 < this.f24612c.length) {
                nzf nzf3 = this.f24612c[i2];
                if (nzf3 != null) {
                    b += nyu.d(3, nzf3);
                }
                i2++;
            }
        }
        if (this.f24613d != null) {
            return b + nyu.d(4, this.f24613d);
        }
        return b;
    }

    private lcs m28647b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f24610a == null) {
                        a = 0;
                    } else {
                        a = this.f24610a.length;
                    }
                    obj = new lct[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24610a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lct();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lct();
                    nyt.a(obj[a]);
                    this.f24610a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f24611b == null) {
                        a = 0;
                    } else {
                        a = this.f24611b.length;
                    }
                    obj = new lcn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24611b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcn();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcn();
                    nyt.a(obj[a]);
                    this.f24611b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f24612c == null) {
                        a = 0;
                    } else {
                        a = this.f24612c.length;
                    }
                    obj = new lcy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24612c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcy();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcy();
                    nyt.a(obj[a]);
                    this.f24612c = obj;
                    continue;
                case 34:
                    if (this.f24613d == null) {
                        this.f24613d = new lcp();
                    }
                    nyt.a(this.f24613d);
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
