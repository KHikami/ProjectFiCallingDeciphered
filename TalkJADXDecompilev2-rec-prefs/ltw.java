package p000;

public final class ltw extends nyx<ltw> {
    public Integer f26425a;
    public String f26426b;
    public int[] f26427c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30516b(nyt);
    }

    public ltw() {
        m30517d();
    }

    private ltw m30517d() {
        this.f26426b = null;
        this.f26427c = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26425a != null) {
            nyu.a(1, this.f26425a.intValue());
        }
        if (this.f26426b != null) {
            nyu.a(2, this.f26426b);
        }
        if (this.f26427c != null && this.f26427c.length > 0) {
            for (int a : this.f26427c) {
                nyu.a(3, a);
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f26425a != null) {
            b += nyu.f(1, this.f26425a.intValue());
        }
        if (this.f26426b != null) {
            b += nyu.b(2, this.f26426b);
        }
        if (this.f26427c == null || this.f26427c.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f26427c.length) {
            i2 += nyu.g(this.f26427c[i]);
            i++;
        }
        return (b + i2) + (this.f26427c.length * 1);
    }

    private ltw m30516b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f26425a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f26426b = nyt.j();
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
                        a = this.f26427c == null ? 0 : this.f26427c.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f26427c, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f26427c = obj2;
                            break;
                        }
                        this.f26427c = obj;
                        break;
                    }
                    continue;
                case wi.dx /*26*/:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
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
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f26427c == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f26427c.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f26427c, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
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
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f26427c = obj3;
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
