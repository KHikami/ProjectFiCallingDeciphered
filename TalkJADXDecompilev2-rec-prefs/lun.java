package p000;

public final class lun extends nyx<lun> {
    public lor f26501a;
    public Long f26502b;
    public Integer f26503c;
    public int[] f26504d;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30622b(nyt);
    }

    public lun() {
        m30623d();
    }

    private lun m30623d() {
        this.requestHeader = null;
        this.f26501a = null;
        this.f26502b = null;
        this.f26504d = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26501a != null) {
            nyu.b(2, this.f26501a);
        }
        if (this.f26503c != null) {
            nyu.a(3, this.f26503c.intValue());
        }
        if (this.f26502b != null) {
            nyu.a(4, this.f26502b.longValue());
        }
        if (this.f26504d != null && this.f26504d.length > 0) {
            for (int a : this.f26504d) {
                nyu.a(5, a);
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26501a != null) {
            b += nyu.d(2, this.f26501a);
        }
        if (this.f26503c != null) {
            b += nyu.f(3, this.f26503c.intValue());
        }
        if (this.f26502b != null) {
            b += nyu.e(4, this.f26502b.longValue());
        }
        if (this.f26504d == null || this.f26504d.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f26504d.length) {
            i2 += nyu.g(this.f26504d[i]);
            i++;
        }
        return (b + i2) + (this.f26504d.length * 1);
    }

    private lun m30622b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
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
                    if (this.f26501a == null) {
                        this.f26501a = new lor();
                    }
                    nyt.a(this.f26501a);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26503c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.f26502b = Long.valueOf(nyt.d());
                    continue;
                case 40:
                    int b = nzl.b(nyt, 40);
                    Object obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case 1:
                            case 2:
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
                        a = this.f26504d == null ? 0 : this.f26504d.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f26504d, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f26504d = obj2;
                            break;
                        }
                        this.f26504d = obj;
                        break;
                    }
                    continue;
                case 42:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 1:
                            case 2:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f26504d == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f26504d.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f26504d, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 1:
                                case 2:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f26504d = obj3;
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
