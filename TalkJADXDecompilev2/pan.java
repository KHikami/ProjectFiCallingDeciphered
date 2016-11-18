package defpackage;

import java.io.IOException;

public final class pan extends nwi<pan, nwk> implements nxk {
    public static final pan d;
    private static final nxa<Integer, pap> g = new pao();
    private static volatile nxm<pan> i;
    private int e;
    private nwy f = nwu.b;
    private double h;

    private pan() {
    }

    static {
        pan pan = new pan();
        d = pan;
        pan.d();
    }

    private boolean i() {
        return (this.e & 1) == 1;
    }

    public void a(nvy nvy) {
        for (int i = 0; i < this.f.size(); i++) {
            nvy.b(1, this.f.b(i));
        }
        if ((this.e & 1) == 1) {
            nvy.a(2, this.h);
        }
        this.b.a(nvy);
    }

    public int l() {
        int i = 0;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        i2 = 0;
        while (i < this.f.size()) {
            i2 += nvy.h(this.f.b(i));
            i++;
        }
        i = (i2 + 0) + (this.f.size() * 1);
        if ((this.e & 1) == 1) {
            i += nvy.b(2, this.h);
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        byte b = (byte) 0;
        switch (ozp.a[i - 1]) {
            case 1:
                return new pan();
            case 2:
                return d;
            case 3:
                this.f.b();
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pan pan = (pan) obj2;
                this.f = nwt.a(this.f, pan.f);
                this.h = nwt.a(i(), this.h, pan.i(), pan.h);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= pan.e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                while (b == (byte) 0) {
                    try {
                        int a = nvw.a();
                        nwy nwy;
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 8:
                                if (!this.f.a()) {
                                    nwy = this.f;
                                    a = nwy.size();
                                    if (a == 0) {
                                        a = 10;
                                    } else {
                                        a <<= 1;
                                    }
                                    this.f = nwy.a(a);
                                }
                                a = nvw.n();
                                if (pap.a(a) != null) {
                                    this.f.c(a);
                                    break;
                                }
                                super.a(1, a);
                                break;
                            case 10:
                                if (!this.f.a()) {
                                    nwy = this.f;
                                    a = nwy.size();
                                    if (a == 0) {
                                        a = 10;
                                    } else {
                                        a <<= 1;
                                    }
                                    this.f = nwy.a(a);
                                }
                                a = nvw.b(nvw.s());
                                while (nvw.u() > 0) {
                                    int n = nvw.n();
                                    if (pap.a(n) == null) {
                                        super.a(1, n);
                                    } else {
                                        this.f.c(n);
                                    }
                                }
                                nvw.c(a);
                                break;
                            case wi.dK /*17*/:
                                this.e |= 1;
                                this.h = nvw.b();
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
                if (i == null) {
                    synchronized (pan.class) {
                        if (i == null) {
                            i = new nvk(d);
                        }
                    }
                }
                return i;
            default:
                throw new UnsupportedOperationException();
        }
        return d;
    }
}
