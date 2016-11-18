package p000;

import java.io.IOException;

public final class pba extends nwi<pba, nwk> implements nxk {
    public static final pba f34881d;
    private static volatile nxm<pba> f34882g;
    private int f34883e;
    private int f34884f;

    private pba() {
    }

    private boolean m40154i() {
        return (this.f34883e & 1) == 1;
    }

    public void m40156a(nvy nvy) {
        if ((this.f34883e & 1) == 1) {
            nvy.mo4029b(1, this.f34884f);
        }
        this.b.a(nvy);
    }

    public int m40157l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34883e & 1) == 1) {
            i = nvy.m36848e(1, this.f34884f) + 0;
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40155a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new pba();
            case 2:
                return f34881d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pba pba = (pba) obj2;
                this.f34884f = nwt.mo4044a(m40154i(), this.f34884f, pba.m40154i(), pba.f34884f);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34883e |= pba.f34883e;
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
                                this.f34883e |= 1;
                                this.f34884f = nvw.mo3999f();
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
                if (f34882g == null) {
                    synchronized (pba.class) {
                        if (f34882g == null) {
                            f34882g = new nvk(f34881d);
                        }
                    }
                }
                return f34882g;
            default:
                throw new UnsupportedOperationException();
        }
        return f34881d;
    }

    static {
        pba pba = new pba();
        f34881d = pba;
        pba.d();
    }
}
