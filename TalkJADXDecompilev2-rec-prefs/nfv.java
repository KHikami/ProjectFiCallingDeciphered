package p000;

public final class nfv extends nyx<nfv> {
    public nhx f29735a;
    public int[] f29736b;

    public /* synthetic */ nzf m34746a(nyt nyt) {
        return m34744b(nyt);
    }

    public nfv() {
        m34745d();
    }

    private nfv m34745d() {
        this.f29735a = null;
        this.f29736b = nzl.f31327a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34747a(nyu nyu) {
        if (this.f29735a != null) {
            nyu.m37182b(1, this.f29735a);
        }
        if (this.f29736b != null && this.f29736b.length > 0) {
            for (int a : this.f29736b) {
                nyu.m37168a(2, a);
            }
        }
        super.a(nyu);
    }

    protected int m34748b() {
        int i = 0;
        int b = super.b();
        if (this.f29735a != null) {
            b += nyu.m37145d(1, this.f29735a);
        }
        if (this.f29736b == null || this.f29736b.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f29736b.length) {
            i2 += nyu.m37150g(this.f29736b[i]);
            i++;
        }
        return (b + i2) + (this.f29736b.length * 1);
    }

    private nfv m34744b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29735a == null) {
                        this.f29735a = new nhx();
                    }
                    nyt.m37101a(this.f29735a);
                    continue;
                case 16:
                    int b = nzl.m37265b(nyt, 16);
                    Object obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.m37099a();
                        }
                        int f = nyt.m37112f();
                        switch (f) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
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
                        a = this.f29736b == null ? 0 : this.f29736b.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f29736b, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f29736b = obj2;
                            break;
                        }
                        this.f29736b = obj;
                        break;
                    }
                    continue;
                case wi.dH /*18*/:
                    i = nyt.m37108d(nyt.m37125r());
                    i2 = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        switch (nyt.m37112f()) {
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
                        nyt.m37113f(i2);
                        if (this.f29736b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f29736b.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f29736b, 0, obj3, 0, i2);
                        }
                        while (nyt.m37126s() > 0) {
                            int f2 = nyt.m37112f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f29736b = obj3;
                    }
                    nyt.m37111e(i);
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
