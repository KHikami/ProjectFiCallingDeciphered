package p000;

import java.io.IOException;

public final class ozq extends nwi<ozq, nwk> implements nxk {
    public static final ozq f34695d;
    private static final nxa<Integer, pbe> f34696i = new ozr();
    private static volatile nxm<ozq> f34697p;
    private int f34698e;
    private int f34699f;
    private paj f34700g;
    private nwy f34701h = nwu.f31195b;
    private pba f34702j;
    private pab f34703k;
    private long f34704l;
    private ozu f34705m;
    private ozs f34706n;
    private pbb f34707o;

    private ozq() {
    }

    private boolean m40042i() {
        return (this.f34698e & 1) == 1;
    }

    private paj m40043j() {
        if (this.f34700g == null) {
            return paj.f34803d;
        }
        return this.f34700g;
    }

    static {
        ozq ozq = new ozq();
        f34695d = ozq;
        ozq.d();
    }

    private pba m40044k() {
        if (this.f34702j == null) {
            return pba.f34881d;
        }
        return this.f34702j;
    }

    private pab m40045m() {
        if (this.f34703k == null) {
            return pab.f34760d;
        }
        return this.f34703k;
    }

    private boolean m40046n() {
        return (this.f34698e & 16) == 16;
    }

    private ozu m40047o() {
        if (this.f34705m == null) {
            return ozu.f34720d;
        }
        return this.f34705m;
    }

    private ozs m40048p() {
        if (this.f34706n == null) {
            return ozs.f34708d;
        }
        return this.f34706n;
    }

    private pbb m40049q() {
        if (this.f34707o == null) {
            return pbb.f34885d;
        }
        return this.f34707o;
    }

    public void m40051a(nvy nvy) {
        if ((this.f34698e & 1) == 1) {
            nvy.mo4029b(1, this.f34699f);
        }
        if ((this.f34698e & 2) == 2) {
            nvy.mo4022a(2, m40043j());
        }
        for (int i = 0; i < this.f34701h.size(); i++) {
            nvy.mo4029b(3, this.f34701h.mo4059b(i));
        }
        if ((this.f34698e & 4) == 4) {
            nvy.mo4022a(4, m40044k());
        }
        if ((this.f34698e & 8) == 8) {
            nvy.mo4022a(5, m40045m());
        }
        if ((this.f34698e & 16) == 16) {
            nvy.mo4019a(6, this.f34704l);
        }
        if ((this.f34698e & 32) == 32) {
            nvy.mo4022a(7, m40047o());
        }
        if ((this.f34698e & 64) == 64) {
            nvy.mo4022a(8, m40048p());
        }
        if ((this.f34698e & 128) == 128) {
            nvy.mo4022a(9, m40049q());
        }
        this.b.a(nvy);
    }

