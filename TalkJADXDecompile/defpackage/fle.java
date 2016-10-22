package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: fle */
public class fle extends fld {
    final String A;
    final String B;
    final boolean C;
    final int D;
    final String E;
    final String F;
    final int G;
    final int H;
    final int I;
    final int J;
    final bcr K;
    final List<bxn> L;
    final int M;
    long N;
    long O;
    long P;
    final List<fpd> l;
    final List<foz> m;
    final boolean n;
    final int o;
    final String p;
    final String q;
    final long r;
    final long s;
    final long t;
    final boolean u;
    final long v;
    final int w;
    final long x;
    final String y;
    final int z;

    fle(fea fea) {
        super(fea.l, fea.m, fea.n, fea.a, fea.o, fea.b, fea.c, fea.d, fea.e, fea.t, fea.f);
        this.N = 0;
        this.P = -1;
        this.E = fea.q;
        this.l = new ArrayList();
        if (fea.p != null) {
            for (fpd add : fea.p) {
                this.l.add(add);
            }
        }
        if (fea.r != null) {
            this.m = new ArrayList();
            for (foz add2 : fea.r) {
                this.m.add(add2);
            }
        } else if (fea.J != null) {
            this.m = fle.a(fea.J);
        } else {
            this.m = null;
        }
        this.n = fea.s;
        if (!fea.N && this.n) {
            this.i = Long.MAX_VALUE;
        } else if (!fea.N) {
            this.i = 0;
        }
        this.o = fea.v;
        this.p = fea.w;
        this.u = fea.g;
        this.r = fea.h;
        this.s = fea.i;
        this.t = fea.j;
        this.N = fea.k;
        this.q = fea.x;
        this.v = fea.y;
        this.w = fea.z;
        this.x = fea.A;
        this.y = fea.B;
        this.z = fea.C;
        this.A = fea.D;
        this.B = fea.E;
        this.C = fea.F;
        this.D = fea.G;
        this.F = fea.H;
        this.G = fea.I;
        this.H = fea.u;
        this.K = (bcr) jyn.b(gwb.H(), bcr.class);
        this.L = fea.J;
        this.I = fea.K;
        this.J = fea.M;
        this.M = fea.L;
    }

    static List<foz> a(List<bxn> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (bxn bxn : list) {
            hkh hkh;
            String str = null;
            int i = 0;
            String str2 = null;
            int i2 = 0;
            int i3 = 0;
            String str3 = null;
            if (bxn != null) {
                String str4;
                switch (fdz.a[bxn.c.ordinal()]) {
                    case wi.j /*1*/:
                        hkh = ((bxw) bxn).f;
                        str3 = null;
                        break;
                    case wi.l /*2*/:
                    case wi.z /*3*/:
                        bxy bxy = (bxy) bxn;
                        str4 = bxy.d;
                        str = bxn.a;
                        i2 = bxy.g;
                        i3 = bxy.f;
                        i = bxy.h;
                        hkh = null;
                        str3 = str4;
                        break;
                    case wi.h /*4*/:
                        byg byg = (byg) bxn;
                        str4 = byg.d;
                        str = bxn.a;
                        str2 = byg.f;
                        hkh = null;
                        str3 = str4;
                        break;
                }
            }
            hkh = null;
            ArrayList arrayList2;
            if (bxn.c == bxo.LOCATION) {
                dut dut = (dut) jyn.a(gwb.H(), dut.class);
                arrayList2 = arrayList;
                arrayList2.add(new fpb(new int[]{0}, null, null, hkh.c().toString(), hkh.d().a, hkh.d().b, hkh.b().toString(), dut.a(hkh), dut.b(hkh)));
            } else if (str2 != null || str != null) {
                String type;
                if (str3 == null) {
                    type = gwb.H().getContentResolver().getType(Uri.parse(str));
                    if (type == null) {
                        type = "image/jpg";
                    }
                } else {
                    type = str3;
                }
                arrayList2 = arrayList;
                arrayList2.add(new fpc(new int[]{0}, null, null, str2, null, null, str, i2, i3, type, i, null, null, null, null));
            }
        }
        return arrayList;
    }

    public long a() {
        return this.P;
    }

