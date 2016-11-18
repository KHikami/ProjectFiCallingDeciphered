package p000;

import java.io.IOException;

public final class oeo extends nwo<oeo, nwn> implements nxk {
    public static final oeo f32473e;
    private static volatile nxm<oeo> f32474g;
    private byte f32475f = (byte) -1;

    private oeo() {
    }

    public void m37971a(nvy nvy) {
        j().m36970a(Integer.MAX_VALUE, nvy);
        this.b.a(nvy);
    }

    public int m37972l() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = (k() + 0) + this.b.b();
        this.c = i;
        return i;
    }

    protected final Object m37970a(int i, Object obj, Object obj2) {
        byte b = (byte) 0;
        switch (oep.f32476a[i - 1]) {
            case 1:
                return new oeo();
            case 2:
                byte b2 = this.f32475f;
                if (b2 == (byte) 1) {
                    return f32473e;
                }
                if (b2 == (byte) 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (i()) {
                    if (booleanValue) {
                        this.f32475f = (byte) 1;
                    }
                    return f32473e;
                }
                if (booleanValue) {
                    this.f32475f = (byte) 0;
                }
                return null;
            case 3:
                return null;
            case 4:
                return new nwn();
            case 5:
                nwr nwr = nwr.f31185a;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                nwd nwd = (nwd) obj2;
                while (b == (byte) 0) {
                    try {
                        int a = nvw.mo3987a();
                        switch (a) {
                            case 0:
                                b = (byte) 1;
                                break;
                            default:
                                byte b3;
                                if (a((oeo) ((nwi) a(nws.f31192g)), nvw, nwd, a)) {
                                    b3 = b;
                                } else {
                                    b3 = (byte) 1;
                                }
                                b = b3;
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
                if (f32474g == null) {
                    synchronized (oeo.class) {
                        if (f32474g == null) {
                            f32474g = new nvk(f32473e);
                        }
                    }
                }
                return f32474g;
            default:
                throw new UnsupportedOperationException();
        }
        return f32473e;
    }

    static {
        oeo oeo = new oeo();
        f32473e = oeo;
        oeo.d();
    }
}
