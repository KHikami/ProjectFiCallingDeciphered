package p000;

import java.io.IOException;

public final class ozt extends nwi<ozt, nwk> implements nxk {
    public static final ozt f34713d;
    private static volatile nxm<ozt> f34714j;
    private int f34715e;
    private int f34716f;
    private int f34717g;
    private int f34718h;
    private long f34719i;

    private ozt() {
    }

    private boolean m40059i() {
        return (this.f34715e & 1) == 1;
    }

    private boolean m40060j() {
        return (this.f34715e & 2) == 2;
    }

    private boolean m40061k() {
        return (this.f34715e & 4) == 4;
    }

    private boolean m40062m() {
        return (this.f34715e & 8) == 8;
    }

    public void m40064a(nvy nvy) {
        if ((this.f34715e & 1) == 1) {
            nvy.mo4035c(1, this.f34716f);
        }
        if ((this.f34715e & 2) == 2) {
            nvy.mo4035c(2, this.f34717g);
        }
        if ((this.f34715e & 4) == 4) {
            nvy.mo4035c(3, this.f34718h);
        }
        if ((this.f34715e & 8) == 8) {
            nvy.mo4019a(4, this.f34719i);
        }
        this.b.a(nvy);
    }

    public int m40065l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34715e & 1) == 1) {
            i = nvy.m36853f(1, this.f34716f) + 0;
        }
        if ((this.f34715e & 2) == 2) {
            i += nvy.m36853f(2, this.f34717g);
        }
        if ((this.f34715e & 4) == 4) {
            i += nvy.m36853f(3, this.f34718h);
        }
        if ((this.f34715e & 8) == 8) {
            i += nvy.m36837c(4, this.f34719i);
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40063a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new ozt();
            case 2:
                return f34713d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ozt ozt = (ozt) obj2;
                this.f34716f = nwt.mo4044a(m40059i(), this.f34716f, ozt.m40059i(), ozt.f34716f);
                this.f34717g = nwt.mo4044a(m40060j(), this.f34717g, ozt.m40060j(), ozt.f34717g);
                this.f34718h = nwt.mo4044a(m40061k(), this.f34718h, ozt.m40061k(), ozt.f34718h);
                this.f34719i = nwt.mo4045a(m40062m(), this.f34719i, ozt.m40062m(), ozt.f34719i);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34715e |= ozt.f34715e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                while (!z) {
                    try {
                        int a = nvw.mo3987a();
                        switch (a) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.f34715e |= 1;
                                this.f34716f = nvw.mo4006m();
                                break;
                            case 16:
                                this.f34715e |= 2;
                                this.f34717g = nvw.mo4006m();
                                break;
                            case wi.dA /*24*/:
                                this.f34715e |= 4;
                                this.f34718h = nvw.mo4006m();
                                break;
                            case 32:
                                this.f34715e |= 8;
                                this.f34719i = nvw.mo3998e();
                                break;
                            default:
                                if (!a(a, nvw)) {
                                    z = true;
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
                if (f34714j == null) {
                    synchronized (ozt.class) {
                        if (f34714j == null) {
                            f34714j = new nvk(f34713d);
                        }
                    }
                }
                return f34714j;
            default:
                throw new UnsupportedOperationException();
        }
        return f34713d;
    }

    static {
        ozt ozt = new ozt();
        f34713d = ozt;
        ozt.d();
    }
}
