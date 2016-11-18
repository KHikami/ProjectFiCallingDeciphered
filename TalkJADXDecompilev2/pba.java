package defpackage;

import java.io.IOException;

public final class pba extends nwi<pba, nwk> implements nxk {
    public static final pba d;
    private static volatile nxm<pba> g;
    private int e;
    private int f;

    private pba() {
    }

    private boolean i() {
        return (this.e & 1) == 1;
    }

    public void a(nvy nvy) {
        if ((this.e & 1) == 1) {
            nvy.b(1, this.f);
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
            i = nvy.e(1, this.f) + 0;
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        switch (ozp.a[i - 1]) {
            case 1:
                return new pba();
            case 2:
                return d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pba pba = (pba) obj2;
                this.f = nwt.a(i(), this.f, pba.i(), pba.f);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= pba.e;
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
                                this.f = nvw.f();
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
                if (g == null) {
                    synchronized (pba.class) {
                        if (g == null) {
                            g = new nvk(d);
                        }
                    }
                }
                return g;
            default:
                throw new UnsupportedOperationException();
        }
        return d;
    }

    static {
        pba pba = new pba();
        d = pba;
        pba.d();
    }
}
