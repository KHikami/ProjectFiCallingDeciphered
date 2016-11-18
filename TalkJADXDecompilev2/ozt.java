package defpackage;

import java.io.IOException;

public final class ozt extends nwi<ozt, nwk> implements nxk {
    public static final ozt d;
    private static volatile nxm<ozt> j;
    private int e;
    private int f;
    private int g;
    private int h;
    private long i;

    private ozt() {
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

    public void a(nvy nvy) {
        if ((this.e & 1) == 1) {
            nvy.c(1, this.f);
        }
        if ((this.e & 2) == 2) {
            nvy.c(2, this.g);
        }
        if ((this.e & 4) == 4) {
            nvy.c(3, this.h);
        }
        if ((this.e & 8) == 8) {
            nvy.a(4, this.i);
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
            i = nvy.f(1, this.f) + 0;
        }
        if ((this.e & 2) == 2) {
            i += nvy.f(2, this.g);
        }
        if ((this.e & 4) == 4) {
            i += nvy.f(3, this.h);
        }
        if ((this.e & 8) == 8) {
            i += nvy.c(4, this.i);
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (ozp.a[i - 1]) {
            case 1:
                return new ozt();
            case 2:
                return d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ozt ozt = (ozt) obj2;
                this.f = nwt.a(i(), this.f, ozt.i(), ozt.f);
                this.g = nwt.a(j(), this.g, ozt.j(), ozt.g);
                this.h = nwt.a(k(), this.h, ozt.k(), ozt.h);
                this.i = nwt.a(m(), this.i, ozt.m(), ozt.i);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= ozt.e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                while (!z) {
                    try {
                        int a = nvw.a();
                        switch (a) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.e |= 1;
                                this.f = nvw.m();
                                break;
                            case 16:
                                this.e |= 2;
                                this.g = nvw.m();
                                break;
                            case wi.dA /*24*/:
                                this.e |= 4;
                                this.h = nvw.m();
                                break;
                            case 32:
                                this.e |= 8;
                                this.i = nvw.e();
                                break;
                            default:
                                if (!a(a, nvw)) {
                                    z = true;
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
                if (j == null) {
                    synchronized (ozt.class) {
                        if (j == null) {
                            j = new nvk(d);
                        }
                    }
                }
                return j;
            default:
                throw new UnsupportedOperationException();
        }
        return d;
    }

    static {
        ozt ozt = new ozt();
        d = ozt;
        ozt.d();
    }
}
