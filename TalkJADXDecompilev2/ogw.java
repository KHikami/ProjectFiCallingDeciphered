package defpackage;

import java.io.IOException;

public final class ogw extends nwi<ogw, nwk> implements nxk {
    public static final ogw d;
    private static volatile nxm<ogw> q;
    private int e;
    private String f = "";
    private double g;
    private int h;
    private String i = "";
    private int j;
    private long k;
    private double l;
    private oeo m;
    private boolean n;
    private nxb<ogx> o = nxn.b;
    private byte p = (byte) -1;

    private ogw() {
    }

    private boolean i() {
        return (this.e & 1) == 1;
    }

    private String j() {
        return this.f;
    }

    private boolean k() {
        return (this.e & 2) == 2;
    }

    private boolean m() {
        return (this.e & 4) == 4;
    }

    private boolean n() {
        return (this.e & 8) == 8;
    }

    private String o() {
        return this.i;
    }

    private boolean p() {
        return (this.e & 16) == 16;
    }

    private boolean q() {
        return (this.e & 32) == 32;
    }

    private boolean r() {
        return (this.e & 64) == 64;
    }

    private boolean s() {
        return (this.e & 128) == 128;
    }

    private oeo t() {
        if (this.m == null) {
            return oeo.e;
        }
        return this.m;
    }

    private boolean u() {
        return (this.e & 256) == 256;
    }

    private int v() {
        return this.o.size();
    }

    private ogx b(int i) {
        return (ogx) this.o.get(i);
    }

    public void a(nvy nvy) {
        if ((this.e & 2) == 2) {
            nvy.a(12, this.g);
        }
        if ((this.e & 8) == 8) {
            nvy.a(13, o());
        }
        if ((this.e & 16) == 16) {
            nvy.b(21, this.j);
        }
        if ((this.e & 32) == 32) {
            nvy.a(22, this.k);
        }
        if ((this.e & 64) == 64) {
            nvy.a(23, this.l);
        }
        if ((this.e & 128) == 128) {
            nvy.a(24, t());
        }
        for (int i = 0; i < this.o.size(); i++) {
            nvy.e(25, (nxi) this.o.get(i));
        }
        if ((this.e & 1) == 1) {
            nvy.a(27, j());
        }
        if ((this.e & 256) == 256) {
            nvy.a(30, this.n);
        }
        if ((this.e & 4) == 4) {
            nvy.b(37, this.h);
        }
        this.b.a(nvy);
    }

