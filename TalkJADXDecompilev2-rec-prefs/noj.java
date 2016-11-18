package p000;

public final class noj extends nyx<noj> {
    public Long f30366a;
    public nom[] f30367b;
    public nok[] f30368c;
    public nol[] f30369d;
    public Integer f30370e;
    public Integer f30371f;

    public /* synthetic */ nzf m35904a(nyt nyt) {
        return m35902b(nyt);
    }

    public noj() {
        m35903d();
    }

    private noj m35903d() {
        this.f30366a = null;
        this.f30367b = nom.m35920d();
        this.f30368c = nok.m35908d();
        this.f30369d = nol.m35914d();
        this.f30370e = null;
        this.f30371f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35905a(nyu nyu) {
        int i = 0;
        if (this.f30366a != null) {
            nyu.m37181b(1, this.f30366a.longValue());
        }
        if (this.f30367b != null && this.f30367b.length > 0) {
            for (nzf nzf : this.f30367b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f30369d != null && this.f30369d.length > 0) {
            for (nzf nzf2 : this.f30369d) {
                if (nzf2 != null) {
                    nyu.m37182b(3, nzf2);
                }
            }
        }
        if (this.f30370e != null) {
            nyu.m37168a(4, this.f30370e.intValue());
        }
        if (this.f30371f != null) {
            nyu.m37168a(5, this.f30371f.intValue());
        }
        if (this.f30368c != null && this.f30368c.length > 0) {
            while (i < this.f30368c.length) {
                nzf nzf3 = this.f30368c[i];
                if (nzf3 != null) {
                    nyu.m37182b(6, nzf3);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m35906b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f30366a != null) {
            b += nyu.m37148f(1, this.f30366a.longValue());
        }
        if (this.f30367b != null && this.f30367b.length > 0) {
            i = b;
            for (nzf nzf : this.f30367b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f30369d != null && this.f30369d.length > 0) {
            i = b;
            for (nzf nzf2 : this.f30369d) {
                if (nzf2 != null) {
                    i += nyu.m37145d(3, nzf2);
                }
            }
            b = i;
        }
        if (this.f30370e != null) {
            b += nyu.m37147f(4, this.f30370e.intValue());
        }
        if (this.f30371f != null) {
            b += nyu.m37147f(5, this.f30371f.intValue());
        }
        if (this.f30368c != null && this.f30368c.length > 0) {
            while (i2 < this.f30368c.length) {
                nzf nzf3 = this.f30368c[i2];
                if (nzf3 != null) {
                    b += nyu.m37145d(6, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private noj m35902b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30366a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f30367b == null) {
                        a = 0;
                    } else {
                        a = this.f30367b.length;
                    }
                    obj = new nom[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30367b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nom();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nom();
                    nyt.m37101a(obj[a]);
                    this.f30367b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f30369d == null) {
                        a = 0;
                    } else {
                        a = this.f30369d.length;
                    }
                    obj = new nol[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30369d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nol();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nol();
                    nyt.m37101a(obj[a]);
                    this.f30369d = obj;
                    continue;
                case 32:
                    this.f30370e = Integer.valueOf(nyt.m37112f());
                    continue;
                case 40:
                    this.f30371f = Integer.valueOf(nyt.m37112f());
                    continue;
                case 50:
                    b = nzl.m37265b(nyt, 50);
                    if (this.f30368c == null) {
                        a = 0;
                    } else {
                        a = this.f30368c.length;
                    }
                    obj = new nok[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30368c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nok();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nok();
                    nyt.m37101a(obj[a]);
                    this.f30368c = obj;
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
