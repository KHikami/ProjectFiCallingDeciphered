package p000;

public final class kje extends nyx<kje> {
    public kjg f21915a;
    public kiz f21916b;
    public kix f21917c;
    public int[] f21918d;
    public Boolean f21919e;
    public kiv f21920f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26066b(nyt);
    }

    public kje() {
        m26067d();
    }

    private kje m26067d() {
        this.f21915a = null;
        this.f21916b = null;
        this.f21917c = null;
        this.f21918d = nzl.a;
        this.f21919e = null;
        this.f21920f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21915a != null) {
            nyu.b(1, this.f21915a);
        }
        if (this.f21916b != null) {
            nyu.b(2, this.f21916b);
        }
        if (this.f21917c != null) {
            nyu.b(3, this.f21917c);
        }
        if (this.f21918d != null && this.f21918d.length > 0) {
            for (int a : this.f21918d) {
                nyu.a(4, a);
            }
        }
        if (this.f21919e != null) {
            nyu.a(5, this.f21919e.booleanValue());
        }
        if (this.f21920f != null) {
            nyu.b(6, this.f21920f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f21915a != null) {
            b += nyu.d(1, this.f21915a);
        }
        if (this.f21916b != null) {
            b += nyu.d(2, this.f21916b);
        }
        if (this.f21917c != null) {
            b += nyu.d(3, this.f21917c);
        }
        if (this.f21918d != null && this.f21918d.length > 0) {
            int i2 = 0;
            while (i < this.f21918d.length) {
                i2 += nyu.g(this.f21918d[i]);
                i++;
            }
            b = (b + i2) + (this.f21918d.length * 1);
        }
        if (this.f21919e != null) {
            this.f21919e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f21920f != null) {
            return b + nyu.d(6, this.f21920f);
        }
        return b;
    }

    private kje m26066b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21915a == null) {
                        this.f21915a = new kjg();
                    }
                    nyt.a(this.f21915a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f21916b == null) {
                        this.f21916b = new kiz();
                    }
                    nyt.a(this.f21916b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f21917c == null) {
                        this.f21917c = new kix();
                    }
                    nyt.a(this.f21917c);
                    continue;
                case 32:
                    int b = nzl.b(nyt, 32);
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
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case wi.dK /*17*/:
                            case wi.dH /*18*/:
                            case wi.dL /*19*/:
                            case 20:
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
                        a = this.f21918d == null ? 0 : this.f21918d.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f21918d, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f21918d = obj2;
                            break;
                        }
                        this.f21918d = obj;
                        break;
                    }
                    continue;
                case 34:
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
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case wi.dK /*17*/:
                            case wi.dH /*18*/:
                            case wi.dL /*19*/:
                            case 20:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f21918d == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f21918d.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f21918d, 0, obj3, 0, i2);
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
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case wi.dK /*17*/:
                                case wi.dH /*18*/:
                                case wi.dL /*19*/:
                                case 20:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f21918d = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 40:
                    this.f21919e = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    if (this.f21920f == null) {
                        this.f21920f = new kiv();
                    }
                    nyt.a(this.f21920f);
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
