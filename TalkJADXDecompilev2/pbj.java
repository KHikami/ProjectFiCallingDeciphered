package defpackage;

import java.io.IOException;

public final class pbj extends nwi<pbj, nwk> implements nxk {
    public static final pbj d;
    private static volatile nxm<pbj> j;
    private int e;
    private String f = "";
    private int g;
    private int h;
    private nxb<pbl> i = nxn.b;

    private pbj() {
    }

    private boolean i() {
        return (this.e & 1) == 1;
    }

    private String j() {
        return this.f;
    }

    private boolean k() {
        return (this.e & 2) == 2;
    }

    private boolean m() {
        return (this.e & 4) == 4;
    }

    public void a(nvy nvy) {
        if ((this.e & 1) == 1) {
            nvy.a(1, j());
        }
        if ((this.e & 2) == 2) {
            nvy.b(2, this.g);
        }
        if ((this.e & 4) == 4) {
            nvy.b(3, this.h);
        }
        for (int i = 0; i < this.i.size(); i++) {
            nvy.a(4, (nxi) this.i.get(i));
        }
        this.b.a(nvy);
    }

    public int l() {
        int i = 0;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        if ((this.e & 1) == 1) {
            i2 = nvy.b(1, j()) + 0;
        } else {
            i2 = 0;
        }
        if ((this.e & 2) == 2) {
            i2 += nvy.e(2, this.g);
        }
        if ((this.e & 4) == 4) {
            i2 += nvy.e(3, this.h);
        }
        int i3 = i2;
        while (i < this.i.size()) {
            i++;
            i3 = nvy.c(4, (nxi) this.i.get(i)) + i3;
        }
        i2 = this.b.b() + i3;
        this.c = i2;
        return i2;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        byte b = (byte) 0;
        switch (ozp.a[i - 1]) {
            case 1:
                return new pbj();
            case 2:
                return d;
            case 3:
                this.i.b();
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pbj pbj = (pbj) obj2;
                this.f = nwt.a(i(), this.f, pbj.i(), pbj.f);
                this.g = nwt.a(k(), this.g, pbj.k(), pbj.g);
                this.h = nwt.a(m(), this.h, pbj.m(), pbj.h);
                this.i = nwt.a(this.i, pbj.i);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= pbj.e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                nwd nwd = (nwd) obj2;
                while (b == (byte) 0) {
                    try {
                        int a = nvw.a();
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 10:
                                String j = nvw.j();
                                this.e |= 1;
                                this.f = j;
                                break;
                            case 16:
                                this.e |= 2;
                                this.g = nvw.f();
                                break;
                            case wi.dA /*24*/:
                                this.e |= 4;
                                this.h = nvw.f();
                                break;
                            case 34:
                                if (!this.i.a()) {
                                    nxb nxb = this.i;
                                    a = nxb.size();
                                    this.i = nxb.d(a == 0 ? 10 : a << 1);
                                }
                                this.i.add((pbl) nvw.a(pbl.d, nwd));
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
                if (j == null) {
                    synchronized (pbj.class) {
                        if (j == null) {
                            j = new nvk(d);
                        }
                    }
                }
                return j;
            default:
                throw new UnsupportedOperationException();
        }
        return d;
    }

    static {
        pbj pbj = new pbj();
        d = pbj;
        pbj.d();
    }
}