    public int l() {
        int i = 0;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        if ((this.e & 2) == 2) {
            i2 = nvy.b(12, this.g) + 0;
        } else {
            i2 = 0;
        }
        if ((this.e & 8) == 8) {
            i2 += nvy.b(13, o());
        }
        if ((this.e & 16) == 16) {
            i2 += nvy.e(21, this.j);
        }
        if ((this.e & 32) == 32) {
            i2 += nvy.c(22, this.k);
        }
        if ((this.e & 64) == 64) {
            i2 += nvy.b(23, this.l);
        }
        if ((this.e & 128) == 128) {
            i2 += nvy.c(24, t());
        }
        int i3 = i2;
        while (i < this.o.size()) {
            i++;
            i3 = nvy.f(25, (nxi) this.o.get(i)) + i3;
        }
        if ((this.e & 1) == 1) {
            i3 += nvy.b(27, j());
        }
        if ((this.e & 256) == 256) {
            i3 += nvy.b(30, this.n);
        }
        if ((this.e & 4) == 4) {
            i3 += nvy.e(37, this.h);
        }
        i2 = this.b.b() + i3;
        this.c = i2;
        return i2;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        int i2;
        byte b;
        switch (ogt.a[i - 1]) {
            case 1:
                return new ogw();
            case 2:
                byte b2 = this.p;
                if (b2 == (byte) 1) {
                    return d;
                }
                if (b2 == (byte) 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (k()) {
                    if (s()) {
                        if (t().a(nws.a, Boolean.TRUE) != null) {
                            b2 = (byte) 1;
                        } else {
                            b2 = (byte) 0;
                        }
                        if (b2 == (byte) 0) {
                            if (booleanValue) {
                                this.p = (byte) 0;
                            }
                            return null;
                        }
                    }
                    for (i2 = 0; i2 < v(); i2++) {
                        if (b(i2).a(nws.a, Boolean.TRUE) != null) {
                            b = (byte) 1;
                        } else {
                            b = (byte) 0;
                        }
                        if (b == (byte) 0) {
                            if (booleanValue) {
                                this.p = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (booleanValue) {
                        this.p = (byte) 1;
                    }
                    return d;
                }
                if (booleanValue) {
                    this.p = (byte) 0;
                }
                return null;
            case 3:
                this.o.b();
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ogw ogw = (ogw) obj2;
                this.f = nwt.a(i(), this.f, ogw.i(), ogw.f);
                this.g = nwt.a(k(), this.g, ogw.k(), ogw.g);
                this.h = nwt.a(m(), this.h, ogw.m(), ogw.h);
                this.i = nwt.a(n(), this.i, ogw.n(), ogw.i);
                this.j = nwt.a(p(), this.j, ogw.p(), ogw.j);
                this.k = nwt.a(q(), this.k, ogw.q(), ogw.k);
                this.l = nwt.a(r(), this.l, ogw.r(), ogw.l);
                this.m = (oeo) nwt.a(this.m, ogw.m);
                this.n = nwt.a(u(), this.n, ogw.u(), ogw.n);
                this.o = nwt.a(this.o, ogw.o);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= ogw.e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                nwd nwd = (nwd) obj2;
                b = (byte) 0;
                while (b == (byte) 0) {
                    try {
                        i2 = nvw.a();
                        String j;
                        switch (i2) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 97:
                                this.e |= 2;
                                this.g = nvw.b();
                                break;
                            case 106:
                                j = nvw.j();
                                this.e |= 8;
                                this.i = j;
                                break;
                            case 168:
                                this.e |= 16;
                                this.j = nvw.f();
                                break;
                            case 176:
                                this.e |= 32;
                                this.k = nvw.e();
                                break;
                            case 185:
                                this.e |= 64;
                                this.l = nvw.b();
                                break;
                            case 194:
                                nwn nwn;
                                if ((this.e & 128) == 128) {
                                    nwi nwi = this.m;
                                    nwk nwk = (nwk) nwi.a(nws.f);
                                    nwk.b(nwi);
                                    nwn = (nwn) nwk;
                                } else {
                                    nwn = null;
                                }
                                this.m = (oeo) nvw.a(oeo.e, nwd);
                                if (nwn != null) {
                                    nwn.b(this.m);
                                    this.m = (oeo) nwn.l();
                                }
                                this.e |= 128;
                                break;
                            case 203:
                                if (!this.o.a()) {
                                    nxb nxb = this.o;
                                    i2 = nxb.size();
                                    this.o = nxb.d(i2 == 0 ? 10 : i2 << 1);
                                }
                                this.o.add((ogx) nvw.a(25, ogx.d, nwd));
                                break;
                            case 218:
                                j = nvw.j();
                                this.e |= 1;
                                this.f = j;
                                break;
                            case 240:
                                this.e |= 256;
                                this.n = nvw.i();
                                break;
                            case 296:
                                this.e |= 4;
                                this.h = nvw.f();
                                break;
                            default:
                                if (!a(i2, nvw)) {
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
                if (q == null) {
                    synchronized (ogw.class) {
                        if (q == null) {
                            q = new nvk(d);
                        }
                    }
                }
                return q;
            default:
                throw new UnsupportedOperationException();
        }
        return d;
    }

    static {
        ogw ogw = new ogw();
        d = ogw;
        ogw.d();
    }
}
