package defpackage;

public final class ory extends nyx<ory> {
    private static volatile ory[] i;
    public oqu a;
    public oos b;
    public String c;
    public osx[] d;
    public String e;
    public ooz[] f;
    public osc[] g;
    public Integer h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ory[] d() {
        if (i == null) {
            synchronized (nzc.c) {
                if (i == null) {
                    i = new ory[0];
                }
            }
        }
        return i;
    }

    public ory() {
        g();
    }

    private ory g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = osx.d();
        this.e = null;
        this.f = ooz.d();
        this.g = osc.d();
        this.h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            for (nzf nzf2 : this.f) {
                if (nzf2 != null) {
                    nyu.b(6, nzf2);
                }
            }
        }
        if (this.g != null && this.g.length > 0) {
            while (i < this.g.length) {
                nzf nzf3 = this.g[i];
                if (nzf3 != null) {
                    nyu.b(7, nzf3);
                }
                i++;
            }
        }
        if (this.h != null) {
            nyu.a(8, this.h.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            i = b;
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    i += nyu.d(4, nzf);
                }
            }
            b = i;
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            i = b;
            for (nzf nzf2 : this.f) {
                if (nzf2 != null) {
                    i += nyu.d(6, nzf2);
                }
            }
            b = i;
        }
        if (this.g != null && this.g.length > 0) {
            while (i2 < this.g.length) {
                nzf nzf3 = this.g[i2];
                if (nzf3 != null) {
                    b += nyu.d(7, nzf3);
                }
                i2++;
            }
        }
        if (this.h != null) {
            return b + nyu.f(8, this.h.intValue());
        }
        return b;
    }

    private ory b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new oqu();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new oos();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new osx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new osx();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new ooz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ooz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ooz();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.g == null) {
                        a = 0;
                    } else {
                        a = this.g.length;
                    }
                    obj = new osc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new osc();
                    nyt.a(obj[a]);
                    this.g = obj;
                    continue;
                case 64:
                    this.h = Integer.valueOf(nyt.f());
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
