package defpackage;

import java.io.IOException;

public final class pbg extends nwi<pbg, nwk> implements nxk {
    public static final pbg d;
    private static volatile nxm<pbg> k;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;

    private pbg() {
    }

    private boolean i() {
        return (this.e & 1) == 1;
    }

    private boolean j() {
        return (this.e & 2) == 2;
    }

    private boolean k() {
        return (this.e & 4) == 4;
    }

    private boolean m() {
        return (this.e & 8) == 8;
    }

    private boolean n() {
        return (this.e & 16) == 16;
    }

    public void a(nvy nvy) {
        if ((this.e & 1) == 1) {
            nvy.a(1, this.f);
        }
        if ((this.e & 2) == 2) {
            nvy.a(2, this.g);
        }
        if ((this.e & 4) == 4) {
            nvy.a(3, this.h);
        }
        if ((this.e & 8) == 8) {
            nvy.a(4, this.i);
        }
        if ((this.e & 16) == 16) {
            nvy.a(5, this.j);
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
            i = nvy.b(1, this.f) + 0;
        }
        if ((this.e & 2) == 2) {
            i += nvy.b(2, this.g);
        }
        if ((this.e & 4) == 4) {
            i += nvy.b(3, this.h);
        }
        if ((this.e & 8) == 8) {
            i += nvy.b(4, this.i);
        }
        if ((this.e & 16) == 16) {
            i += nvy.b(5, this.j);
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        switch (ozp.a[i - 1]) {
            case 1:
                return new pbg();
            case 2:
                return d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pbg pbg = (pbg) obj2;
                this.f = nwt.a(i(), this.f, pbg.i(), pbg.f);
                this.g = nwt.a(j(), this.g, pbg.j(), pbg.g);
                this.h = nwt.a(k(), this.h, pbg.k(), pbg.h);
                this.i = nwt.a(m(), this.i, pbg.m(), pbg.i);
                this.j = nwt.a(n(), this.j, pbg.n(), pbg.j);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= pbg.e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                byte b = (byte) 0;
                while (b == (byte) 0) {
                    try {
                        int a = nvw.a();
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 8:
                                this.e |= 1;
                                this.f = nvw.i();
                                break;
                            case 16:
                                this.e |= 2;
                                this.g = nvw.i();
                                break;
                            case wi.dA /*24*/:
                                this.e |= 4;
                                this.h = nvw.i();
                                break;
                            case 32:
                                this.e |= 8;
                                this.i = nvw.i();
                                break;
                            case 40:
                                this.e |= 16;
                                this.j = nvw.i();
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
                if (k == null) {
                    synchronized (pbg.class) {
                        if (k == null) {
                            k = new nvk(d);
                        }
                    }
                }
                return k;
            default:
                throw new UnsupportedOperationException();
        }
        return d;
    }

    static {
        pbg pbg = new pbg();
        d = pbg;
        pbg.d();
    }
}
