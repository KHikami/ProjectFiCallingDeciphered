package p000;

import java.io.IOException;

public final class pak extends nwi<pak, nwk> implements nxk {
    public static final pak f34812d;
    private static volatile nxm<pak> f34813g;
    private int f34814e;
    private int f34815f;

    private pak() {
    }

    private boolean m40114i() {
        return (this.f34814e & 1) == 1;
    }

    public void m40116a(nvy nvy) {
        if ((this.f34814e & 1) == 1) {
            nvy.mo4029b(1, this.f34815f);
        }
        this.b.a(nvy);
    }

    public int m40117l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34814e & 1) == 1) {
            i = nvy.m36860h(1, this.f34815f) + 0;
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40115a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new pak();
            case 2:
                return f34812d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pak pak = (pak) obj2;
                this.f34815f = nwt.mo4044a(m40114i(), this.f34815f, pak.m40114i(), pak.f34815f);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34814e |= pak.f34814e;
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
                                if (pal.m40118a(a) != null) {
                                    this.f34814e |= 1;
                                    this.f34815f = a;
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
                if (f34813g == null) {
                    synchronized (pak.class) {
                        if (f34813g == null) {
                            f34813g = new nvk(f34812d);
                        }
                    }
                }
                return f34813g;
            default:
                throw new UnsupportedOperationException();
        }
        return f34812d;
    }

    static {
        pak pak = new pak();
        f34812d = pak;
        pak.d();
    }
}
