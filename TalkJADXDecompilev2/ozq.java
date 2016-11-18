package defpackage;

import java.io.IOException;

public final class ozq extends nwi<ozq, nwk> implements nxk {
    public static final ozq d;
    private static final nxa<Integer, pbe> i = new ozr();
    private static volatile nxm<ozq> p;
    private int e;
    private int f;
    private paj g;
    private nwy h = nwu.b;
    private pba j;
    private pab k;
    private long l;
    private ozu m;
    private ozs n;
    private pbb o;

    private ozq() {
    }

    private boolean i() {
        return (this.e & 1) == 1;
    }

    private paj j() {
        if (this.g == null) {
            return paj.d;
        }
        return this.g;
    }

    static {
        ozq ozq = new ozq();
        d = ozq;
        ozq.d();
    }

    private pba k() {
        if (this.j == null) {
            return pba.d;
        }
        return this.j;
    }

    private pab m() {
        if (this.k == null) {
            return pab.d;
        }
        return this.k;
    }

    private boolean n() {
        return (this.e & 16) == 16;
    }

    private ozu o() {
        if (this.m == null) {
            return ozu.d;
        }
        return this.m;
    }

    private ozs p() {
        if (this.n == null) {
            return ozs.d;
        }
        return this.n;
    }

    private pbb q() {
        if (this.o == null) {
            return pbb.d;
        }
        return this.o;
    }

    public void a(nvy nvy) {
        if ((this.e & 1) == 1) {
            nvy.b(1, this.f);
        }
        if ((this.e & 2) == 2) {
            nvy.a(2, j());
        }
        for (int i = 0; i < this.h.size(); i++) {
            nvy.b(3, this.h.b(i));
        }
        if ((this.e & 4) == 4) {
            nvy.a(4, k());
        }
        if ((this.e & 8) == 8) {
            nvy.a(5, m());
        }
        if ((this.e & 16) == 16) {
            nvy.a(6, this.l);
        }
        if ((this.e & 32) == 32) {
            nvy.a(7, o());
        }
        if ((this.e & 64) == 64) {
            nvy.a(8, p());
        }
        if ((this.e & 128) == 128) {
            nvy.a(9, q());
        }
        this.b.a(nvy);
    }

