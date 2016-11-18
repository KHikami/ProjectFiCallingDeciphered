package p000;

import java.io.IOException;

public final class pab extends nwi<pab, nwk> implements nxk {
    public static final pab f34760d;
    private static volatile nxm<pab> f34761n;
    private int f34762e;
    private int f34763f;
    private int f34764g;
    private long f34765h;
    private boolean f34766i;
    private long f34767j;
    private long f34768k;
    private pag f34769l;
    private pbk f34770m;

    private pab() {
    }

    private boolean m40081i() {
        return (this.f34762e & 1) == 1;
    }

    private boolean m40082j() {
        return (this.f34762e & 2) == 2;
    }

    private boolean m40083k() {
        return (this.f34762e & 4) == 4;
    }

    private boolean m40084m() {
        return (this.f34762e & 8) == 8;
    }

    private boolean m40085n() {
        return (this.f34762e & 16) == 16;
    }

    private boolean m40086o() {
        return (this.f34762e & 32) == 32;
    }

    private pag m40087p() {
        if (this.f34769l == null) {
            return pag.f34784d;
        }
        return this.f34769l;
    }

    private pbk m40088q() {
        if (this.f34770m == null) {
            return pbk.f34933d;
        }
        return this.f34770m;
    }

    public void m40090a(nvy nvy) {
        if ((this.f34762e & 1) == 1) {
            nvy.mo4029b(1, this.f34763f);
        }
        if ((this.f34762e & 2) == 2) {
            nvy.mo4029b(2, this.f34764g);
        }
        if ((this.f34762e & 4) == 4) {
            nvy.mo4019a(3, this.f34765h);
        }
        if ((this.f34762e & 8) == 8) {
            nvy.mo4023a(4, this.f34766i);
        }
        if ((this.f34762e & 16) == 16) {
            nvy.mo4019a(5, this.f34767j);
        }
        if ((this.f34762e & 32) == 32) {
            nvy.mo4019a(6, this.f34768k);
        }
        if ((this.f34762e & 64) == 64) {
            nvy.mo4022a(7, m40087p());
        }
        if ((this.f34762e & 128) == 128) {
            nvy.mo4022a(8, m40088q());
        }
        this.b.a(nvy);
    }

    public int m40091l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34762e & 1) == 1) {
            i = nvy.m36860h(1, this.f34763f) + 0;
        }
        if ((this.f34762e & 2) == 2) {
            i += nvy.m36860h(2, this.f34764g);
        }
        if ((this.f34762e & 4) == 4) {
            i += nvy.m36837c(3, this.f34765h);
        }
        if ((this.f34762e & 8) == 8) {
            i += nvy.m36831b(4, this.f34766i);
        }
        if ((this.f34762e & 16) == 16) {
            i += nvy.m36837c(5, this.f34767j);
        }
        if ((this.f34762e & 32) == 32) {
            i += nvy.m36837c(6, this.f34768k);
        }
        if ((this.f34762e & 64) == 64) {
            i += nvy.m36838c(7, m40087p());
        }
        if ((this.f34762e & 128) == 128) {
            i += nvy.m36838c(8, m40088q());
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40089a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new pab();
            case 2:
                return f34760d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pab pab = (pab) obj2;
                this.f34763f = nwt.mo4044a(m40081i(), this.f34763f, pab.m40081i(), pab.f34763f);
                this.f34764g = nwt.mo4044a(m40082j(), this.f34764g, pab.m40082j(), pab.f34764g);
                this.f34765h = nwt.mo4045a(m40083k(), this.f34765h, pab.m40083k(), pab.f34765h);
                this.f34766i = nwt.mo4052a(m40084m(), this.f34766i, pab.m40084m(), pab.f34766i);
                this.f34767j = nwt.mo4045a(m40085n(), this.f34767j, pab.m40085n(), pab.f34767j);
                this.f34768k = nwt.mo4045a(m40086o(), this.f34768k, pab.m40086o(), pab.f34768k);
                this.f34769l = (pag) nwt.mo4050a(this.f34769l, pab.f34769l);
                this.f34770m = (pbk) nwt.mo4050a(this.f34770m, pab.f34770m);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34762e |= pab.f34762e;
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
                                if (pac.m40092a(a) != null) {
                                    this.f34762e |= 1;
                                    this.f34763f = a;
                                    break;
                                }
                                super.a(1, a);
                                break;
                            case 16:
                                a = nvw.mo4007n();
                                if (pae.m40095a(a) != null) {
                                    this.f34762e |= 2;
                                    this.f34764g = a;
                                    break;
                                }
                                super.a(2, a);
                                break;
                            case wi.dA /*24*/:
                                this.f34762e |= 4;
                                this.f34765h = nvw.mo3998e();
                                break;
                            case 32:
                                this.f34762e |= 8;
                                this.f34766i = nvw.mo4002i();
                                break;
                            case 40:
                                this.f34762e |= 16;
                                this.f34767j = nvw.mo3998e();
                                break;
                            case 48:
                                this.f34762e |= 32;
                                this.f34768k = nvw.mo3998e();
                                break;
                            case 58:
                                if ((this.f34762e & 64) == 64) {
                                    nwi = this.f34769l;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34769l = (pag) nvw.mo3989a(pag.f34784d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34769l);
                                    this.f34769l = (pag) nwk2.mo4055d();
                                }
                                this.f34762e |= 64;
                                break;
                            case 66:
                                if ((this.f34762e & 128) == 128) {
                                    nwi = this.f34770m;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34770m = (pbk) nvw.mo3989a(pbk.f34933d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34770m);
                                    this.f34770m = (pbk) nwk2.mo4055d();
                                }
                                this.f34762e |= 128;
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
                if (f34761n == null) {
                    synchronized (pab.class) {
                        if (f34761n == null) {
                            f34761n = new nvk(f34760d);
                        }
                    }
                }
                return f34761n;
            default:
                throw new UnsupportedOperationException();
        }
        return f34760d;
    }

    static {
        pab pab = new pab();
        f34760d = pab;
        pab.d();
    }
}
