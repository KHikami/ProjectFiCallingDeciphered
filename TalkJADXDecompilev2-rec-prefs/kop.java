package p000;

public final class kop extends nyx<kop> {
    public String f22555a;
    public Boolean f22556b;
    public int[] f22557c;
    public Integer f22558d;
    public Integer f22559e;
    public Integer f22560f;
    public Integer f22561g;
    public String f22562h;
    public Boolean f22563i;
    public Boolean f22564j;
    public Boolean f22565k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26816b(nyt);
    }

    public kop() {
        m26817d();
    }

    private kop m26817d() {
        this.f22555a = null;
        this.f22556b = null;
        this.f22557c = nzl.a;
        this.f22558d = null;
        this.f22559e = null;
        this.f22560f = null;
        this.f22562h = null;
        this.f22563i = null;
        this.f22564j = null;
        this.f22565k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22555a != null) {
            nyu.a(1, this.f22555a);
        }
        if (this.f22556b != null) {
            nyu.a(2, this.f22556b.booleanValue());
        }
        if (this.f22557c != null && this.f22557c.length > 0) {
            for (int a : this.f22557c) {
                nyu.a(3, a);
            }
        }
        if (this.f22558d != null) {
            nyu.a(4, this.f22558d.intValue());
        }
        if (this.f22559e != null) {
            nyu.a(5, this.f22559e.intValue());
        }
        if (this.f22560f != null) {
            nyu.a(6, this.f22560f.intValue());
        }
        if (this.f22561g != null) {
            nyu.a(7, this.f22561g.intValue());
        }
        if (this.f22562h != null) {
            nyu.a(8, this.f22562h);
        }
        if (this.f22563i != null) {
            nyu.a(9, this.f22563i.booleanValue());
        }
        if (this.f22564j != null) {
            nyu.a(10, this.f22564j.booleanValue());
        }
        if (this.f22565k != null) {
            nyu.a(11, this.f22565k.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22555a != null) {
            b += nyu.b(1, this.f22555a);
        }
        if (this.f22556b != null) {
            this.f22556b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f22557c != null && this.f22557c.length > 0) {
            int i2 = 0;
            while (i < this.f22557c.length) {
                i2 += nyu.g(this.f22557c[i]);
                i++;
            }
            b = (b + i2) + (this.f22557c.length * 1);
        }
        if (this.f22558d != null) {
            b += nyu.f(4, this.f22558d.intValue());
        }
        if (this.f22559e != null) {
            b += nyu.f(5, this.f22559e.intValue());
        }
        if (this.f22560f != null) {
            b += nyu.f(6, this.f22560f.intValue());
        }
        if (this.f22561g != null) {
            b += nyu.f(7, this.f22561g.intValue());
        }
        if (this.f22562h != null) {
            b += nyu.b(8, this.f22562h);
        }
        if (this.f22563i != null) {
            this.f22563i.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.f22564j != null) {
            this.f22564j.booleanValue();
            b += nyu.h(10) + 1;
        }
        if (this.f22565k == null) {
            return b;
        }
        this.f22565k.booleanValue();
        return b + (nyu.h(11) + 1);
    }

    private kop m26816b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22555a = nyt.j();
                    continue;
                case 16:
                    this.f22556b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    int b = nzl.b(nyt, 24);
                    Object obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                a = i2 + 1;
                                obj[i2] = f;
                                break;
                            default:
                                a = i2;
                                break;
                        }
                        i++;
                        i2 = a;
                    }
                    if (i2 != 0) {
                        a = this.f22557c == null ? 0 : this.f22557c.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f22557c, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f22557c = obj2;
                            break;
                        }
                        this.f22557c = obj;
                        break;
                    }
                    continue;
                case wi.dx /*26*/:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f22557c == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f22557c.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f22557c, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f22557c = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 32:
                    this.f22558d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f22559e = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f22560f = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f22561g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 66:
                    this.f22562h = nyt.j();
                    continue;
                case 72:
                    this.f22563i = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    this.f22564j = Boolean.valueOf(nyt.i());
                    continue;
                case 88:
                    this.f22565k = Boolean.valueOf(nyt.i());
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
