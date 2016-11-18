package p000;

import java.io.IOException;

public final class pbg extends nwi<pbg, nwk> implements nxk {
    public static final pbg f34904d;
    private static volatile nxm<pbg> f34905k;
    private int f34906e;
    private boolean f34907f;
    private boolean f34908g;
    private boolean f34909h;
    private boolean f34910i;
    private boolean f34911j;

    private pbg() {
    }

    private boolean m40168i() {
        return (this.f34906e & 1) == 1;
    }

    private boolean m40169j() {
        return (this.f34906e & 2) == 2;
    }

    private boolean m40170k() {
        return (this.f34906e & 4) == 4;
    }

    private boolean m40171m() {
        return (this.f34906e & 8) == 8;
    }

    private boolean m40172n() {
        return (this.f34906e & 16) == 16;
    }

    public void m40174a(nvy nvy) {
        if ((this.f34906e & 1) == 1) {
            nvy.mo4023a(1, this.f34907f);
        }
        if ((this.f34906e & 2) == 2) {
            nvy.mo4023a(2, this.f34908g);
        }
        if ((this.f34906e & 4) == 4) {
            nvy.mo4023a(3, this.f34909h);
        }
        if ((this.f34906e & 8) == 8) {
            nvy.mo4023a(4, this.f34910i);
        }
        if ((this.f34906e & 16) == 16) {
            nvy.mo4023a(5, this.f34911j);
        }
        this.b.a(nvy);
    }

    public int m40175l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34906e & 1) == 1) {
            i = nvy.m36831b(1, this.f34907f) + 0;
        }
        if ((this.f34906e & 2) == 2) {
            i += nvy.m36831b(2, this.f34908g);
        }
        if ((this.f34906e & 4) == 4) {
            i += nvy.m36831b(3, this.f34909h);
        }
        if ((this.f34906e & 8) == 8) {
            i += nvy.m36831b(4, this.f34910i);
        }
        if ((this.f34906e & 16) == 16) {
            i += nvy.m36831b(5, this.f34911j);
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40173a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new pbg();
            case 2:
                return f34904d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pbg pbg = (pbg) obj2;
                this.f34907f = nwt.mo4052a(m40168i(), this.f34907f, pbg.m40168i(), pbg.f34907f);
                this.f34908g = nwt.mo4052a(m40169j(), this.f34908g, pbg.m40169j(), pbg.f34908g);
                this.f34909h = nwt.mo4052a(m40170k(), this.f34909h, pbg.m40170k(), pbg.f34909h);
                this.f34910i = nwt.mo4052a(m40171m(), this.f34910i, pbg.m40171m(), pbg.f34910i);
                this.f34911j = nwt.mo4052a(m40172n(), this.f34911j, pbg.m40172n(), pbg.f34911j);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34906e |= pbg.f34906e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                byte b = (byte) 0;
                while (b == (byte) 0) {
                    try {
                        int a = nvw.mo3987a();
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 8:
                                this.f34906e |= 1;
                                this.f34907f = nvw.mo4002i();
                                break;
                            case 16:
                                this.f34906e |= 2;
                                this.f34908g = nvw.mo4002i();
                                break;
                            case wi.dA /*24*/:
                                this.f34906e |= 4;
                                this.f34909h = nvw.mo4002i();
                                break;
                            case 32:
                                this.f34906e |= 8;
                                this.f34910i = nvw.mo4002i();
                                break;
                            case 40:
                                this.f34906e |= 16;
                                this.f34911j = nvw.mo4002i();
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
                if (f34905k == null) {
                    synchronized (pbg.class) {
                        if (f34905k == null) {
                            f34905k = new nvk(f34904d);
                        }
                    }
                }
                return f34905k;
            default:
                throw new UnsupportedOperationException();
        }
        return f34904d;
    }

    static {
        pbg pbg = new pbg();
        f34904d = pbg;
        pbg.d();
    }
}
