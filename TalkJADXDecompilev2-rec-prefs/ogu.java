package p000;

import com.google.api.client.http.HttpStatusCodes;
import java.io.IOException;

public final class ogu extends nwi<ogu, nwk> implements nxk {
    public static final ogu f32755k;
    public static final nwb f32756l = new nwb(oeo.f32473e, f32755k, f32755k, new nwh(null, 6076542, nyi.MESSAGE, false, false));
    private static volatile nxm<ogu> f32757z;
    public int f32758d;
    public long f32759e;
    public long f32760f;
    public long f32761g;
    public String f32762h = "";
    public double f32763i;
    public double f32764j;
    private long f32765m;
    private int f32766n = 1;
    private double f32767o;
    private double f32768p = 1024.0d;
    private double f32769q;
    private boolean f32770r;
    private int f32771s;
    private boolean f32772t;
    private int f32773u;
    private String f32774v = "";
    private boolean f32775w;
    private nxb<ogv> f32776x = nxn.f31214b;
    private byte f32777y = (byte) -1;

    private ogu() {
    }

    private boolean m38243p() {
        return (this.f32758d & 1) == 1;
    }

    public long m38256i() {
        return this.f32759e;
    }

    private boolean m38244q() {
        return (this.f32758d & 2) == 2;
    }

    private boolean m38245r() {
        return (this.f32758d & 4) == 4;
    }

    public long m38257j() {
        return this.f32761g;
    }

    private boolean m38246s() {
        return (this.f32758d & 8) == 8;
    }

    private boolean m38247t() {
        return (this.f32758d & 16) == 16;
    }

    private boolean m38248u() {
        return (this.f32758d & 32) == 32;
    }

    private boolean m38249v() {
        return (this.f32758d & 64) == 64;
    }

    private boolean m38250w() {
        return (this.f32758d & 128) == 128;
    }

    public String m38258k() {
        return this.f32762h;
    }

    private boolean m38251x() {
        return (this.f32758d & 256) == 256;
    }

    public double m38260m() {
        return this.f32763i;
    }

    private boolean m38252y() {
        return (this.f32758d & 512) == 512;
    }

    public double m38261n() {
        return this.f32764j;
    }

    private boolean m38253z() {
        return (this.f32758d & 1024) == 1024;
    }

    private boolean m38233A() {
        return (this.f32758d & 2048) == 2048;
    }

    private boolean m38234B() {
        return (this.f32758d & 4096) == 4096;
    }

    private boolean m38235C() {
        return (this.f32758d & 8192) == 8192;
    }

    private boolean m38236D() {
        return (this.f32758d & 16384) == 16384;
    }

    private boolean m38237E() {
        return (this.f32758d & 32768) == 32768;
    }

    private String m38238F() {
        return this.f32774v;
    }

    private boolean m38239G() {
        return (this.f32758d & 65536) == 65536;
    }

    private int m38240H() {
        return this.f32776x.size();
    }

    private ogv m38241b(int i) {
        return (ogv) this.f32776x.get(i);
    }

    public void m38255a(nvy nvy) {
        if ((this.f32758d & 1) == 1) {
            nvy.mo4030b(1, this.f32759e);
        }
        if ((this.f32758d & 2) == 2) {
            nvy.mo4030b(2, this.f32760f);
        }
        for (int i = 0; i < this.f32776x.size(); i++) {
            nvy.m36886e(9, (nxi) this.f32776x.get(i));
        }
        if ((this.f32758d & 4) == 4) {
            nvy.mo4030b(14, this.f32761g);
        }
        if ((this.f32758d & 8) == 8) {
            nvy.mo4030b(15, this.f32765m);
        }
        if ((this.f32758d & 16) == 16) {
            nvy.mo4029b(16, this.f32766n);
        }
        if ((this.f32758d & 64) == 64) {
            nvy.m36865a(17, this.f32768p);
        }
        if ((this.f32758d & 128) == 128) {
            nvy.mo4020a(18, m38258k());
        }
        if ((this.f32758d & 256) == 256) {
            nvy.m36865a(19, this.f32763i);
        }
        if ((this.f32758d & 512) == 512) {
            nvy.m36865a(20, this.f32764j);
        }
        if ((this.f32758d & 2048) == 2048) {
            nvy.mo4023a(26, this.f32770r);
        }
        if ((this.f32758d & 1024) == 1024) {
            nvy.m36865a(31, this.f32769q);
        }
        if ((this.f32758d & 32) == 32) {
            nvy.m36865a(32, this.f32767o);
        }
        if ((this.f32758d & 8192) == 8192) {
            nvy.mo4023a(33, this.f32772t);
        }
        if ((this.f32758d & 16384) == 16384) {
            nvy.mo4029b(34, this.f32773u);
        }
        if ((this.f32758d & 32768) == 32768) {
            nvy.mo4020a(35, m38238F());
        }
        if ((this.f32758d & 65536) == 65536) {
            nvy.mo4023a(36, this.f32775w);
        }
        if ((this.f32758d & 4096) == 4096) {
            nvy.mo4029b(38, this.f32771s);
        }
        this.b.a(nvy);
    }

