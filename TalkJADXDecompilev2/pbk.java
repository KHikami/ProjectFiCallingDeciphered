package defpackage;

import java.io.IOException;

public final class pbk extends nwi<pbk, nwk> implements nxk {
    public static final pbk d;
    private static volatile nxm<pbk> j;
    private int e;
    private long f;
    private String g = "";
    private String h = "";
    private String i = "";

    private pbk() {
    }

    private boolean i() {
        return (this.e & 1) == 1;
    }

    private boolean j() {
        return (this.e & 2) == 2;
    }

    private String k() {
        return this.g;
    }

    private boolean m() {
        return (this.e & 4) == 4;
    }

    private String n() {
        return this.h;
    }

    private boolean o() {
        return (this.e & 8) == 8;
    }

    private String p() {
        return this.i;
    }

    public void a(nvy nvy) {
        if ((this.e & 1) == 1) {
            nvy.a(1, this.f);
        }
        if ((this.e & 2) == 2) {
            nvy.a(2, k());
        }
        if ((this.e & 4) == 4) {
            nvy.a(3, n());
        }
        if ((this.e & 8) == 8) {
            nvy.a(4, p());
        }
        this.b.a(nvy);
    }

    public int l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.e & 1) == 1) {
            i = nvy.c(1, this.f) + 0;
        }
        if ((this.e & 2) == 2) {
            i += nvy.b(2, k());
        }
        if ((this.e & 4) == 4) {
            i += nvy.b(3, n());
        }
        if ((this.e & 8) == 8) {
            i += nvy.b(4, p());
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        switch (ozp.a[i - 1]) {
            case 1:
                return new pbk();
            case 2:
                return d;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                pbk pbk = (pbk) obj2;
                this.f = nwt.a(i(), this.f, pbk.i(), pbk.f);
                this.g = nwt.a(j(), this.g, pbk.j(), pbk.g);
                this.h = nwt.a(m(), this.h, pbk.m(), pbk.h);
                this.i = nwt.a(o(), this.i, pbk.o(), pbk.i);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= pbk.e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                byte b = (byte) 0;
                while (b == (byte) 0) {
                    try {
                        int a = nvw.a();
                        String j;
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 8:
                                this.e |= 1;
                                this.f = nvw.e();
                                break;
                            case wi.dH /*18*/:
                                j = nvw.j();
                                this.e |= 2;
                                this.g = j;
                                break;
                            case wi.dx /*26*/:
                                j = nvw.j();
                                this.e |= 4;
                                this.h = j;
                                break;
                            case 34:
                                j = nvw.j();
                                this.e |= 8;
                                this.i = j;
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
                    synchronized (pbk.class) {
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
        pbk pbk = new pbk();
        d = pbk;
        pbk.d();
    }
}
