package p000;

import java.io.IOException;

public final class pbl extends nwi<pbl, nwk> implements nxk {
    public static final pbl f34940d;
    private static volatile nxm<pbl> f34941i;
    private int f34942e;
    private pbk f34943f;
    private pbk f34944g;
    private pbk f34945h;

    private pbl() {
    }

    private pbk m40196i() {
        if (this.f34943f == null) {
            return pbk.f34933d;
        }
        return this.f34943f;
    }

    private pbk m40197j() {
        if (this.f34944g == null) {
            return pbk.f34933d;
        }
        return this.f34944g;
    }

    private pbk m40198k() {
        if (this.f34945h == null) {
            return pbk.f34933d;
        }
        return this.f34945h;
    }

    public void m40200a(nvy nvy) {
        if ((this.f34942e & 1) == 1) {
            nvy.mo4022a(1, m40196i());
        }
        if ((this.f34942e & 2) == 2) {
            nvy.mo4022a(2, m40197j());
        }
        if ((this.f34942e & 4) == 4) {
            nvy.mo4022a(3, m40198k());
        }
        this.b.a(nvy);
    }

    public int m40201l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34942e & 1) == 1) {
            i = nvy.m36838c(1, m40196i()) + 0;
        }
        if ((this.f34942e & 2) == 2) {
            i += nvy.m36838c(2, m40197j());
        }
        if ((this.f34942e & 4) == 4) {
            i += nvy.m36838c(3, m40198k());
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40199a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new pbl();
            case 2:
                return f34940d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pbl pbl = (pbl) obj2;
                this.f34943f = (pbk) nwt.mo4050a(this.f34943f, pbl.f34943f);
                this.f34944g = (pbk) nwt.mo4050a(this.f34944g, pbl.f34944g);
                this.f34945h = (pbk) nwt.mo4050a(this.f34945h, pbl.f34945h);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34942e |= pbl.f34942e;
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
                            case 10:
                                if ((this.f34942e & 1) == 1) {
                                    nwi = this.f34943f;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34943f = (pbk) nvw.mo3989a(pbk.f34933d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34943f);
                                    this.f34943f = (pbk) nwk2.mo4055d();
                                }
                                this.f34942e |= 1;
                                break;
                            case wi.dH /*18*/:
                                if ((this.f34942e & 2) == 2) {
                                    nwi = this.f34944g;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34944g = (pbk) nvw.mo3989a(pbk.f34933d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34944g);
                                    this.f34944g = (pbk) nwk2.mo4055d();
                                }
                                this.f34942e |= 2;
                                break;
                            case wi.dx /*26*/:
                                if ((this.f34942e & 4) == 4) {
                                    nwi = this.f34945h;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34945h = (pbk) nvw.mo3989a(pbk.f34933d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34945h);
                                    this.f34945h = (pbk) nwk2.mo4055d();
                                }
                                this.f34942e |= 4;
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
                if (f34941i == null) {
                    synchronized (pbl.class) {
                        if (f34941i == null) {
                            f34941i = new nvk(f34940d);
                        }
                    }
                }
                return f34941i;
            default:
                throw new UnsupportedOperationException();
        }
        return f34940d;
    }

    static {
        pbl pbl = new pbl();
        f34940d = pbl;
        pbl.d();
    }
}
