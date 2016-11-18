package p000;

public final class lrd extends nyx<lrd> {
    public lqd[] f26205a;
    public int[] f26206b;
    public lqd f26207c;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30145b(nyt);
    }

    public lrd() {
        m30146d();
    }

    private lrd m30146d() {
        this.requestHeader = null;
        this.f26205a = lqd.m30008d();
        this.f26206b = nzl.a;
        this.f26207c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26207c != null) {
            nyu.b(2, this.f26207c);
        }
        if (this.f26205a != null && this.f26205a.length > 0) {
            for (nzf nzf : this.f26205a) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f26206b != null && this.f26206b.length > 0) {
            while (i < this.f26206b.length) {
                nyu.a(4, this.f26206b[i]);
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26207c != null) {
            b += nyu.d(2, this.f26207c);
        }
        if (this.f26205a != null && this.f26205a.length > 0) {
            i = b;
            for (nzf nzf : this.f26205a) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f26206b == null || this.f26206b.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f26206b.length) {
            i += nyu.g(this.f26206b[i2]);
            i2++;
        }
        return (b + i) + (this.f26206b.length * 1);
    }

    private lrd m30145b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26207c == null) {
                        this.f26207c = new lqd();
                    }
                    nyt.a(this.f26207c);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f26205a == null) {
                        a = 0;
                    } else {
                        a = this.f26205a.length;
                    }
                    Object obj = new lqd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26205a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqd();
                    nyt.a(obj[a]);
                    this.f26205a = obj;
                    continue;
                case 32:
                    int b2 = nzl.b(nyt, 32);
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
                        a = this.f26206b == null ? 0 : this.f26206b.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f26206b, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.f26206b = obj3;
                            break;
                        }
                        this.f26206b = obj2;
                        break;
                    }
                    continue;
                case 34:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                            case 2:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.f26206b == null) {
                            b = 0;
                        } else {
                            b = this.f26206b.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f26206b, 0, obj4, 0, b);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f26206b = obj4;
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
