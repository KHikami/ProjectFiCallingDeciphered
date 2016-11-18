package p000;

public final class mbx extends nyx<mbx> {
    private static volatile mbx[] f27278e;
    public mby f27279a;
    public int[] f27280b;
    public String f27281c;
    public String f27282d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31649b(nyt);
    }

    public static mbx[] m31650d() {
        if (f27278e == null) {
            synchronized (nzc.c) {
                if (f27278e == null) {
                    f27278e = new mbx[0];
                }
            }
        }
        return f27278e;
    }

    public mbx() {
        m31651g();
    }

    private mbx m31651g() {
        this.f27279a = null;
        this.f27280b = nzl.a;
        this.f27281c = null;
        this.f27282d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27279a != null) {
            nyu.b(1, this.f27279a);
        }
        if (this.f27280b != null && this.f27280b.length > 0) {
            for (int a : this.f27280b) {
                nyu.a(2, a);
            }
        }
        if (this.f27281c != null) {
            nyu.a(3, this.f27281c);
        }
        if (this.f27282d != null) {
            nyu.a(4, this.f27282d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27279a != null) {
            b += nyu.d(1, this.f27279a);
        }
        if (this.f27280b != null && this.f27280b.length > 0) {
            int i2 = 0;
            while (i < this.f27280b.length) {
                i2 += nyu.g(this.f27280b[i]);
                i++;
            }
            b = (b + i2) + (this.f27280b.length * 1);
        }
        if (this.f27281c != null) {
            b += nyu.b(3, this.f27281c);
        }
        if (this.f27282d != null) {
            return b + nyu.b(4, this.f27282d);
        }
        return b;
    }

    private mbx m31649b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27279a == null) {
                        this.f27279a = new mby();
                    }
                    nyt.a(this.f27279a);
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
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
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
                        a = this.f27280b == null ? 0 : this.f27280b.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f27280b, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f27280b = obj2;
                            break;
                        }
                        this.f27280b = obj;
                        break;
                    }
                    continue;
                case wi.dH /*18*/:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f27280b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f27280b.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f27280b, 0, obj3, 0, i2);
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
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f27280b = obj3;
                    }
                    nyt.e(i);
                    continue;
                case wi.dx /*26*/:
                    this.f27281c = nyt.j();
                    continue;
                case 34:
                    this.f27282d = nyt.j();
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
