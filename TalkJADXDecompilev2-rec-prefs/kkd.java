package p000;

public final class kkd extends nyx<kkd> {
    public kke[] f22034a;
    public int[] f22035b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26209b(nyt);
    }

    public kkd() {
        m26210d();
    }

    private kkd m26210d() {
        this.f22034a = kke.m26215d();
        this.f22035b = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22034a != null && this.f22034a.length > 0) {
            for (nzf nzf : this.f22034a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f22035b != null && this.f22035b.length > 0) {
            while (i < this.f22035b.length) {
                nyu.a(2, this.f22035b[i]);
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f22034a != null && this.f22034a.length > 0) {
            i = b;
            for (nzf nzf : this.f22034a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f22035b == null || this.f22035b.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f22035b.length) {
            i += nyu.g(this.f22035b[i2]);
            i2++;
        }
        return (b + i) + (this.f22035b.length * 1);
    }

    private kkd m26209b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f22034a == null) {
                        a = 0;
                    } else {
                        a = this.f22034a.length;
                    }
                    Object obj = new kke[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22034a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kke();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kke();
                    nyt.a(obj[a]);
                    this.f22034a = obj;
                    continue;
                case 16:
                    int b2 = nzl.b(nyt, 16);
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
                        a = this.f22035b == null ? 0 : this.f22035b.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f22035b, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.f22035b = obj3;
                            break;
                        }
                        this.f22035b = obj2;
                        break;
                    }
                    continue;
                case wi.dH /*18*/:
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
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.f22035b == null) {
                            b = 0;
                        } else {
                            b = this.f22035b.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f22035b, 0, obj4, 0, b);
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
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f22035b = obj4;
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
