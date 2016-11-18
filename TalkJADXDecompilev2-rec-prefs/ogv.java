package p000;

import java.io.IOException;

public final class ogv extends nwi<ogv, nwk> implements nxk {
    public static final ogv f32778d;
    private static volatile nxm<ogv> f32779i;
    private int f32780e;
    private int f32781f;
    private nxb<ogw> f32782g = nxn.f31214b;
    private byte f32783h = (byte) -1;

    private ogv() {
    }

    private boolean m38263i() {
        return (this.f32780e & 1) == 1;
    }

    private int m38264j() {
        return this.f32782g.size();
    }

    private ogw m38262b(int i) {
        return (ogw) this.f32782g.get(i);
    }

    public void m38266a(nvy nvy) {
        if ((this.f32780e & 1) == 1) {
            nvy.mo4036d(10, this.f32781f);
        }
        for (int i = 0; i < this.f32782g.size(); i++) {
            nvy.m36886e(11, (nxi) this.f32782g.get(i));
        }
        this.b.a(nvy);
    }

    public int m38267l() {
        int i = 0;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f32780e & 1) == 1) {
            i2 = nvy.m36858g(10, this.f32781f) + 0;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        while (i < this.f32782g.size()) {
            i++;
            i3 = nvy.m36854f(11, (nxi) this.f32782g.get(i)) + i3;
        }
        i2 = this.b.b() + i3;
        this.c = i2;
        return i2;
    }

    protected final Object m38265a(int i, Object obj, Object obj2) {
        byte b = (byte) 0;
        int i2;
        switch (ogt.f32754a[i - 1]) {
            case 1:
                return new ogv();
            case 2:
                byte b2 = this.f32783h;
                if (b2 == (byte) 1) {
                    return f32778d;
                }
                if (b2 == (byte) 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (m38263i()) {
                    for (i2 = 0; i2 < m38264j(); i2++) {
                        byte b3;
                        if (m38262b(i2).a(nws.f31186a, Boolean.TRUE) != null) {
                            b3 = (byte) 1;
                        } else {
                            b3 = (byte) 0;
                        }
                        if (b3 == (byte) 0) {
                            if (booleanValue) {
                                this.f32783h = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (booleanValue) {
                        this.f32783h = (byte) 1;
                    }
                    return f32778d;
                }
                if (booleanValue) {
                    this.f32783h = (byte) 0;
                }
                return null;
            case 3:
                this.f32782g.mo3981b();
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ogv ogv = (ogv) obj2;
                this.f32781f = nwt.mo4044a(m38263i(), this.f32781f, ogv.m38263i(), ogv.f32781f);
                this.f32782g = nwt.mo4049a(this.f32782g, ogv.f32782g);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f32780e |= ogv.f32780e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                nwd nwd = (nwd) obj2;
                while (b == (byte) 0) {
                    try {
                        i2 = nvw.mo3987a();
                        switch (i2) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 85:
                                this.f32780e |= 1;
                                this.f32781f = nvw.mo4001h();
                                break;
                            case 91:
                                if (!this.f32782g.mo3980a()) {
                                    nxb nxb = this.f32782g;
                                    i2 = nxb.size();
                                    this.f32782g = nxb.mo4061d(i2 == 0 ? 10 : i2 << 1);
                                }
                                this.f32782g.add((ogw) nvw.mo3988a(11, ogw.f32784d, nwd));
                                break;
                            default:
                                if (!a(i2, nvw)) {
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
                if (f32779i == null) {
                    synchronized (ogv.class) {
                        if (f32779i == null) {
                            f32779i = new nvk(f32778d);
                        }
                    }
                }
                return f32779i;
            default:
                throw new UnsupportedOperationException();
        }
        return f32778d;
    }

    static {
        ogv ogv = new ogv();
        f32778d = ogv;
        ogv.d();
    }
}
