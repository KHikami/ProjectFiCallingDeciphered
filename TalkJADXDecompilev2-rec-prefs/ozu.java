package p000;

import java.io.IOException;

public final class ozu extends nwi<ozu, nwk> implements nxk {
    public static final ozu f34720d;
    private static volatile nxm<ozu> f34721i;
    private int f34722e;
    private int f34723f;
    private int f34724g;
    private int f34725h;

    private ozu() {
    }

    private boolean m40066i() {
        return (this.f34722e & 1) == 1;
    }

    private boolean m40067j() {
        return (this.f34722e & 2) == 2;
    }

    private boolean m40068k() {
        return (this.f34722e & 4) == 4;
    }

    public void m40070a(nvy nvy) {
        if ((this.f34722e & 1) == 1) {
            nvy.mo4029b(1, this.f34723f);
        }
        if ((this.f34722e & 2) == 2) {
            nvy.mo4029b(2, this.f34724g);
        }
        if ((this.f34722e & 4) == 4) {
            nvy.mo4029b(3, this.f34725h);
        }
        this.b.a(nvy);
    }

    public int m40071l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34722e & 1) == 1) {
            i = nvy.m36860h(1, this.f34723f) + 0;
        }
        if ((this.f34722e & 2) == 2) {
            i += nvy.m36860h(2, this.f34724g);
        }
        if ((this.f34722e & 4) == 4) {
            i += nvy.m36860h(3, this.f34725h);
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40069a(int i, Object obj, Object obj2) {
        byte b = (byte) 0;
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new ozu();
            case 2:
                return f34720d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ozu ozu = (ozu) obj2;
                this.f34723f = nwt.mo4044a(m40066i(), this.f34723f, ozu.m40066i(), ozu.f34723f);
                this.f34724g = nwt.mo4044a(m40067j(), this.f34724g, ozu.m40067j(), ozu.f34724g);
                this.f34725h = nwt.mo4044a(m40068k(), this.f34725h, ozu.m40068k(), ozu.f34725h);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34722e |= ozu.f34722e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                while (b == (byte) 0) {
                    try {
                        int a = nvw.mo3987a();
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 8:
                                a = nvw.mo4007n();
                                if (ozz.m40078a(a) != null) {
                                    this.f34722e |= 1;
                                    this.f34723f = a;
                                    break;
                                }
                                super.a(1, a);
                                break;
                            case 16:
                                a = nvw.mo4007n();
                                if (ozx.m40075a(a) != null) {
                                    this.f34722e |= 2;
                                    this.f34724g = a;
                                    break;
                                }
                                super.a(2, a);
                                break;
                            case wi.dA /*24*/:
                                a = nvw.mo4007n();
                                if (ozv.m40072a(a) != null) {
                                    this.f34722e |= 4;
                                    this.f34725h = a;
                                    break;
                                }
                                super.a(3, a);
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
                if (f34721i == null) {
                    synchronized (ozu.class) {
                        if (f34721i == null) {
                            f34721i = new nvk(f34720d);
                        }
                    }
                }
                return f34721i;
            default:
                throw new UnsupportedOperationException();
        }
        return f34720d;
    }

    static {
        ozu ozu = new ozu();
        f34720d = ozu;
        ozu.d();
    }
}