    public void a(blo blo, fhc fhc) {
        blo.a();
        this.N = glj.b() * 1000;
        try {
            if (this.o != 3) {
                blo.e(this.f, 1);
            }
            a(blo, fhc, 1);
            a(blo);
            blo.b();
            blf.d(blo, this.f);
            fhc.c();
        } finally {
            blo.c();
        }
    }

    public void b(blo blo, fhc fhc) {
        a(blo, fhc, this.I);
        a(blo);
    }

    static void a(fhc fhc, int i, int i2, boolean z, long j) {
        fhc.a(z);
        if (i == 2) {
            switch (i2) {
                case wi.dr /*10*/:
                    return;
                case wi.dz /*25*/:
                    if (z) {
                        fhc.b(j);
                        return;
                    }
                    return;
                default:
                    fhc.b(j);
                    return;
            }
        }
        switch (i2) {
            case wi.dr /*10*/:
            case wi.dz /*25*/:
                if (z) {
                    fhc.a(j);
                }
            default:
                fhc.a(j);
        }
    }

    void a(blo blo, fhc fhc, int i) {
        int size;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        String str7;
        String str8;
        int i3;
        String str9;
        int i4;
        String str10;
        byte[] bArr;
        int i5;
        bko g = blo.g();
        boolean a = g.b().a(this.g);
        String str11 = null;
        String str12 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        int i6 = 0;
        List emptyList = Collections.emptyList();
        if (this.m != null) {
            size = this.m.size();
        } else {
            size = 0;
        }
        foz foz;
        String str13;
        int i7;
        List list;
        String str14;
        if (size == 1) {
            foz = (foz) this.m.get(0);
            str = foz.f;
            str13 = foz.h;
            str2 = foz.g;
            str11 = foz.d;
            str3 = foz.e;
            if (foz instanceof fpc) {
                fpc fpc = (fpc) foz;
                String str15 = fpc.i;
                str12 = fpc.j;
                str4 = fpc.k;
                int i8 = fpc.l;
                int i9 = fpc.m;
                i7 = fpc.n;
                str5 = str4;
                str6 = str15;
                str4 = null;
                i2 = i8;
                str7 = str13;
                str8 = str;
                i3 = i9;
                str = str12;
                str9 = str2;
                str12 = str3;
                str2 = fpc.o;
                String str16 = fpc.p;
                i4 = i7;
                str10 = str16;
                list = emptyList;
                bArr = null;
            } else if (foz instanceof fpe) {
                fpe fpe = (fpe) foz;
                str14 = fpe.i;
                i6 = fpe.j;
                i4 = 0;
                str10 = null;
                str12 = str3;
                str9 = str2;
                str7 = str13;
                str2 = null;
                i3 = 0;
                str4 = null;
                i2 = 0;
                str8 = str;
                str5 = null;
                str = null;
                str6 = str14;
                list = emptyList;
                bArr = null;
            } else if (foz instanceof fpa) {
                str14 = ((fpa) foz).i;
                i4 = 0;
                str10 = null;
                str12 = str3;
                str9 = str2;
                str7 = str13;
                str2 = null;
                i3 = 0;
                str4 = null;
                i2 = 0;
                str8 = str;
                str5 = null;
                str = null;
                str6 = str14;
                list = emptyList;
                bArr = null;
            } else if (foz instanceof fpb) {
                fpb fpb = (fpb) foz;
                double d3 = fpb.i;
                d2 = fpb.j;
                d = d3;
                str10 = null;
                str12 = str3;
                str8 = str;
                str7 = str13;
                str = null;
                i3 = 0;
                i2 = 0;
                str5 = null;
                str6 = null;
                List list2 = emptyList;
                bArr = null;
                list = list2;
                str4 = fpb.k;
                i4 = 0;
                str9 = str2;
                str2 = null;
            } else {
                if (foz instanceof foy) {
                    foy foy = (foy) foz;
                    if (foy.a() != null) {
                        list = emptyList;
                        str10 = null;
                        str12 = str3;
                        bArr = nzf.a(foy.a());
                        str7 = str13;
                        i4 = 0;
                        i3 = 0;
                        str9 = str2;
                        i2 = 0;
                        str2 = null;
                        str5 = null;
                        str4 = null;
                        str6 = null;
                        str8 = str;
                        str = null;
                    } else {
                        glk.d("Babel", "askjane result is null.", new Object[0]);
                    }
                }
                i4 = 0;
                str10 = null;
                str12 = str3;
                str9 = str2;
                str7 = str13;
                str2 = null;
                i3 = 0;
                str4 = null;
                i2 = 0;
                str8 = str;
                str5 = null;
                str = null;
                str6 = null;
                list = emptyList;
                bArr = null;
            }
        } else if (size > 1) {
            str13 = "multipart/mixed";
            List arrayList = new ArrayList(size);
            StringBuilder stringBuilder = new StringBuilder();
            i7 = 0;
            str14 = null;
            i6 = 0;
            while (i6 < size) {
                int i10;
                if (i6 > 0) {
                    stringBuilder.append('|');
                }
                foz = (foz) this.m.get(i6);
                bmf bmf = new bmf();
                bmf.a = this.f;
                bmf.b = this.a;
                bmf.c = foz.f;
                bmf.d = foz.h;
                if (foz instanceof fpc) {
                    fpc fpc2 = (fpc) foz;
                    bmf.e = fpc2.l;
                    bmf.f = fpc2.m;
                    i10 = i7;
                    str10 = str14;
                } else if (foz instanceof fpe) {
                    fpe fpe2 = (fpe) foz;
                    str10 = fpe2.i;
                    i10 = fpe2.j;
                } else if (foz instanceof fpa) {
                    int i11 = i7;
                    str10 = ((fpa) foz).i;
                    i10 = i11;
                } else {
                    i10 = i7;
                    str10 = str14;
                }
                r7 = new String[2];
                r7[0] = foz.f;
                r7[1] = foz.h;
                stringBuilder.append(gwb.a(r7));
                arrayList.add(bmf);
                i6++;
                str14 = str10;
                i7 = i10;
            }
            i6 = i7;
            bArr = null;
            str = null;
            list = arrayList;
            str10 = null;
            str2 = null;
            str7 = str13;
            str4 = null;
            i3 = 0;
            i2 = 0;
            str8 = stringBuilder.toString();
            str5 = null;
            i4 = 0;
            str9 = null;
            str6 = str14;
        } else {
            str2 = null;
            i3 = 0;
            str = null;
            str4 = null;
            i2 = 0;
            str8 = null;
            str5 = null;
            str10 = null;
            str6 = null;
            str7 = null;
            i4 = 0;
            str9 = null;
            list = emptyList;
            bArr = null;
        }
        if (this.E != null) {
            str3 = this.E;
        } else {
            str3 = gwb.a(this.l, str9);
        }
        boolean d4 = RealTimeChatService.d(g, this.f);
        boolean a2 = a(g.g(), blo);
        boolean b = b(blo);
        boolean c = c(blo);
        boolean d5 = d(blo);
        long b2 = glj.b();
        boolean b3 = gwb.b(this.l, g.b().a);
        bmd bmd = new bmd();
        bmd.a = this.a;
        bmd.b = this.b;
        bmd.c = this.f;
        bmd.d = this.o;
        bmd.e = this.p;
        bmd.f = this.g;
        bmd.g = str3;
        bmd.h = this.k.ordinal();
        bmd.i = this.h;
        bmd.j = str6;
        bmd.k = str;
        bmd.l = str5;
        bmd.n = str8;
        bmd.o = str11;
        bmd.p = str12;
        bmd.q = d;
        bmd.r = d2;
        bmd.s = str4;
        bmd.t = str9;
        bmd.u = str2;
        bmd.v = str10;
        bmd.w = bArr;
        bmd.m = i4;
        bmd.y = a;
        bmd.z = this.c;
        bmd.A = this.i;
        bmd.B = this.n;
        bmd.C = i2;
        bmd.D = i3;
        bmd.E = str7;
        bmd.F = this.q;
        bmd.G = this.v;
        bmd.H = this.w;
        bmd.I = this.x;
        bmd.J = this.y;
        bmd.K = this.A;
        bmd.L = this.B;
        bmd.M = this.C;
        bmd.N = -1;
        bmd.O = this.D;
        bmd.P = this.F;
        bmd.Q = this.G;
        bmd.R = this.H;
        bmd.S = i6;
        int e = e(blo);
        if (a) {
            bmd.U = 1;
        } else if (e == 1) {
            bmd.U = e;
        } else {
            bmd.U = this.M;
        }
        bmd.V = i;
        bmd.W = this.r;
        bmd.X = this.r == 0 ? 0 : b2 - (this.r / 1000);
        if (this.L != null) {
            try {
                bmd.Y = gwb.d(this.L);
            } catch (Throwable e2) {
                bmd.h = fwx.FAILED_TO_SEND.ordinal();
                bmd.Y = null;
                glk.d("Babel_ChatMsgProc", "Attachment encoding failed with IO error:", e2);
            }
        } else {
            bmd.Y = null;
        }
        bmd.Z = b3;
        if (a) {
            i5 = 10;
        } else {
            i4 = g.g();
            boolean b4 = b(i4, blo);
            if (!(a2 || b4 || d4)) {
                if (fdq.O.b(i4) || this.c != 25) {
                    fle.a(fhc, this.d, this.c, b3, this.h);
                } else {
                    fle.a(fhc, this.d, 30, b3, this.h);
                }
                if (!(this.c == -1 || this.c == 10)) {
                    i4 = this.c;
                    this.O = glj.b() * 1000;
                    i5 = i4;
                }
            }
            i4 = 10;
            this.O = glj.b() * 1000;
            i5 = i4;
        }
        this.P = blo.a(bmd);
        for (bmf a3 : r10) {
            blo.a(a3);
        }
        blo.a(this.f, this.h, this.i, this.z, str7, this.g, str3, str8, this.P, this.D, i6);
        a(blo, fhc, d4, b, c, d5, b2, e, this.M, i5, blo.b(this.g) == 1);
    }

