package p000;

import java.io.IOException;

public final class paj extends nwi<paj, nwk> implements nxk {
    public static final paj f34803d;
    private static volatile nxm<paj> f34804l;
    private int f34805e;
    private int f34806f;
    private pan f34807g;
    private par f34808h;
    private paz f34809i;
    private pak f34810j;
    private pau f34811k;

    private paj() {
    }

    private boolean m40105i() {
        return (this.f34805e & 1) == 1;
    }

    private pan m40106j() {
        if (this.f34807g == null) {
            return pan.f34822d;
        }
        return this.f34807g;
    }

    private par m40107k() {
        if (this.f34808h == null) {
            return par.f34838d;
        }
        return this.f34808h;
    }

    private paz m40108m() {
        if (this.f34809i == null) {
            return paz.f34876d;
        }
        return this.f34809i;
    }

    private pak m40109n() {
        if (this.f34810j == null) {
            return pak.f34812d;
        }
        return this.f34810j;
    }

    private pau m40110o() {
        if (this.f34811k == null) {
            return pau.f34848d;
        }
        return this.f34811k;
    }

    public void m40112a(nvy nvy) {
        if ((this.f34805e & 1) == 1) {
            nvy.mo4029b(1, this.f34806f);
        }
        if ((this.f34805e & 2) == 2) {
            nvy.mo4022a(2, m40106j());
        }
        if ((this.f34805e & 4) == 4) {
            nvy.mo4022a(3, m40107k());
        }
        if ((this.f34805e & 8) == 8) {
            nvy.mo4022a(4, m40108m());
        }
        if ((this.f34805e & 16) == 16) {
            nvy.mo4022a(5, m40109n());
        }
        if ((this.f34805e & 32) == 32) {
            nvy.mo4022a(6, m40110o());
        }
        this.b.a(nvy);
    }

    public int m40113l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34805e & 1) == 1) {
            i = nvy.m36860h(1, this.f34806f) + 0;
        }
        if ((this.f34805e & 2) == 2) {
            i += nvy.m36838c(2, m40106j());
        }
        if ((this.f34805e & 4) == 4) {
            i += nvy.m36838c(3, m40107k());
        }
        if ((this.f34805e & 8) == 8) {
            i += nvy.m36838c(4, m40108m());
        }
        if ((this.f34805e & 16) == 16) {
            i += nvy.m36838c(5, m40109n());
        }
        if ((this.f34805e & 32) == 32) {
            i += nvy.m36838c(6, m40110o());
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40111a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new paj();
            case 2:
                return f34803d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                paj paj = (paj) obj2;
                this.f34806f = nwt.mo4044a(m40105i(), this.f34806f, paj.m40105i(), paj.f34806f);
                this.f34807g = (pan) nwt.mo4050a(this.f34807g, paj.f34807g);
                this.f34808h = (par) nwt.mo4050a(this.f34808h, paj.f34808h);
                this.f34809i = (paz) nwt.mo4050a(this.f34809i, paj.f34809i);
                this.f34810j = (pak) nwt.mo4050a(this.f34810j, paj.f34810j);
                this.f34811k = (pau) nwt.mo4050a(this.f34811k, paj.f34811k);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34805e |= paj.f34805e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                nwd nwd = (nwd) obj2;
                byte b = (byte) 0;
                while (b == (byte) 0) {
                    try {
                        int a = nvw.mo3987a();
                        nwi nwi;
                        nwk nwk;
                        nwk nwk2;
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 8:
                                a = nvw.mo4007n();
                                if (pax.m40143a(a) != null) {
                                    this.f34805e |= 1;
                                    this.f34806f = a;
                                    break;
                                }
                                super.a(1, a);
                                break;
                            case wi.dH /*18*/:
                                if ((this.f34805e & 2) == 2) {
                                    nwi = this.f34807g;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34807g = (pan) nvw.mo3989a(pan.f34822d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34807g);
                                    this.f34807g = (pan) nwk2.mo4055d();
                                }
                                this.f34805e |= 2;
                                break;
                            case wi.dx /*26*/:
                                if ((this.f34805e & 4) == 4) {
                                    nwi = this.f34808h;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34808h = (par) nvw.mo3989a(par.f34838d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34808h);
                                    this.f34808h = (par) nwk2.mo4055d();
                                }
                                this.f34805e |= 4;
                                break;
                            case 34:
                                if ((this.f34805e & 8) == 8) {
                                    nwi = this.f34809i;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34809i = (paz) nvw.mo3989a(paz.f34876d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34809i);
                                    this.f34809i = (paz) nwk2.mo4055d();
                                }
                                this.f34805e |= 8;
                                break;
                            case 42:
                                if ((this.f34805e & 16) == 16) {
                                    nwi = this.f34810j;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34810j = (pak) nvw.mo3989a(pak.f34812d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34810j);
                                    this.f34810j = (pak) nwk2.mo4055d();
                                }
                                this.f34805e |= 16;
                                break;
                            case 50:
                                if ((this.f34805e & 32) == 32) {
                                    nwi = this.f34811k;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34811k = (pau) nvw.mo3989a(pau.f34848d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34811k);
                                    this.f34811k = (pau) nwk2.mo4055d();
                                }
                                this.f34805e |= 32;
                                break;
                            default:
                                if (!a(a, nvw)) {
                                    b = (byte) 1;
                                    break;
                                }
                                break;
                        }
                    } catch (nxc e) {
                        throw new RuntimeException(e.m37022a(this));
                    } catch (IOException e2) {
                        throw new RuntimeException(new nxc(e2.getMessage()).m37022a(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f34804l == null) {
                    synchronized (paj.class) {
                        if (f34804l == null) {
                            f34804l = new nvk(f34803d);
                        }
                    }
                }
                return f34804l;
            default:
                throw new UnsupportedOperationException();
        }
        return f34803d;
    }

    static {
        paj paj = new paj();
        f34803d = paj;
        paj.d();
    }
}
