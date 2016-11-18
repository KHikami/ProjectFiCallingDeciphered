package defpackage;

import com.google.api.client.http.HttpStatusCodes;
import java.io.IOException;

public final class ogu extends nwi<ogu, nwk> implements nxk {
    public static final ogu k;
    public static final nwb l = new nwb(oeo.e, k, k, new nwh(null, 6076542, nyi.MESSAGE, false, false));
    private static volatile nxm<ogu> z;
    public int d;
    public long e;
    public long f;
    public long g;
    public String h = "";
    public double i;
    public double j;
    private long m;
    private int n = 1;
    private double o;
    private double p = 1024.0d;
    private double q;
    private boolean r;
    private int s;
    private boolean t;
    private int u;
    private String v = "";
    private boolean w;
    private nxb<ogv> x = nxn.b;
    private byte y = (byte) -1;

    private ogu() {
    }

    private boolean p() {
        return (this.d & 1) == 1;
    }

    public long i() {
        return this.e;
    }

    private boolean q() {
        return (this.d & 2) == 2;
    }

    private boolean r() {
        return (this.d & 4) == 4;
    }

    public long j() {
        return this.g;
    }

    private boolean s() {
        return (this.d & 8) == 8;
    }

    private boolean t() {
        return (this.d & 16) == 16;
    }

    private boolean u() {
        return (this.d & 32) == 32;
    }

    private boolean v() {
        return (this.d & 64) == 64;
    }

    private boolean w() {
        return (this.d & 128) == 128;
    }

    public String k() {
        return this.h;
    }

    private boolean x() {
        return (this.d & 256) == 256;
    }

    public double m() {
        return this.i;
    }

    private boolean y() {
        return (this.d & 512) == 512;
    }

    public double n() {
        return this.j;
    }

    private boolean z() {
        return (this.d & 1024) == 1024;
    }

    private boolean A() {
        return (this.d & 2048) == 2048;
    }

    private boolean B() {
        return (this.d & 4096) == 4096;
    }

    private boolean C() {
        return (this.d & 8192) == 8192;
    }

    private boolean D() {
        return (this.d & 16384) == 16384;
    }

    private boolean E() {
        return (this.d & 32768) == 32768;
    }

    private String F() {
        return this.v;
    }

    private boolean G() {
        return (this.d & 65536) == 65536;
    }

    private int H() {
        return this.x.size();
    }

    private ogv b(int i) {
        return (ogv) this.x.get(i);
    }

    public void a(nvy nvy) {
        if ((this.d & 1) == 1) {
            nvy.b(1, this.e);
        }
        if ((this.d & 2) == 2) {
            nvy.b(2, this.f);
        }
        for (int i = 0; i < this.x.size(); i++) {
            nvy.e(9, (nxi) this.x.get(i));
        }
        if ((this.d & 4) == 4) {
            nvy.b(14, this.g);
        }
        if ((this.d & 8) == 8) {
            nvy.b(15, this.m);
        }
        if ((this.d & 16) == 16) {
            nvy.b(16, this.n);
        }
        if ((this.d & 64) == 64) {
            nvy.a(17, this.p);
        }
        if ((this.d & 128) == 128) {
            nvy.a(18, k());
        }
        if ((this.d & 256) == 256) {
            nvy.a(19, this.i);
        }
        if ((this.d & 512) == 512) {
            nvy.a(20, this.j);
        }
        if ((this.d & 2048) == 2048) {
            nvy.a(26, this.r);
        }
        if ((this.d & 1024) == 1024) {
            nvy.a(31, this.q);
        }
        if ((this.d & 32) == 32) {
            nvy.a(32, this.o);
        }
        if ((this.d & 8192) == 8192) {
            nvy.a(33, this.t);
        }
        if ((this.d & 16384) == 16384) {
            nvy.b(34, this.u);
        }
        if ((this.d & 32768) == 32768) {
            nvy.a(35, F());
        }
        if ((this.d & 65536) == 65536) {
            nvy.a(36, this.w);
        }
        if ((this.d & 4096) == 4096) {
            nvy.b(38, this.s);
        }
        this.b.a(nvy);
    }

    public int l() {
        int i = 0;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        if ((this.d & 1) == 1) {
            i2 = nvy.e(1, this.e) + 0;
        } else {
            i2 = 0;
        }
        if ((this.d & 2) == 2) {
            i2 += nvy.e(2, this.f);
        }
        int i3 = i2;
        while (i < this.x.size()) {
            i++;
            i3 = nvy.f(9, (nxi) this.x.get(i)) + i3;
        }
        if ((this.d & 4) == 4) {
            i3 += nvy.e(14, this.g);
        }
        if ((this.d & 8) == 8) {
            i3 += nvy.e(15, this.m);
        }
        if ((this.d & 16) == 16) {
            i3 += nvy.e(16, this.n);
        }
        if ((this.d & 64) == 64) {
            i3 += nvy.b(17, this.p);
        }
        if ((this.d & 128) == 128) {
            i3 += nvy.b(18, k());
        }
        if ((this.d & 256) == 256) {
            i3 += nvy.b(19, this.i);
        }
        if ((this.d & 512) == 512) {
            i3 += nvy.b(20, this.j);
        }
        if ((this.d & 2048) == 2048) {
            i3 += nvy.b(26, this.r);
        }
        if ((this.d & 1024) == 1024) {
            i3 += nvy.b(31, this.q);
        }
        if ((this.d & 32) == 32) {
            i3 += nvy.b(32, this.o);
        }
        if ((this.d & 8192) == 8192) {
            i3 += nvy.b(33, this.t);
        }
        if ((this.d & 16384) == 16384) {
            i3 += nvy.h(34, this.u);
        }
        if ((this.d & 32768) == 32768) {
            i3 += nvy.b(35, F());
        }
        if ((this.d & 65536) == 65536) {
            i3 += nvy.b(36, this.w);
        }
        if ((this.d & 4096) == 4096) {
            i3 += nvy.e(38, this.s);
        }
        i2 = this.b.b() + i3;
        this.c = i2;
        return i2;
    }

