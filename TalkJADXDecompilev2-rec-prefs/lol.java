package p000;

public final class lol extends nyx<lol> {
    public ltr[] f25882a;
    public ltr[] f25883b;
    public lqw[] f25884c;
    public lqx f25885d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29760b(nyt);
    }

    public lol() {
        m29761d();
    }

    private lol m29761d() {
        this.f25882a = ltr.m30492d();
        this.f25883b = ltr.m30492d();
        this.f25884c = lqw.m30110d();
        this.f25885d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f25882a != null && this.f25882a.length > 0) {
            for (nzf nzf : this.f25882a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f25883b != null && this.f25883b.length > 0) {
            for (nzf nzf2 : this.f25883b) {
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
            }
        }
        if (this.f25884c != null && this.f25884c.length > 0) {
            while (i < this.f25884c.length) {
                nzf nzf3 = this.f25884c[i];
                if (nzf3 != null) {
                    nyu.b(3, nzf3);
                }
                i++;
            }
        }
        if (this.f25885d != null) {
            nyu.b(4, this.f25885d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f25882a != null && this.f25882a.length > 0) {
            i = b;
            for (nzf nzf : this.f25882a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f25883b != null && this.f25883b.length > 0) {
            i = b;
            for (nzf nzf2 : this.f25883b) {
                if (nzf2 != null) {
                    i += nyu.d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.f25884c != null && this.f25884c.length > 0) {
            while (i2 < this.f25884c.length) {
                nzf nzf3 = this.f25884c[i2];
                if (nzf3 != null) {
                    b += nyu.d(3, nzf3);
                }
                i2++;
            }
        }
        if (this.f25885d != null) {
            return b + nyu.d(4, this.f25885d);
        }
        return b;
    }

    private lol m29760b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f25882a == null) {
                        a = 0;
                    } else {
                        a = this.f25882a.length;
                    }
                    obj = new ltr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25882a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltr();
                    nyt.a(obj[a]);
                    this.f25882a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f25883b == null) {
                        a = 0;
                    } else {
                        a = this.f25883b.length;
                    }
                    obj = new ltr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25883b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltr();
                    nyt.a(obj[a]);
                    this.f25883b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f25884c == null) {
                        a = 0;
                    } else {
                        a = this.f25884c.length;
                    }
                    obj = new lqw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25884c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqw();
                    nyt.a(obj[a]);
                    this.f25884c = obj;
                    continue;
                case 34:
                    if (this.f25885d == null) {
                        this.f25885d = new lqx();
                    }
                    nyt.a(this.f25885d);
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
