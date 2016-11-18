package p000;

import java.io.IOException;

public final class pbk extends nwi<pbk, nwk> implements nxk {
    public static final pbk f34933d;
    private static volatile nxm<pbk> f34934j;
    private int f34935e;
    private long f34936f;
    private String f34937g = "";
    private String f34938h = "";
    private String f34939i = "";

    private pbk() {
    }

    private boolean m40186i() {
        return (this.f34935e & 1) == 1;
    }

    private boolean m40187j() {
        return (this.f34935e & 2) == 2;
    }

    private String m40188k() {
        return this.f34937g;
    }

    private boolean m40189m() {
        return (this.f34935e & 4) == 4;
    }

    private String m40190n() {
        return this.f34938h;
    }

    private boolean m40191o() {
        return (this.f34935e & 8) == 8;
    }

    private String m40192p() {
        return this.f34939i;
    }

    public void m40194a(nvy nvy) {
        if ((this.f34935e & 1) == 1) {
            nvy.mo4019a(1, this.f34936f);
        }
        if ((this.f34935e & 2) == 2) {
            nvy.mo4020a(2, m40188k());
        }
        if ((this.f34935e & 4) == 4) {
            nvy.mo4020a(3, m40190n());
        }
        if ((this.f34935e & 8) == 8) {
            nvy.mo4020a(4, m40192p());
        }
        this.b.a(nvy);
    }

    public int m40195l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f34935e & 1) == 1) {
            i = nvy.m36837c(1, this.f34936f) + 0;
        }
        if ((this.f34935e & 2) == 2) {
            i += nvy.m36829b(2, m40188k());
        }
        if ((this.f34935e & 4) == 4) {
            i += nvy.m36829b(3, m40190n());
        }
        if ((this.f34935e & 8) == 8) {
            i += nvy.m36829b(4, m40192p());
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m40193a(int i, Object obj, Object obj2) {
        switch (ozp.f34694a[i - 1]) {
            case 1:
                return new pbk();
            case 2:
                return f34933d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pbk pbk = (pbk) obj2;
                this.f34936f = nwt.mo4045a(m40186i(), this.f34936f, pbk.m40186i(), pbk.f34936f);
                this.f34937g = nwt.mo4046a(m40187j(), this.f34937g, pbk.m40187j(), pbk.f34937g);
                this.f34938h = nwt.mo4046a(m40189m(), this.f34938h, pbk.m40189m(), pbk.f34938h);
                this.f34939i = nwt.mo4046a(m40191o(), this.f34939i, pbk.m40191o(), pbk.f34939i);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f34935e |= pbk.f34935e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                byte b = (byte) 0;
                while (b == (byte) 0) {
                    try {
                        int a = nvw.mo3987a();
                        String j;
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 8:
                                this.f34935e |= 1;
                                this.f34936f = nvw.mo3998e();
                                break;
                            case wi.dH /*18*/:
                                j = nvw.mo4003j();
                                this.f34935e |= 2;
                                this.f34937g = j;
                                break;
                            case wi.dx /*26*/:
                                j = nvw.mo4003j();
                                this.f34935e |= 4;
                                this.f34938h = j;
                                break;
                            case 34:
                                j = nvw.mo4003j();
                                this.f34935e |= 8;
                                this.f34939i = j;
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
                if (f34934j == null) {
                    synchronized (pbk.class) {
                        if (f34934j == null) {
                            f34934j = new nvk(f34933d);
                        }
                    }
                }
                return f34934j;
            default:
                throw new UnsupportedOperationException();
        }
        return f34933d;
    }

    static {
        pbk pbk = new pbk();
        f34933d = pbk;
        pbk.d();
    }
}
