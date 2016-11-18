package p000;

public final class lai extends nyx<lai> {
    public Boolean f24353a;
    public int[] f24354b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28352b(nyt);
    }

    public lai() {
        m28353d();
    }

    private lai m28353d() {
        this.f24353a = null;
        this.f24354b = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24353a != null) {
            nyu.a(1, this.f24353a.booleanValue());
        }
        if (this.f24354b != null && this.f24354b.length > 0) {
            for (int a : this.f24354b) {
                nyu.a(2, a);
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f24353a != null) {
            this.f24353a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f24354b == null || this.f24354b.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f24354b.length) {
            i2 += nyu.g(this.f24354b[i]);
            i++;
        }
        return (b + i2) + (this.f24354b.length * 1);
    }

    private lai m28352b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24353a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    int b = nzl.b(nyt, 16);
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
                        a = this.f24354b == null ? 0 : this.f24354b.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f24354b, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f24354b = obj2;
                            break;
                        }
                        this.f24354b = obj;
                        break;
                    }
                    continue;
                case wi.dH /*18*/:
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
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f24354b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f24354b.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f24354b, 0, obj3, 0, i2);
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
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f24354b = obj3;
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
