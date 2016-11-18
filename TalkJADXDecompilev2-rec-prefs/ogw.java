package p000;

import java.io.IOException;

public final class ogw extends nwi<ogw, nwk> implements nxk {
    public static final ogw f32784d;
    private static volatile nxm<ogw> f32785q;
    private int f32786e;
    private String f32787f = "";
    private double f32788g;
    private int f32789h;
    private String f32790i = "";
    private int f32791j;
    private long f32792k;
    private double f32793l;
    private oeo f32794m;
    private boolean f32795n;
    private nxb<ogx> f32796o = nxn.f31214b;
    private byte f32797p = (byte) -1;

    private ogw() {
    }

    private boolean m38269i() {
        return (this.f32786e & 1) == 1;
    }

    private String m38270j() {
        return this.f32787f;
    }

    private boolean m38271k() {
        return (this.f32786e & 2) == 2;
    }

    private boolean m38272m() {
        return (this.f32786e & 4) == 4;
    }

    private boolean m38273n() {
        return (this.f32786e & 8) == 8;
    }

    private String m38274o() {
        return this.f32790i;
    }

    private boolean m38275p() {
        return (this.f32786e & 16) == 16;
    }

    private boolean m38276q() {
        return (this.f32786e & 32) == 32;
    }

    private boolean m38277r() {
        return (this.f32786e & 64) == 64;
    }

    private boolean m38278s() {
        return (this.f32786e & 128) == 128;
    }

    private oeo m38279t() {
        if (this.f32794m == null) {
            return oeo.f32473e;
        }
        return this.f32794m;
    }

    private boolean m38280u() {
        return (this.f32786e & 256) == 256;
    }

    private int m38281v() {
        return this.f32796o.size();
    }

    private ogx m38268b(int i) {
        return (ogx) this.f32796o.get(i);
    }

    public void m38283a(nvy nvy) {
        if ((this.f32786e & 2) == 2) {
            nvy.m36865a(12, this.f32788g);
        }
        if ((this.f32786e & 8) == 8) {
            nvy.mo4020a(13, m38274o());
        }
        if ((this.f32786e & 16) == 16) {
            nvy.mo4029b(21, this.f32791j);
        }
        if ((this.f32786e & 32) == 32) {
            nvy.mo4019a(22, this.f32792k);
        }
        if ((this.f32786e & 64) == 64) {
            nvy.m36865a(23, this.f32793l);
        }
        if ((this.f32786e & 128) == 128) {
            nvy.mo4022a(24, m38279t());
        }
        for (int i = 0; i < this.f32796o.size(); i++) {
            nvy.m36886e(25, (nxi) this.f32796o.get(i));
        }
        if ((this.f32786e & 1) == 1) {
            nvy.mo4020a(27, m38270j());
        }
        if ((this.f32786e & 256) == 256) {
            nvy.mo4023a(30, this.f32795n);
        }
        if ((this.f32786e & 4) == 4) {
            nvy.mo4029b(37, this.f32789h);
        }
        this.b.a(nvy);
    }

