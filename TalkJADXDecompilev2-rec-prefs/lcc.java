package p000;

public final class lcc extends nyx<lcc> {
    public lcd[] f24555a;
    public kzr[] f24556b;
    public lcl[] f24557c;
    public lac f24558d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28570b(nyt);
    }

    public lcc() {
        this.f24555a = lcd.m28575d();
        this.f24556b = kzr.m28271d();
        this.f24557c = lcl.m28612d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f24555a != null && this.f24555a.length > 0) {
            for (nzf nzf : this.f24555a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f24556b != null && this.f24556b.length > 0) {
            for (nzf nzf2 : this.f24556b) {
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
            }
        }
        if (this.f24557c != null && this.f24557c.length > 0) {
            while (i < this.f24557c.length) {
                nzf nzf3 = this.f24557c[i];
                if (nzf3 != null) {
                    nyu.b(3, nzf3);
                }
                i++;
            }
        }
        if (this.f24558d != null) {
            nyu.b(4, this.f24558d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f24555a != null && this.f24555a.length > 0) {
            i = b;
            for (nzf nzf : this.f24555a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f24556b != null && this.f24556b.length > 0) {
            i = b;
            for (nzf nzf2 : this.f24556b) {
                if (nzf2 != null) {
                    i += nyu.d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.f24557c != null && this.f24557c.length > 0) {
            while (i2 < this.f24557c.length) {
                nzf nzf3 = this.f24557c[i2];
                if (nzf3 != null) {
                    b += nyu.d(3, nzf3);
                }
                i2++;
            }
        }
        if (this.f24558d != null) {
            return b + nyu.d(4, this.f24558d);
        }
        return b;
    }

    private lcc m28570b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f24555a == null) {
                        a = 0;
                    } else {
                        a = this.f24555a.length;
                    }
                    obj = new lcd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24555a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcd();
                    nyt.a(obj[a]);
                    this.f24555a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f24556b == null) {
                        a = 0;
                    } else {
                        a = this.f24556b.length;
                    }
                    obj = new kzr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24556b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kzr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kzr();
                    nyt.a(obj[a]);
                    this.f24556b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f24557c == null) {
                        a = 0;
                    } else {
                        a = this.f24557c.length;
                    }
                    obj = new lcl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24557c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcl();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcl();
                    nyt.a(obj[a]);
                    this.f24557c = obj;
                    continue;
                case 34:
                    if (this.f24558d == null) {
                        this.f24558d = new lac();
                    }
                    nyt.a(this.f24558d);
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
