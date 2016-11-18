package p000;

public final class nrd extends nyx<nrd> {
    public int[] f30581a;

    public /* synthetic */ nzf m36235a(nyt nyt) {
        return m36234b(nyt);
    }

    public nrd() {
        this.f30581a = nzl.f31327a;
        this.cachedSize = -1;
    }

    public void m36236a(nyu nyu) {
        if (this.f30581a != null && this.f30581a.length > 0) {
            for (int a : this.f30581a) {
                nyu.m37168a(1, a);
            }
        }
        super.a(nyu);
    }

    protected int m36237b() {
        int i = 0;
        int b = super.b();
        if (this.f30581a == null || this.f30581a.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f30581a.length) {
            i2 += nyu.m37150g(this.f30581a[i]);
            i++;
        }
        return (b + i2) + (this.f30581a.length * 1);
    }

    private nrd m36234b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    int b = nzl.m37265b(nyt, 8);
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
                        a = this.f30581a == null ? 0 : this.f30581a.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f30581a, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f30581a = obj2;
                            break;
                        }
                        this.f30581a = obj;
                        break;
                    }
                    continue;
                case 10:
                    i = nyt.m37108d(nyt.m37125r());
                    i2 = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        switch (nyt.m37112f()) {
                            case 0:
                            case 1:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.m37113f(i2);
                        if (this.f30581a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f30581a.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f30581a, 0, obj3, 0, i2);
                        }
                        while (nyt.m37126s() > 0) {
                            int f2 = nyt.m37112f();
                            switch (f2) {
                                case 0:
                                case 1:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f30581a = obj3;
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
