package defpackage;

import java.io.IOException;

public final class ogv extends nwi<ogv, nwk> implements nxk {
    public static final ogv d;
    private static volatile nxm<ogv> i;
    private int e;
    private int f;
    private nxb<ogw> g = nxn.b;
    private byte h = (byte) -1;

    private ogv() {
    }

    private boolean i() {
        return (this.e & 1) == 1;
    }

    private int j() {
        return this.g.size();
    }

    private ogw b(int i) {
        return (ogw) this.g.get(i);
    }

    public void a(nvy nvy) {
        if ((this.e & 1) == 1) {
            nvy.d(10, this.f);
        }
        for (int i = 0; i < this.g.size(); i++) {
            nvy.e(11, (nxi) this.g.get(i));
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
            i2 = nvy.g(10, this.f) + 0;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        while (i < this.g.size()) {
            i++;
            i3 = nvy.f(11, (nxi) this.g.get(i)) + i3;
        }
        i2 = this.b.b() + i3;
        this.c = i2;
        return i2;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        byte b = (byte) 0;
        int i2;
        switch (ogt.a[i - 1]) {
            case 1:
                return new ogv();
            case 2:
                byte b2 = this.h;
                if (b2 == (byte) 1) {
                    return d;
                }
                if (b2 == (byte) 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (i()) {
                    for (i2 = 0; i2 < j(); i2++) {
                        byte b3;
                        if (b(i2).a(nws.a, Boolean.TRUE) != null) {
                            b3 = (byte) 1;
                        } else {
                            b3 = (byte) 0;
                        }
                        if (b3 == (byte) 0) {
                            if (booleanValue) {
                                this.h = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (booleanValue) {
                        this.h = (byte) 1;
                    }
                    return d;
                }
                if (booleanValue) {
                    this.h = (byte) 0;
                }
                return null;
            case 3:
                this.g.b();
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ogv ogv = (ogv) obj2;
                this.f = nwt.a(i(), this.f, ogv.i(), ogv.f);
                this.g = nwt.a(this.g, ogv.g);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= ogv.e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                nwd nwd = (nwd) obj2;
                while (b == (byte) 0) {
                    try {
                        i2 = nvw.a();
                        switch (i2) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 85:
                                this.e |= 1;
                                this.f = nvw.h();
                                break;
                            case 91:
                                if (!this.g.a()) {
                                    nxb nxb = this.g;
                                    i2 = nxb.size();
                                    this.g = nxb.d(i2 == 0 ? 10 : i2 << 1);
                                }
                                this.g.add((ogw) nvw.a(11, ogw.d, nwd));
                                break;
                            default:
                                if (!a(i2, nvw)) {
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
                    synchronized (ogv.class) {
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

    static {
        ogv ogv = new ogv();
        d = ogv;
        ogv.d();
    }
}
