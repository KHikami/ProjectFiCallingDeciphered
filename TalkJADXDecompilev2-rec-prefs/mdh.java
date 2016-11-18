package p000;

public final class mdh extends nyx<mdh> {
    public mdi[] f27453a;
    public mdj[] f27454b;
    public int[] f27455c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31835b(nyt);
    }

    public mdh() {
        m31836d();
    }

    private mdh m31836d() {
        this.f27453a = mdi.m31841d();
        this.f27454b = mdj.m31847d();
        this.f27455c = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27453a != null && this.f27453a.length > 0) {
            for (nzf nzf : this.f27453a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f27454b != null && this.f27454b.length > 0) {
            for (nzf nzf2 : this.f27454b) {
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
            }
        }
        if (this.f27455c != null && this.f27455c.length > 0) {
            while (i < this.f27455c.length) {
                nyu.a(3, this.f27455c[i]);
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f27453a != null && this.f27453a.length > 0) {
            i = b;
            for (nzf nzf : this.f27453a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f27454b != null && this.f27454b.length > 0) {
            i = b;
            for (nzf nzf2 : this.f27454b) {
                if (nzf2 != null) {
                    i += nyu.d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.f27455c == null || this.f27455c.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f27455c.length) {
            i += nyu.g(this.f27455c[i2]);
            i2++;
        }
        return (b + i) + (this.f27455c.length * 1);
    }

    private mdh m31835b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f27453a == null) {
                        a = 0;
                    } else {
                        a = this.f27453a.length;
                    }
                    obj = new mdi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27453a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mdi();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mdi();
                    nyt.a(obj[a]);
                    this.f27453a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f27454b == null) {
                        a = 0;
                    } else {
                        a = this.f27454b.length;
                    }
                    obj = new mdj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27454b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mdj();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mdj();
                    nyt.a(obj[a]);
                    this.f27454b = obj;
                    continue;
                case wi.dA /*24*/:
                    int b2 = nzl.b(nyt, 24);
                    Object obj2 = new int[b2];
                    i = 0;
                    b = 0;
                    while (i < b2) {
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
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case wi.dK /*17*/:
                            case wi.dH /*18*/:
                                a = b + 1;
                                obj2[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        i++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.f27455c == null ? 0 : this.f27455c.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f27455c, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.f27455c = obj3;
                            break;
                        }
                        this.f27455c = obj2;
                        break;
                    }
                    continue;
                case wi.dx /*26*/:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
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
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case wi.dK /*17*/:
                            case wi.dH /*18*/:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.f27455c == null) {
                            b = 0;
                        } else {
                            b = this.f27455c.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f27455c, 0, obj4, 0, b);
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
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case wi.dK /*17*/:
                                case wi.dH /*18*/:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f27455c = obj4;
                    }
                    nyt.e(i);
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
