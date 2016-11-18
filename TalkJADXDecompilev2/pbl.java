package defpackage;

import java.io.IOException;

public final class pbl extends nwi<pbl, nwk> implements nxk {
    public static final pbl d;
    private static volatile nxm<pbl> i;
    private int e;
    private pbk f;
    private pbk g;
    private pbk h;

    private pbl() {
    }

    private pbk i() {
        if (this.f == null) {
            return pbk.d;
        }
        return this.f;
    }

    private pbk j() {
        if (this.g == null) {
            return pbk.d;
        }
        return this.g;
    }

    private pbk k() {
        if (this.h == null) {
            return pbk.d;
        }
        return this.h;
    }

    public void a(nvy nvy) {
        if ((this.e & 1) == 1) {
            nvy.a(1, i());
        }
        if ((this.e & 2) == 2) {
            nvy.a(2, j());
        }
        if ((this.e & 4) == 4) {
            nvy.a(3, k());
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
            i = nvy.c(1, i()) + 0;
        }
        if ((this.e & 2) == 2) {
            i += nvy.c(2, j());
        }
        if ((this.e & 4) == 4) {
            i += nvy.c(3, k());
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        switch (ozp.a[i - 1]) {
            case 1:
                return new pbl();
            case 2:
                return d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pbl pbl = (pbl) obj2;
                this.f = (pbk) nwt.a(this.f, pbl.f);
                this.g = (pbk) nwt.a(this.g, pbl.g);
                this.h = (pbk) nwt.a(this.h, pbl.h);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= pbl.e;
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
                            case 10:
                                if ((this.e & 1) == 1) {
                                    nwi = this.f;
                                    nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f = (pbk) nvw.a(pbk.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.f);
                                    this.f = (pbk) nwk2.d();
                                }
                                this.e |= 1;
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
                                this.g = (pbk) nvw.a(pbk.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.g);
                                    this.g = (pbk) nwk2.d();
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
                                this.h = (pbk) nvw.a(pbk.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.h);
                                    this.h = (pbk) nwk2.d();
                                }
                                this.e |= 4;
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
                if (i == null) {
                    synchronized (pbl.class) {
                        if (i == null) {
                            i = new nvk(d);
                        }
                    }
                }
                return i;
            default:
                throw new UnsupportedOperationException();
        }
        return d;
    }

    static {
        pbl pbl = new pbl();
        d = pbl;
        pbl.d();
    }
}
