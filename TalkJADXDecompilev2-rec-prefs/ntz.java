package p000;

public final class ntz extends nyx<ntz> {
    private static volatile ntz[] f30802e;
    public nua f30803a;
    public int[] f30804b;
    public Integer f30805c;
    public nue f30806d;

    public /* synthetic */ nzf m36547a(nyt nyt) {
        return m36544b(nyt);
    }

    public static ntz[] m36545d() {
        if (f30802e == null) {
            synchronized (nzc.f31309c) {
                if (f30802e == null) {
                    f30802e = new ntz[0];
                }
            }
        }
        return f30802e;
    }

    public ntz() {
        m36546g();
    }

    private ntz m36546g() {
        this.f30803a = null;
        this.f30804b = nzl.f31327a;
        this.f30806d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36548a(nyu nyu) {
        if (this.f30803a != null) {
            nyu.m37182b(1, this.f30803a);
        }
        if (this.f30804b != null && this.f30804b.length > 0) {
            for (int a : this.f30804b) {
                nyu.m37168a(2, a);
            }
        }
        if (this.f30805c != null) {
            nyu.m37168a(3, this.f30805c.intValue());
        }
        if (this.f30806d != null) {
            nyu.m37182b(4, this.f30806d);
        }
        super.a(nyu);
    }

    protected int m36549b() {
        int i = 0;
        int b = super.b();
        if (this.f30803a != null) {
            b += nyu.m37145d(1, this.f30803a);
        }
        if (this.f30804b != null && this.f30804b.length > 0) {
            int i2 = 0;
            while (i < this.f30804b.length) {
                i2 += nyu.m37150g(this.f30804b[i]);
                i++;
            }
            b = (b + i2) + (this.f30804b.length * 1);
        }
        if (this.f30805c != null) {
            b += nyu.m37147f(3, this.f30805c.intValue());
        }
        if (this.f30806d != null) {
            return b + nyu.m37145d(4, this.f30806d);
        }
        return b;
    }

    private ntz m36544b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30803a == null) {
                        this.f30803a = new nua();
                    }
                    nyt.m37101a(this.f30803a);
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
                        a = this.f30804b == null ? 0 : this.f30804b.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f30804b, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f30804b = obj2;
                            break;
                        }
                        this.f30804b = obj;
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
                        if (this.f30804b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f30804b.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f30804b, 0, obj3, 0, i2);
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
                        this.f30804b = obj3;
                    }
                    nyt.m37111e(i);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f30805c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f30806d == null) {
                        this.f30806d = new nue();
                    }
                    nyt.m37101a(this.f30806d);
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
