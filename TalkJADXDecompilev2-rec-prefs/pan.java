package p000;

import java.io.IOException;

public final class pan extends nwi<pan, nwk> implements nxk {
    public static final pan f34822d;
    private static final nxa<Integer, pap> f34823g = new pao();
    private static volatile nxm<pan> f34824i;
    private int f34825e;
    private nwy f34826f = nwu.f31195b;
    private double f34827h;

    private pan() {
    }

    static {
        pan pan = new pan();
        f34822d = pan;
        pan.d();
    }

    private boolean m40121i() {
        return (this.f34825e & 1) == 1;
    }

    public void m40123a(nvy nvy) {
        for (int i = 0; i < this.f34826f.size(); i++) {
            nvy.mo4029b(1, this.f34826f.mo4059b(i));
        }
        if ((this.f34825e & 1) == 1) {
            nvy.m36865a(2, this.f34827h);
        }
        this.b.a(nvy);
    }

    public int m40124l() {
        int i = 0;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        i2 = 0;
        while (i < this.f34826f.size()) {
            i2 += nvy.m36859h(this.f34826f.mo4059b(i));
            i++;
        }
        i = (i2 + 0) + (this.f34826f.size() * 1);
        if ((this.f34825e & 1) == 1) {
            i += nvy.m36828b(2, this.f34827h);
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40122a(int i, Object obj, Object obj2) {
        byte b = (byte) 0;
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new pan();
            case 2:
                return f34822d;
            case 3:
                this.f34826f.mo3981b();
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pan pan = (pan) obj2;
                this.f34826f = nwt.mo4048a(this.f34826f, pan.f34826f);
                this.f34827h = nwt.mo4043a(m40121i(), this.f34827h, pan.m40121i(), pan.f34827h);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34825e |= pan.f34825e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                while (b == (byte) 0) {
                    try {
                        int a = nvw.mo3987a();
                        nwy nwy;
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 8:
                                if (!this.f34826f.mo3980a()) {
                                    nwy = this.f34826f;
                                    a = nwy.size();
                                    if (a == 0) {
                                        a = 10;
                                    } else {
                                        a <<= 1;
                                    }
                                    this.f34826f = nwy.mo4056a(a);
                                }
                                a = nvw.mo4007n();
                                if (pap.m40126a(a) != null) {
                                    this.f34826f.mo4060c(a);
                                    break;
                                }
                                super.a(1, a);
                                break;
                            case 10:
                                if (!this.f34826f.mo3980a()) {
                                    nwy = this.f34826f;
                                    a = nwy.size();
                                    if (a == 0) {
                                        a = 10;
                                    } else {
                                        a <<= 1;
                                    }
                                    this.f34826f = nwy.mo4056a(a);
                                }
                                a = nvw.mo3994b(nvw.mo4012s());
                                while (nvw.mo4014u() > 0) {
                                    int n = nvw.mo4007n();
                                    if (pap.m40126a(n) == null) {
                                        super.a(1, n);
                                    } else {
                                        this.f34826f.mo4060c(n);
                                    }
                                }
                                nvw.mo3996c(a);
                                break;
                            case wi.dK /*17*/:
                                this.f34825e |= 1;
                                this.f34827h = nvw.mo3993b();
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
                if (f34824i == null) {
                    synchronized (pan.class) {
                        if (f34824i == null) {
                            f34824i = new nvk(f34822d);
                        }
                    }
                }
                return f34824i;
            default:
                throw new UnsupportedOperationException();
        }
        return f34822d;
    }
}