    public int m38259l() {
        int i = 0;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f32758d & 1) == 1) {
            i2 = nvy.m36849e(1, this.f32759e) + 0;
        } else {
            i2 = 0;
        }
        if ((this.f32758d & 2) == 2) {
            i2 += nvy.m36849e(2, this.f32760f);
        }
        int i3 = i2;
        while (i < this.f32776x.size()) {
            i++;
            i3 = nvy.m36854f(9, (nxi) this.f32776x.get(i)) + i3;
        }
        if ((this.f32758d & 4) == 4) {
            i3 += nvy.m36849e(14, this.f32761g);
        }
        if ((this.f32758d & 8) == 8) {
            i3 += nvy.m36849e(15, this.f32765m);
        }
        if ((this.f32758d & 16) == 16) {
            i3 += nvy.m36848e(16, this.f32766n);
        }
        if ((this.f32758d & 64) == 64) {
            i3 += nvy.m36828b(17, this.f32768p);
        }
        if ((this.f32758d & 128) == 128) {
            i3 += nvy.m36829b(18, m38258k());
        }
        if ((this.f32758d & 256) == 256) {
            i3 += nvy.m36828b(19, this.f32763i);
        }
        if ((this.f32758d & 512) == 512) {
            i3 += nvy.m36828b(20, this.f32764j);
        }
        if ((this.f32758d & 2048) == 2048) {
            i3 += nvy.m36831b(26, this.f32770r);
        }
        if ((this.f32758d & 1024) == 1024) {
            i3 += nvy.m36828b(31, this.f32769q);
        }
        if ((this.f32758d & 32) == 32) {
            i3 += nvy.m36828b(32, this.f32767o);
        }
        if ((this.f32758d & 8192) == 8192) {
            i3 += nvy.m36831b(33, this.f32772t);
        }
        if ((this.f32758d & 16384) == 16384) {
            i3 += nvy.m36860h(34, this.f32773u);
        }
        if ((this.f32758d & 32768) == 32768) {
            i3 += nvy.m36829b(35, m38238F());
        }
        if ((this.f32758d & 65536) == 65536) {
            i3 += nvy.m36831b(36, this.f32775w);
        }
        if ((this.f32758d & 4096) == 4096) {
            i3 += nvy.m36848e(38, this.f32771s);
        }
        i2 = this.b.b() + i3;
        this.c = i2;
        return i2;
    }

    public static nwk m38242o() {
        nwi nwi = f32755k;
        nwk nwk = (nwk) nwi.a(nws.f31191f);
        nwk.m36931b(nwi);
        return nwk;
    }

    protected final Object m38254a(int i, Object obj, Object obj2) {
        byte b = (byte) 0;
        int i2;
        switch (ogt.f32754a[i - 1]) {
            case 1:
                return new ogu();
            case 2:
                byte b2 = this.f32777y;
                if (b2 == (byte) 1) {
                    return f32755k;
                }
                if (b2 == (byte) 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!m38243p()) {
                    if (booleanValue) {
                        this.f32777y = (byte) 0;
                    }
                    return null;
                } else if (m38244q()) {
                    for (i2 = 0; i2 < m38240H(); i2++) {
                        byte b3;
                        if (m38241b(i2).a(nws.f31186a, Boolean.TRUE) != null) {
                            b3 = (byte) 1;
                        } else {
                            b3 = (byte) 0;
                        }
                        if (b3 == (byte) 0) {
                            if (booleanValue) {
                                this.f32777y = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (booleanValue) {
                        this.f32777y = (byte) 1;
                    }
                    return f32755k;
                } else {
                    if (booleanValue) {
                        this.f32777y = (byte) 0;
                    }
                    return null;
                }
            case 3:
                this.f32776x.mo3981b();
                return null;
            case 4:
                return new nwk();
            case 5:
                nwt nwt = (nwt) obj;
                ogu ogu = (ogu) obj2;
                this.f32759e = nwt.mo4045a(m38243p(), this.f32759e, ogu.m38243p(), ogu.f32759e);
                this.f32760f = nwt.mo4045a(m38244q(), this.f32760f, ogu.m38244q(), ogu.f32760f);
                this.f32761g = nwt.mo4045a(m38245r(), this.f32761g, ogu.m38245r(), ogu.f32761g);
                this.f32765m = nwt.mo4045a(m38246s(), this.f32765m, ogu.m38246s(), ogu.f32765m);
                this.f32766n = nwt.mo4044a(m38247t(), this.f32766n, ogu.m38247t(), ogu.f32766n);
                this.f32767o = nwt.mo4043a(m38248u(), this.f32767o, ogu.m38248u(), ogu.f32767o);
                this.f32768p = nwt.mo4043a(m38249v(), this.f32768p, ogu.m38249v(), ogu.f32768p);
                this.f32762h = nwt.mo4046a(m38250w(), this.f32762h, ogu.m38250w(), ogu.f32762h);
                this.f32763i = nwt.mo4043a(m38251x(), this.f32763i, ogu.m38251x(), ogu.f32763i);
                this.f32764j = nwt.mo4043a(m38252y(), this.f32764j, ogu.m38252y(), ogu.f32764j);
                this.f32769q = nwt.mo4043a(m38253z(), this.f32769q, ogu.m38253z(), ogu.f32769q);
                this.f32770r = nwt.mo4052a(m38233A(), this.f32770r, ogu.m38233A(), ogu.f32770r);
                this.f32771s = nwt.mo4044a(m38234B(), this.f32771s, ogu.m38234B(), ogu.f32771s);
                this.f32772t = nwt.mo4052a(m38235C(), this.f32772t, ogu.m38235C(), ogu.f32772t);
                this.f32773u = nwt.mo4044a(m38236D(), this.f32773u, ogu.m38236D(), ogu.f32773u);
                this.f32774v = nwt.mo4046a(m38237E(), this.f32774v, ogu.m38237E(), ogu.f32774v);
                this.f32775w = nwt.mo4052a(m38239G(), this.f32775w, ogu.m38239G(), ogu.f32775w);
                this.f32776x = nwt.mo4049a(this.f32776x, ogu.f32776x);
                if (nwt != nwr.f31185a) {
                    return this;
                }
                this.f32758d |= ogu.f32758d;
                return this;
            case 6:
                nvw nvw = (nvw) obj;
                nwd nwd = (nwd) obj2;
                while (b == (byte) 0) {
                    try {
                        i2 = nvw.mo3987a();
                        String j;
                        switch (i2) {
                            case 0:
                                b = (byte) 1;
                                break;
                            case 9:
                                this.f32758d |= 1;
                                this.f32759e = nvw.mo4000g();
                                break;
                            case wi.dK /*17*/:
                                this.f32758d |= 2;
                                this.f32760f = nvw.mo4000g();
                                break;
                            case 75:
                                if (!this.f32776x.mo3980a()) {
                                    nxb nxb = this.f32776x;
                                    i2 = nxb.size();
                                    this.f32776x = nxb.mo4061d(i2 == 0 ? 10 : i2 << 1);
                                }
                                this.f32776x.add((ogv) nvw.mo3988a(9, ogv.f32778d, nwd));
                                break;
                            case 113:
                                this.f32758d |= 4;
                                this.f32761g = nvw.mo4000g();
                                break;
                            case 121:
                                this.f32758d |= 8;
                                this.f32765m = nvw.mo4000g();
                                break;
                            case 128:
                                this.f32758d |= 16;
                                this.f32766n = nvw.mo3999f();
                                break;
                            case 137:
                                this.f32758d |= 64;
                                this.f32768p = nvw.mo3993b();
                                break;
                            case 146:
                                j = nvw.mo4003j();
                                this.f32758d |= 128;
                                this.f32762h = j;
                                break;
                            case 153:
                                this.f32758d |= 256;
                                this.f32763i = nvw.mo3993b();
                                break;
                            case 161:
                                this.f32758d |= 512;
                                this.f32764j = nvw.mo3993b();
                                break;
                            case 208:
                                this.f32758d |= 2048;
                                this.f32770r = nvw.mo4002i();
                                break;
                            case 249:
                                this.f32758d |= 1024;
                                this.f32769q = nvw.mo3993b();
                                break;
                            case 257:
                                this.f32758d |= 32;
                                this.f32767o = nvw.mo3993b();
                                break;
                            case 264:
                                this.f32758d |= 8192;
                                this.f32772t = nvw.mo4002i();
                                break;
                            case 272:
                                i2 = nvw.mo4007n();
                                if (ogy.m38291a(i2) != null) {
                                    this.f32758d |= 16384;
                                    this.f32773u = i2;
                                    break;
                                }
                                super.a(34, i2);
                                break;
                            case 282:
                                j = nvw.mo4003j();
                                this.f32758d |= 32768;
                                this.f32774v = j;
                                break;
                            case 288:
                                this.f32758d |= 65536;
                                this.f32775w = nvw.mo4002i();
                                break;
                            case HttpStatusCodes.STATUS_CODE_NOT_MODIFIED /*304*/:
                                this.f32758d |= 4096;
                                this.f32771s = nvw.mo3999f();
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
                if (f32757z == null) {
                    synchronized (ogu.class) {
                        if (f32757z == null) {
                            f32757z = new nvk(f32755k);
                        }
                    }
                }
                return f32757z;
            default:
                throw new UnsupportedOperationException();
        }
        return f32755k;
    }

    static {
        ogu ogu = new ogu();
        f32755k = ogu;
        ogu.d();
        Class cls = ogu.class;
    }
}
