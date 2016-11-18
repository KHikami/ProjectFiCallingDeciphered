package defpackage;

public final class noj extends nyx<noj> {
    public Long a;
    public nom[] b;
    public nok[] c;
    public nol[] d;
    public Integer e;
    public Integer f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public noj() {
        d();
    }

    private noj d() {
        this.a = null;
        this.b = nom.d();
        this.c = nok.d();
        this.d = nol.d();
        this.e = null;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf2 : this.d) {
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
            }
        }
        if (this.e != null) {
            nyu.a(4, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(5, this.f.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nzf nzf3 = this.c[i];
                if (nzf3 != null) {
                    nyu.b(6, nzf3);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.d != null && this.d.length > 0) {
            i = b;
            for (nzf nzf2 : this.d) {
                if (nzf2 != null) {
                    i += nyu.d(3, nzf2);
                }
            }
            b = i;
        }
        if (this.e != null) {
            b += nyu.f(4, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.f(5, this.f.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            while (i2 < this.c.length) {
                nzf nzf3 = this.c[i2];
                if (nzf3 != null) {
                    b += nyu.d(6, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private noj b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new nom[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nom();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nom();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new nol[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nol();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nol();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 32:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f = Integer.valueOf(nyt.f());
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new nok[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nok();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nok();
                    nyt.a(obj[a]);
                    this.c = obj;
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
