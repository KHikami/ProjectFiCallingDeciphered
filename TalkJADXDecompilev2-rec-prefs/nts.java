package p000;

public final class nts extends nyx<nts> {
    public Long f30776a;
    public ntv[] f30777b;
    public ntt[] f30778c;
    public ntu[] f30779d;
    public Integer f30780e;
    public Integer f30781f;

    public /* synthetic */ nzf m36514a(nyt nyt) {
        return m36513b(nyt);
    }

    public nts() {
        this.f30776a = null;
        this.f30777b = ntv.m36528d();
        this.f30778c = ntt.m36518d();
        this.f30779d = ntu.m36523d();
        this.f30780e = null;
        this.f30781f = null;
        this.cachedSize = -1;
    }

    public void m36515a(nyu nyu) {
        int i = 0;
        if (this.f30776a != null) {
            nyu.m37181b(1, this.f30776a.longValue());
        }
        if (this.f30777b != null && this.f30777b.length > 0) {
            for (nzf nzf : this.f30777b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f30779d != null && this.f30779d.length > 0) {
            for (nzf nzf2 : this.f30779d) {
                if (nzf2 != null) {
                    nyu.m37182b(3, nzf2);
                }
            }
        }
        if (this.f30780e != null) {
            nyu.m37168a(4, this.f30780e.intValue());
        }
        if (this.f30781f != null) {
            nyu.m37168a(5, this.f30781f.intValue());
        }
        if (this.f30778c != null && this.f30778c.length > 0) {
            while (i < this.f30778c.length) {
                nzf nzf3 = this.f30778c[i];
                if (nzf3 != null) {
                    nyu.m37182b(6, nzf3);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m36516b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f30776a != null) {
            b += nyu.m37148f(1, this.f30776a.longValue());
        }
        if (this.f30777b != null && this.f30777b.length > 0) {
            i = b;
            for (nzf nzf : this.f30777b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f30779d != null && this.f30779d.length > 0) {
            i = b;
            for (nzf nzf2 : this.f30779d) {
                if (nzf2 != null) {
                    i += nyu.m37145d(3, nzf2);
                }
            }
            b = i;
        }
        if (this.f30780e != null) {
            b += nyu.m37147f(4, this.f30780e.intValue());
        }
        if (this.f30781f != null) {
            b += nyu.m37147f(5, this.f30781f.intValue());
        }
        if (this.f30778c != null && this.f30778c.length > 0) {
            while (i2 < this.f30778c.length) {
                nzf nzf3 = this.f30778c[i2];
                if (nzf3 != null) {
                    b += nyu.m37145d(6, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private nts m36513b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30776a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f30777b == null) {
                        a = 0;
                    } else {
                        a = this.f30777b.length;
                    }
                    obj = new ntv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30777b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ntv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ntv();
                    nyt.m37101a(obj[a]);
                    this.f30777b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f30779d == null) {
                        a = 0;
                    } else {
                        a = this.f30779d.length;
                    }
                    obj = new ntu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30779d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ntu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ntu();
                    nyt.m37101a(obj[a]);
                    this.f30779d = obj;
                    continue;
                case 32:
                    this.f30780e = Integer.valueOf(nyt.m37112f());
                    continue;
                case 40:
                    this.f30781f = Integer.valueOf(nyt.m37112f());
                    continue;
                case 50:
                    b = nzl.m37265b(nyt, 50);
                    if (this.f30778c == null) {
                        a = 0;
                    } else {
                        a = this.f30778c.length;
                    }
                    obj = new ntt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30778c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ntt();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ntt();
                    nyt.m37101a(obj[a]);
                    this.f30778c = obj;
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
