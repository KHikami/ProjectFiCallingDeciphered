package defpackage;

import java.io.IOException;

public final class pab extends nwi<pab, nwk> implements nxk {
    public static final pab d;
    private static volatile nxm<pab> n;
    private int e;
    private int f;
    private int g;
    private long h;
    private boolean i;
    private long j;
    private long k;
    private pag l;
    private pbk m;

    private pab() {
    }

    private boolean i() {
        return (this.e & 1) == 1;
    }

    private boolean j() {
        return (this.e & 2) == 2;
    }

    private boolean k() {
        return (this.e & 4) == 4;
    }

    private boolean m() {
        return (this.e & 8) == 8;
    }

    private boolean n() {
        return (this.e & 16) == 16;
    }

    private boolean o() {
        return (this.e & 32) == 32;
    }

    private pag p() {
        if (this.l == null) {
            return pag.d;
        }
        return this.l;
    }

    private pbk q() {
        if (this.m == null) {
            return pbk.d;
        }
        return this.m;
    }

    public void a(nvy nvy) {
        if ((this.e & 1) == 1) {
            nvy.b(1, this.f);
        }
        if ((this.e & 2) == 2) {
            nvy.b(2, this.g);
        }
        if ((this.e & 4) == 4) {
            nvy.a(3, this.h);
        }
        if ((this.e & 8) == 8) {
            nvy.a(4, this.i);
        }
        if ((this.e & 16) == 16) {
            nvy.a(5, this.j);
        }
        if ((this.e & 32) == 32) {
            nvy.a(6, this.k);
        }
        if ((this.e & 64) == 64) {
            nvy.a(7, p());
        }
        if ((this.e & 128) == 128) {
            nvy.a(8, q());
        }
        this.b.a(nvy);
    }

    public int l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.e & 1) == 1) {
            i = nvy.h(1, this.f) + 0;
        }
        if ((this.e & 2) == 2) {
            i += nvy.h(2, this.g);
        }
        if ((this.e & 4) == 4) {
            i += nvy.c(3, this.h);
        }
        if ((this.e & 8) == 8) {
            i += nvy.b(4, this.i);
        }
        if ((this.e & 16) == 16) {
            i += nvy.c(5, this.j);
        }
        if ((this.e & 32) == 32) {
            i += nvy.c(6, this.k);
        }
        if ((this.e & 64) == 64) {
            i += nvy.c(7, p());
        }
        if ((this.e & 128) == 128) {
            i += nvy.c(8, q());
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        switch (ozp.a[i - 1]) {
            case 1:
                return new pab();
            case 2:
                return d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pab pab = (pab) obj2;
                this.f = nwt.a(i(), this.f, pab.i(), pab.f);
                this.g = nwt.a(j(), this.g, pab.j(), pab.g);
                this.h = nwt.a(k(), this.h, pab.k(), pab.h);
                this.i = nwt.a(m(), this.i, pab.m(), pab.i);
                this.j = nwt.a(n(), this.j, pab.n(), pab.j);
                this.k = nwt.a(o(), this.k, pab.o(), pab.k);
                this.l = (pag) nwt.a(this.l, pab.l);
                this.m = (pbk) nwt.a(this.m, pab.m);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= pab.e;
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
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 8:
                                a = nvw.n();
                                if (pac.a(a) != null) {
                                    this.e |= 1;
                                    this.f = a;
                                    break;
                                }
                                super.a(1, a);
                                break;
                            case 16:
                                a = nvw.n();
                                if (pae.a(a) != null) {
                                    this.e |= 2;
                                    this.g = a;
                                    break;
                                }
                                super.a(2, a);
                                break;
                            case wi.dA /*24*/:
                                this.e |= 4;
                                this.h = nvw.e();
                                break;
                            case 32:
                                this.e |= 8;
                                this.i = nvw.i();
                                break;
                            case 40:
                                this.e |= 16;
                                this.j = nvw.e();
                                break;
                            case 48:
                                this.e |= 32;
                                this.k = nvw.e();
                                break;
                            case 58:
                                if ((this.e & 64) == 64) {
                                    nwi = this.l;
                                    nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.l = (pag) nvw.a(pag.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.l);
                                    this.l = (pag) nwk2.d();
                                }
                                this.e |= 64;
                                break;
                            case 66:
                                if ((this.e & 128) == 128) {
                                    nwi = this.m;
                                    nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.m = (pbk) nvw.a(pbk.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.m);
                                    this.m = (pbk) nwk2.d();
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
                if (n == null) {
                    synchronized (pab.class) {
                        if (n == null) {
                            n = new nvk(d);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return d;
    }

    static {
        pab pab = new pab();
        d = pab;
        pab.d();
    }
}