    public static nwk o() {
        nwi nwi = k;
        nwk nwk = (nwk) nwi.a(nws.f);
        nwk.b(nwi);
        return nwk;
    }

    protected final Object a(int i, Object obj, Object obj2) {
        byte b = (byte) 0;
        int i2;
        switch (ogt.a[i - 1]) {
            case 1:
                return new ogu();
            case 2:
                byte b2 = this.y;
                if (b2 == (byte) 1) {
                    return k;
                }
                if (b2 == (byte) 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!p()) {
                    if (booleanValue) {
                        this.y = (byte) 0;
                    }
                    return null;
                } else if (q()) {
                    for (i2 = 0; i2 < H(); i2++) {
                        byte b3;
                        if (b(i2).a(nws.a, Boolean.TRUE) != null) {
                            b3 = (byte) 1;
                        } else {
                            b3 = (byte) 0;
                        }
                        if (b3 == (byte) 0) {
                            if (booleanValue) {
                                this.y = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (booleanValue) {
                        this.y = (byte) 1;
                    }
                    return k;
                } else {
                    if (booleanValue) {
                        this.y = (byte) 0;
                    }
                    return null;
                }
            case 3:
                this.x.b();
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ogu ogu = (ogu) obj2;
                this.e = nwt.a(p(), this.e, ogu.p(), ogu.e);
                this.f = nwt.a(q(), this.f, ogu.q(), ogu.f);
                this.g = nwt.a(r(), this.g, ogu.r(), ogu.g);
                this.m = nwt.a(s(), this.m, ogu.s(), ogu.m);
                this.n = nwt.a(t(), this.n, ogu.t(), ogu.n);
                this.o = nwt.a(u(), this.o, ogu.u(), ogu.o);
                this.p = nwt.a(v(), this.p, ogu.v(), ogu.p);
                this.h = nwt.a(w(), this.h, ogu.w(), ogu.h);
                this.i = nwt.a(x(), this.i, ogu.x(), ogu.i);
                this.j = nwt.a(y(), this.j, ogu.y(), ogu.j);
                this.q = nwt.a(z(), this.q, ogu.z(), ogu.q);
                this.r = nwt.a(A(), this.r, ogu.A(), ogu.r);
                this.s = nwt.a(B(), this.s, ogu.B(), ogu.s);
                this.t = nwt.a(C(), this.t, ogu.C(), ogu.t);
                this.u = nwt.a(D(), this.u, ogu.D(), ogu.u);
                this.v = nwt.a(E(), this.v, ogu.E(), ogu.v);
                this.w = nwt.a(G(), this.w, ogu.G(), ogu.w);
                this.x = nwt.a(this.x, ogu.x);
                if (nwt != nwr.a) {
                    return this;
                }
                this.d |= ogu.d;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                nwd nwd = (nwd) obj2;
                while (b == (byte) 0) {
                    try {
                        i2 = nvw.a();
                        String j;
                        switch (i2) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 9:
                                this.d |= 1;
                                this.e = nvw.g();
                                break;
                            case wi.dK /*17*/:
                                this.d |= 2;
                                this.f = nvw.g();
                                break;
                            case 75:
                                if (!this.x.a()) {
                                    nxb nxb = this.x;
                                    i2 = nxb.size();
                                    this.x = nxb.d(i2 == 0 ? 10 : i2 << 1);
                                }
                                this.x.add((ogv) nvw.a(9, ogv.d, nwd));
                                break;
                            case 113:
                                this.d |= 4;
                                this.g = nvw.g();
                                break;
                            case 121:
                                this.d |= 8;
                                this.m = nvw.g();
                                break;
                            case 128:
                                this.d |= 16;
                                this.n = nvw.f();
                                break;
                            case 137:
                                this.d |= 64;
                                this.p = nvw.b();
                                break;
                            case 146:
                                j = nvw.j();
                                this.d |= 128;
                                this.h = j;
                                break;
                            case 153:
                                this.d |= 256;
                                this.i = nvw.b();
                                break;
                            case 161:
                                this.d |= 512;
                                this.j = nvw.b();
                                break;
                            case 208:
                                this.d |= 2048;
                                this.r = nvw.i();
                                break;
                            case 249:
                                this.d |= 1024;
                                this.q = nvw.b();
                                break;
                            case 257:
                                this.d |= 32;
                                this.o = nvw.b();
                                break;
                            case 264:
                                this.d |= 8192;
                                this.t = nvw.i();
                                break;
                            case 272:
                                i2 = nvw.n();
                                if (ogy.a(i2) != null) {
                                    this.d |= 16384;
                                    this.u = i2;
                                    break;
                                }
                                super.a(34, i2);
                                break;
                            case 282:
                                j = nvw.j();
                                this.d |= 32768;
                                this.v = j;
                                break;
                            case 288:
                                this.d |= 65536;
                                this.w = nvw.i();
                                break;
                            case HttpStatusCodes.STATUS_CODE_NOT_MODIFIED /*304*/:
                                this.d |= 4096;
                                this.s = nvw.f();
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
                if (z == null) {
                    synchronized (ogu.class) {
                        if (z == null) {
                            z = new nvk(k);
                        }
                    }
                }
                return z;
            default:
                throw new UnsupportedOperationException();
        }
        return k;
    }

    static {
        ogu ogu = new ogu();
        k = ogu;
        ogu.d();
        Class cls = ogu.class;
    }
}
