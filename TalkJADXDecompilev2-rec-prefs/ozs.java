package p000;

import java.io.IOException;

public final class ozs extends nwi<ozs, nwk> implements nxk {
    public static final ozs f34708d;
    private static volatile nxm<ozs> f34709h;
    private int f34710e;
    private ozt f34711f;
    private pbg f34712g;

    private ozs() {
    }

    private ozt m40054i() {
        if (this.f34711f == null) {
            return ozt.f34713d;
        }
        return this.f34711f;
    }

    private pbg m40055j() {
        if (this.f34712g == null) {
            return pbg.f34904d;
        }
        return this.f34712g;
    }

    public void m40057a(nvy nvy) {
        if ((this.f34710e & 1) == 1) {
            nvy.mo4022a(1, m40054i());
        }
        if ((this.f34710e & 2) == 2) {
            nvy.mo4022a(2, m40055j());
        }
        this.b.a(nvy);
    }

    public int m40058l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34710e & 1) == 1) {
            i = nvy.m36838c(1, m40054i()) + 0;
        }
        if ((this.f34710e & 2) == 2) {
            i += nvy.m36838c(2, m40055j());
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40056a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new ozs();
            case 2:
                return f34708d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ozs ozs = (ozs) obj2;
                this.f34711f = (ozt) nwt.mo4050a(this.f34711f, ozs.f34711f);
                this.f34712g = (pbg) nwt.mo4050a(this.f34712g, ozs.f34712g);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34710e |= ozs.f34710e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                nwd nwd = (nwd) obj2;
                int i2 = 0;
                while (i2 == 0) {
                    try {
                        int a = nvw.mo3987a();
                        nwi nwi;
                        nwk nwk;
                        nwk nwk2;
                        switch (a) {
                            case 0:
                                i2 = 1;
                                break;
                            case 10:
                                if ((this.f34710e & 1) == 1) {
                                    nwi = this.f34711f;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34711f = (ozt) nvw.mo3989a(ozt.f34713d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34711f);
                                    this.f34711f = (ozt) nwk2.mo4055d();
                                }
                                this.f34710e |= 1;
                                break;
                            case wi.dH /*18*/:
                                if ((this.f34710e & 2) == 2) {
                                    nwi = this.f34712g;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34712g = (pbg) nvw.mo3989a(pbg.f34904d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34712g);
                                    this.f34712g = (pbg) nwk2.mo4055d();
                                }
                                this.f34710e |= 2;
                                break;
                            default:
                                if (!a(a, nvw)) {
                                    i2 = 1;
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
                if (f34709h == null) {
                    synchronized (ozs.class) {
                        if (f34709h == null) {
                            f34709h = new nvk(f34708d);
                        }
                    }
                }
                return f34709h;
            default:
                throw new UnsupportedOperationException();
        }
        return f34708d;
    }

    static {
        ozs ozs = new ozs();
        f34708d = ozs;
        ozs.d();
    }
}
