package p000;

public final class knp extends nyx<knp> {
    public Integer f22429a;
    public Integer f22430b;
    public knq[] f22431c;
    public Boolean f22432d;
    public Integer f22433e;
    public Integer f22434f;
    public Integer f22435g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26696b(nyt);
    }

    public knp() {
        m26697d();
    }

    private knp m26697d() {
        this.f22431c = knq.m26702d();
        this.f22432d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22429a != null) {
            nyu.a(1, this.f22429a.intValue());
        }
        if (this.f22430b != null) {
            nyu.a(2, this.f22430b.intValue());
        }
        if (this.f22431c != null && this.f22431c.length > 0) {
            for (nzf nzf : this.f22431c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f22432d != null) {
            nyu.a(4, this.f22432d.booleanValue());
        }
        if (this.f22433e != null) {
            nyu.a(5, this.f22433e.intValue());
        }
        if (this.f22434f != null) {
            nyu.a(6, this.f22434f.intValue());
        }
        if (this.f22435g != null) {
            nyu.a(7, this.f22435g.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22429a != null) {
            b += nyu.f(1, this.f22429a.intValue());
        }
        if (this.f22430b != null) {
            b += nyu.f(2, this.f22430b.intValue());
        }
        if (this.f22431c != null && this.f22431c.length > 0) {
            int i = b;
            for (nzf nzf : this.f22431c) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f22432d != null) {
            this.f22432d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f22433e != null) {
            b += nyu.f(5, this.f22433e.intValue());
        }
        if (this.f22434f != null) {
            b += nyu.f(6, this.f22434f.intValue());
        }
        if (this.f22435g != null) {
            return b + nyu.f(7, this.f22435g.intValue());
        }
        return b;
    }

    private knp m26696b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 10:
                        case 20:
                        case 30:
                        case 40:
                        case 50:
                            this.f22429a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 10:
                        case 20:
                        case 30:
                        case 40:
                        case 50:
                            this.f22430b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f22431c == null) {
                        a = 0;
                    } else {
                        a = this.f22431c.length;
                    }
                    Object obj = new knq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22431c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new knq();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new knq();
                    nyt.a(obj[a]);
                    this.f22431c = obj;
                    continue;
                case 32:
                    this.f22432d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 10:
                        case 20:
                        case 30:
                        case 40:
                        case 50:
                            this.f22433e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 10:
                        case 20:
                        case 30:
                        case 40:
                        case 50:
                            this.f22434f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f22435g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
