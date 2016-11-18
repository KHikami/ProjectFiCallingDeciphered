package defpackage;

import java.io.IOException;

public final class oeo extends nwo<oeo, nwn> implements nxk {
    public static final oeo e;
    private static volatile nxm<oeo> g;
    private byte f = (byte) -1;

    private oeo() {
    }

    public void a(nvy nvy) {
        j().a(Integer.MAX_VALUE, nvy);
        this.b.a(nvy);
    }

    public int l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = (k() + 0) + this.b.b();
        this.c = i;
        return i;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        byte b = (byte) 0;
        switch (oep.a[i - 1]) {
            case 1:
                return new oeo();
            case 2:
                byte b2 = this.f;
                if (b2 == (byte) 1) {
                    return e;
                }
                if (b2 == (byte) 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (i()) {
                    if (booleanValue) {
                        this.f = (byte) 1;
                    }
                    return e;
                }
                if (booleanValue) {
                    this.f = (byte) 0;
                }
                return null;
            case 3:
                return null;
            case 4:
                return new nwn();
            case 5:
                nwr nwr = nwr.a;
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
                            default:
                                byte b3;
                                if (a((oeo) ((nwi) a(nws.g)), nvw, nwd, a)) {
                                    b3 = b;
                                } else {
                                    b3 = (byte) 1;
                                }
                                b = b3;
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
                if (g == null) {
                    synchronized (oeo.class) {
                        if (g == null) {
                            g = new nvk(e);
                        }
                    }
                }
                return g;
            default:
                throw new UnsupportedOperationException();
        }
        return e;
    }

    static {
        oeo oeo = new oeo();
        e = oeo;
        oeo.d();
    }
}
