package p000;

public final class ory extends nyx<ory> {
    private static volatile ory[] f34090i;
    public oqu f34091a;
    public oos f34092b;
    public String f34093c;
    public osx[] f34094d;
    public String f34095e;
    public ooz[] f34096f;
    public osc[] f34097g;
    public Integer f34098h;

    public /* synthetic */ nzf m39511a(nyt nyt) {
        return m39508b(nyt);
    }

    public static ory[] m39509d() {
        if (f34090i == null) {
            synchronized (nzc.f31309c) {
                if (f34090i == null) {
                    f34090i = new ory[0];
                }
            }
        }
        return f34090i;
    }

    public ory() {
        m39510g();
    }

    private ory m39510g() {
        this.f34091a = null;
        this.f34092b = null;
        this.f34093c = null;
        this.f34094d = osx.m39640d();
        this.f34095e = null;
        this.f34096f = ooz.m38990d();
        this.f34097g = osc.m39530d();
        this.f34098h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39512a(nyu nyu) {
        int i = 0;
        if (this.f34091a != null) {
            nyu.m37182b(1, this.f34091a);
        }
        if (this.f34092b != null) {
            nyu.m37182b(2, this.f34092b);
        }
        if (this.f34093c != null) {
            nyu.m37170a(3, this.f34093c);
        }
        if (this.f34094d != null && this.f34094d.length > 0) {
            for (nzf nzf : this.f34094d) {
                if (nzf != null) {
                    nyu.m37182b(4, nzf);
                }
            }
        }
        if (this.f34095e != null) {
            nyu.m37170a(5, this.f34095e);
        }
        if (this.f34096f != null && this.f34096f.length > 0) {
            for (nzf nzf2 : this.f34096f) {
                if (nzf2 != null) {
                    nyu.m37182b(6, nzf2);
                }
            }
        }
        if (this.f34097g != null && this.f34097g.length > 0) {
            while (i < this.f34097g.length) {
                nzf nzf3 = this.f34097g[i];
                if (nzf3 != null) {
                    nyu.m37182b(7, nzf3);
                }
                i++;
            }
        }
        if (this.f34098h != null) {
            nyu.m37168a(8, this.f34098h.intValue());
        }
        super.a(nyu);
    }

    protected int m39513b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f34091a != null) {
            b += nyu.m37145d(1, this.f34091a);
        }
        if (this.f34092b != null) {
            b += nyu.m37145d(2, this.f34092b);
        }
        if (this.f34093c != null) {
            b += nyu.m37137b(3, this.f34093c);
        }
        if (this.f34094d != null && this.f34094d.length > 0) {
            i = b;
            for (nzf nzf : this.f34094d) {
                if (nzf != null) {
                    i += nyu.m37145d(4, nzf);
                }
            }
            b = i;
        }
        if (this.f34095e != null) {
            b += nyu.m37137b(5, this.f34095e);
        }
        if (this.f34096f != null && this.f34096f.length > 0) {
            i = b;
            for (nzf nzf2 : this.f34096f) {
                if (nzf2 != null) {
                    i += nyu.m37145d(6, nzf2);
                }
            }
            b = i;
        }
        if (this.f34097g != null && this.f34097g.length > 0) {
            while (i2 < this.f34097g.length) {
                nzf nzf3 = this.f34097g[i2];
                if (nzf3 != null) {
                    b += nyu.m37145d(7, nzf3);
                }
                i2++;
            }
        }
        if (this.f34098h != null) {
            return b + nyu.m37147f(8, this.f34098h.intValue());
        }
        return b;
    }

    private ory m39508b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34091a == null) {
                        this.f34091a = new oqu();
                    }
                    nyt.m37101a(this.f34091a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f34092b == null) {
                        this.f34092b = new oos();
                    }
                    nyt.m37101a(this.f34092b);
                    continue;
                case wi.dx /*26*/:
                    this.f34093c = nyt.m37117j();
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f34094d == null) {
                        a = 0;
                    } else {
                        a = this.f34094d.length;
                    }
                    obj = new osx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34094d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osx();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new osx();
                    nyt.m37101a(obj[a]);
                    this.f34094d = obj;
                    continue;
                case 42:
                    this.f34095e = nyt.m37117j();
                    continue;
                case 50:
                    b = nzl.m37265b(nyt, 50);
                    if (this.f34096f == null) {
                        a = 0;
                    } else {
                        a = this.f34096f.length;
                    }
                    obj = new ooz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34096f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ooz();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ooz();
                    nyt.m37101a(obj[a]);
                    this.f34096f = obj;
                    continue;
                case 58:
                    b = nzl.m37265b(nyt, 58);
                    if (this.f34097g == null) {
                        a = 0;
                    } else {
                        a = this.f34097g.length;
                    }
                    obj = new osc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34097g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osc();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new osc();
                    nyt.m37101a(obj[a]);
                    this.f34097g = obj;
                    continue;
                case 64:
                    this.f34098h = Integer.valueOf(nyt.m37112f());
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
