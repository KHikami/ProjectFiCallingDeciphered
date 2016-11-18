package p000;

import java.io.IOException;

public final class paz extends nwi<paz, nwk> implements nxk {
    public static final paz f34876d;
    private static volatile nxm<paz> f34877g;
    private int f34878e;
    private boolean f34879f;

    private paz() {
    }

    private boolean m40146i() {
        return (this.f34878e & 1) == 1;
    }

    public void m40148a(nvy nvy) {
        if ((this.f34878e & 1) == 1) {
            nvy.mo4023a(1, this.f34879f);
        }
        this.b.a(nvy);
    }

    public int m40149l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34878e & 1) == 1) {
            i = nvy.m36831b(1, this.f34879f) + 0;
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40147a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new paz();
            case 2:
                return f34876d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                paz paz = (paz) obj2;
                this.f34879f = nwt.mo4052a(m40146i(), this.f34879f, paz.m40146i(), paz.f34879f);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34878e |= paz.f34878e;
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
                                this.f34878e |= 1;
                                this.f34879f = nvw.mo4002i();
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
                if (f34877g == null) {
                    synchronized (paz.class) {
                        if (f34877g == null) {
                            f34877g = new nvk(f34876d);
                        }
                    }
                }
                return f34877g;
            default:
                throw new UnsupportedOperationException();
        }
        return f34876d;
    }

    static {
        paz paz = new paz();
        f34876d = paz;
        paz.d();
    }
}
