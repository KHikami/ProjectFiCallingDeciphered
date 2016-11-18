package defpackage;

import java.io.IOException;

public final class ozs extends nwi<ozs, nwk> implements nxk {
    public static final ozs d;
    private static volatile nxm<ozs> h;
    private int e;
    private ozt f;
    private pbg g;

    private ozs() {
    }

    private ozt i() {
        if (this.f == null) {
            return ozt.d;
        }
        return this.f;
    }

    private pbg j() {
        if (this.g == null) {
            return pbg.d;
        }
        return this.g;
    }

    public void a(nvy nvy) {
        if ((this.e & 1) == 1) {
            nvy.a(1, i());
        }
        if ((this.e & 2) == 2) {
            nvy.a(2, j());
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
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        switch (ozp.a[i - 1]) {
            case 1:
                return new ozs();
            case 2:
                return d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ozs ozs = (ozs) obj2;
                this.f = (ozt) nwt.a(this.f, ozs.f);
                this.g = (pbg) nwt.a(this.g, ozs.g);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= ozs.e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                nwd nwd = (nwd) obj2;
                int i2 = 0;
                while (i2 == 0) {
                    try {
                        int a = nvw.a();
                        nwi nwi;
                        nwk nwk;
                        nwk nwk2;
                        switch (a) {
                            case 0:
                                i2 = 1;
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
                                this.f = (ozt) nvw.a(ozt.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.f);
                                    this.f = (ozt) nwk2.d();
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
                                this.g = (pbg) nvw.a(pbg.d, nwd);
                                if (nwk2 != null) {
                                    nwk2.b(this.g);
                                    this.g = (pbg) nwk2.d();
                                }
                                this.e |= 2;
                                break;
                            default:
                                if (!a(a, nvw)) {
                                    i2 = 1;
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
                if (h == null) {
                    synchronized (ozs.class) {
                        if (h == null) {
                            h = new nvk(d);
                        }
                    }
                }
                return h;
            default:
                throw new UnsupportedOperationException();
        }
        return d;
    }

    static {
        ozs ozs = new ozs();
        d = ozs;
        ozs.d();
    }
}
