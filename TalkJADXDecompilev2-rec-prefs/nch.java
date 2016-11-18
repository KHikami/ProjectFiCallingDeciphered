package p000;

public final class nch extends nyx<nch> {
    private static volatile nch[] f29495e;
    public ncj f29496a;
    public int[] f29497b;
    public int f29498c;
    public nqe f29499d;

    public /* synthetic */ nzf m34302a(nyt nyt) {
        return m34300b(nyt);
    }

    public static nch[] m34301d() {
        if (f29495e == null) {
            synchronized (nzc.f31309c) {
                if (f29495e == null) {
                    f29495e = new nch[0];
                }
            }
        }
        return f29495e;
    }

    public nch() {
        this.f29497b = nzl.f31327a;
        this.f29498c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m34303a(nyu nyu) {
        if (this.f29496a != null) {
            nyu.m37182b(1, this.f29496a);
        }
        if (this.f29497b != null && this.f29497b.length > 0) {
            for (int a : this.f29497b) {
                nyu.m37168a(2, a);
            }
        }
        if (this.f29498c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(3, this.f29498c);
        }
        if (this.f29499d != null) {
            nyu.m37182b(4, this.f29499d);
        }
        super.a(nyu);
    }

    protected int m34304b() {
        int i = 0;
        int b = super.b();
        if (this.f29496a != null) {
            b += nyu.m37145d(1, this.f29496a);
        }
        if (this.f29497b != null && this.f29497b.length > 0) {
            int i2 = 0;
            while (i < this.f29497b.length) {
                i2 += nyu.m37150g(this.f29497b[i]);
                i++;
            }
            b = (b + i2) + (this.f29497b.length * 1);
        }
        if (this.f29498c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(3, this.f29498c);
        }
        if (this.f29499d != null) {
            return b + nyu.m37145d(4, this.f29499d);
        }
        return b;
    }

    private nch m34300b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29496a == null) {
                        this.f29496a = new ncj();
                    }
                    nyt.m37101a(this.f29496a);
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
                        a = this.f29497b == null ? 0 : this.f29497b.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f29497b, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f29497b = obj2;
                            break;
                        }
                        this.f29497b = obj;
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
                        if (this.f29497b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f29497b.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f29497b, 0, obj3, 0, i2);
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
                        this.f29497b = obj3;
                    }
                    nyt.m37111e(i);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f29498c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f29499d == null) {
                        this.f29499d = new nqe();
                    }
                    nyt.m37101a(this.f29499d);
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
