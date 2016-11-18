package p000;

public final class mzv extends nyx<mzv> {
    public int[] f29254a;

    public /* synthetic */ nzf m33977a(nyt nyt) {
        return m33976b(nyt);
    }

    public mzv() {
        this.f29254a = nzl.f31327a;
        this.cachedSize = -1;
    }

    public void m33978a(nyu nyu) {
        if (this.f29254a != null && this.f29254a.length > 0) {
            for (int a : this.f29254a) {
                nyu.m37168a(1, a);
            }
        }
        super.a(nyu);
    }

    protected int m33979b() {
        int i = 0;
        int b = super.b();
        if (this.f29254a == null || this.f29254a.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f29254a.length) {
            i2 += nyu.m37150g(this.f29254a[i]);
            i++;
        }
        return (b + i2) + (this.f29254a.length * 1);
    }

    private mzv m33976b(nyt nyt) {
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
                        a = this.f29254a == null ? 0 : this.f29254a.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f29254a, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f29254a = obj2;
                            break;
                        }
                        this.f29254a = obj;
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
                        if (this.f29254a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f29254a.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f29254a, 0, obj3, 0, i2);
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
                        this.f29254a = obj3;
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