    boolean a(int i, blo blo) {
        if (fdq.w.b(i)) {
            return c(blo);
        }
        return !b(blo);
    }

    boolean b(blo blo) {
        return blo.n(this.f) <= this.h;
    }

    boolean c(blo blo) {
        boolean z;
        Long i = blo.i(this.f, this.a);
        Long h = blo.h(this.f, this.a);
        if (i != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z2;
        if (h == null || gwb.a(h) <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && r2) {
            return true;
        }
        return false;
    }

    void a(blo blo, fhc fhc, boolean z, boolean z2, boolean z3, boolean z4, long j, int i, int i2, int i3, boolean z5) {
        if (this.e != 0) {
            int g = blo.g().g();
            long d = ((fuz) jyn.a(gwb.H(), fuz.class)).d(g);
            blr blr = new blr();
            blr.a = fhc.f();
            blr.b = z2;
            blr.m = z3;
            blr.c = !z4;
            blr.d = glj.a() * 1000 <= d;
            blr.e = z;
            blr.f = this.d;
            if (!fdq.w.b(g)) {
                i3 = this.c;
            }
            blr.g = i3;
            blr.h = this.h;
            blr.i = blo.u(this.f);
            blr.j = blo.v(this.f);
            blr.k = i2;
            blr.l = i;
            blr.n = z5;
            fhc.a(new fdy(this, g, blr, fhc, j, this.K != null ? this.K.b() : false));
        }
    }

    boolean d(blo blo) {
        return this.h <= blo.u(this.f);
    }

    int e(blo blo) {
        bme g = blo.g(this.f, this.a);
        return g == null ? 2 : g.J;
    }

    boolean f(blo blo) {
        return e(blo) == 1;
    }

    boolean b(int i, blo blo) {
        if (fdq.w.b(i)) {
            return f(blo);
        }
        return d(blo);
    }

    public static int a(Context context, int i, String str) {
        if (fdq.O.b(i)) {
            return fle.b(context, i, str);
        }
        return fle.c(context, i, str);
    }

    static int b(Context context, int i, String str) {
        int f = ((fuz) jyn.a(context, fuz.class)).f(i);
        if (str == null) {
            glk.d("Babel", "ChatMessageProcessor.calculateResolvedNotificationLevel(): conversationId is null.", new Object[0]);
            return f;
        }
        bls e = ((bmq) jyn.a(context, bmq.class)).a(context, i).e(str);
        if (e != null) {
            int i2 = e.v;
            if (i2 != 100) {
                return i2;
            }
        }
        return f;
    }

    static int c(Context context, int i, String str) {
        Object obj = 1;
        if (str != null) {
            obj = ((bmq) jyn.a(context, bmq.class)).a(context, i).e(str).v != 10 ? 1 : null;
        }
        boolean e = ((fuz) jyn.a(context, fuz.class)).e(i);
        if (obj == null || !e) {
            return 10;
        }
        return 30;
    }
}
