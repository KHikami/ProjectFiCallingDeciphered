package p000;

import java.io.IOException;

public final class pag extends nwi<pag, nwk> implements nxk {
    public static final pag f34784d;
    private static volatile nxm<pag> f34785g;
    private int f34786e;
    private int f34787f;

    private pag() {
    }

    private boolean m40098i() {
        return (this.f34786e & 1) == 1;
    }

    public void m40100a(nvy nvy) {
        if ((this.f34786e & 1) == 1) {
            nvy.mo4029b(1, this.f34787f);
        }
        this.b.a(nvy);
    }

    public int m40101l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34786e & 1) == 1) {
            i = nvy.m36860h(1, this.f34787f) + 0;
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40099a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new pag();
            case 2:
                return f34784d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pag pag = (pag) obj2;
                this.f34787f = nwt.mo4044a(m40098i(), this.f34787f, pag.m40098i(), pag.f34787f);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34786e |= pag.f34786e;
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
                                if (pah.m40102a(a) != null) {
                                    this.f34786e |= 1;
                                    this.f34787f = a;
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
                if (f34785g == null) {
                    synchronized (pag.class) {
                        if (f34785g == null) {
                            f34785g = new nvk(f34784d);
                        }
                    }
                }
                return f34785g;
            default:
                throw new UnsupportedOperationException();
        }
        return f34784d;
    }

    static {
        pag pag = new pag();
        f34784d = pag;
        pag.d();
    }
}
