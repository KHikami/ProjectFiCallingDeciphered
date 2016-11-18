package p000;

public final class naq extends nyx<naq> {
    public nax[] f29383a;
    public nas[] f29384b;
    public naw[] f29385c;

    public /* synthetic */ nzf m34087a(nyt nyt) {
        return m34085b(nyt);
    }

    public naq() {
        m34086d();
    }

    private naq m34086d() {
        this.f29383a = nax.m34124d();
        this.f29384b = nas.m34097d();
        this.f29385c = naw.m34118d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34088a(nyu nyu) {
        int i = 0;
        if (this.f29383a != null && this.f29383a.length > 0) {
            for (nzf nzf : this.f29383a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f29384b != null && this.f29384b.length > 0) {
            for (nzf nzf2 : this.f29384b) {
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
            }
        }
        if (this.f29385c != null && this.f29385c.length > 0) {
            while (i < this.f29385c.length) {
                nzf nzf3 = this.f29385c[i];
                if (nzf3 != null) {
                    nyu.m37182b(3, nzf3);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m34089b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f29383a != null && this.f29383a.length > 0) {
            i = b;
            for (nzf nzf : this.f29383a) {
                if (nzf != null) {
                    i += nyu.m37145d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f29384b != null && this.f29384b.length > 0) {
            i = b;
            for (nzf nzf2 : this.f29384b) {
                if (nzf2 != null) {
                    i += nyu.m37145d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.f29385c != null && this.f29385c.length > 0) {
            while (i2 < this.f29385c.length) {
                nzf nzf3 = this.f29385c[i2];
                if (nzf3 != null) {
                    b += nyu.m37145d(3, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private naq m34085b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f29383a == null) {
                        a = 0;
                    } else {
                        a = this.f29383a.length;
                    }
                    obj = new nax[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29383a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nax();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nax();
                    nyt.m37101a(obj[a]);
                    this.f29383a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f29384b == null) {
                        a = 0;
                    } else {
                        a = this.f29384b.length;
                    }
                    obj = new nas[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29384b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nas();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nas();
                    nyt.m37101a(obj[a]);
                    this.f29384b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f29385c == null) {
                        a = 0;
                    } else {
                        a = this.f29385c.length;
                    }
                    obj = new naw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29385c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new naw();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new naw();
                    nyt.m37101a(obj[a]);
                    this.f29385c = obj;
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