    public int l() {
        int i = 0;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        if ((this.e & 1) == 1) {
            i2 = nvy.h(1, this.f) + 0;
        } else {
            i2 = 0;
        }
        if ((this.e & 2) == 2) {
            i2 += nvy.c(2, j());
        }
        int i3 = 0;
        while (i < this.h.size()) {
            i3 += nvy.h(this.h.b(i));
            i++;
        }
        i2 = (i2 + i3) + (this.h.size() * 1);
        if ((this.e & 4) == 4) {
            i2 += nvy.c(4, k());
        }
        if ((this.e & 8) == 8) {
            i2 += nvy.c(5, m());
        }
        if ((this.e & 16) == 16) {
            i2 += nvy.c(6, this.l);
        }
        if ((this.e & 32) == 32) {
            i2 += nvy.c(7, o());
        }
        if ((this.e & 64) == 64) {
            i2 += nvy.c(8, p());
        }
        if ((this.e & 128) == 128) {
            i2 += nvy.c(9, q());
        }
        i2 += this.b.b();
        this.c = i2;
        return i2;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        switch (ozp.a[i - 1]) {
            case 1:
                return new ozq();
            case 2:
                return d;
            case 3:
                this.h.b();
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ozq ozq = (ozq) obj2;
                this.f = nwt.a(i(), this.f, ozq.i(), ozq.f);
                this.g = (paj) nwt.a(this.g, ozq.g);
                this.h = nwt.a(this.h, ozq.h);
                this.j = (pba) nwt.a(this.j, ozq.j);
                this.k = (pab) nwt.a(this.k, ozq.k);
                this.l = nwt.a(n(), this.l, ozq.n(), ozq.l);
                this.m = (ozu) nwt.a(this.m, ozq.m);
                this.n = (ozs) nwt.a(this.n, ozq.n);
                this.o = (pbb) nwt.a(this.o, ozq.o);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= ozq.e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                nwd nwd = (nwd) obj2;
                byte b = (byte) 0;
                while (b == (byte) 0) {
                    try {
                        int a = nvw.a();
                        nwi nwi;
                        nwk nwk;
                        nwk nwk2;
                        nwy nwy;
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 8:
                                a = nvw.n();
                                if (pbh.a(a) != null) {
                                    this.e |= 1;
                                    this.f = a;
                                    break;
                                }
                                super.a(1, a);
                                break;
                            case wi.dH /*18*/:
                                if ((this.e & 2) == 2) {
                                    nwi = this.g;
                                    nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.g = (paj) nvw.a(paj.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.g);
                                    this.g = (paj) nwk2.d();
                                }
                                this.e |= 2;
                                break;
                            case wi.dA /*24*/:
                                if (!this.h.a()) {
                                    nwy = this.h;
                                    a = nwy.size();
                                    if (a == 0) {
                                        a = 10;
                                    } else {
                                        a <<= 1;
                                    }
                                    this.h = nwy.a(a);
                                }
                                a = nvw.n();
                                if (pbe.a(a) != null) {
                                    this.h.c(a);
                                    break;
                                }
                                super.a(3, a);
                                break;
                            case wi.dx /*26*/:
                                if (!this.h.a()) {
                                    nwy = this.h;
                                    a = nwy.size();
                                    if (a == 0) {
                                        a = 10;
                                    } else {
                                        a <<= 1;
                                    }
                                    this.h = nwy.a(a);
                                }
                                a = nvw.b(nvw.s());
                                while (nvw.u() > 0) {
                                    int n = nvw.n();
                                    if (pbe.a(n) == null) {
                                        super.a(3, n);
                                    } else {
                                        this.h.c(n);
                                    }
                                }
                                nvw.c(a);
                                break;
                            case 34:
                                if ((this.e & 4) == 4) {
                                    nwi = this.j;
                                    nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.j = (pba) nvw.a(pba.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.j);
                                    this.j = (pba) nwk2.d();
                                }
                                this.e |= 4;
                                break;
                            case 42:
                                if ((this.e & 8) == 8) {
                                    nwi = this.k;
                                    nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.k = (pab) nvw.a(pab.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.k);
                                    this.k = (pab) nwk2.d();
                                }
                                this.e |= 8;
                                break;
                            case 48:
                                this.e |= 16;
                                this.l = nvw.e();
                                break;
                            case 58:
                                if ((this.e & 32) == 32) {
                                    nwi = this.m;
                                    nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.m = (ozu) nvw.a(ozu.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.m);
                                    this.m = (ozu) nwk2.d();
                                }
                                this.e |= 32;
                                break;
                            case 66:
                                if ((this.e & 64) == 64) {
                                    nwi = this.n;
                                    nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.n = (ozs) nvw.a(ozs.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.n);
                                    this.n = (ozs) nwk2.d();
                                }
                                this.e |= 64;
                                break;
                            case 74:
                                if ((this.e & 128) == 128) {
                                    nwi = this.o;
                                    nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.o = (pbb) nvw.a(pbb.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.o);
                                    this.o = (pbb) nwk2.d();
                                }
                                this.e |= 128;
                                break;
                            default:
                                if (!a(a, nvw)) {
                                    b = (byte) 1;
                                    break;
                                }
                                break;
                        }
                    } catch (nxc e) {
                        throw new RuntimeException(e.a(this));
                    } catch (IOException e2) {
                        throw new RuntimeException(new nxc(e2.getMessage()).a(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (p == null) {
                    synchronized (ozq.class) {
                        if (p == null) {
                            p = new nvk(d);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return d;
    }
}
