package defpackage;

import java.io.IOException;

public final class ogx extends nwi<ogx, nwk> implements nxk {
    public static final ogx d;
    private static volatile nxm<ogx> i;
    private int e;
    private long f;
    private String g = "";
    private byte h = (byte) -1;

    private ogx() {
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

    public void a(nvy nvy) {
        if ((this.e & 1) == 1) {
            nvy.a(28, this.f);
        }
        if ((this.e & 2) == 2) {
            nvy.a(29, k());
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
            i = nvy.c(28, this.f) + 0;
        }
        if ((this.e & 2) == 2) {
            i += nvy.b(29, k());
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        switch (ogt.a[i - 1]) {
            case 1:
                return new ogx();
            case 2:
                byte b = this.h;
                if (b == (byte) 1) {
                    return d;
                }
                if (b == (byte) 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (i()) {
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
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ogx ogx = (ogx) obj2;
                this.f = nwt.a(i(), this.f, ogx.i(), ogx.f);
                this.g = nwt.a(j(), this.g, ogx.j(), ogx.g);
                if (nwt != nwr.a) {
                    return this;
                }
                this.e |= ogx.e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                char c = '\u0000';
                while (c == '\u0000') {
                    try {
                        int a = nvw.a();
                        switch (a) {
                            case 0:
                                c = '\u0001';
                                break;
                            case 224:
                                this.e |= 1;
                                this.f = nvw.e();
                                break;
                            case 234:
                                String j = nvw.j();
                                this.e |= 2;
                                this.g = j;
                                break;
                            default:
                                if (!a(a, nvw)) {
                                    c = '\u0001';
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
                    synchronized (ogx.class) {
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
        ogx ogx = new ogx();
        d = ogx;
        ogx.d();
    }
}