    public int m38284l() {
        int i = 0;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f32786e & 2) == 2) {
            i2 = nvy.m36828b(12, this.f32788g) + 0;
        } else {
            i2 = 0;
        }
        if ((this.f32786e & 8) == 8) {
            i2 += nvy.m36829b(13, m38274o());
        }
        if ((this.f32786e & 16) == 16) {
            i2 += nvy.m36848e(21, this.f32791j);
        }
        if ((this.f32786e & 32) == 32) {
            i2 += nvy.m36837c(22, this.f32792k);
        }
        if ((this.f32786e & 64) == 64) {
            i2 += nvy.m36828b(23, this.f32793l);
        }
        if ((this.f32786e & 128) == 128) {
            i2 += nvy.m36838c(24, m38279t());
        }
        int i3 = i2;
        while (i < this.f32796o.size()) {
            i++;
            i3 = nvy.m36854f(25, (nxi) this.f32796o.get(i)) + i3;
        }
        if ((this.f32786e & 1) == 1) {
            i3 += nvy.m36829b(27, m38270j());
        }
        if ((this.f32786e & 256) == 256) {
            i3 += nvy.m36831b(30, this.f32795n);
        }
        if ((this.f32786e & 4) == 4) {
            i3 += nvy.m36848e(37, this.f32789h);
        }
        i2 = this.b.b() + i3;
        this.c = i2;
        return i2;
    }

    protected final Object m38282a(int i, Object obj, Object obj2) {
        int i2;
        byte b;
        switch (ogt.f32754a[i - 1]) {
            case 1:
                return new ogw();
            case 2:
                byte b2 = this.f32797p;
                if (b2 == (byte) 1) {
                    return f32784d;
                }
                if (b2 == (byte) 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (m38271k()) {
                    if (m38278s()) {
                        if (m38279t().a(nws.f31186a, Boolean.TRUE) != null) {
                            b2 = (byte) 1;
                        } else {
                            b2 = (byte) 0;
                        }
                        if (b2 == (byte) 0) {
                            if (booleanValue) {
                                this.f32797p = (byte) 0;
                            }
                            return null;
                        }
                    }
                    for (i2 = 0; i2 < m38281v(); i2++) {
                        if (m38268b(i2).a(nws.f31186a, Boolean.TRUE) != null) {
                            b = (byte) 1;
                        } else {
                            b = (byte) 0;
                        }
                        if (b == (byte) 0) {
                            if (booleanValue) {
                                this.f32797p = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (booleanValue) {
                        this.f32797p = (byte) 1;
                    }
                    return f32784d;
                }
                if (booleanValue) {
                    this.f32797p = (byte) 0;
                }
                return null;
            case 3:
                this.f32796o.mo3981b();
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ogw ogw = (ogw) obj2;
                this.f32787f = nwt.mo4046a(m38269i(), this.f32787f, ogw.m38269i(), ogw.f32787f);
                this.f32788g = nwt.mo4043a(m38271k(), this.f32788g, ogw.m38271k(), ogw.f32788g);
                this.f32789h = nwt.mo4044a(m38272m(), this.f32789h, ogw.m38272m(), ogw.f32789h);
                this.f32790i = nwt.mo4046a(m38273n(), this.f32790i, ogw.m38273n(), ogw.f32790i);
                this.f32791j = nwt.mo4044a(m38275p(), this.f32791j, ogw.m38275p(), ogw.f32791j);
                this.f32792k = nwt.mo4045a(m38276q(), this.f32792k, ogw.m38276q(), ogw.f32792k);
                this.f32793l = nwt.mo4043a(m38277r(), this.f32793l, ogw.m38277r(), ogw.f32793l);
                this.f32794m = (oeo) nwt.mo4050a(this.f32794m, ogw.f32794m);
                this.f32795n = nwt.mo4052a(m38280u(), this.f32795n, ogw.m38280u(), ogw.f32795n);
                this.f32796o = nwt.mo4049a(this.f32796o, ogw.f32796o);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f32786e |= ogw.f32786e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                nwd nwd = (nwd) obj2;
                b = (byte) 0;
                while (b == (byte) 0) {
                    try {
                        i2 = nvw.mo3987a();
                        String j;
                        switch (i2) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 97:
                                this.f32786e |= 2;
                                this.f32788g = nvw.mo3993b();
                                break;
                            case 106:
                                j = nvw.mo4003j();
                                this.f32786e |= 8;
                                this.f32790i = j;
                                break;
                            case 168:
                                this.f32786e |= 16;
                                this.f32791j = nvw.mo3999f();
                                break;
                            case 176:
                                this.f32786e |= 32;
                                this.f32792k = nvw.mo3998e();
                                break;
                            case 185:
                                this.f32786e |= 64;
                                this.f32793l = nvw.mo3993b();
                                break;
                            case 194:
                                nwn nwn;
                                if ((this.f32786e & 128) == 128) {
                                    nwi nwi = this.f32794m;
                                    nwk nwk = (nwk) nwi.a(nws.f31191f);
                                    nwk.m36931b(nwi);
                                    nwn = (nwn) nwk;
                                } else {
                                    nwn = null;
                                }
                                this.f32794m = (oeo) nvw.mo3989a(oeo.f32473e, nwd);
                                if (nwn != null) {
                                    nwn.m36931b(this.f32794m);
                                    this.f32794m = (oeo) nwn.m36968l();
                                }
                                this.f32786e |= 128;
                                break;
                            case 203:
                                if (!this.f32796o.mo3980a()) {
                                    nxb nxb = this.f32796o;
                                    i2 = nxb.size();
                                    this.f32796o = nxb.mo4061d(i2 == 0 ? 10 : i2 << 1);
                                }
                                this.f32796o.add((ogx) nvw.mo3988a(25, ogx.f32798d, nwd));
                                break;
                            case 218:
                                j = nvw.mo4003j();
                                this.f32786e |= 1;
                                this.f32787f = j;
                                break;
                            case 240:
                                this.f32786e |= 256;
                                this.f32795n = nvw.mo4002i();
                                break;
                            case 296:
                                this.f32786e |= 4;
                                this.f32789h = nvw.mo3999f();
                                break;
                            default:
                                if (!a(i2, nvw)) {
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
                if (f32785q == null) {
                    synchronized (ogw.class) {
                        if (f32785q == null) {
                            f32785q = new nvk(f32784d);
                        }
                    }
                }
                return f32785q;
            default:
                throw new UnsupportedOperationException();
        }
        return f32784d;
    }

    static {
        ogw ogw = new ogw();
        f32784d = ogw;
        ogw.d();
    }
}
