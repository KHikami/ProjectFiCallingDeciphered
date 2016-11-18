package p000;

public final class pbs extends nyx<pbs> {
    public pbt f34971a;
    public pbt[] f34972b;
    public pbu f34973c;
    public int[] f34974d;

    public /* synthetic */ nzf m40228a(nyt nyt) {
        return m40227b(nyt);
    }

    public pbs() {
        this.f34972b = pbt.m40232d();
        this.f34974d = nzl.f31327a;
        this.cachedSize = -1;
    }

    public void m40229a(nyu nyu) {
        int i = 0;
        if (this.f34971a != null) {
            nyu.m37182b(1, this.f34971a);
        }
        if (this.f34973c != null) {
            nyu.m37182b(2, this.f34973c);
        }
        if (this.f34974d != null && this.f34974d.length > 0) {
            for (int a : this.f34974d) {
                nyu.m37168a(3, a);
            }
        }
        if (this.f34972b != null && this.f34972b.length > 0) {
            while (i < this.f34972b.length) {
                nzf nzf = this.f34972b[i];
                if (nzf != null) {
                    nyu.m37182b(4, nzf);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m40230b() {
        int i = 0;
        int b = super.b();
        if (this.f34971a != null) {
            b += nyu.m37145d(1, this.f34971a);
        }
        if (this.f34973c != null) {
            b += nyu.m37145d(2, this.f34973c);
        }
        if (this.f34974d != null && this.f34974d.length > 0) {
            int i2 = 0;
            for (int g : this.f34974d) {
                i2 += nyu.m37150g(g);
            }
            b = (b + i2) + (this.f34974d.length * 1);
        }
        if (this.f34972b != null && this.f34972b.length > 0) {
            while (i < this.f34972b.length) {
                nzf nzf = this.f34972b[i];
                if (nzf != null) {
                    b += nyu.m37145d(4, nzf);
                }
                i++;
            }
        }
        return b;
    }

    private pbs m40227b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34971a == null) {
                        this.f34971a = new pbt();
                    }
                    nyt.m37101a(this.f34971a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f34973c == null) {
                        this.f34973c = new pbu();
                    }
                    nyt.m37101a(this.f34973c);
                    continue;
                case wi.dA /*24*/:
                    int b = nzl.m37265b(nyt, 24);
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
                        a = this.f34974d == null ? 0 : this.f34974d.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f34974d, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f34974d = obj2;
                            break;
                        }
                        this.f34974d = obj;
                        break;
                    }
                    continue;
                case wi.dx /*26*/:
                    i = nyt.m37108d(nyt.m37125r());
                    i2 = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        switch (nyt.m37112f()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.m37113f(i2);
                        if (this.f34974d == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f34974d.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f34974d, 0, obj3, 0, i2);
                        }
                        while (nyt.m37126s() > 0) {
                            int f2 = nyt.m37112f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f34974d = obj3;
                    }
                    nyt.m37111e(i);
                    continue;
                case 34:
                    i2 = nzl.m37265b(nyt, 34);
                    if (this.f34972b == null) {
                        a = 0;
                    } else {
                        a = this.f34972b.length;
                    }
                    Object obj4 = new pbt[(i2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34972b, 0, obj4, 0, a);
                    }
                    while (a < obj4.length - 1) {
                        obj4[a] = new pbt();
                        nyt.m37101a(obj4[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj4[a] = new pbt();
                    nyt.m37101a(obj4[a]);
                    this.f34972b = obj4;
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
