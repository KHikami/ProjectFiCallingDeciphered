package p000;

import java.io.IOException;

public final class pbb extends nwi<pbb, nwk> implements nxk {
    public static final pbb f34885d;
    private static volatile nxm<pbb> f34886g;
    private int f34887e;
    private int f34888f;

    private pbb() {
    }

    private boolean m40158i() {
        return (this.f34887e & 1) == 1;
    }

    public void m40160a(nvy nvy) {
        if ((this.f34887e & 1) == 1) {
            nvy.mo4029b(1, this.f34888f);
        }
        this.b.a(nvy);
    }

    public int m40161l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34887e & 1) == 1) {
            i = nvy.m36860h(1, this.f34888f) + 0;
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40159a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new pbb();
            case 2:
                return f34885d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pbb pbb = (pbb) obj2;
                this.f34888f = nwt.mo4044a(m40158i(), this.f34888f, pbb.m40158i(), pbb.f34888f);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34887e |= pbb.f34887e;
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
                                if (pbc.m40162a(a) != null) {
                                    this.f34887e |= 1;
                                    this.f34888f = a;
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
                if (f34886g == null) {
                    synchronized (pbb.class) {
                        if (f34886g == null) {
                            f34886g = new nvk(f34885d);
                        }
                    }
                }
                return f34886g;
            default:
                throw new UnsupportedOperationException();
        }
        return f34885d;
    }

    static {
        pbb pbb = new pbb();
        f34885d = pbb;
        pbb.d();
    }
}
