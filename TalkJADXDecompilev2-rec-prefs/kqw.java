package p000;

public final class kqw extends nyx<kqw> {
    public led f22822a;
    public Boolean f22823b;
    public Boolean f22824c;
    public ldw[] f22825d;
    public ldw[] f22826e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27121b(nyt);
    }

    public kqw() {
        m27122d();
    }

    private kqw m27122d() {
        this.f22822a = null;
        this.f22823b = null;
        this.f22824c = null;
        this.f22825d = ldw.m28800d();
        this.f22826e = ldw.m28800d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22822a != null) {
            nyu.b(1, this.f22822a);
        }
        if (this.f22823b != null) {
            nyu.a(2, this.f22823b.booleanValue());
        }
        if (this.f22824c != null) {
            nyu.a(3, this.f22824c.booleanValue());
        }
        if (this.f22825d != null && this.f22825d.length > 0) {
            for (nzf nzf : this.f22825d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.f22826e != null && this.f22826e.length > 0) {
            while (i < this.f22826e.length) {
                nzf nzf2 = this.f22826e[i];
                if (nzf2 != null) {
                    nyu.b(5, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22822a != null) {
            b += nyu.d(1, this.f22822a);
        }
        if (this.f22823b != null) {
            this.f22823b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f22824c != null) {
            this.f22824c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f22825d != null && this.f22825d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f22825d) {
                if (nzf != null) {
                    i2 += nyu.d(4, nzf);
                }
            }
            b = i2;
        }
        if (this.f22826e != null && this.f22826e.length > 0) {
            while (i < this.f22826e.length) {
                nzf nzf2 = this.f22826e[i];
                if (nzf2 != null) {
                    b += nyu.d(5, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private kqw m27121b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22822a == null) {
                        this.f22822a = new led();
                    }
                    nyt.a(this.f22822a);
                    continue;
                case 16:
                    this.f22823b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f22824c = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f22825d == null) {
                        a = 0;
                    } else {
                        a = this.f22825d.length;
                    }
                    obj = new ldw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22825d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldw();
                    nyt.a(obj[a]);
                    this.f22825d = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f22826e == null) {
                        a = 0;
                    } else {
                        a = this.f22826e.length;
                    }
                    obj = new ldw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22826e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldw();
                    nyt.a(obj[a]);
                    this.f22826e = obj;
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
