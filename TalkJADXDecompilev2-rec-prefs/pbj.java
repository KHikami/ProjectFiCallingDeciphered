package p000;

import java.io.IOException;

public final class pbj extends nwi<pbj, nwk> implements nxk {
    public static final pbj f34926d;
    private static volatile nxm<pbj> f34927j;
    private int f34928e;
    private String f34929f = "";
    private int f34930g;
    private int f34931h;
    private nxb<pbl> f34932i = nxn.f31214b;

    private pbj() {
    }

    private boolean m40179i() {
        return (this.f34928e & 1) == 1;
    }

    private String m40180j() {
        return this.f34929f;
    }

    private boolean m40181k() {
        return (this.f34928e & 2) == 2;
    }

    private boolean m40182m() {
        return (this.f34928e & 4) == 4;
    }

    public void m40184a(nvy nvy) {
        if ((this.f34928e & 1) == 1) {
            nvy.mo4020a(1, m40180j());
        }
        if ((this.f34928e & 2) == 2) {
            nvy.mo4029b(2, this.f34930g);
        }
        if ((this.f34928e & 4) == 4) {
            nvy.mo4029b(3, this.f34931h);
        }
        for (int i = 0; i < this.f34932i.size(); i++) {
            nvy.mo4022a(4, (nxi) this.f34932i.get(i));
        }
        this.b.a(nvy);
    }

    public int m40185l() {
        int i = 0;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f34928e & 1) == 1) {
            i2 = nvy.m36829b(1, m40180j()) + 0;
        } else {
            i2 = 0;
        }
        if ((this.f34928e & 2) == 2) {
            i2 += nvy.m36848e(2, this.f34930g);
        }
        if ((this.f34928e & 4) == 4) {
            i2 += nvy.m36848e(3, this.f34931h);
        }
        int i3 = i2;
        while (i < this.f34932i.size()) {
            i++;
            i3 = nvy.m36838c(4, (nxi) this.f34932i.get(i)) + i3;
        }
        i2 = this.b.b() + i3;
        this.c = i2;
        return i2;
    }

    protected final Object m40183a(int i, Object obj, Object obj2) {
        byte b = (byte) 0;
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new pbj();
            case 2:
                return f34926d;
            case 3:
                this.f34932i.mo3981b();
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pbj pbj = (pbj) obj2;
                this.f34929f = nwt.mo4046a(m40179i(), this.f34929f, pbj.m40179i(), pbj.f34929f);
                this.f34930g = nwt.mo4044a(m40181k(), this.f34930g, pbj.m40181k(), pbj.f34930g);
                this.f34931h = nwt.mo4044a(m40182m(), this.f34931h, pbj.m40182m(), pbj.f34931h);
                this.f34932i = nwt.mo4049a(this.f34932i, pbj.f34932i);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34928e |= pbj.f34928e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                nwd nwd = (nwd) obj2;
                while (b == (byte) 0) {
                    try {
                        int a = nvw.mo3987a();
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 10:
                                String j = nvw.mo4003j();
                                this.f34928e |= 1;
                                this.f34929f = j;
                                break;
                            case 16:
                                this.f34928e |= 2;
                                this.f34930g = nvw.mo3999f();
                                break;
                            case wi.dA /*24*/:
                                this.f34928e |= 4;
                                this.f34931h = nvw.mo3999f();
                                break;
                            case 34:
                                if (!this.f34932i.mo3980a()) {
                                    nxb nxb = this.f34932i;
                                    a = nxb.size();
                                    this.f34932i = nxb.mo4061d(a == 0 ? 10 : a << 1);
                                }
                                this.f34932i.add((pbl) nvw.mo3989a(pbl.f34940d, nwd));
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
                if (f34927j == null) {
                    synchronized (pbj.class) {
                        if (f34927j == null) {
                            f34927j = new nvk(f34926d);
                        }
                    }
                }
                return f34927j;
            default:
                throw new UnsupportedOperationException();
        }
        return f34926d;
    }

    static {
        pbj pbj = new pbj();
        f34926d = pbj;
        pbj.d();
    }
}
