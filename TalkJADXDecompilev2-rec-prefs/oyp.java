package p000;

public final class oyp extends nyx<oyp> {
    public int[] f34662a;

    public /* synthetic */ nzf m39942a(nyt nyt) {
        return m39940b(nyt);
    }

    public oyp() {
        m39941d();
    }

    private oyp m39941d() {
        this.f34662a = nzl.f31327a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39943a(nyu nyu) {
        if (this.f34662a != null && this.f34662a.length > 0) {
            for (int a : this.f34662a) {
                nyu.m37168a(1, a);
            }
        }
        super.a(nyu);
    }

    protected int m39944b() {
        int i = 0;
        int b = super.b();
        if (this.f34662a == null || this.f34662a.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f34662a.length) {
            i2 += nyu.m37150g(this.f34662a[i]);
            i++;
        }
        return (b + i2) + (this.f34662a.length * 1);
    }

    private oyp m39940b(nyt nyt) {
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
                            case 4:
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
                        a = this.f34662a == null ? 0 : this.f34662a.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f34662a, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f34662a = obj2;
                            break;
                        }
                        this.f34662a = obj;
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
                            case 4:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.m37113f(i2);
                        if (this.f34662a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f34662a.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f34662a, 0, obj3, 0, i2);
                        }
                        while (nyt.m37126s() > 0) {
                            int f2 = nyt.m37112f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f34662a = obj3;
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
