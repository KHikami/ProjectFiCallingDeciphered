package p000;

import java.io.IOException;

public final class par extends nwi<par, nwk> implements nxk {
    public static final par f34838d;
    private static volatile nxm<par> f34839g;
    private int f34840e;
    private int f34841f;

    private par() {
    }

    private boolean m40129i() {
        return (this.f34840e & 1) == 1;
    }

    public void m40131a(nvy nvy) {
        if ((this.f34840e & 1) == 1) {
            nvy.mo4029b(1, this.f34841f);
        }
        this.b.a(nvy);
    }

    public int m40132l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34840e & 1) == 1) {
            i = nvy.m36860h(1, this.f34841f) + 0;
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40130a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new par();
            case 2:
                return f34838d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                par par = (par) obj2;
                this.f34841f = nwt.mo4044a(m40129i(), this.f34841f, par.m40129i(), par.f34841f);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34840e |= par.f34840e;
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
                                a = nvw.mo4007n();
                                if (pas.m40133a(a) != null) {
                                    this.f34840e |= 1;
                                    this.f34841f = a;
                                    break;
                                }
                                super.a(1, a);
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
                if (f34839g == null) {
                    synchronized (par.class) {
                        if (f34839g == null) {
                            f34839g = new nvk(f34838d);
                        }
                    }
                }
                return f34839g;
            default:
                throw new UnsupportedOperationException();
        }
        return f34838d;
    }

    static {
        par par = new par();
        f34838d = par;
        par.d();
    }
}
