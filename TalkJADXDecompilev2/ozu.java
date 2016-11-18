package defpackage;

import java.io.IOException;

public final class ozu extends nwi<ozu, nwk> implements nxk {
    public static final ozu d;
    private static volatile nxm<ozu> i;
    private int e;
    private int f;
    private int g;
    private int h;

    private ozu() {
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

    public void a(nvy nvy) {
        if ((this.e & 1) == 1) {
            nvy.b(1, this.f);
        }
        if ((this.e & 2) == 2) {
            nvy.b(2, this.g);
        }
        if ((this.e & 4) == 4) {
            nvy.b(3, this.h);
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
            i = nvy.h(1, this.f) + 0;
        }
        if ((this.e & 2) == 2) {
            i += nvy.h(2, this.g);
        }
        if ((this.e & 4) == 4) {
            i += nvy.h(3, this.h);
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        byte b = (byte) 0;
        switch (ozp.a[i - 1]) {
            case 1:
                return new ozu();
            case 2:
                return d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ozu ozu = (ozu) obj2;
                this.f = nwt.a(i(), this.f, ozu.i(), ozu.f);
                this.g = nwt.a(j(), this.g, ozu.j(), ozu.g);
                this.h = nwt.a(k(), this.h, ozu.k(), ozu.h);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= ozu.e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                while (b == (byte) 0) {
                    try {
                        int a = nvw.a();
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 8:
                                a = nvw.n();
                                if (ozz.a(a) != null) {
                                    this.e |= 1;
                                    this.f = a;
                                    break;
                                }
                                super.a(1, a);
                                break;
                            case 16:
                                a = nvw.n();
                                if (ozx.a(a) != null) {
                                    this.e |= 2;
                                    this.g = a;
                                    break;
                                }
                                super.a(2, a);
                                break;
                            case wi.dA /*24*/:
                                a = nvw.n();
                                if (ozv.a(a) != null) {
                                    this.e |= 4;
                                    this.h = a;
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
                    synchronized (ozu.class) {
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
        ozu ozu = new ozu();
        d = ozu;
        ozu.d();
    }
}