    public int m40052l() {
        int i = 0;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f34698e & 1) == 1) {
            i2 = nvy.m36860h(1, this.f34699f) + 0;
        } else {
            i2 = 0;
        }
        if ((this.f34698e & 2) == 2) {
            i2 += nvy.m36838c(2, m40043j());
        }
        int i3 = 0;
        while (i < this.f34701h.size()) {
            i3 += nvy.m36859h(this.f34701h.mo4059b(i));
            i++;
        }
        i2 = (i2 + i3) + (this.f34701h.size() * 1);
        if ((this.f34698e & 4) == 4) {
            i2 += nvy.m36838c(4, m40044k());
        }
        if ((this.f34698e & 8) == 8) {
            i2 += nvy.m36838c(5, m40045m());
        }
        if ((this.f34698e & 16) == 16) {
            i2 += nvy.m36837c(6, this.f34704l);
        }
        if ((this.f34698e & 32) == 32) {
            i2 += nvy.m36838c(7, m40047o());
        }
        if ((this.f34698e & 64) == 64) {
            i2 += nvy.m36838c(8, m40048p());
        }
        if ((this.f34698e & 128) == 128) {
            i2 += nvy.m36838c(9, m40049q());
        }
        i2 += this.b.b();
        this.c = i2;
        return i2;
    }

    protected final Object m40050a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new ozq();
            case 2:
                return f34695d;
            case 3:
                this.f34701h.mo3981b();
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ozq ozq = (ozq) obj2;
                this.f34699f = nwt.mo4044a(m40042i(), this.f34699f, ozq.m40042i(), ozq.f34699f);
                this.f34700g = (paj) nwt.mo4050a(this.f34700g, ozq.f34700g);
                this.f34701h = nwt.mo4048a(this.f34701h, ozq.f34701h);
                this.f34702j = (pba) nwt.mo4050a(this.f34702j, ozq.f34702j);
                this.f34703k = (pab) nwt.mo4050a(this.f34703k, ozq.f34703k);
                this.f34704l = nwt.mo4045a(m40046n(), this.f34704l, ozq.m40046n(), ozq.f34704l);
                this.f34705m = (ozu) nwt.mo4050a(this.f34705m, ozq.f34705m);
                this.f34706n = (ozs) nwt.mo4050a(this.f34706n, ozq.f34706n);
                this.f34707o = (pbb) nwt.mo4050a(this.f34707o, ozq.f34707o);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34698e |= ozq.f34698e;
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
                        nwy nwy;
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 8:
                                a = nvw.mo4007n();
                                if (pbh.m40176a(a) != null) {
                                    this.f34698e |= 1;
                                    this.f34699f = a;
                                    break;
                                }
                                super.a(1, a);
                                break;
                            case wi.dH /*18*/:
                                if ((this.f34698e & 2) == 2) {
                                    nwi = this.f34700g;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34700g = (paj) nvw.mo3989a(paj.f34803d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34700g);
                                    this.f34700g = (paj) nwk2.mo4055d();
                                }
                                this.f34698e |= 2;
                                break;
                            case wi.dA /*24*/:
                                if (!this.f34701h.mo3980a()) {
                                    nwy = this.f34701h;
                                    a = nwy.size();
                                    if (a == 0) {
                                        a = 10;
                                    } else {
                                        a <<= 1;
                                    }
                                    this.f34701h = nwy.mo4056a(a);
                                }
                                a = nvw.mo4007n();
                                if (pbe.m40165a(a) != null) {
                                    this.f34701h.mo4060c(a);
                                    break;
                                }
                                super.a(3, a);
                                break;
                            case wi.dx /*26*/:
                                if (!this.f34701h.mo3980a()) {
                                    nwy = this.f34701h;
                                    a = nwy.size();
                                    if (a == 0) {
                                        a = 10;
                                    } else {
                                        a <<= 1;
                                    }
                                    this.f34701h = nwy.mo4056a(a);
                                }
                                a = nvw.mo3994b(nvw.mo4012s());
                                while (nvw.mo4014u() > 0) {
                                    int n = nvw.mo4007n();
                                    if (pbe.m40165a(n) == null) {
                                        super.a(3, n);
                                    } else {
                                        this.f34701h.mo4060c(n);
                                    }
                                }
                                nvw.mo3996c(a);
                                break;
                            case 34:
                                if ((this.f34698e & 4) == 4) {
                                    nwi = this.f34702j;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34702j = (pba) nvw.mo3989a(pba.f34881d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34702j);
                                    this.f34702j = (pba) nwk2.mo4055d();
                                }
                                this.f34698e |= 4;
                                break;
                            case 42:
                                if ((this.f34698e & 8) == 8) {
                                    nwi = this.f34703k;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34703k = (pab) nvw.mo3989a(pab.f34760d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34703k);
                                    this.f34703k = (pab) nwk2.mo4055d();
                                }
                                this.f34698e |= 8;
                                break;
                            case 48:
                                this.f34698e |= 16;
                                this.f34704l = nvw.mo3998e();
                                break;
                            case 58:
                                if ((this.f34698e & 32) == 32) {
                                    nwi = this.f34705m;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34705m = (ozu) nvw.mo3989a(ozu.f34720d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34705m);
                                    this.f34705m = (ozu) nwk2.mo4055d();
                                }
                                this.f34698e |= 32;
                                break;
                            case 66:
                                if ((this.f34698e & 64) == 64) {
                                    nwi = this.f34706n;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34706n = (ozs) nvw.mo3989a(ozs.f34708d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34706n);
                                    this.f34706n = (ozs) nwk2.mo4055d();
                                }
                                this.f34698e |= 64;
                                break;
                            case 74:
                                if ((this.f34698e & 128) == 128) {
                                    nwi = this.f34707o;
                                    nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwk2 = nwk;
                                } else {
                                    nwk2 = null;
                                }
                                this.f34707o = (pbb) nvw.mo3989a(pbb.f34885d, nwd);
                                if (nwk2 != null) {
                                    nwk2.m36931b(this.f34707o);
                                    this.f34707o = (pbb) nwk2.mo4055d();
                                }
                                this.f34698e |= 128;
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
                if (f34697p == null) {
                    synchronized (ozq.class) {
                        if (f34697p == null) {
                            f34697p = new nvk(f34695d);
                        }
                    }
                }
                return f34697p;
            default:
                throw new UnsupportedOperationException();
        }
        return f34695d;
    }
}
