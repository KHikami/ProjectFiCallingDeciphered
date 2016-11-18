package p000;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fle extends fld {
    final String f13370A;
    final String f13371B;
    final boolean f13372C;
    final int f13373D;
    final String f13374E;
    final String f13375F;
    final int f13376G;
    final int f13377H;
    final int f13378I;
    final int f13379J;
    final bcr f13380K;
    final List<bxn> f13381L;
    final int f13382M;
    long f13383N;
    long f13384O;
    long f13385P;
    final List<fpd> f13386l;
    final List<foz> f13387m;
    final boolean f13388n;
    final int f13389o;
    final String f13390p;
    final String f13391q;
    final long f13392r;
    final long f13393s;
    final long f13394t;
    final boolean f13395u;
    final long f13396v;
    final int f13397w;
    final long f13398x;
    final String f13399y;
    final int f13400z;

    fle(fea fea) {
        super(fea.f12866l, fea.f12867m, fea.f12868n, fea.f12855a, fea.f12869o, fea.f12856b, fea.f12857c, fea.f12858d, fea.f12859e, fea.f12874t, fea.f12860f);
        this.f13383N = 0;
        this.f13385P = -1;
        this.f13374E = fea.f12871q;
        this.f13386l = new ArrayList();
        if (fea.f12870p != null) {
            for (fpd add : fea.f12870p) {
                this.f13386l.add(add);
            }
        }
        if (fea.f12872r != null) {
            this.f13387m = new ArrayList();
            for (foz add2 : fea.f12872r) {
                this.f13387m.add(add2);
            }
        } else if (fea.f12850J != null) {
            this.f13387m = fle.m15604a(fea.f12850J);
        } else {
            this.f13387m = null;
        }
        this.f13388n = fea.f12873s;
        if (!fea.f12854N && this.f13388n) {
            this.i = Long.MAX_VALUE;
        } else if (!fea.f12854N) {
            this.i = 0;
        }
        this.f13389o = fea.f12876v;
        this.f13390p = fea.f12877w;
        this.f13395u = fea.f12861g;
        this.f13392r = fea.f12862h;
        this.f13393s = fea.f12863i;
        this.f13394t = fea.f12864j;
        this.f13383N = fea.f12865k;
        this.f13391q = fea.f12878x;
        this.f13396v = fea.f12879y;
        this.f13397w = fea.f12880z;
        this.f13398x = fea.f12841A;
        this.f13399y = fea.f12842B;
        this.f13400z = fea.f12843C;
        this.f13370A = fea.f12844D;
        this.f13371B = fea.f12845E;
        this.f13372C = fea.f12846F;
        this.f13373D = fea.f12847G;
        this.f13375F = fea.f12848H;
        this.f13376G = fea.f12849I;
        this.f13377H = fea.f12875u;
        this.f13380K = (bcr) jyn.m25433b(gwb.m1400H(), bcr.class);
        this.f13381L = fea.f12850J;
        this.f13378I = fea.f12851K;
        this.f13379J = fea.f12853M;
        this.f13382M = fea.f12852L;
    }

    static List<foz> m15604a(List<bxn> list) {
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
                switch (fdz.f12840a[bxn.f4741c.ordinal()]) {
                    case 1:
                        hkh = ((bxw) bxn).f4756f;
                        str3 = null;
                        break;
                    case 2:
                    case 3:
                        bxy bxy = (bxy) bxn;
                        str4 = bxy.d;
                        str = bxn.f4739a;
                        i2 = bxy.f4758g;
                        i3 = bxy.f4757f;
                        i = bxy.f4759h;
                        hkh = null;
                        str3 = str4;
                        break;
                    case 4:
                        byg byg = (byg) bxn;
                        str4 = byg.d;
                        str = bxn.f4739a;
                        str2 = byg.f4767f;
                        hkh = null;
                        str3 = str4;
                        break;
                }
            }
            hkh = null;
            ArrayList arrayList2;
            if (bxn.f4741c == bxo.LOCATION) {
                dut dut = (dut) jyn.m25426a(gwb.m1400H(), dut.class);
                arrayList2 = arrayList;
                arrayList2.add(new fpb(new int[]{0}, null, null, hkh.mo1285c().toString(), hkh.mo1286d().f7681a, hkh.mo1286d().f7682b, hkh.mo1284b().toString(), dut.mo1685a(hkh), dut.mo1689b(hkh)));
            } else if (str2 != null || str != null) {
                String type;
                if (str3 == null) {
                    type = gwb.m1400H().getContentResolver().getType(Uri.parse(str));
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

    public long m15616a() {
        return this.f13385P;
    }

    public void m15617a(blo blo, fhc fhc) {
        blo.m5958a();
        this.f13383N = glj.m17963b() * 1000;
        try {
            if (this.f13389o != 3) {
                blo.m6046e(this.f, 1);
            }
            m15618a(blo, fhc, 1);
            m15599a(blo);
            blo.m6015b();
            blf.m5821d(blo, this.f);
            fhc.m15313c();
        } finally {
            blo.m6028c();
        }
    }

    public void m15621b(blo blo, fhc fhc) {
        m15618a(blo, fhc, this.f13378I);
        m15599a(blo);
    }

    static void m15605a(fhc fhc, int i, int i2, boolean z, long j) {
        fhc.m15310a(z);
        if (i == 2) {
            switch (i2) {
                case 10:
                    return;
                case wi.dz /*25*/:
                    if (z) {
                        fhc.m15312b(j);
                        return;
                    }
                    return;
                default:
                    fhc.m15312b(j);
                    return;
            }
        }
        switch (i2) {
            case 10:
                return;
            case wi.dz /*25*/:
                if (z) {
                    fhc.m15305a(j);
                    return;
                }
                return;
            default:
                fhc.m15305a(j);
                return;
        }
    }

    void m15618a(blo blo, fhc fhc, int i) {
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
        bko g = blo.m6056g();
        boolean a = g.m5632b().m13608a(this.g);
        String str11 = null;
        String str12 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        int i6 = 0;
        List emptyList = Collections.emptyList();
        if (this.f13387m != null) {
            size = this.f13387m.size();
        } else {
            size = 0;
        }
        foz foz;
        String str13;
        int i7;
        List list;
        String str14;
        if (size == 1) {
            foz = (foz) this.f13387m.get(0);
            str = foz.f13629f;
            str13 = foz.f13631h;
            str2 = foz.f13630g;
            str11 = foz.f13627d;
            str3 = foz.f13628e;
            if (foz instanceof fpc) {
                fpc fpc = (fpc) foz;
                String str15 = fpc.f13637i;
                str12 = fpc.f13638j;
                str4 = fpc.f13639k;
                int i8 = fpc.f13640l;
                int i9 = fpc.f13641m;
                i7 = fpc.f13642n;
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
                str2 = fpc.f13643o;
                String str16 = fpc.f13644p;
                i4 = i7;
                str10 = str16;
                list = emptyList;
                bArr = null;
            } else if (foz instanceof fpe) {
                fpe fpe = (fpe) foz;
                str14 = fpe.f13653i;
                i6 = fpe.f13654j;
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
                str14 = ((fpa) foz).f13633i;
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
                double d3 = fpb.f13634i;
                d2 = fpb.f13635j;
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
                str4 = fpb.f13636k;
                i4 = 0;
                str9 = str2;
                str2 = null;
            } else {
                if (foz instanceof foy) {
                    foy foy = (foy) foz;
                    if (foy.m15864a() != null) {
                        list = emptyList;
                        str10 = null;
                        str12 = str3;
                        bArr = nzf.m1029a(foy.m15864a());
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
                        glk.m17981d("Babel", "askjane result is null.", new Object[0]);
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
                foz = (foz) this.f13387m.get(i6);
                bmf bmf = new bmf();
                bmf.f3953a = this.f;
                bmf.f3954b = this.a;
                bmf.f3955c = foz.f13629f;
                bmf.f3956d = foz.f13631h;
                if (foz instanceof fpc) {
                    fpc fpc2 = (fpc) foz;
                    bmf.f3957e = fpc2.f13640l;
                    bmf.f3958f = fpc2.f13641m;
                    i10 = i7;
                    str10 = str14;
                } else if (foz instanceof fpe) {
                    fpe fpe2 = (fpe) foz;
                    str10 = fpe2.f13653i;
                    i10 = fpe2.f13654j;
                } else if (foz instanceof fpa) {
                    int i11 = i7;
                    str10 = ((fpa) foz).f13633i;
                    i10 = i11;
                } else {
                    i10 = i7;
                    str10 = str14;
                }
                stringBuilder.append(gwb.m1678a(foz.f13629f, foz.f13631h));
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
        if (this.f13374E != null) {
            str3 = this.f13374E;
        } else {
            str3 = gwb.m1668a(this.f13386l, str9);
        }
        boolean d4 = RealTimeChatService.m9103d(g, this.f);
        boolean a2 = m15620a(g.m5638g(), blo);
        boolean b = m15623b(blo);
        boolean c = m15624c(blo);
        boolean d5 = m15625d(blo);
        long b2 = glj.m17963b();
        boolean b3 = gwb.m2063b(this.f13386l, g.m5632b().f11244a);
        bmd bmd = new bmd();
        bmd.f3888a = this.a;
        bmd.f3889b = this.b;
        bmd.f3890c = this.f;
        bmd.f3891d = this.f13389o;
        bmd.f3892e = this.f13390p;
        bmd.f3893f = this.g;
        bmd.f3894g = str3;
        bmd.f3895h = this.k.ordinal();
        bmd.f3896i = this.h;
        bmd.f3897j = str6;
        bmd.f3898k = str;
        bmd.f3899l = str5;
        bmd.f3901n = str8;
        bmd.f3902o = str11;
        bmd.f3903p = str12;
        bmd.f3904q = d;
        bmd.f3905r = d2;
        bmd.f3906s = str4;
        bmd.f3907t = str9;
        bmd.f3908u = str2;
        bmd.f3909v = str10;
        bmd.f3910w = bArr;
        bmd.f3900m = i4;
        bmd.f3912y = a;
        bmd.f3913z = this.c;
        bmd.f3862A = this.i;
        bmd.f3863B = this.f13388n;
        bmd.f3864C = i2;
        bmd.f3865D = i3;
        bmd.f3866E = str7;
        bmd.f3867F = this.f13391q;
        bmd.f3868G = this.f13396v;
        bmd.f3869H = this.f13397w;
        bmd.f3870I = this.f13398x;
        bmd.f3871J = this.f13399y;
        bmd.f3872K = this.f13370A;
        bmd.f3873L = this.f13371B;
        bmd.f3874M = this.f13372C;
        bmd.f3875N = -1;
        bmd.f3876O = this.f13373D;
        bmd.f3877P = this.f13375F;
        bmd.f3878Q = this.f13376G;
        bmd.f3879R = this.f13377H;
        bmd.f3880S = i6;
        int e = m15626e(blo);
        if (a) {
            bmd.f3882U = 1;
        } else if (e == 1) {
            bmd.f3882U = e;
        } else {
            bmd.f3882U = this.f13382M;
        }
        bmd.f3883V = i;
        bmd.f3884W = this.f13392r;
        bmd.f3885X = this.f13392r == 0 ? 0 : b2 - (this.f13392r / 1000);
        if (this.f13381L != null) {
            try {
                bmd.f3886Y = gwb.m2158d(this.f13381L);
            } catch (Throwable e2) {
                bmd.f3895h = fwx.FAILED_TO_SEND.ordinal();
                bmd.f3886Y = null;
                glk.m17980d("Babel_ChatMsgProc", "Attachment encoding failed with IO error:", e2);
            }
        } else {
            bmd.f3886Y = null;
        }
        bmd.f3887Z = b3;
        if (a) {
            i5 = 10;
        } else {
            i4 = g.m5638g();
            boolean b4 = m15622b(i4, blo);
            if (!(a2 || b4 || d4)) {
                if (fdq.f12773O.m14370b(i4) || this.c != 25) {
                    fle.m15605a(fhc, this.d, this.c, b3, this.h);
                } else {
                    fle.m15605a(fhc, this.d, 30, b3, this.h);
                }
                if (!(this.c == -1 || this.c == 10)) {
                    i4 = this.c;
                    this.f13384O = glj.m17963b() * 1000;
                    i5 = i4;
                }
            }
            i4 = 10;
            this.f13384O = glj.m17963b() * 1000;
            i5 = i4;
        }
        this.f13385P = blo.m5940a(bmd);
        for (bmf a3 : r10) {
            blo.m5941a(a3);
        }
        blo.m6005a(this.f, this.h, this.i, this.f13400z, str7, this.g, str3, str8, this.f13385P, this.f13373D, i6);
        m15619a(blo, fhc, d4, b, c, d5, b2, e, this.f13382M, i5, blo.m6006b(this.g) == 1);
    }

    boolean m15620a(int i, blo blo) {
        if (fdq.f12807w.m14370b(i)) {
            return m15624c(blo);
        }
        return !m15623b(blo);
    }

    boolean m15623b(blo blo) {
        return blo.m6089n(this.f) <= this.h;
    }

    boolean m15624c(blo blo) {
        boolean z;
        Long i = blo.m6068i(this.f, this.a);
        Long h = blo.m6064h(this.f, this.a);
        if (i != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z2;
        if (h == null || gwb.m1523a(h) <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && r2) {
            return true;
        }
        return false;
    }

    void m15619a(blo blo, fhc fhc, boolean z, boolean z2, boolean z3, boolean z4, long j, int i, int i2, int i3, boolean z5) {
        if (this.e != 0) {
            int g = blo.m6056g().m5638g();
            long d = ((fuz) jyn.m25426a(gwb.m1400H(), fuz.class)).m16296d(g);
            blr blr = new blr();
            blr.f3741a = fhc.m15317f();
            blr.f3742b = z2;
            blr.f3753m = z3;
            blr.f3743c = !z4;
            blr.f3744d = glj.m17956a() * 1000 <= d;
            blr.f3745e = z;
            blr.f3746f = this.d;
            if (!fdq.f12807w.m14370b(g)) {
                i3 = this.c;
            }
            blr.f3747g = i3;
            blr.f3748h = this.h;
            blr.f3749i = blo.m6107u(this.f);
            blr.f3750j = blo.m6108v(this.f);
            blr.f3751k = i2;
            blr.f3752l = i;
            blr.f3754n = z5;
            fhc.m15309a(new fdy(this, g, blr, fhc, j, this.f13380K != null ? this.f13380K.mo468b() : false));
        }
    }

    boolean m15625d(blo blo) {
        return this.h <= blo.m6107u(this.f);
    }

    int m15626e(blo blo) {
        bme g = blo.m6057g(this.f, this.a);
        return g == null ? 2 : g.f3923J;
    }

    boolean m15627f(blo blo) {
        return m15626e(blo) == 1;
    }

    boolean m15622b(int i, blo blo) {
        if (fdq.f12807w.m14370b(i)) {
            return m15627f(blo);
        }
        return m15625d(blo);
    }

    public static int m15603a(Context context, int i, String str) {
        if (fdq.f12773O.m14370b(i)) {
            return fle.m15607b(context, i, str);
        }
        return fle.m15609c(context, i, str);
    }

    static int m15607b(Context context, int i, String str) {
        int f = ((fuz) jyn.m25426a(context, fuz.class)).m16298f(i);
        if (str == null) {
            glk.m17981d("Babel", "ChatMessageProcessor.calculateResolvedNotificationLevel(): conversationId is null.", new Object[0]);
            return f;
        }
        bls e = ((bmq) jyn.m25426a(context, bmq.class)).mo613a(context, i).m6043e(str);
        if (e != null) {
            int i2 = e.f3776v;
            if (i2 != 100) {
                return i2;
            }
        }
        return f;
    }

    static int m15609c(Context context, int i, String str) {
        Object obj = 1;
        if (str != null) {
            obj = ((bmq) jyn.m25426a(context, bmq.class)).mo613a(context, i).m6043e(str).f3776v != 10 ? 1 : null;
        }
        boolean e = ((fuz) jyn.m25426a(context, fuz.class)).m16297e(i);
        if (obj == null || !e) {
            return 10;
        }
        return 30;
    }
}
