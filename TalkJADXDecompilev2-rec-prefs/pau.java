package p000;

import java.io.IOException;

public final class pau extends nwi<pau, nwk> implements nxk {
    public static final pau f34848d;
    private static volatile nxm<pau> f34849g;
    private int f34850e;
    private int f34851f;

    private pau() {
    }

    private boolean m40136i() {
        return (this.f34850e & 1) == 1;
    }

    public void m40138a(nvy nvy) {
        if ((this.f34850e & 1) == 1) {
            nvy.mo4029b(1, this.f34851f);
        }
        this.b.a(nvy);
    }

    public int m40139l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34850e & 1) == 1) {
            i = nvy.m36860h(1, this.f34851f) + 0;
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40137a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new pau();
            case 2:
                return f34848d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pau pau = (pau) obj2;
                this.f34851f = nwt.mo4044a(m40136i(), this.f34851f, pau.m40136i(), pau.f34851f);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34850e |= pau.f34850e;
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
                                if (pav.m40140a(a) != null) {
                                    this.f34850e |= 1;
                                    this.f34851f = a;
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
                if (f34849g == null) {
                    synchronized (pau.class) {
                        if (f34849g == null) {
                            f34849g = new nvk(f34848d);
                        }
                    }
                }
                return f34849g;
            default:
                throw new UnsupportedOperationException();
        }
        return f34848d;
    }

    static {
        pau pau = new pau();
        f34848d = pau;
        pau.d();
    }
}
