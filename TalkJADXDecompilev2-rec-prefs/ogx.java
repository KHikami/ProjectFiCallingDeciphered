package p000;

import java.io.IOException;

public final class ogx extends nwi<ogx, nwk> implements nxk {
    public static final ogx f32798d;
    private static volatile nxm<ogx> f32799i;
    private int f32800e;
    private long f32801f;
    private String f32802g = "";
    private byte f32803h = (byte) -1;

    private ogx() {
    }

    private boolean m38285i() {
        return (this.f32800e & 1) == 1;
    }

    private boolean m38286j() {
        return (this.f32800e & 2) == 2;
    }

    private String m38287k() {
        return this.f32802g;
    }

    public void m38289a(nvy nvy) {
        if ((this.f32800e & 1) == 1) {
            nvy.mo4019a(28, this.f32801f);
        }
        if ((this.f32800e & 2) == 2) {
            nvy.mo4020a(29, m38287k());
        }
        this.b.a(nvy);
    }

    public int m38290l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f32800e & 1) == 1) {
            i = nvy.m36837c(28, this.f32801f) + 0;
        }
        if ((this.f32800e & 2) == 2) {
            i += nvy.m36829b(29, m38287k());
        }
        i += this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m38288a(int i, Object obj, Object obj2) {
        switch (ogt.f32754a[i - 1]) {
            case 1:
                return new ogx();
            case 2:
                byte b = this.f32803h;
                if (b == (byte) 1) {
                    return f32798d;
                }
                if (b == (byte) 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (m38285i()) {
                    if (booleanValue) {
                        this.f32803h = (byte) 1;
                    }
                    return f32798d;
                }
                if (booleanValue) {
                    this.f32803h = (byte) 0;
                }
                return null;
            case 3:
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ogx ogx = (ogx) obj2;
                this.f32801f = nwt.mo4045a(m38285i(), this.f32801f, ogx.m38285i(), ogx.f32801f);
                this.f32802g = nwt.mo4046a(m38286j(), this.f32802g, ogx.m38286j(), ogx.f32802g);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f32800e |= ogx.f32800e;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                char c = '\u0000';
                while (c == '\u0000') {
                    try {
                        int a = nvw.mo3987a();
                        switch (a) {
                            case 0:
                                c = '\u0001';
                                break;
                            case 224:
                                this.f32800e |= 1;
                                this.f32801f = nvw.mo3998e();
                                break;
                            case 234:
                                String j = nvw.mo4003j();
                                this.f32800e |= 2;
                                this.f32802g = j;
                                break;
                            default:
                                if (!a(a, nvw)) {
                                    c = '\u0001';
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
                if (f32799i == null) {
                    synchronized (ogx.class) {
                        if (f32799i == null) {
                            f32799i = new nvk(f32798d);
                        }
                    }
                }
                return f32799i;
            default:
                throw new UnsupportedOperationException();
        }
        return f32798d;
    }

    static {
        ogx ogx = new ogx();
        f32798d = ogx;
        ogx.d();
    }
}
