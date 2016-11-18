package defpackage;

import java.io.IOException;

public final class paj extends nwi<paj, nwk> implements nxk {
    public static final paj d;
    private static volatile nxm<paj> l;
    private int e;
    private int f;
    private pan g;
    private par h;
    private paz i;
    private pak j;
    private pau k;

    private paj() {
    }

    private boolean i() {
        return (this.e & 1) == 1;
    }

    private pan j() {
        if (this.g == null) {
            return pan.d;
        }
        return this.g;
    }

    private par k() {
        if (this.h == null) {
            return par.d;
        }
        return this.h;
    }

    private paz m() {
        if (this.i == null) {
            return paz.d;
        }
        return this.i;
    }

    private pak n() {
        if (this.j == null) {
            return pak.d;
        }
        return this.j;
    }

    private pau o() {
        if (this.k == null) {
            return pau.d;
        }
        return this.k;
    }

    public void a(nvy nvy) {
        if ((this.e & 1) == 1) {
            nvy.b(1, this.f);
        }
        if ((this.e & 2) == 2) {
            nvy.a(2, j());
        }
        if ((this.e & 4) == 4) {
            nvy.a(3, k());
        }
        if ((this.e & 8) == 8) {
            nvy.a(4, m());
        }
        if ((this.e & 16) == 16) {
            nvy.a(5, n());
        }
        if ((this.e & 32) == 32) {
            nvy.a(6, o());
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
            i += nvy.c(2, j());
        }
        if ((this.e & 4) == 4) {
            i += nvy.c(3, k());
        }
        if ((this.e & 8) == 8) {
            i += nvy.c(4, m());
        }
        if ((this.e & 16) == 16) {
            i += nvy.c(5, n());
        }
        if ((this.e & 32) == 32) {
            i += nvy.c(6, o());
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        switch (ozp.a[i - 1]) {
            case 1:
                return new paj();
            case 2:
                return d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                paj paj = (paj) obj2;
                this.f = nwt.a(i(), this.f, paj.i(), paj.f);
                this.g = (pan) nwt.a(this.g, paj.g);
                this.h = (par) nwt.a(this.h, paj.h);
                this.i = (paz) nwt.a(this.i, paj.i);
                this.j = (pak) nwt.a(this.j, paj.j);
                this.k = (pau) nwt.a(this.k, paj.k);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= paj.e;
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
                                if (pax.a(a) != null) {
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
                                this.g = (pan) nvw.a(pan.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.g);
                                    this.g = (pan) nwk2.d();
                                }
                                this.e |= 2;
                                break;
                            case wi.dx /*26*/:
                                if ((this.e & 4) == 4) {
                                    nwi = this.h;
                                    nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.h = (par) nvw.a(par.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.h);
                                    this.h = (par) nwk2.d();
                                }
                                this.e |= 4;
                                break;
                            case 34:
                                if ((this.e & 8) == 8) {
                                    nwi = this.i;
                                    nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.i = (paz) nvw.a(paz.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.i);
                                    this.i = (paz) nwk2.d();
                                }
                                this.e |= 8;
                                break;
                            case 42:
                                if ((this.e & 16) == 16) {
                                    nwi = this.j;
                                    nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.j = (pak) nvw.a(pak.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.j);
                                    this.j = (pak) nwk2.d();
                                }
                                this.e |= 16;
                                break;
                            case 50:
                                if ((this.e & 32) == 32) {
                                    nwi = this.k;
                                    nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.k = (pau) nvw.a(pau.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.k);
                                    this.k = (pau) nwk2.d();
                                }
                                this.e |= 32;
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
                if (l == null) {
                    synchronized (paj.class) {
                        if (l == null) {
                            l = new nvk(d);
                        }
                    }
                }
                return l;
            default:
                throw new UnsupportedOperationException();
        }
        return d;
    }

    static {
        paj paj = new paj();
        d = paj;
        paj.d();
    }
}
